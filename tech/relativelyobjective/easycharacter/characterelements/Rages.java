package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

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
		rageCount = MiscPrompts.openSpinnerPrompt(rageCount, 0, 20, "Rages (20 means Unlimited)");
	}
	@Override
	public String toString() {
		if (rageCount >= 20) {
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
		} else if (c > 20) {
			rageCount = 20;
		} else {
			rageCount = c;
		}
	}
	public int getRageCount() {
		return rageCount;
	}
}
