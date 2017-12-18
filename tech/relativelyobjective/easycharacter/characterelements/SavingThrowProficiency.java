package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class SavingThrowProficiency implements CharacterElement,Comparable {
	public Lists.Ability ability;
	private Integer proficiencyMagnitude;
	/*
		A magnitude of zero means that the proficiencyMagnitude bonus is not applied
		A magnitude of one means that the proficiencyMagnitude bonus is added once
		A magnitude of two means that the proficiencyMagnitude bonus is added twice
	*/
	public SavingThrowProficiency() {
		ability = null;
		proficiencyMagnitude = null;
	}
	public SavingThrowProficiency(Lists.Ability a) {
		ability = a;
		proficiencyMagnitude = 1;
	}
	public SavingThrowProficiency(Lists.Ability a, int mag) {
		ability = a;
		proficiencyMagnitude = mag;
	}
	@Override
	public void edit() {
		ObjectIntegerPair<Lists.Ability> newValues = MiscPrompts.openObjectChooserSpinner(
			Lists.Ability.values(),
			ability,
			proficiencyMagnitude,
			0,
			5,
			"Saving Throw Proficiency",
			1
		);
		ability = newValues.object;
		proficiencyMagnitude = newValues.value;
	}
	@Override
	public String toString() {
		return "Saving Throw Proficiency: "+InformationManager.capitalizeFirstLetterOfWords(ability);
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
