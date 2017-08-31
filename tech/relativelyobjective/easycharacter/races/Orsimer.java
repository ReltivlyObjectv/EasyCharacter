package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.Feat;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
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
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.ATHLETICS, 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Orcish"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.STRENGTH,1));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CONSTITUTION,2));
		Feat fellHanded = new Feat();
		fellHanded.setName("Fell Handed");
		fellHanded.setDescription(
			"You master the handaxe, battleaxe, greataxe, warhammer, and maul. "+
			"You gain the following benefits when using any of them:\n"+
			"* You gain a +1 bonus to attack rolls you make with the weapon.\n"+
			"* Whenever you have advantage on a melee attack roll you make "+
			"with the weapon and hit, you can knock the target prone if the "+
			"lower of the two d20 rolls would also hit the target.\n"+
			"* Whenever you have disadvantage on a melee attack roll you make "+
			"with the weapon, the target takes bludgeoning damage equal to your "+
			"Strength modifier (minimum of 0) if the attack misses but the higher "+
			"of the two d20 rolls would have hit.\n"+
			"* If you use the Help action to aid an ally’s melee attack while "+
			"you’re wielding the weapon, you knock the target’s shield aside "+
			"momentarily. In addition to the ally gaining advantage on the "+
			"attack roll, the ally gains a +2 bonus to the roll if the target "+
			"is using a shield."
		);
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
