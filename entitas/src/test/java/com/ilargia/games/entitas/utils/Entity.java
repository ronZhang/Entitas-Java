package com.ilargia.games.entitas.utils;

import com.ilargia.games.entitas.api.ContextInfo;
import com.ilargia.games.entitas.api.IComponent;
import java.util.Stack;

import com.ilargia.games.entitas.components.Interactive;
import com.ilargia.games.entitas.components.Motion;
import com.ilargia.games.entitas.components.Player;
import com.ilargia.games.entitas.components.Position;
import com.ilargia.games.entitas.components.Score;
import com.ilargia.games.entitas.components.View;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Entity extends com.ilargia.games.entitas.Entity {

	public Interactive InteractiveComponent = new Interactive();
	public Player PlayerComponent = new Player();

	public Entity(int totalComponents, Stack<IComponent>[] componentPools,
                  ContextInfo contextInfo) {
		super(totalComponents, componentPools, contextInfo);
	}

	public boolean isInteractive() {
		return hasComponent(TestComponentIds.Interactive);
	}

	public Entity setInteractive(boolean value) {
		if (value != hasComponent(TestComponentIds.Interactive)) {
			if (value) {
				addComponent(TestComponentIds.Interactive, InteractiveComponent);
			} else {
				removeComponent(TestComponentIds.Interactive);
			}
		}
		return this;
	}

	public Motion getMotion() {
		return (Motion) getComponent(TestComponentIds.Motion);
	}

	public boolean hasMotion() {
		return hasComponent(TestComponentIds.Motion);
	}

	public Entity addMotion(float x, float y) {
		Motion component = (Motion) recoverComponent(TestComponentIds.Motion);
		if (component == null) {
			component = new Motion(x, y);
		} else {
			component.x = x;;
			component.y = y;
		}
		addComponent(TestComponentIds.Motion, component);
		return this;
	}

	public Entity replaceMotion(float x, float y) {
		Motion component = (Motion) recoverComponent(TestComponentIds.Motion);
		if (component == null) {
			component = new Motion(x, y);
		} else {
			component.x = x;;
			component.y = y;
		}
		replaceComponent(TestComponentIds.Motion, component);
		return this;
	}

	public Entity removeMotion() {
		removeComponent(TestComponentIds.Motion);
		return this;
	}

	public boolean isPlayer() {
		return hasComponent(TestComponentIds.Player);
	}

	public Entity setPlayer(boolean value) {
		if (value != hasComponent(TestComponentIds.Player)) {
			if (value) {
				addComponent(TestComponentIds.Player, PlayerComponent);
			} else {
				removeComponent(TestComponentIds.Player);
			}
		}
		return this;
	}

	public Position getPosition() {
		return (Position) getComponent(TestComponentIds.Position);
	}

	public boolean hasPosition() {
		return hasComponent(TestComponentIds.Position);
	}

	public Entity addPosition(float x, float y) {
		Position component = (Position) recoverComponent(TestComponentIds.Position);
		if (component == null) {
			component = new Position(x, y);
		} else {
			component.x = x;;
			component.y = y;
		}
		addComponent(TestComponentIds.Position, component);
		return this;
	}

	public Entity replacePosition(float x, float y) {
		Position component = (Position) recoverComponent(TestComponentIds.Position);
		if (component == null) {
			component = new Position(x, y);
		} else {
			component.x = x;;
			component.y = y;
		}
		replaceComponent(TestComponentIds.Position, component);
		return this;
	}

	public Entity removePosition() {
		removeComponent(TestComponentIds.Position);
		return this;
	}

	public Score getScore() {
		return (Score) getComponent(TestComponentIds.Score);
	}

	public boolean hasScore() {
		return hasComponent(TestComponentIds.Score);
	}

	public Entity addScore(String text, int x, int y) {
		Score component = (Score) recoverComponent(TestComponentIds.Score);
		if (component == null) {
			component = new Score(text, x, y);
		} else {
			component.text = text;;
			component.x = x;;
			component.y = y;
		}
		addComponent(TestComponentIds.Score, component);
		return this;
	}

	public Entity replaceScore(String text, int x, int y) {
		Score component = (Score) recoverComponent(TestComponentIds.Score);
		if (component == null) {
			component = new Score(text, x, y);
		} else {
			component.text = text;;
			component.x = x;;
			component.y = y;
		}
		replaceComponent(TestComponentIds.Score, component);
		return this;
	}

	public Entity removeScore() {
		removeComponent(TestComponentIds.Score);
		return this;
	}

	public View getView() {
		return (View) getComponent(TestComponentIds.View);
	}

	public boolean hasView() {
		return hasComponent(TestComponentIds.View);
	}

	public Entity addView(int shape) {
		View component = (View) recoverComponent(TestComponentIds.View);
		if (component == null) {
			component = new View(shape);
		} else {
			component.shape = shape;
		}
		addComponent(TestComponentIds.View, component);
		return this;
	}

	public Entity replaceView(int shape) {
		View component = (View) recoverComponent(TestComponentIds.View);
		if (component == null) {
			component = new View(shape);
		} else {
			component.shape = shape;
		}
		replaceComponent(TestComponentIds.View, component);
		return this;
	}

	public Entity removeView() {
		removeComponent(TestComponentIds.View);
		return this;
	}
}