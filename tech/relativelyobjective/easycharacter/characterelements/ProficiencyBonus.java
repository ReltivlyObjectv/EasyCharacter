package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

/**
 *
 * @author ReltivlyObjectv
 */
public class ProficiencyBonus implements CharacterElement,Comparable {
	private Integer bonus;

	public ProficiencyBonus() {
		bonus = 0;
	}
	public ProficiencyBonus(int b) {
		bonus = b < 0 ? 0 : b;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int b) {
		bonus = b < 0 ? 0 : b;
	}
	@Override
	public void edit() {
		bonus = MiscPrompts.openSpinnerPrompt(bonus, 0, 10, "Proficiency Bonus");
	}
	@Override
	public String toString() {
		return String.format("Proficiency Bonus: +%d", bonus);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
