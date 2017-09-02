package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.Darkvision;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import static tech.relativelyobjective.easycharacter.utilities.Lists.Skill.*;
import static tech.relativelyobjective.easycharacter.utilities.Lists.Ability.*;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class HalfOrc {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Half-Orc"));
		InformationManager.addRaceElement(new AbilityModifier(STRENGTH,2));
		InformationManager.addRaceElement(new AbilityModifier(CONSTITUTION,1));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Darkvision(60));
		InformationManager.addRaceElement(new SkillProficiency(INTIMIDATION,1));
		InformationManager.addRaceElement(new Feature(
			"Relentless Endurance",
			"When you are reduced to 0 hit points but not killed outright, you "+
			"can drop to 1 hit point instead. You can't use this feature again "+
			"until you finish a long rest."
		));
		InformationManager.addRaceElement(new Feature(
			"Savage Attacks",
			"When you score a critical hit with a melee weapon attack, you can "+
			"roll one of the weapon's damage dice one additional time and add "+
			"it to the extra damage of the critical hit."
		));
		InformationManager.addRaceElement(new Language("Common"));
		InformationManager.addRaceElement(new Language("Orc"));
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
