package tech.relativelyobjective.easycharacter.characterclasses;

import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class ClassChoices {
	public static void setupClassChoices(Lists.Class characterClass, int level) {
		if (characterClass == null) {
			throw new NullPointerException();
		}
		switch (characterClass) {
			case BARBARIAN:
				Barbarian.setup(level);
				break;
			case BARD:
				Bard.setup(level);
				break;
			case CLERIC:
				Cleric.setup(level);
				break;
			case DRUID:
				Druid.setup(level);
				break;
			case FIGHTER:
				Fighter.setup(level);
				break;
			case MONK:
				Monk.setup(level);
				break;
			case PALADIN:
				Paladin.setup(level);
				break;
			case RANGER:
				Ranger.setup(level);
				break;
			case ROGUE:
				Rogue.setup(level);
				break;
			case SORCERER:
				Sorcerer.setup(level);
				break;
			case WARLOCK:
				Warlock.setup(level);
				break;
			case WIZARD:
				Wizard.setup(level);
				break;
			default:
				throw new UnsupportedOperationException();
		}
	}
}
