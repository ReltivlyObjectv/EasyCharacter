package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.DamageModifier;
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
public class Dunmer {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Dunmer (Dark Elf)"));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.ARCANA, 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Dunmeris"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.DEXTERITY,2));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.INTELLIGENCE,1));
		InformationManager.addRaceElement(new DamageModifier("Fire", Lists.DamageMod.RESISTANT));
		Feature ancestorGuardian = new Feature();
		ancestorGuardian.setName("Ancestor Guardian");
		ancestorGuardian.setDescription(
			"Once per long rest you can use a bonus action to summon the ghost "+
			"of an ancestor (MM p147). This ghost will return to rest after 2 "+
			"minutes or once its hit points return to zero. The ghost cannot be "+
			"given commands, but it will try to protect you from any threats.");
		InformationManager.addRaceElement(ancestorGuardian);
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
