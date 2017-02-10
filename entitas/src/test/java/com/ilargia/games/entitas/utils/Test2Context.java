package com.ilargia.games.entitas.utils;

import com.ilargia.games.entitas.api.ContextInfo;
import com.ilargia.games.entitas.api.FactoryEntity;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Test2Context
        extends
        com.ilargia.games.entitas.Context<Test2Entity> {

    public Test2Context(int totalComponents, int startCreationIndex,
                        ContextInfo contextInfo, FactoryEntity<Test2Entity> factoryMethod) {
        super(totalComponents, startCreationIndex, contextInfo, factoryMethod);
    }

    public Test2Entity getPlayerEntity() {
        return getGroup(TestMatcher.Player()).getSingleEntity();
    }

    public boolean isPlayer() {
        return getPlayerEntity() != null;
    }

    public Test2Context setPlayer(boolean value) {
        Test2Entity entity = getPlayerEntity();
        if (value != (entity != null)) {
            if (value) {
                entity.setPlayer(true);
            } else {
                destroyEntity(entity);
            }
        }
        return this;
    }
}