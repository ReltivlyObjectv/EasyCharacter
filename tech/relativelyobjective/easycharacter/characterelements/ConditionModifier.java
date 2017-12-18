package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class ConditionModifier implements CharacterElement,Comparable {
	public Lists.Conditions type;
	public Lists.DamageMod modifier;
	
	public ConditionModifier() {
		type = null;
		modifier = null;
	}
	public ConditionModifier(Lists.Conditions c, Lists.DamageMod mod) {
		type = c;
		modifier = mod;
	}
	@Override
	public void edit() {
		ObjectPair<Lists.DamageMod, Lists.Conditions> newValues = MiscPrompts.openTwoMultipleObjectChooserPrompt(
			Lists.DamageMod.values(),
			modifier,
			Lists.Conditions.values(),
			type,
			"Condition Modifier"
		);
		modifier = newValues.objectA;
		type = newValues.objectB;
	}
	@Override
	public String toString() {
		return String.format(
			"Condition Modifier: %s to being %s",
			InformationManager.capitalizeFirstLetterOfWords(modifier),
			InformationManager.capitalizeFirstLetterOfWords(type)
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	
}
