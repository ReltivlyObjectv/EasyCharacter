package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class OtherProficiency implements CharacterElement,Comparable {
	public String prof;

	public OtherProficiency() {
		prof = "New Language";
	}
	public OtherProficiency(String p) {
		prof = p;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return "Proficiency: "+prof;
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
