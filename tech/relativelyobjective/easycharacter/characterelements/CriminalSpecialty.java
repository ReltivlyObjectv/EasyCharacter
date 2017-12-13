package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class CriminalSpecialty implements CharacterElement,Comparable {
	public Lists.CriminalSpecialty specialty;

	public CriminalSpecialty() {
		specialty = null;
	}
	public CriminalSpecialty(Lists.CriminalSpecialty s) {
		specialty = s;
	}
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return "Criminal Specialty: "+InformationManager.capitalizeFirstLetterOfWords(specialty);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
