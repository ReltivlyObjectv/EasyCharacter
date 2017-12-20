package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectSet;

/**
 *
 * @author ReltivlyObjectv
 */
public class Spell implements CharacterElement,Comparable {
	public String name, description;
	private int level;
	
	public Spell() {
		name = "";
		description = "";
		level = 0;
	}
	public Spell(String n, String d, int l) {
		name = n;
		description = d;
		level = l;
	}
	@Override
	public void edit() {
		ObjectSet<String, String, Integer> newValues = MiscPrompts.openShortAndLongStringSpinnerPrompt(
			name,
			description,
			level,
			0,
			9,
			"Spell",
			1
		);
	}
	@Override
	public String toString() {
		return String.format("Spell: %s (%s)",
			name,
			level < 1 ? "Cantrip" : "Level "+level
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int l) {
		level = l < 1 ? 0 
			: l > 9 ? 9 
			: l;
	}
}
