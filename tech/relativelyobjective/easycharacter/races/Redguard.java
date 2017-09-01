package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.Feat;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
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
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.ATHLETICS, 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Yoku"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.DEXTERITY,2));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CONSTITUTION,1));
		Feat dualWielder = new Feat("Dual Wielder");
		InformationManager.addRaceElement(dualWielder);
		Feature adrenalineRush = new Feature();
		adrenalineRush.setName("Adrenaline Rush");
		adrenalineRush.setDescription(
			"Once per long rest, you have advantage on a Strength, "+
			"Dexterity, or Constitution check or save."
		);
		InformationManager.addRaceElement(adrenalineRush);
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
