package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class SkillProficiency implements CharacterElement,Comparable {
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
	public SkillProficiency(Lists.Skill s) {
		skill = s;
		proficiencyMagnitude = 1;
	}
	public SkillProficiency(Lists.Skill s, int profMag) {
		skill = s;
		((SkillProficiency) this).setProficiencyMagnitude(profMag);
	}
	@Override
	public void edit() {
		ObjectIntegerPair<Lists.Skill> newValues = MiscPrompts.openObjectChooserSpinner(
			Lists.Skill.values(),
			skill,
			proficiencyMagnitude,
			0,
			5,
			"Skill Proficiency",
			1
		);
		skill = newValues.object;
		proficiencyMagnitude = newValues.value;
	}
	@Override
	public String toString() {
		return "Skill Proficiency: "+InformationManager.capitalizeFirstLetterOfWords(skill);
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
