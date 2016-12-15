package com.ilargia.games.entitas.utils;

import com.ilargia.games.entitas.EntityMetaData;
import com.ilargia.games.entitas.interfaces.FactoryEntity;
import com.ilargia.games.entitas.events.EventBus;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Pool extends com.ilargia.games.entitas.BasePool<Entity, Pool> {

	public Pool(int totalComponents, int startCreationIndex,
			EntityMetaData metaData, FactoryEntity<Entity> factoryMethod,
			EventBus<Entity> bus) {
		super(totalComponents, startCreationIndex, metaData, bus, factoryMethod);
	}

	public Entity getPlayerEntity() {
		return getGroup(TestMatcher.Player()).getSingleEntity();
	}

	public boolean isPlayer() {
		return getPlayerEntity() != null;
	}

	public Pool setPlayer(boolean value) {
		Entity entity = getPlayerEntity();
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