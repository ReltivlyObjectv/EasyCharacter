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
public class Bosmer {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Bosmer"));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new WalkSpeed(35));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.ANIMAL_HANDLING, 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Bosmeris"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.DEXTERITY,2));
		Feature commandCreature = new Feature();
		commandCreature.setName("Command Creature");
		commandCreature.setDescription(
			"Once per short rest, you can cast the “Command” spell at "+
			"1st-level as an action (save DC 10 + character level). "+
			"This spell can be cast with a verbal or a somatic component. "+
			"If cast with a verbal component, the creature must be able to "+
			"understand the language that you speak to it. If cast with a "+
			"somatic component, the creature must be able to see you.");
		InformationManager.addRaceElement(commandCreature);
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
