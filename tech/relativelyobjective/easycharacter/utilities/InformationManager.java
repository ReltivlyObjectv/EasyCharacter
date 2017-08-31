package tech.relativelyobjective.easycharacter.utilities;

import java.util.TreeSet;
import tech.relativelyobjective.easycharacter.characterelements.*;
import tech.relativelyobjective.easycharacter.utilities.Lists.Race;

/**
 *
 * @author ReltivlyObjectv
 */
public class InformationManager {
	private static Lists.LoreSet loreSet = Lists.LoreSet.DUNGEONS_AND_DRAGONS;
	private static final TreeSet<CharacterElement> raceElements = new TreeSet<>();
	public static Race selectedRace = null;
	
	//TODO Move race information to InformationManagerRace
	
	public static Lists.LoreSet getLoreSet() {
		return loreSet;
	}
	public static void setLoreSet(Lists.LoreSet loreSet) {
		InformationManager.loreSet = loreSet;
		WindowManager.getRaceTab().updateRaceList();
	}
	public static String calculateStatModifierString(int value) {
		int intVal = calculateStatModifier(value);
		if (intVal < 0) {
			return ""+intVal;
		} else {
			return "+"+intVal;
		}
	}
	public static int calculateStatModifier(int value) {
		if (value < 1) {
			return -5;
		} else if(value > 30) {
			return 10;
		} else {
			return (value / 2)-5;
		}
	}
	public static void resetRaceElements() {
		raceElements.clear();
	}
	public static TreeSet<CharacterElement> getRaceElements() {
		return new TreeSet<>(raceElements);
	}
	public static void addRaceElement(AbilityModifier ab) {
		for (CharacterElement c : raceElements) {
			if (c instanceof AbilityModifier) {
				AbilityModifier cMod = (AbilityModifier) c;
				if (cMod.ability.equals(ab.ability)) {
					cMod.modifier += ab.modifier;
					return;
				}
			}
		}
		raceElements.add(ab);
	}
	public static void addRaceElement(DamageModifier newModifier) {
		for (CharacterElement c : raceElements) {
			if (c instanceof DamageModifier) {
				DamageModifier existingModifier = (DamageModifier) c;
				if (existingModifier.type.equals(existingModifier.type)) {
					if (existingModifier.modifier == Lists.DamageMod.IMMUNE || 
						newModifier.modifier == Lists.DamageMod.IMMUNE) {
						//Immune cannot be overwritten
						existingModifier.modifier = Lists.DamageMod.IMMUNE;
					} else if (existingModifier.modifier == Lists.DamageMod.UNMODIFIED &&
						newModifier.modifier != Lists.DamageMod.UNMODIFIED) {
						//Overwrite unmodified
						existingModifier.modifier = newModifier.modifier;
					} else if (existingModifier.modifier != Lists.DamageMod.UNMODIFIED &&
						newModifier.modifier == Lists.DamageMod.UNMODIFIED) {
						//Remove modifier == set to unmodified
						raceElements.remove(existingModifier);
					} else if (existingModifier.modifier == Lists.DamageMod.RESISTANT &&
						existingModifier.modifier == Lists.DamageMod.VULNERABLE
						) {
						//Cancelled effects
						raceElements.remove(existingModifier);
					} else if (existingModifier.modifier == Lists.DamageMod.VULNERABLE &&
						existingModifier.modifier == Lists.DamageMod.RESISTANT
						) {
						//Cancelled effects
						raceElements.remove(existingModifier);
					} else if (existingModifier.modifier.equals(newModifier.modifier)) {
						//No change
						return;
					}
					return;
				}
			}
		}
		if (newModifier.modifier == Lists.DamageMod.UNMODIFIED) {
			//Don't want to add a new modifier that does nothing
			return;
		}
		raceElements.add(newModifier);
	}
	public static void addRaceElement(Feat newFeat) {
		//TODO
	}
	public static void addRaceElement(Feature newFeature) {
		//TODO
	}
	public static void addRaceElement(Language newLanguage) {
		for (CharacterElement c : raceElements) {
			if (c instanceof Language) {
				Language existingLanguage = (Language) c;
				if (existingLanguage.lang.equals(newLanguage.lang)) {
					//Character already knows language
					return;
				}
			}
		}
		raceElements.add(newLanguage);
	}
	public static void addRaceElement(SavingThrowProficiency newProficiency) {
		//TODO
	}
	public static void addRaceElement(SkillProficiency newProficiency) {
		//TODO
	}
}
