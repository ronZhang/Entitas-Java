package com.ilargia.games.egdx.logicbricks.gen.input;

import com.ilargia.games.entitas.matcher.Matcher;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class InputMatcher {

	private static Matcher _matcherPadButtons;
	private static Matcher _matcherPlayerInputController;
	private static Matcher _matcherTouchPad;

	public static Matcher PadButtons() {
		if (_matcherPadButtons == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(InputComponentsLookup.PadButtons);
			matcher.componentNames = InputComponentsLookup.componentNames();
			_matcherPadButtons = matcher;
		}
		return _matcherPadButtons;
	}

	public static Matcher PlayerInputController() {
		if (_matcherPlayerInputController == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(InputComponentsLookup.PlayerInputController);
			matcher.componentNames = InputComponentsLookup.componentNames();
			_matcherPlayerInputController = matcher;
		}
		return _matcherPlayerInputController;
	}

	public static Matcher TouchPad() {
		if (_matcherTouchPad == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(InputComponentsLookup.TouchPad);
			matcher.componentNames = InputComponentsLookup.componentNames();
			_matcherTouchPad = matcher;
		}
		return _matcherTouchPad;
	}
}