package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class KiAction implements CharacterElement,Comparable {
	private int kiCost;
	public String t, d;
	
	public KiAction() {
		kiCost = 0;
	}
	public KiAction(int cost, String title, String description) {
		((KiAction) this).setKiCount(cost);
		t = title;
		d = description;
	}
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Ki Action (Cost: %d Ki): %s", kiCost, t);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public void setKiCount(int c) {
		if (c < 1) {
			kiCost = 0;
		} else {
			kiCost = c;
		}
	}
	public int getKiCount() {
		return kiCost;
	}
}
