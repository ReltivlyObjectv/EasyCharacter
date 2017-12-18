package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectSet;

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
	public void edit() {
		ObjectSet<String, String, Integer> newValues = MiscPrompts.openShortAndLongStringSpinnerPrompt(
			t,
			d,
			kiCost,
			0,
			50,
			"Ki Action",
			1
		);
		t = newValues.objectA;
		d = newValues.objectB;
		kiCost = newValues.objectC;
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
