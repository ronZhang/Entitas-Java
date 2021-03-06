package ilargia.egdx.logicbricks.component.scene;

import com.badlogic.gdx.graphics.Color;
import ilargia.entitas.api.IComponent;
import ilargia.entitas.codeGenerator.Component;

@Component(pools = {"Scene"}, isSingleEntity = true)
public class GameWorld implements IComponent {
    public float width;
    public float height;
    public float metresToPixels;
    public float pixelsToMetres;
    public Color backGroundColor;


    public GameWorld(float width, float height, float metresToPixels, Color backGroundColor) {
        this.width = width;
        this.height = height;
        this.metresToPixels = metresToPixels;
        this.pixelsToMetres = 1.0f / metresToPixels;
        this.backGroundColor = backGroundColor;

    }

}
