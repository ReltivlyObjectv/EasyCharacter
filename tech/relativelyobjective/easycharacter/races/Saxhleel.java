package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.ConditionModifier;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Saxhleel {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Jel"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.DEXTERITY,1));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.INTELLIGENCE,1));
		InformationManager.addRaceElement(new Feature("Water Breathing",
			"You can breathe underwater indefinitely."));
		InformationManager.addRaceElement(new ConditionModifier(Lists.Conditions.DISEASED, 
			Lists.DamageMod.IMMUNE));
		Feature Histskin = new Feature();
		Histskin.setName("Histskin");
		Histskin.setDescription(
			"Once per long rest, you can spend up to two hit "+
			"dice as a bonus action."
		);
		InformationManager.addRaceElement(Histskin);
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
