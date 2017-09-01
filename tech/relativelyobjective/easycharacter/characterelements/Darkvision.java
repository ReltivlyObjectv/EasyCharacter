package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Darkvision implements CharacterElement,Comparable {
	public Integer distance;

	public Darkvision() {
		distance = 0;
	}
	public Darkvision(int mag) {
		distance = mag;
	}
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Darkvision (%s ft.)", distance);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
