package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

/**
 *
 * @author ReltivlyObjectv
 */
public class Race implements CharacterElement,Comparable {
	public String race;

	public Race() {
		race = "";
	}
	public Race(String r) {
		race = r;
	}
	@Override
	public void edit() {
		race = MiscPrompts.openStringPrompt("Race", race);
	}
	@Override
	public String toString() {
		return "Race: "+race;
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
