package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class InitiativeModifier implements CharacterElement, Comparable {
	public Integer modifier;
	
	public InitiativeModifier() {
		modifier = 0;
	}
	public InitiativeModifier(int mod) {
		modifier = mod;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Initiative Modifier: %s%d",
			modifier < 0 ? "" : "+",
			modifier
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
