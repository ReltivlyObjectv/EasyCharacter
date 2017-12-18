package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class WalkSpeed implements CharacterElement,Comparable {
	public Integer distance;

	public WalkSpeed() {
		distance = 0;
	}
	public WalkSpeed(int mag) {
		distance = mag;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Walk Speed: %d ft.", distance);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
