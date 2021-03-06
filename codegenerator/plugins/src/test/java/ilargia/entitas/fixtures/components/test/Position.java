package ilargia.entitas.fixtures.components.test;

import ilargia.entitas.api.IComponent;
import ilargia.entitas.codeGenerator.annotations.Contexts;

@Contexts(names = {"Test"})
public class Position implements IComponent {
    public float x, y;

    public Position() {
        this.x = 1;
        this.y = 1;
    }

    public Position(float x, float y) {
        this.x = x;
        this.y = y;
    }

}