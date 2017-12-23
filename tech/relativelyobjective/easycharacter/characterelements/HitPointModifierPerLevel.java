package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

/**
 *
 * @author ReltivlyObjectv
 */
public class HitPointModifierPerLevel implements CharacterElement,Comparable {
	public int mod;
	
	public HitPointModifierPerLevel() {
		mod = 0;
	}
	public HitPointModifierPerLevel(int c) {
		mod = c;
	}
	@Override
	public void edit() {
		mod = MiscPrompts.openSpinnerPrompt(
			mod,
			-50,
			50,
			"Additional or Fewer Hit Points (Per Level)"
		);
	}
	@Override
	public String toString() {
		return String.format("Hit Point Modifier (per level): %s%d", 
			mod < 0 ? "" : "+",
			mod
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
