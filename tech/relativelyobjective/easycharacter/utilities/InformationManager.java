package tech.relativelyobjective.easycharacter.utilities;

import java.util.HashMap;
import java.util.TreeSet;
import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElementList;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.Lists.Race;

/**
 *
 * @author ReltivlyObjectv
 */
public class InformationManager {
	private static Lists.LoreSet loreSet = Lists.LoreSet.DUNGEONS_AND_DRAGONS;
	public static Race selectedRace = null;
	private static final CharacterElementList RACEELEMENTS = new CharacterElementList();
	private static final CharacterElementList CLASSELEMENTS = new CharacterElementList();
	
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
	public static String capitalizeFirstLetterOfWords(Object o) {
		String s = o.toString().replace("_", " ");
		String[] split = s.split(" ");
		String finalString = "";
		for (int i = 0; i < split.length; i++) {
			if (s.length() < 2) {
				finalString += split[i].toUpperCase();
			} else {
				finalString += split[i].substring(0,1).toUpperCase() + 
					split[i].substring(1).toLowerCase();
			}
			if (i != split.length - 1) {
				finalString += " ";
			}
		}
		return finalString;
	}
	public static TreeSet<CharacterElement> getRaceElements() {
		return RACEELEMENTS.getCharacterElements();
	}
	public static void addRaceElement(CharacterElement e) {
		RACEELEMENTS.addCharacterElement(e);
	}
	public static void resetRaceElements() {
		RACEELEMENTS.resetCharacterElements();
	}
	public static TreeSet<CharacterElement> getClassElements() {
		return CLASSELEMENTS.getCharacterElements();
	}
	public static void addClassElement(CharacterElement e) {
		CLASSELEMENTS.addCharacterElement(e);
	}
	public static void resetClassElements() {
		CLASSELEMENTS.resetCharacterElements();
	}
	public static TreeSet<CharacterElement> getAllElements() {
		TreeSet<CharacterElement> returnMe = new TreeSet<>();
		for (CharacterElement e : RACEELEMENTS.getCharacterElements()) {
			returnMe.add(e);
		}
		for (CharacterElement e : CLASSELEMENTS.getCharacterElements()) {
			returnMe.add(e);
		}
		return returnMe;
	}
	public static HashMap<Lists.Ability, Integer> getCurrentSkills() {
		int str = WindowManager.getStatsTab().getStrength();
		int dex = WindowManager.getStatsTab().getDexterity();
		int con = WindowManager.getStatsTab().getConstitution();
		int intel=WindowManager.getStatsTab().getIntelligence();
		int wis = WindowManager.getStatsTab().getWisdom();
		int cha = WindowManager.getStatsTab().getCharisma();
		//Race Elements
		for (CharacterElement e : RACEELEMENTS.getCharacterElements()) {
			if (e instanceof AbilityModifier) {
				AbilityModifier mod = (AbilityModifier) e;
				switch (mod.ability) {
					case STRENGTH:
						str += mod.modifier;
						break;
					case DEXTERITY:
						dex += mod.modifier;
						break;
					case CONSTITUTION:
						con += mod.modifier;
						break;
					case INTELLIGENCE:
						intel += mod.modifier;
						break;
					case WISDOM:
						wis += mod.modifier;
						break;
					case CHARISMA:
						cha += mod.modifier;
						break;
				}
			}
		}
		//Class Elements
		for (CharacterElement e : CLASSELEMENTS.getCharacterElements()) {
			if (e instanceof AbilityModifier) {
				AbilityModifier mod = (AbilityModifier) e;
				switch (mod.ability) {
					case STRENGTH:
						str += mod.modifier;
						break;
					case DEXTERITY:
						dex += mod.modifier;
						break;
					case CONSTITUTION:
						con += mod.modifier;
						break;
					case INTELLIGENCE:
						intel += mod.modifier;
						break;
					case WISDOM:
						wis += mod.modifier;
						break;
					case CHARISMA:
						cha += mod.modifier;
						break;
				}
			}
		}
		HashMap<Lists.Ability, Integer> returnMe = new HashMap<>();
		returnMe.put(Lists.Ability.STRENGTH, str);
		returnMe.put(Lists.Ability.DEXTERITY, dex);
		returnMe.put(Lists.Ability.CONSTITUTION, con);
		returnMe.put(Lists.Ability.INTELLIGENCE, intel);
		returnMe.put(Lists.Ability.WISDOM, wis);
		returnMe.put(Lists.Ability.CHARISMA, cha);
		return returnMe;
	}
	public static int getSpeed() {
		for (CharacterElement e : getAllElements()) {
			if (e instanceof WalkSpeed) {
				WalkSpeed s = (WalkSpeed) e;
				return s.distance;
			}
		}
		return 30;
	}
}
