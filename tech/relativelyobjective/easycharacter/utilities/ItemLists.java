package tech.relativelyobjective.easycharacter.utilities;

import java.util.LinkedList;
import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;

/**
 *
 * @author ReltivlyObjectv
 */
public class ItemLists {
	public static LinkedList<InventoryItem> getExplorersPack() {
		LinkedList<InventoryItem> returnMe = new LinkedList<>();
		returnMe.add(new InventoryItem("Backpack"));
		returnMe.add(new InventoryItem("Bedroll"));
		returnMe.add(new InventoryItem("Mess Kit"));
		returnMe.add(new InventoryItem("Tinder Box"));
		returnMe.add(new InventoryItem("Torch", 10));
		returnMe.add(new InventoryItem("Daily Ration", 10));
		returnMe.add(new InventoryItem("Waterskin"));
		returnMe.add(new InventoryItem("50' of Hempen Rope"));
		return returnMe;
	}
}
