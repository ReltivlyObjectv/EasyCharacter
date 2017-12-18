package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Rages implements CharacterElement,Comparable {
	private int rageCount;
	
	public Rages() {
		rageCount = 1;
	}
	public Rages(int c) {
		((Rages) this).setRageCount(c);
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		if (rageCount == Integer.MAX_VALUE) {
			return String.format("Rages: %s", "Unlimited");
		} else {
			return String.format("Rages: %d", rageCount);
		}
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public void setRageCount(int c) {
		if (c < 1) {
			rageCount = 0;
		} else {
			rageCount = c;
		}
	}
	public int getRageCount() {
		return rageCount;
	}
}
