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
	public static int getSkillIndex(Skill skill) {
		Skill[] skills = Skill.values();
		for (int i = 0; i < skills.length; i++) {
			if (skills[i] == skill) {
				return i;
			}
		}
		return -1;
	}
	public static String getSkillString(Skill skill) {
		return SKILLS[getSkillIndex(skill)];
	}
	public static Ability getSkillAbility(Skill skill) {
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
	public enum LoreSet {
		DUNGEONS_AND_DRAGONS,
		THE_ELDER_SCROLLS
	}
	public enum Race {
		DRAGONBORN,
		DWARF_HILL,
		DWARF_MOUNTAIN,
		ELF_DARK,
		ELF_HIGH,
		ELF_WOOD,
		HALFLING,
		HUMAN,
		GNOME_FOREST,
		GNOME_ROCK,
		HALF_ELF,
		HALF_ORC,
		TIEFLING,
		ALTMER,
		BOSMER,
		BRETON,
		DUNMER,
		IMPERIAL,
		KHAJIIT,
		NORD,
		ORSIMER,
		REDGUARD,
		SAXHLEEL
	}
	public static final Race[] RacesDND = {
		Race.DRAGONBORN,
		Race.DWARF_HILL,
		Race.DWARF_MOUNTAIN,
		Race.ELF_DARK,
		Race.ELF_HIGH,
		Race.ELF_WOOD,
		Race.HALFLING,
		Race.HUMAN,
		Race.GNOME_FOREST,
		Race.GNOME_ROCK,
		Race.HALF_ELF,
		Race.HALF_ORC,
		Race.TIEFLING
	};
	public static final Race[] RacesTES = {
		Race.ALTMER,
		Race.BOSMER,
		Race.BRETON,
		Race.DUNMER,
		Race.IMPERIAL,
		Race.KHAJIIT,
		Race.NORD,
		Race.ORSIMER,
		Race.REDGUARD,
		Race.SAXHLEEL
	};
	public static String getUserFriendlyRace(Race r) {
		switch (r) {
			case DRAGONBORN:
				return "Dragonborn";
			case DWARF_HILL:
				return "Dwarf, Hill";
			case DWARF_MOUNTAIN:
				return "Dwarf, Mountain";
			case ELF_DARK:
				return "Elf, Dark (Drow)";
			case ELF_HIGH:
				return "Elf, High";
			case ELF_WOOD:
				return "Elf, Wood";
			case HALFLING:
				return "Halfling";
			case HUMAN:
				return "Human";
			case GNOME_FOREST:
				return "Gnome, Forest";
			case GNOME_ROCK:
				return "Gnome, Rock";
			case HALF_ELF:
				return "Half-Elf";
			case HALF_ORC:
				return "Half-Orc";
			case TIEFLING:
				return "Tiefling";
			case ALTMER:
				return "Altmer (High Elf)";
			case BOSMER:
				return "Bosmer (Wood Elf)";
			case BRETON:
				return "Breton";
			case DUNMER:
				return "Dunmer (Dark Elf)";
			case IMPERIAL:
				return "Imperial";
			case KHAJIIT:
				return "Khajiit";
			case NORD:
				return "Nord";
			case ORSIMER:
				return "Orsimer (Orc)";
			case REDGUARD:
				return "Redguard";
			case SAXHLEEL:
				return "Saxhleel (Argonian)";
			default:
				return null;
		}
	}
	public enum ModifierType {
		CONDITION,
		DAMAGE
	}
	public enum DamageMod {
		IMMUNE,
		RESISTANT,
		VULNERABLE,
		UNMODIFIED
	}
	public static final String[] DamageType = {
		"Acid",
		"Bludgeoning",
		"Cold",
		"Fire",
		"Force",
		"Lightning",
		"Necrotic",
		"Piercing",
		"Poison",
		"Psychic",
		"Radiant",
		"Slashing",
		"Thunder"
	};
}
