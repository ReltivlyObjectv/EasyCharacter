package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class SuperiorityDice implements CharacterElement,Comparable {
	public enum DiceSides {
		D6,
		D8
	}
	public int count;
	public DiceSides sides;
	
	public SuperiorityDice() {
		count = 4;
		sides = DiceSides.D8;
	}
	public SuperiorityDice(int c) {
		count = c;
		sides = DiceSides.D8;
	}
	public SuperiorityDice(int c, DiceSides d) {
		count = c;
		sides = d;
	}
	@Override
	public void edit() {
		ObjectIntegerPair<DiceSides> newValues = MiscPrompts.openObjectChooserSpinner(
			DiceSides.values(),
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
