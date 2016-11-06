package com.ilargia.games.entitas.codeGenerator;


import com.ilargia.games.entitas.codeGenerator.interfaces.*;
import com.ilargia.games.entitas.codeGenerator.intermediate.CodeGenFile;
import com.ilargia.games.entitas.codeGenerator.intermediate.ComponentInfo;
import org.jboss.forge.roaster.Roaster;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CodeGenerator {

    public static final String DEFAULT_POOL_NAME = "Pool";
    public static final String COMPONENT_SUFFIX = "Component";

    public static final String DEFAULT_COMPONENT_LOOKUP_TAG = "ComponentIds";
    public static final String AUTO_GENERATED_HEADER_FORMAT = String.join("\n",
            "@//------------------------------------------------------------------------------",
            "// <auto-generated>",
            "//     This code was generated by {0}.",
            "//",
            "//     Changes to this file may cause incorrect behavior and will be lost if",
            "//             public static CodeGenFile[] Generate(ICodeGeneratorDataProvider provider, String directory, ICodeGenerator[] codeGthe code is regenerated.",
            "// </auto-generated>",
            "//------------------------------------------------------------------------------"
    );


    public static CodeGenFile[] generate(ICodeGeneratorDataProvider provider, String directory, ICodeGenerator[] codeGenerators) {

        ArrayList<CodeGenFile> generatedFiles = new ArrayList<CodeGenFile>();
        ComponentInfo[] componentInfos = provider.getComponentInfos();
        CodeGenFile[] files = new CodeGenFile[0];

        for (int i = 0; i < codeGenerators.length; i++) {

            if (codeGenerators[i] instanceof IPoolCodeGenerator) {
                IPoolCodeGenerator generator = (IPoolCodeGenerator) codeGenerators[i];
                files = generator.generate(provider.poolNames());

            }

            if (codeGenerators[i] instanceof IComponentCodeGenerator) {
                IComponentCodeGenerator generator = (IComponentCodeGenerator) codeGenerators[i];
                files = generator.generate(componentInfos);

            }

            if (codeGenerators[i] instanceof IBlueprintsCodeGenerator) {
                IBlueprintsCodeGenerator generator = (IBlueprintsCodeGenerator) codeGenerators[i];
                files = generator.generate(provider.blueprintNames());

            }

            Collections.addAll(generatedFiles, files);
            writeFiles(directory, files);
        }


        return (CodeGenFile[]) generatedFiles.toArray();

    }

    static void writeFiles(String directoryName, CodeGenFile[] files) {

        File directory = new File(String.valueOf(directoryName));
        if (!directory.exists()) {
            directory.mkdir();
        }

        Arrays.stream(files).forEach((file) -> {
            String fileName = directory.getPath() + file.fileName + ".java";
            String fileContent = Roaster.format(file.fileContent.toString());
            String header = String.format(AUTO_GENERATED_HEADER_FORMAT, file.generatorName);
            write(fileName, header + fileContent);

        });

    }

    public static void write(String fileName, String content) {
        File file = new File(fileName);
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}


