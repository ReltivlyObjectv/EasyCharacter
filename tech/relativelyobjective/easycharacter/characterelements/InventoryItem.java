package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectIntegerPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class InventoryItem implements CharacterElement,Comparable {
	public String item;
	public int count;

	public InventoryItem() {
		item = "New Item";
		count = 1;
	}
	public InventoryItem(String i, int c) {
		item = i;
		count = c;
	}
	public InventoryItem(String i) {
		item = i;
		count = 1;
	}
	@Override
	public void edit() {
		ObjectIntegerPair<String> newValues = MiscPrompts.openStringSpinnerPrompt(
			item,
			count,
			0,
			1000,
			"Inventory Item",
			1
		);
		item = newValues.object;
		count = newValues.value;
	}
	@Override
	public String toString() {
		return String.format("Item: %s (x%d)", item, count);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
