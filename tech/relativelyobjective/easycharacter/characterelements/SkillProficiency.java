package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class SkillProficiency implements CharacterElement {
	public Lists.Skill skill;
	private Integer proficiencyMagnitude;
	/*
		A magnitude of zero means that the proficiencyMagnitude bonus is not applied
		A magnitude of one means that the proficiencyMagnitude bonus is added once
		A magnitude of two means that the proficiencyMagnitude bonus is added twice
	*/
	public SkillProficiency() {
		skill = null;
		proficiencyMagnitude = null;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
