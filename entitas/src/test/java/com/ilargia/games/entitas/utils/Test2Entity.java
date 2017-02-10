package com.ilargia.games.entitas.utils;

import com.ilargia.games.entitas.Entity;
import com.ilargia.games.entitas.api.ContextInfo;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.entitas.components.Interactive;
import com.ilargia.games.entitas.components.Player;

import java.util.Stack;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Test2Entity extends Entity {

    public Interactive InteractiveComponent = new Interactive();
    public Player PlayerComponent = new Player();

    public Test2Entity(int totalComponents,
                       Stack<IComponent>[] componentContexts, ContextInfo contextInfo) {
        super(totalComponents, componentContexts, contextInfo);
    }

    public boolean isInteractive() {
        return hasComponent(TestComponentIds.Interactive);
    }

    public Test2Entity setInteractive(boolean value) {
        if (value != hasComponent(TestComponentIds.Interactive)) {
            if (value) {
                addComponent(TestComponentIds.Interactive, InteractiveComponent);
            } else {
                removeComponent(TestComponentIds.Interactive);
            }
        }
        return this;
    }

    public boolean isPlayer() {
        return hasComponent(TestComponentIds.Player);
    }

    public Test2Entity setPlayer(boolean value) {
        if (value != hasComponent(TestComponentIds.Player)) {
            if (value) {
                addComponent(TestComponentIds.Player, PlayerComponent);
            } else {
                removeComponent(TestComponentIds.Player);
            }
        }
        return this;
    }
}