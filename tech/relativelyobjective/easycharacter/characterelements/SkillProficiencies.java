package tech.relativelyobjective.easycharacter.characterelements;

import java.util.HashMap;
import java.util.Map;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class SkillProficiencies implements CharacterElement {
	private Map<Lists.Skill, Integer> skillProficiencies;
	/*
		A magnitude of zero means that the proficiency bonus is not applied
		A magnitude of one means that the proficiency bonus is added once
		A magnitude of two means that the proficiency bonus is added twice
	*/
	public SkillProficiencies() {
		skillProficiencies = new HashMap<>();
	}
	public void setProficiencyMagnitude(Lists.Skill skill, Integer magnitude) {
		skillProficiencies.put(skill, magnitude);
		if (magnitude <= 0) {
			skillProficiencies.remove(skill);
		}
	}
	public int getProficiencyMagnitude(Lists.Skill skill) {
		if (skillProficiencies.containsKey(skill)) {
			return skillProficiencies.get(skill);
		} else {
			return 0;
		}
	}
}
