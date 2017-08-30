package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class DamageModifier implements CharacterElement,Comparable {
	public Lists.DamageType type;
	public Lists.DamageMod modifier;
	
	public DamageModifier() {
		type = null;
		modifier = null;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
