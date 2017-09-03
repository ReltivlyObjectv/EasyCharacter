package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.Feat;
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
public class Orsimer {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Orsimer (Orc)"));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.ATHLETICS, 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Orcish"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.STRENGTH,1));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CONSTITUTION,2));
		Feat fellHanded = new Feat("Fell Handed");
		InformationManager.addRaceElement(fellHanded);
		Feature berserk = new Feature();
		berserk.setName("Berserk");
		berserk.setDescription("Once per long rest, you can use the Rage "+
		"ability from the Barbarian class (PHB p48). If you are a barbarian, "+
		"this does not count toward the number of times you can rage per long "+
		"rest. If you are not a barbarian, then it is always the level 1 "+
		"version of Rage.");
		InformationManager.addRaceElement(berserk);
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
