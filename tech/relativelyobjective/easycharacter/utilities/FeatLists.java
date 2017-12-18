package tech.relativelyobjective.easycharacter.utilities;

import java.util.TreeSet;
import tech.relativelyobjective.easycharacter.characterelements.*;
import tech.relativelyobjective.easycharacter.utilities.Lists.Ability;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class FeatLists {
	public static Feat getAlertFeat() {
		Feat returnMe = new Feat(
			"Alert",
			"You can't be surprised while you are conscious. Other creatures don't "+
			"gain advantage on attack rolls against you as a result of being hidden "+
			"from you."
		);
		returnMe.addFeatElement(new InitiativeModifier(5));
		return returnMe;
	}
	public static Feat getAthleteFeat() {
		Feat returnMe = new Feat(
			"Athlete",
			"When you are prone, standing up uses only 5 feet of movement. "+
			"Climbing doesn't halve your speed. "+
			"You can make a running long jump or a running high jump after "+
			"moving only 5 feet on foot, rather than 10 feet."
		);
		Lists.Ability[] skillOptions = {Lists.Ability.STRENGTH, Lists.Ability.DEXTERITY};
		TreeSet<AbilityModifier> improvement = MiscPrompts.openAbilityScoreImprovementPrompt(1, skillOptions);
		for (AbilityModifier mod : improvement) {
			returnMe.addFeatElement(mod);
		}
		return returnMe;
	}
	public static Feat getActorFeat() {
		Feat returnMe = new Feat(
			"Actor",
			"You have advantage on Charisma (Deception) and Charisma (Performance) "+
			"checks when trying to pass yourself off as a different person. You "+
			"can mimic the speech of another person or the sounds made by other "+
			"creatures. You must have heard the person speaking. or heard the "+
			"creature make the sound, for at least 1 minute. A successful Wisdom "+
			"(Insight) check contested by your Charisma (Deception) check allows "+
			"a listener to determine that the effect is faked."
		);
		returnMe.addFeatElement(new AbilityModifier(Ability.CHARISMA, 1));
		return returnMe;
	}
	public static Feat getChargerFeat() {
		Feat returnMe = new Feat(
			"Charger",
			"When you use your action to Dash, you can use a bonus action to "+
			"make one melee weapon attack or to shove a creature. If you move "+
			"at least 10 feet in a straight line immediately before taking this "+
			"bonus action, you either gain a +5 bonus to the attack's damage "+
			"roll (if you chose to make a melee attack and hit) or push the "+
			"target up to 10 feet away from you (if you chose to shove and you succeed)."
		);
		return returnMe;
	}
	public static Feat getCrossbowExpertFeat() {
		Feat returnMe = new Feat(
			"Crossbow Expert",
			"You ignore the loading quality of crossbows with which you are proficient. "+
			"Being within 5 feet of a hostile creature doesn't impose disadvantage "+
			"on your ranged attack rolls. "+
			"When you use the Attack action and attack with a one- handed weapon, "+
			"you can use a bonus action to attack with a loaded hand crossbow you are holding."
		);
		return returnMe;
	}
	public static Feat getDefensiveDuelistFeat() {
		Feat returnMe = new Feat(
			"Defensive Duelist",
			"When you are wielding a finesse weapon with which you are proficient and another creature hits you with a melee attack, you can use your reaction to add your proficiency bonus to your AC for that attack, potentially causing the attack to miss you."
		);
		return returnMe;
	}
	public static Feat getDualWielderFeat() {
		Feat returnMe = new Feat(
			"Dual Wielder",
			"You gain a +1 bonus to AC while you are wielding a separate "+
			"melee weapon in each hand. You can use two-weapon fighting even "+
			"when the one-handed melee weapons you are wielding aren't light. "+
			"You can draw or stow two one-handed weapons when you would normally "+
			"be able to draw or stow only one."
		);
		return returnMe;
	}
	public static Feat getDungeonDelverFeat() {
		Feat returnMe = new Feat(
			"Dungeon Delver",
			"You have advantage on Wisdom (Perception) and Intelligence "+ 
			"(Investigation) checks made to detect the presence of secret doors. "+
			"You have advantage on saving throws made to avoid or resist traps. "+
			"You have resistance to the damage dealt by traps. You can search for "+
			"traps while traveling at a normal pace, instead of only at a slow pace."
		);
		return returnMe;
	}
	public static Feat getDurableFeat() {
		Feat returnMe = new Feat(
			"Durable",
			"When you roll a Hit Die to regain hit points, the minimum number "+
			"of hit points you regain from the roll equals twice your "+
			"Constitution modifier (minimum of 2)."
		);
		returnMe.addFeatElement(new AbilityModifier(Lists.Ability.CONSTITUTION, 1));
		return returnMe;
	}
}
