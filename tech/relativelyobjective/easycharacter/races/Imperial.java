package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.*;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Imperial {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Imperial"));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.PERSUASION, 1));
		InformationManager.addRaceElement(new OtherProficiency("Heavy Armor", 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CHARISMA,3));
		InformationManager.addRaceElement(new DamageModifier("Fire", Lists.DamageMod.RESISTANT));
		Feature voiceOfTheEmperor = new Feature(
			"Voice of the Emperor",
			"Once per long rest you can give yourself advantage on a charisma "+
			"roll, then give the final number +2."
		);
		InformationManager.addRaceElement(voiceOfTheEmperor);
		WindowManager.getRaceTab().updateRaceElementsList();
		InformationManager.addRaceElement(new Language(
			MiscPrompts.openSingleStringChooserPrompt(
				InformationManager.getUnknownLanguages(),
				"Additional Imperial Language",
				true
			)
		));
	}
	
}
