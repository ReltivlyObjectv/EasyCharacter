package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.Lists.Die;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class SuperiorityDice implements CharacterElement,Comparable {
	public int count;
	public Die sides;
	
	public SuperiorityDice() {
		count = 4;
		sides = Die.D8;
	}
	public SuperiorityDice(int c) {
		count = c;
		sides = Die.D8;
	}
	public SuperiorityDice(int c, Die d) {
		count = c;
		sides = d;
	}
	@Override
	public void edit() {
		ObjectIntegerPair<Die> newValues = MiscPrompts.openObjectChooserSpinner(
			Die.values(),
			sides,
			count,
			0,
			10,
			"Superiority Dice",
			1
		);
		sides = newValues.object;
		count = newValues.value;
	}
	@Override
	public String toString() {
		return String.format("Superiority Dice: %d%s",
			count,
			sides.toString().toLowerCase()
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
