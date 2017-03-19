package com.ilargia.games.egdx.logicbricks.gen.actuator;

import com.ilargia.games.egdx.logicbricks.component.actuator.CameraActuator;
import com.ilargia.games.egdx.logicbricks.component.actuator.CharacterActuator;
import com.ilargia.games.egdx.logicbricks.component.actuator.Link;
import com.ilargia.games.egdx.logicbricks.component.actuator.TextureActuator;
import com.ilargia.games.egdx.logicbricks.component.actuator.VelocityActuator;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class ActuatorComponentsLookup {

	public static final int CameraActuator = 0;
	public static final int CharacterActuator = 1;
	public static final int Link = 2;
	public static final int TextureActuator = 3;
	public static final int VelocityActuator = 4;
	public static final int totalComponents = 5;

	public static String[] componentNames() {
		return new String[]{"CameraActuator", "CharacterActuator", "Link",
				"TextureActuator", "VelocityActuator"};
	}

	public static Class[] componentTypes() {
		return new Class[]{CameraActuator.class, CharacterActuator.class,
				Link.class, TextureActuator.class, VelocityActuator.class};
	}
}