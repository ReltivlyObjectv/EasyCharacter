package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Ki implements CharacterElement,Comparable {
	private int kiCount;
	
	public Ki() {
		kiCount = 1;
	}
	public Ki(int c) {
		((Ki) this).setKiCount(c);
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Ki: %d", kiCount);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public void setKiCount(int c) {
		if (c < 1) {
			kiCount = 0;
		} else {
			kiCount = c;
		}
	}
	public int getKiCount() {
		return kiCount;
	}
}
