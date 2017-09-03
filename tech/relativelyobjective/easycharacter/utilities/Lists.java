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
		DWARF,
		ELF,
		GNOME,
		HALFLING,
		HALF_ELF,
		HALF_ORC,
		HUMAN,
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
		Race.DWARF,
		Race.ELF,
		Race.GNOME,
		Race.HALFLING,
		Race.HALF_ELF,
		Race.HALF_ORC,
		Race.HUMAN,
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
			case DWARF:
				return "Dwarf";
			case ELF:
				return "Elf";
			case HALFLING:
				return "Halfling";
			case HUMAN:
				return "Human";
			case GNOME:
				return "Gnome";
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
	public enum Conditions {
		BLINDED,
		CHARMED,
		DEAFENED,
		DISEASED,
		EXHAUSTED,
		FATIGUED,
		FRIGHTENED,
		GRAPPLED,
		INCAPACITATED,
		INVISIBLE,
		PARALYZED,
		PETRIFIED,
		POISONED,
		PRONE,
		RESTRAINED,
		STUNNED,
		UNCONSCIOUS
	}
	public static final String[] LANGUAGESTES = {
		"Altmeris",
		"Ayleidoon",
		"Bosmeris",
		"Cyrodilic",
		"Daedric",
		"Dovahzul",
		"Dunmeris",
		"Dwenmeris",
		"Ehlnofex",
		"Falmer",
		"Jel",
		"Nedic",
		"Nordic",
		"Old Bretic",
		"Orcish",
		"Sload",
		"Ta'agra",
		"Yoku"
	};
	public static final String[] LANGUAGESDND = {
		"Abyssal",
		"Aquan",
		"Auran",
		"Celestial",
		"Common",
		"Deep Speech",
		"Draconic",
		"Druidic",
		"Dwarvish",
		"Elvish",
		"Giant",
		"Gnomish",
		"Goblin",
		"Gnoll",
		"Halfling",
		"Ignan",
		"Infernal",
		"Orc",
		"Primordial",
		"Sylvan",
		"Terran",
		"Undercommon"
	};
	public enum Size {
		FINE,
		DIMINUTIVE,
		TINY,
		SMALL,
		MEDIUM,
		LARGE,
		HUGE,
		GARGANTUAN,
		COLOSSAL
	}
	public enum Class {
		BARBARIAN,
		BARD,
		CLERIC,
		DRUID,
		FIGHTER,
		MONK,
		PALADIN,
		RANGER,
		ROGUE,
		SORCERER,
		WARLOCK,
		WIZARD
	}
}
