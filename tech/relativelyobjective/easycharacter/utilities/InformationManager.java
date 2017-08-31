package tech.relativelyobjective.easycharacter.utilities;

import java.util.TreeSet;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElementList;
import tech.relativelyobjective.easycharacter.utilities.Lists.Race;

/**
 *
 * @author ReltivlyObjectv
 */
public class InformationManager {
	private static Lists.LoreSet loreSet = Lists.LoreSet.DUNGEONS_AND_DRAGONS;
	public static Race selectedRace = null;
	private static final CharacterElementList RaceElements = new CharacterElementList();
	
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
	public static String capitalizeFirstLetterOnly(Object o) {
		String s = o.toString();
		if (s == null) {
			return null;
		} else if (s.length() < 2) {
			return s.toUpperCase();
		} else {
			return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
		}
	}
	public static TreeSet<CharacterElement> getRaceElements() {
		return RaceElements.getCharacterElements();
	}
	public static void addRaceElement(CharacterElement e) {
		RaceElements.addCharacterElement(e);
	}
	public static void resetRaceElements() {
		RaceElements.resetCharacterElements();
	}
}
