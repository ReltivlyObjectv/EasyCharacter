package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class MaxAbilityScore implements CharacterElement,Comparable {
	public Lists.Ability ability;
	public int maxScore;
	
	public MaxAbilityScore(Lists.Ability ab) {
		ability = ab;
		maxScore = 20;
	}
	public MaxAbilityScore(Lists.Ability ab, int max) {
		ability = ab;
		maxScore = max;
	}
	@Override
	public void edit() {
		ObjectIntegerPair<Lists.Ability> newValues = MiscPrompts.openObjectChooserSpinner(
			Lists.Ability.values(),
			ability,
			maxScore,
			20,
			30,
			"Maximum Ability Score",
			1
		);
		ability = newValues.object;
		maxScore = newValues.value;
	}
	@Override
	public String toString() {
		return String.format(
			"Ability Maximum (%s): %d",
			InformationManager.capitalizeFirstLetterOfWords(ability),
			maxScore
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
