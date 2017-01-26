package com.ilargia.games.entitas.codeGenerator.generated;

import com.ilargia.games.entitas.api.*;
import com.ilargia.games.entitas.Entity;
import java.util.Stack;
import com.ilargia.games.entitas.codeGenerator.components.Player.ID;
import com.ilargia.games.entitas.codeGenerator.components.Player;
import com.ilargia.games.entitas.codeGenerator.components.View;
import com.badlogic.gdx.math.Shape2D;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class OtroEntity extends Entity {

	public OtroEntity(int totalComponents,
			Stack<IComponent>[] componentContexts, ContextInfo contextInfo) {
		super(totalComponents, componentContexts, contextInfo);
	}

	public Player getPlayer() {
		return (Player) getComponent(CoreComponentIds.Player);
	}

	public boolean hasPlayer() {
		return hasComponent(CoreComponentIds.Player);
	}

	public OtroEntity addPlayer(ID id) {
		Player component = (Player) recoverComponent(CoreComponentIds.Player);
		if (component == null) {
			component = new Player(id);
		} else {
			component.id = id;
		}
		addComponent(CoreComponentIds.Player, component);
		return this;
	}

	public OtroEntity replacePlayer(ID id) {
		Player component = (Player) recoverComponent(CoreComponentIds.Player);
		if (component == null) {
			component = new Player(id);
		} else {
			component.id = id;
		}
		replaceComponent(CoreComponentIds.Player, component);
		return this;
	}

	public OtroEntity removePlayer() {
		removeComponent(CoreComponentIds.Player);
		return this;
	}

	public View getView() {
		return (View) getComponent(CoreComponentIds.View);
	}

	public boolean hasView() {
		return hasComponent(CoreComponentIds.View);
	}

	public OtroEntity addView(Shape2D shape) {
		View component = (View) recoverComponent(CoreComponentIds.View);
		if (component == null) {
			component = new View(shape);
		} else {
			component.shape = shape;
		}
		addComponent(CoreComponentIds.View, component);
		return this;
	}

	public OtroEntity replaceView(Shape2D shape) {
		View component = (View) recoverComponent(CoreComponentIds.View);
		if (component == null) {
			component = new View(shape);
		} else {
			component.shape = shape;
		}
		replaceComponent(CoreComponentIds.View, component);
		return this;
	}

	public OtroEntity removeView() {
		removeComponent(CoreComponentIds.View);
		return this;
	}
}