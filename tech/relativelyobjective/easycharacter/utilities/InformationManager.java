package tech.relativelyobjective.easycharacter.utilities;

import java.util.HashMap;
import java.util.TreeSet;
import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElementList;
import tech.relativelyobjective.easycharacter.characterelements.Feat;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.characterelements.Spell;
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
	private static final CharacterElementList BACKGROUNDELEMENTS = new CharacterElementList();
	
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
	public static void revalidateRaceElements() {
		RACEELEMENTS.revalidate();
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
	public static void revalidateClassElements() {
		CLASSELEMENTS.revalidate();
	}
	public static TreeSet<CharacterElement> getBackgroundElements() {
		return BACKGROUNDELEMENTS.getCharacterElements();
	}
	public static void addBackgroundElement(CharacterElement e) {
		BACKGROUNDELEMENTS.addCharacterElement(e);
	}
	public static void resetBackgroundElements() {
		BACKGROUNDELEMENTS.resetCharacterElements();
	}
	public static void revalidateBackgroundElements() {
		BACKGROUNDELEMENTS.revalidate();
	}
	public static TreeSet<CharacterElement> getAllElements() {
		CharacterElementList returnMe = new CharacterElementList();
		for (CharacterElement e : RACEELEMENTS.getCharacterElements()) {
			returnMe.addCharacterElement(e);
		}
		for (CharacterElement e : CLASSELEMENTS.getCharacterElements()) {
			returnMe.addCharacterElement(e);
		}
		for (CharacterElement e : BACKGROUNDELEMENTS.getCharacterElements()) {
			returnMe.addCharacterElement(e);
		}
		return returnMe.getCharacterElements();
	}
	public static HashMap<Lists.Ability, Integer> getAbilityScores() {
		int str = WindowManager.getStatsTab().getStrength();
		int dex = WindowManager.getStatsTab().getDexterity();
		int con = WindowManager.getStatsTab().getConstitution();
		int intel=WindowManager.getStatsTab().getIntelligence();
		int wis = WindowManager.getStatsTab().getWisdom();
		int cha = WindowManager.getStatsTab().getCharisma();
		for (CharacterElement e : getAllElements()) {
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
	public static HashMap<Lists.Skill, Integer> getSkillProficiencies() {
		HashMap<Lists.Skill, Integer> returnMe = new HashMap<>();
		for (CharacterElement e : getAllElements()) {
			if (e instanceof SkillProficiency) {
				SkillProficiency p = (SkillProficiency) e;
				if (returnMe.containsKey(p.skill)) {
					//This should never happen
				} else {
					returnMe.put(p.skill, p.getProficiencyMagnitude());
				}
			}
		}
		return returnMe;
	}
	public static boolean isProficient(Lists.Skill skill) {
		HashMap<Lists.Skill, Integer> profs = getSkillProficiencies();
		if (profs.containsKey(skill)) {
			if (profs.get(skill) > 0) {
				return true;
			} else {
				//This should never happen
			}
		}
		return false;
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
	public static String[] getKnownLanguages() {
		TreeSet<String> knownLangs = new TreeSet<>();
		for (CharacterElement e : getAllElements()) {
			if (e instanceof Language) {
				Language l = (Language) e;
				knownLangs.add(l.lang);
			}
		}
		return knownLangs.toArray(new String[knownLangs.size()]);
	}
	public static String[] getUnknownLanguages() {
		String [] allLanguages = InformationManager.getLoreSet() == Lists.LoreSet.DUNGEONS_AND_DRAGONS 
			? Lists.LANGUAGESDND 
			: Lists.LANGUAGESTES;
		TreeSet<String> unknownLangs = new TreeSet<>();
		for (String s : allLanguages) {
			boolean known = false;
			for (String l : getKnownLanguages()) {
				if (l.equals(s)){
					known = true;
					break;
				}
			}
			if (!known) {
				unknownLangs.add(s);
			}
		}
		return unknownLangs.toArray(new String[unknownLangs.size()]);
	}
	public static boolean knowsLanguage(String l) {
		for (String s : getKnownLanguages()) {
			if (s.equals(l)) {
				return true;
			}
		}
		return false;
	}
	public static Spell[] getKnownSpells() {
		TreeSet<Spell> knownSpells = new TreeSet<>();
		for (CharacterElement e : getAllElements()) {
			if (e instanceof Spell) {
				knownSpells.add((Spell) e);
			}
		}
		return knownSpells.toArray(new Spell[knownSpells.size()]);
	}
	public static Spell[] getUnknownSpells() {
		TreeSet<Spell> unknownSpells = new TreeSet<>();
		for (SpellLists.SpellKey s : SpellLists.SpellKey.values()) {
			Spell keysSpell = AllSpells.getSpell(s);
			if (!knowsSpell(keysSpell)) {
				unknownSpells.add(keysSpell);
			}
		}
		return unknownSpells.toArray(new Spell[unknownSpells.size()]);
	}
	public static boolean knowsSpell(Spell s) {
		for (Spell sp : getKnownSpells()) {
			if (s.name.equals(sp.name)) {
				return true;
			}
		}
		return false;
	}
	public static Feat[] getPossessedFeats() {
		TreeSet<Feat> ownedFeats = new TreeSet<>();
		for (CharacterElement e : getAllElements()) {
			if (e instanceof Feat) {
				ownedFeats.add((Feat) e);
			}
		}
		return ownedFeats.toArray(new Feat[ownedFeats.size()]);
	}
	public static Feat[] getNonPossessedFeats() {
		TreeSet<Feat> nonPossessedFeats = new TreeSet<>();
		for (Feat f : AllFeats.ALL_FEATS) {
			if (!hasFeat(f)) {
				nonPossessedFeats.add(f);
			}
		}
		return nonPossessedFeats.toArray(new Feat[nonPossessedFeats.size()]);
	}
	public static boolean hasFeat(Feat f) {
		for (Feat ft : getPossessedFeats()) {
			if (ft.name.equals(f.name)) {
				return true;
			}
		}
		return false;
	}
}
