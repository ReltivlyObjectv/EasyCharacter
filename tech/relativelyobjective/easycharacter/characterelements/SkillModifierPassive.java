package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class SkillModifierPassive implements CharacterElement, Comparable {
	public Lists.Skill skill;
	public Integer modifier;
	
	public SkillModifierPassive() {
		skill = Lists.Skill.ACROBATICS;
		modifier = 0;
	}
	public SkillModifierPassive(Lists.Skill ab, int mod) {
		skill = ab;
		modifier = mod;
	}
	@Override
	public void edit() {
		ObjectIntegerPair newValues = MiscPrompts.openObjectChooserSpinner(Lists.Skill.values(),
			skill,
			modifier,
			-50,
			50,
			"Skill Modifier",
			1
		);
		skill = (Lists.Skill) newValues.object;
		modifier = newValues.value;
	}
	@Override
	public String toString() {
		return String.format("Skill Modifier (Passive): %s%d %s",
			modifier < 0 ? "" : "+",
			modifier,
			InformationManager.capitalizeFirstLetterOfWords(skill)
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
