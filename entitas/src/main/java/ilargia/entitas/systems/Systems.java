package ilargia.entitas.systems;

import ilargia.entitas.api.system.*;
import ilargia.entitas.factories.EntitasCollections;

import java.util.List;


public class Systems implements IInitializeSystem, IExecuteSystem, IRenderSystem, ICleanupSystem, ITearDownSystem {


    protected List<IInitializeSystem> _initializeSystems; // ObjectArrayList
    protected List<IExecuteSystem> _executeSystems;
    protected List<IRenderSystem> _renderSystems;
    protected List<ICleanupSystem> _cleanupSystems;
    protected List<ITearDownSystem> _tearDownSystems;

    public Systems() {
        _initializeSystems = EntitasCollections.createList(ISystem.class);
        _executeSystems = EntitasCollections.createList(ISystem.class);
        _renderSystems = EntitasCollections.createList(ISystem.class);
        _cleanupSystems = EntitasCollections.createList(ISystem.class);
        _tearDownSystems = EntitasCollections.createList(ISystem.class);

    }

    public Systems add(ISystem system) {
        if (system != null) {
            if (system instanceof IInitializeSystem) _initializeSystems.add((IInitializeSystem) system);
            if (system instanceof IExecuteSystem) _executeSystems.add((IExecuteSystem) system);
            if (system instanceof IRenderSystem) _renderSystems.add((IRenderSystem) system);
            if (system instanceof ICleanupSystem) _cleanupSystems.add((ICleanupSystem) system);
            if (system instanceof ITearDownSystem) _tearDownSystems.add((ITearDownSystem) system);
        }
        return this;
    }

    public void initialize() {
        for (IInitializeSystem iSystem : _initializeSystems) {
            iSystem.initialize();
        }
    }

    public void execute(float deltaTime) {
        for (IExecuteSystem eSystem : _executeSystems) {
            eSystem.execute(deltaTime);
        }
    }


    @Override
    public void render() {
        for (IRenderSystem eSystem : _renderSystems) {
            eSystem.render();
        }
    }

    public void cleanup() {
        for (ICleanupSystem clSystem : _cleanupSystems) {
            clSystem.cleanup();
        }
    }

    public void tearDown() {
        for (ITearDownSystem tSystem : _tearDownSystems) {
            tSystem.tearDown();
        }
    }

    public void activateReactiveSystems() {
        for (int i = 0; i < _executeSystems.size(); i++) {
            ReactiveSystem reactiveSystem = (ReactiveSystem) ((_executeSystems.get(i) instanceof ReactiveSystem) ? _executeSystems.get(i) : null);
            if (reactiveSystem != null) {
                reactiveSystem.activate();
            }

            Systems nestedSystems = (Systems) ((_executeSystems.get(i) instanceof Systems) ? _executeSystems.get(i) : null);
            if (nestedSystems != null) {
                nestedSystems.activateReactiveSystems();
            }
        }
    }

    public void deactivateReactiveSystems() {
        for (int i = 0; i < _executeSystems.size(); i++) {
            ReactiveSystem reactiveSystem = (ReactiveSystem) ((_executeSystems.get(i) instanceof ReactiveSystem) ? _executeSystems.get(i) : null);
            if (reactiveSystem != null) {
                reactiveSystem.deactivate();
            }

            Systems nestedSystems = (Systems) ((_executeSystems.get(i) instanceof Systems) ? _executeSystems.get(i) : null);
            if (nestedSystems != null) {
                nestedSystems.deactivateReactiveSystems();
            }
        }
    }

    public void clearReactiveSystems() {
        for (int i = 0; i < _executeSystems.size(); i++) {
            ReactiveSystem reactiveSystem = (ReactiveSystem) ((_executeSystems.get(i) instanceof ReactiveSystem) ? _executeSystems.get(i) : null);
            if (reactiveSystem != null) {
                reactiveSystem.clear();
            }

            Systems nestedSystems = (Systems) ((_executeSystems.get(i) instanceof Systems) ? _executeSystems.get(i) : null);
            if (nestedSystems != null) {
                nestedSystems.clearReactiveSystems();
            }
        }
    }

    public void clearSystems() {
        _initializeSystems.clear();
        _executeSystems.clear();
        _renderSystems.clear();
        _cleanupSystems.clear();
        _tearDownSystems.clear();

    }

    @Override
    public String toString() {
        return "Systems{" +
                "_initializeSystems=" + _initializeSystems +
                ", _executeSystems=" + _executeSystems +
                ", _renderSystems=" + _renderSystems +
                ", _cleanupSystems=" + _cleanupSystems +
                ", _tearDownSystems=" + _tearDownSystems +
                '}';
    }


}