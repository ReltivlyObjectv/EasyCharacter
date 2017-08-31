package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class OtherProficiency implements CharacterElement,Comparable {
	public String prof;
	private Integer proficiencyMagnitude;

	public OtherProficiency() {
		prof = "New Language";
	}
	public OtherProficiency(String p, int mag) {
		prof = p;
		proficiencyMagnitude = mag;
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
	public void setProficiencyMagnitude(Integer magnitude) {
		proficiencyMagnitude = magnitude;
		if (magnitude <= 0) {
			proficiencyMagnitude = 0;
		}
	}
	public int getProficiencyMagnitude() {
		return proficiencyMagnitude;
	}
}
