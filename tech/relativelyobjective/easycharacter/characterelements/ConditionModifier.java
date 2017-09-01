package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

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
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return "Condition Modifier: "+InformationManager.capitalizeFirstLetterOfWords(modifier)
			+" to being "
			+InformationManager.capitalizeFirstLetterOfWords(type);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	
}
