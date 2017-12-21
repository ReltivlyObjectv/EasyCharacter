package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

/**
 *
 * @author ReltivlyObjectv
 */
public class InitiativeModifier implements CharacterElement, Comparable {
	public Integer modifier;
	
	public InitiativeModifier() {
		modifier = 0;
	}
	public InitiativeModifier(int mod) {
		modifier = mod;
	}
	@Override
	public void edit() {
		modifier = MiscPrompts.openSpinnerPrompt(
			modifier,
			-50,
			50,
			"Initiative Modifier",
			1
		);
	}
	@Override
	public String toString() {
		return String.format("Initiative Modifier: %s%d",
			modifier < 0 ? "" : "+",
			modifier
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
