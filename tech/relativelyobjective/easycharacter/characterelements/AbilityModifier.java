package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class AbilityModifier implements CharacterElement, Comparable {
	public Lists.Ability ability;
	public Integer modifier;
	
	public AbilityModifier() {
		ability = null;
		modifier = null;
	}
	public AbilityModifier(Lists.Ability ab, int mod) {
		ability = ab;
		modifier = mod;
	}
	@Override
	public void edit() {
		ObjectIntegerPair newValues = MiscPrompts.openObjectChooserSpinner(
			Lists.Ability.values(),
			ability,
			modifier,
			-50,
			50,
			"Ability Modifier",
			1
		);
		ability = (Lists.Ability) newValues.object;
		modifier = newValues.value;
	}
	@Override
	public String toString() {
		return String.format("Ability Modifier: %s%d %s",
			modifier < 0 ? "" : "+",
			modifier,
			InformationManager.capitalizeFirstLetterOfWords(ability)
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
