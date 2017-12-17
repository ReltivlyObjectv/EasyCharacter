package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

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
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
