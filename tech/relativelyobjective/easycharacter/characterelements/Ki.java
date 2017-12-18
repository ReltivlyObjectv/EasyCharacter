package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

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
		setKiCount(MiscPrompts.openSpinnerPrompt(
			kiCount,
			0,
			50,
			"Number of Ki Points"
		));
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
