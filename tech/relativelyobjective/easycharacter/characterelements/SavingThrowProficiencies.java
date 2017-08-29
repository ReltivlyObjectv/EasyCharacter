package tech.relativelyobjective.easycharacter.characterelements;

import java.util.HashMap;
import java.util.Map;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class SavingThrowProficiencies implements CharacterElement {
	private Map<Lists.Ability, Integer> savingThrowProficiencies;
	/*
		A magnitude of zero means that the proficiency bonus is not applied
		A magnitude of one means that the proficiency bonus is added once
		A magnitude of two means that the proficiency bonus is added twice
	*/
	public SavingThrowProficiencies() {
		savingThrowProficiencies = new HashMap<>();
	}
	public void setProficiencyMagnitude(Lists.Ability ability, Integer magnitude) {
		savingThrowProficiencies.put(ability, magnitude);
		if (magnitude <= 0) {
			savingThrowProficiencies.remove(ability);
		}
	}
	public int getProficiencyMagnitude(Lists.Ability ability) {
		if (savingThrowProficiencies.containsKey(ability)) {
			return savingThrowProficiencies.get(ability);
		} else {
			return 0;
		}
	}
}
