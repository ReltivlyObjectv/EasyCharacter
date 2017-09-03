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
public class Nord {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Nord"));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.ATHLETICS, 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Nordic"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.STRENGTH,2));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CONSTITUTION,1));
		InformationManager.addRaceElement(new DamageModifier("Cold", Lists.DamageMod.RESISTANT));
		Feature commandCreature = new Feature();
		commandCreature.setName("Nordic Frost");
		commandCreature.setDescription(
			"Once per long rest, you can touch a creature and inflict "+
			"3d6 of Cold Damage."
		);
		InformationManager.addRaceElement(commandCreature);
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
