package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

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
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return "Damage Modifier: "+InformationManager.capitalizeFirstLetterOfWords(modifier)
			+" to "
			+InformationManager.capitalizeFirstLetterOfWords(type);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	
}
