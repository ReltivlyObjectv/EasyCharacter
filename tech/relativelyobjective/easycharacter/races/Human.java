package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.Size;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Human {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Human"));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		for (Lists.Ability a : Lists.Ability.values()) {
			InformationManager.addRaceElement(new AbilityModifier(a,1));
		}
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Language("Common"));
		WindowManager.getRaceTab().updateRaceElementsList();
		InformationManager.addRaceElement(new Language(
			MiscPrompts.openSingleStringChooserPrompt(
				InformationManager.getUnknownLanguages(),
				"Additional Human Language",
				true
			)
		));
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
