package com.ilargia.games.egdx.logicbricks.gen.game;

import com.ilargia.games.entitas.matcher.Matcher;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class GameMatcher {

	private static Matcher _matcherAnimations;
	private static Matcher _matcherCharacter;
	private static Matcher _matcherDestroy;
	private static Matcher _matcherInteractive;
	private static Matcher _matcherMovable;
	private static Matcher _matcherOnGround;
	private static Matcher _matcherPlayer;
	private static Matcher _matcherRigidBody;
	private static Matcher _matcherTags;
	private static Matcher _matcherTextureView;

	public static Matcher Animations() {
		if (_matcherAnimations == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.Animations);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherAnimations = matcher;
		}
		return _matcherAnimations;
	}

	public static Matcher Character() {
		if (_matcherCharacter == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.Character);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherCharacter = matcher;
		}
		return _matcherCharacter;
	}

	public static Matcher Destroy() {
		if (_matcherDestroy == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.Destroy);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherDestroy = matcher;
		}
		return _matcherDestroy;
	}

	public static Matcher Interactive() {
		if (_matcherInteractive == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.Interactive);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherInteractive = matcher;
		}
		return _matcherInteractive;
	}

	public static Matcher Movable() {
		if (_matcherMovable == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.Movable);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherMovable = matcher;
		}
		return _matcherMovable;
	}

	public static Matcher OnGround() {
		if (_matcherOnGround == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.OnGround);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherOnGround = matcher;
		}
		return _matcherOnGround;
	}

	public static Matcher Player() {
		if (_matcherPlayer == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.Player);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherPlayer = matcher;
		}
		return _matcherPlayer;
	}

	public static Matcher RigidBody() {
		if (_matcherRigidBody == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.RigidBody);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherRigidBody = matcher;
		}
		return _matcherRigidBody;
	}

	public static Matcher Tags() {
		if (_matcherTags == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.Tags);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherTags = matcher;
		}
		return _matcherTags;
	}

	public static Matcher TextureView() {
		if (_matcherTextureView == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(GameComponentsLookup.TextureView);
			matcher.componentNames = GameComponentsLookup.componentNames();
			_matcherTextureView = matcher;
		}
		return _matcherTextureView;
	}
}