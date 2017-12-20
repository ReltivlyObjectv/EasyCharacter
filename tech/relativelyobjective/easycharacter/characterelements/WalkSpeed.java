package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

/**
 *
 * @author ReltivlyObjectv
 */
public class WalkSpeed implements CharacterElement,Comparable {
	public Integer distance;

	public WalkSpeed() {
		distance = 30;
	}
	public WalkSpeed(int mag) {
		distance = mag;
	}
	@Override
	public void edit() {
		distance = MiscPrompts.openSpinnerPrompt(distance, 0, 120, "Walk Speed", 5);
	}
	@Override
	public String toString() {
		return String.format("Walk Speed: %d ft.", distance);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
