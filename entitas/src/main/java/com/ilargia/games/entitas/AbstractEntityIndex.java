package com.ilargia.games.entitas;

import com.ilargia.games.entitas.exceptions.EntityIndexException;
import com.ilargia.games.entitas.interfaces.GroupChanged;
import com.ilargia.games.entitas.interfaces.IComponent;
import com.ilargia.games.entitas.interfaces.IEntityIndex;

public abstract class AbstractEntityIndex<T> implements IEntityIndex {


    protected Group _group;
    protected Func<Entity, IComponent, T> _key;
    protected GroupChanged onEntityAdded = (Group group, Entity entity, int index, IComponent component) -> {
        addEntity(entity, component);
    };
    protected GroupChanged onEntityRemoved = (Group group, Entity entity, int index, IComponent component) -> {
        removeEntity(entity, component);
    };

    protected AbstractEntityIndex(Group group, Func<Entity, IComponent, T> key) {
        _group = group;
        _key = key;

    }

    @Override
    public void activate() throws EntityIndexException {
        _group.OnEntityAdded = onEntityAdded;
        _group.OnEntityRemoved = onEntityRemoved;

    }

    @Override
    public void deactivate() {
        _group.OnEntityAdded = null;
        _group.OnEntityRemoved = null;
        clear();

    }

    protected void indexEntities(Group group) {
        Entity[] entities = group.getEntities();
        for (int i = 0; i < entities.length; i++) {
            addEntity(entities[i], null);
        }
    }

    protected abstract void addEntity(Entity entity, IComponent component) throws EntityIndexException;

    protected abstract void removeEntity(Entity entity, IComponent component);

    protected abstract void clear();

    public interface Func<Entity, IComponent, T> {
        T getKey(Entity entity, IComponent component);
    }

}