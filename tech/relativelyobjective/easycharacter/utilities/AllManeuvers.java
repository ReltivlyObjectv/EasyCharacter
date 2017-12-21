/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tech.relativelyobjective.easycharacter.utilities;

import java.util.TreeSet;
import tech.relativelyobjective.easycharacter.characterelements.Maneuver;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class AllManeuvers {
	public static final Maneuver COMMANDERS_STRIKE = new Maneuver(
		"Commander's Strike",
		"When you take the Attack action on your turn, you can forgo one of "
		+ "your attacks and use a bonus action to direct one of your companions "
		+ "to strike. When you do so, choose a friendly creature who can see or "
		+ "hear you and expend one superiority die. That creature can immediately "
		+ "use its reaction to make one weapon attack, adding the superiority "
		+ "die to the attack’s damage roll."
	);
	public static final Maneuver DISARMING_ATTACK = new Maneuver(
		"Disarming Attack",
		"When you hit a creature with a weapon attack, you can expend one "
		+ "superiority die to attempt to disarm the target, forcing it to "
		+ "drop one item of your choice that it’s holding. You add the "
		+ "superiority die to the attack’s damage roll, and the target must "
		+ "make a Strength saving throw. On a failed save, it drops the "
		+ "object you choose. The object lands at its feet."
	);
	public static final Maneuver DISTRACTING_STRIKE = new Maneuver(
		"Distracting Strike",
		"When you hit a creature with a weapon attack, you can expend one "
		+ "superiority die to distract the creature, giving your allies an "
		+ "opening. You add the superiority die to the attack’s damage roll. "
		+ "The next attack roll against the target by an attacker other than "
		+ "you has advantage if the attack is made before the start of your "
		+ "next turn."
	);
	public static final Maneuver EVASIVE_FOOTWORK = new Maneuver(
		"Evasive Footwork",
		"When you move, you can expend one superiority die, rolling the die "
		+ "and adding the number rolled to your AC until you stop moving."
	);
	public static final Maneuver FEINTING_ATTACK = new Maneuver(
		"Feinting Attack",
		"You can expend one superiority dieand use a bonus action on your "
		+ "turn to feint, choosing one creature within 5 feet of you as your "
		+ "target. You have advantage on your next attack roll against that "
		+ "creature. If that attack hits, add the superiority die to the "
		+ "attack’s damage roll."
	);
	public static final Maneuver GOADING_ATTACK = new Maneuver(
		"Goading Attack",
		"When you hit a creature with a weapon attack, you can expend one "
		+ "superiority die to attempt to goad the target into attacking you. "
		+ "You add the superiority die to the attack’s damage roll, and the "
		+ "target must make a Wisdom saving throw. On a failed save, the "
		+ "target has disadvantage on all attack rolls against targets "
		+ "other than you until the end of your next turn."
	);
	public static final Maneuver LUNGING_ATTACK = new Maneuver(
		"Lunging Attack",
		"When you make a melee weapon attack on your turn, you can expend "
		+ "one superiority die to increase your reach for that attack by "
		+ "5 feet. If you hit, you add the superiority die to the attack’s "
		+ "damage roll."
	);
	public static final Maneuver MANEUVERING_ATTACK = new Maneuver(
		"Maneuvering Attack",
		"When you hit a creature with a weapon attack, you can expend one "
		+ "superiority die to maneuver one of your comrades into a more "
		+ "advantageous position. You add the superiority die to the "
		+ "attack’s damage roll, and you choose a friendly creature who "
		+ "can see or hear you. That creature can use its reaction to "
		+ "move up to half its speed without provoking opportunity attacks "
		+ "from the target of your attack."
	);
	public static final Maneuver MENACING_ATTACK = new Maneuver(
		"Menacing Attack",
		"When you hit a creature with a weapon attack, you can expend one "
		+ "superiority die to attempt to frighten the target. You add the "
		+ "superiority die to the attack’s damage roll, and the target must "
		+ "make a Wisdom saving throw. On a failed save, it is frightened of "
		+ "you until the end of your next turn."
	);
	public static final Maneuver PARRY = new Maneuver(
		"Parry",
		"When another creature damages you with a melee attack, you can use "
		+ "your reaction and expend one superiority die to reduce the damage "
		+ "by the number you roll on your superiority die + your Dexterity modifier."
	);
	public static final Maneuver PRECISION_ATTACK = new Maneuver(
		"Precision Attack",
		"When you make a weapon attack roll against a creature, you can "
		+ "expend one superiority die to add it to the roll. You can use "
		+ "this maneuver before or after making the attack roll, but before "
		+ "any effects of the attack are applied."
	);
	public static final Maneuver PUSHING_ATTACK = new Maneuver(
		"Pushing Attack",
		"When you hit a creature with a weapon attack, you can expend one "
		+ "superiority die to attempt to drive the target back. You add the "
		+ "superiority die to the attack's damage roll, and if the target is "
		+ "Large or smaller, it must make a Strength saving throw. On a "
		+ "failed save, you push the target up to 15 feet away from you."
	);
	public static final Maneuver RALLY = new Maneuver(
		"Rally",
		"On your turn, you can use a bonus action and expend one superiority "
		+ "die to bolster the resolve of one of your companions. When you do "
		+ "so, choose a friendly creature who can see or hear you. That "
		+ "creature gains temporary hit points equal to the superiority "
		+ "die roll + your Charisma modifier."
	);
	public static final Maneuver RIPOSTE = new Maneuver(
		"Riposte",
		"When a creature misses you with a melee attack, you can use your "
		+ "reaction and expend one superiority die to make a melee weapon "
		+ "attack against the creature. If you hit, you add the superiority "
		+ "die to the attack's damage roll."
	);
	public static final Maneuver SWEEPING_ATTACK = new Maneuver(
		"Sweeping Attack",
		"When you hit a creature with a melee weapon attack, you can expend "
		+ "one superiority die to attempt to damage another creature with "
		+ "the same attack. Choose another creature within 5 feet of the "
		+ "original target and within your reach. If the original attack "
		+ "roll would hit the second creature, it takes damage equal to "
		+ "the number you roll on your superiority die. The damage is of "
		+ "the same type dealt by the original attack."
	);
	public static final Maneuver TRIP_ATTACK = new Maneuver(
		"Trip Attack",
		"When you hit a creature with a weapon attack, you can expend one "
		+ "superiority die to attempt to knock the target down. You add the "
		+ "superiority die to the attack’s damage roll, and if the target is "
		+ "Large or smaller, it must make a Strength saving throw. On a "
		+ "failed save, you knock the target prone."
	);
	public static final Maneuver[] ALL_MANEUVERS = {
		COMMANDERS_STRIKE,
		DISARMING_ATTACK,
		DISTRACTING_STRIKE,
		EVASIVE_FOOTWORK,
		FEINTING_ATTACK,
		GOADING_ATTACK,
		LUNGING_ATTACK,
		MANEUVERING_ATTACK,
		MENACING_ATTACK,
		PARRY,
		PRECISION_ATTACK,
		PUSHING_ATTACK,
		RALLY,
		RIPOSTE,
		SWEEPING_ATTACK,
		TRIP_ATTACK
	};
	public static Maneuver[] getUnknownManeuvers() {
		TreeSet<Maneuver> unknownManeuvers = new TreeSet<>();
		for (Maneuver m : ALL_MANEUVERS) {
			if (!InformationManager.getAllElements().contains(m)) {
				unknownManeuvers.add(m);
			}
		}
		return unknownManeuvers.toArray(new Maneuver[unknownManeuvers.size()]);
	}
}
