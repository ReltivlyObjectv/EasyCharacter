package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.Size;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Redguard {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Redguard"));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.ATHLETICS, 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Yoku"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.DEXTERITY,2));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CONSTITUTION,1));
		Feature adrenalineRush = new Feature(
			"Adrenaline Rush",
			"Once per long rest, you have advantage on a Strength, "+
			"Dexterity, or Constitution check or save."
		);
		InformationManager.addRaceElement(adrenalineRush);
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
