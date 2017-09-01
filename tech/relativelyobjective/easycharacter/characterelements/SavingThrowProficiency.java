package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.Lists;

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
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return "Saving Throw Proficiency: "+ability;
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
