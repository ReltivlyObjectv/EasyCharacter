package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

/**
 *
 * @author ReltivlyObjectv
 */
public class Darkvision implements CharacterElement,Comparable {
	public Integer distance;

	public Darkvision() {
		distance = 0;
	}
	public Darkvision(int mag) {
		distance = mag;
	}
	@Override
	public void edit() {
		distance = MiscPrompts.openSpinnerPrompt(distance, 0, 1000, "Darkvision", 5);
	}
	@Override
	public String toString() {
		return String.format("Darkvision (%s ft.)", distance);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
