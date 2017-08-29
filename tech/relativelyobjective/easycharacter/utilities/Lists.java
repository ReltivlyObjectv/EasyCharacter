package tech.relativelyobjective.easycharacter.utilities;

/**
 *
 * @author ReltivlyObjectv
 */
public class Lists {
	public static final String[] ABILITIES = {
		"Strength",
		"Dexterity",
		"Constitution",
		"Intelligence",
		"Wisdom",
		"Charisma"
	};
	public enum Ability {
		STRENGTH,
		DEXTERITY,
		CONSTITUTION,
		INTELLIGENCE,
		WISDOM,
		CHARISMA
	}
	public int getAbilityIndex(Ability ability) {
		Ability[] abilities = Ability.values();
		for (int i = 0; i < abilities.length; i++) {
			if (abilities[i] == ability) {
				return i;
			}
		}
		return -1;
	}
	public String getAbilityString(Ability ability) {
		return ABILITIES[getAbilityIndex(ability)];
	}
	public static final String[] SKILLS = {
		"Acrobatics",
		"Animal Handling",
		"Arcana",
		"Athletics",
		"Deception",
		"History",
		"Insight",
		"Intimidation",
		"Investigation",
		"Medicine",
		"Nature",
		"Perception",
		"Performance",
		"Persuasion",
		"Religion",
		"Sleight of Hand",
		"Stealth",
		"Survival"
	};
	public enum Skill {
		ACROBATICS,
		ANIMAL_HANDLING,
		ARCANA,
		ATHLETICS,
		DECEPTION,
		HISTORY,
		INSIGHT,
		INTIMIDATION,
		INVESTIGATION,
		MEDICINE,
		NATURE,
		PERCEPTION,
		PERFORMANCE,
		PERSUASION,
		RELIGION,
		SLEIGHT_OF_HAND,
		STEALTH,
		SURVIVAL
	}
	public int getSkillIndex(Skill skill) {
		Skill[] skills = Skill.values();
		for (int i = 0; i < skills.length; i++) {
			if (skills[i] == skill) {
				return i;
			}
		}
		return -1;
	}
	public String getSkillString(Skill skill) {
		return SKILLS[getSkillIndex(skill)];
	}
	public Ability getSkillAbility(Skill skill) {
		switch (skill) {
			case ATHLETICS:
				return Ability.STRENGTH;
			case ACROBATICS:
			case SLEIGHT_OF_HAND:
			case STEALTH:
				return Ability.DEXTERITY;
			case ARCANA:
			case HISTORY:
			case INVESTIGATION:
			case NATURE:
			case RELIGION:
				return Ability.INTELLIGENCE;
			case ANIMAL_HANDLING:
			case INSIGHT:
			case MEDICINE:
			case SURVIVAL:
				return Ability.WISDOM;
			case DECEPTION:
			case INTIMIDATION:
			case PERFORMANCE:
			case PERSUASION:
				return Ability.CHARISMA;
		}
		return null;
	}
}
