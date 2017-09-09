package tech.relativelyobjective.easycharacter.characterelements;

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
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
