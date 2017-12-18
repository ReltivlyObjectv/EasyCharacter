package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class OtherProficiency implements CharacterElement,Comparable {
	public String prof;
	private Integer proficiencyMagnitude;

	public OtherProficiency() {
		prof = "New Language";
	}
	public OtherProficiency(String p) {
		prof = p;
		proficiencyMagnitude = 1;
	}
	public OtherProficiency(String p, int mag) {
		prof = p;
		proficiencyMagnitude = mag;
	}
	@Override
	public void edit() {
		ObjectIntegerPair<String> newValues = MiscPrompts.openStringSpinnerPrompt(
			prof,
			proficiencyMagnitude,
			0,
			5,
			"Misc. Proficiency",
			1
		);
		prof = newValues.object;
		proficiencyMagnitude = newValues.value;
	}
	@Override
	public String toString() {
		return "Proficiency: "+prof;
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public void setProficiencyMagnitude(Integer magnitude) {
		proficiencyMagnitude = magnitude;
		if (magnitude <= 0) {
			proficiencyMagnitude = 0;
		}
	}
	public int getProficiencyMagnitude() {
		return proficiencyMagnitude;
	}
}
