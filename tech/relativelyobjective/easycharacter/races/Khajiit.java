package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.Darkvision;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Khajiit {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.STEALTH, 1));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.SLEIGHT_OF_HAND, 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Ta'agra"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.DEXTERITY,2));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.INTELLIGENCE,1));
		InformationManager.addRaceElement(new Darkvision(120));
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
