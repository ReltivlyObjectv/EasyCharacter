package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class DamageModifier implements CharacterElement {
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
}
