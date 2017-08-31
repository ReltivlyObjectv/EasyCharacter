package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class OtherEffect implements CharacterElement,Comparable {
	public String effect;

	public OtherEffect() {
		effect = "";
	}
	public OtherEffect(String l) {
		effect = l;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return effect;
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
