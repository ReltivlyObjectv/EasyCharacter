package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class DamageModifier implements CharacterElement,Comparable {
	public String type;
	public Lists.DamageMod modifier;
	
	public DamageModifier() {
		type = null;
		modifier = null;
	}
	public DamageModifier(String t, Lists.DamageMod mod) {
		type = t;
		modifier = mod;
	}
	@Override
	public void edit() {
		ObjectPair<Lists.DamageMod, String> newValues = MiscPrompts.openStringAndObjectChooserPrompt(
			Lists.DamageMod.values(),
			modifier,
			Lists.DamageType,
			type,
			"Damage Modifier"
		);
		modifier = newValues.objectA;
		type = newValues.objectB;
	}
	@Override
	public String toString() {
		return String.format(
			"Damage Modifier: %s to %s",
			InformationManager.capitalizeFirstLetterOfWords(modifier),
			InformationManager.capitalizeFirstLetterOfWords(type)
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	
}
