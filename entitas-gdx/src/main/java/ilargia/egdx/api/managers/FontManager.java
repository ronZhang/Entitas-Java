package ilargia.egdx.api.managers;


public interface FontManager<Font> extends Manager {

    public void loadFont(String name);

    public void unloadFont(String name);

    public Font getFont(String name);


}
