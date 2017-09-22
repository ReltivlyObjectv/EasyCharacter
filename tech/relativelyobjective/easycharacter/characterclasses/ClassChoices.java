package tech.relativelyobjective.easycharacter.characterclasses;

import tech.relativelyobjective.easycharacter.characterelements.ProficiencyBonus;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class ClassChoices {
	public static void setupClassChoices(Lists.Class characterClass, int level) {
		if (characterClass == null) {
			throw new NullPointerException();
		} else if (level < 1 || level > 20) {
			//Out of Bounds
			return;
		}
		InformationManager.resetClassElements();
		InformationManager.addClassElement(
			new tech.relativelyobjective.easycharacter.characterelements.Class(characterClass, level)
		);
		InformationManager.addClassElement(
			new ProficiencyBonus(ClassChoices.getProficiencyBonus(level))
		);
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
	public static int getProficiencyBonus(int level) {
		if (level < 1) {
			return 0;
		} else if (level >= 20) {
			return 6;
		}
		switch (level) {
			case 1:
			case 2:
			case 3:
			case 4:
				return 2;
			case 5:
			case 6:
			case 7:
			case 8:
				return 3;
			case 9:
			case 10:
			case 11:
			case 12:
				return 4;
			case 13:
			case 14:
			case 15:
			case 16:
				return 5;
			case 17:
			case 18:
			case 19:
			case 20:
				return 6;
			default:
				return 0;
		}
	}
	public static void applyAbilityScoreImprovement() {
	
	}
}
