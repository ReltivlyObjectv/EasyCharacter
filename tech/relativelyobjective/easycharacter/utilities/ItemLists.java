package tech.relativelyobjective.easycharacter.utilities;

import java.util.LinkedList;
import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;

/**
 *
 * @author ReltivlyObjectv
 * Reference: PHB p151
 */
public class ItemLists {

	public static enum ItemPack {
		BURGLAR,
		DIPLOMAT,
		DUNGEONEER,
		ENTERTAINER,
		EXPLORER,
		PRIEST,
		SCHOLAR
	}
	public static LinkedList<InventoryItem> getItemPack(ItemPack p) {
		switch (p) {
			case BURGLAR:
				return getBurglarsPack();
			case DIPLOMAT:
				return getDiplomatsPack();
			case DUNGEONEER:
				return getDungeoneersPack();
			case ENTERTAINER:
				return getEntertainersPack();
			case EXPLORER:
				return getExplorersPack();
			case PRIEST:
				return getPriestsPack();
			case SCHOLAR:
				return getScholarsPack();
		}
		return null;
	}
	public static LinkedList<InventoryItem> getBurglarsPack() {
		LinkedList<InventoryItem> returnMe = new LinkedList<>();
		returnMe.add(new InventoryItem("Backpack"));
		returnMe.add(new InventoryItem("Ball Bearing", 1000));
		returnMe.add(new InventoryItem("10' of String"));
		returnMe.add(new InventoryItem("Bell"));
		returnMe.add(new InventoryItem("Candle", 5));
		returnMe.add(new InventoryItem("Crowbar"));
		returnMe.add(new InventoryItem("Hammer"));
		returnMe.add(new InventoryItem("Piton", 10));
		returnMe.add(new InventoryItem("Hooded Lantern"));
		returnMe.add(new InventoryItem("Flask of Oil", 2));
		returnMe.add(new InventoryItem("Daily Ration", 5));
		returnMe.add(new InventoryItem("Tinder Box"));
		returnMe.add(new InventoryItem("Waterskin"));
		returnMe.add(new InventoryItem("50' of Hempen Rope"));
		return returnMe;
	}
	public static LinkedList<InventoryItem> getDiplomatsPack() {
		LinkedList<InventoryItem> returnMe = new LinkedList<>();
		returnMe.add(new InventoryItem("Chest"));
		returnMe.add(new InventoryItem("Case for Maps and Scrolls", 2));
		returnMe.add(new InventoryItem("Fine Clothes"));
		returnMe.add(new InventoryItem("Bottle of Ink"));
		returnMe.add(new InventoryItem("Ink Pen"));
		returnMe.add(new InventoryItem("Lamp"));
		returnMe.add(new InventoryItem("Flask of Oil", 2));
		returnMe.add(new InventoryItem("Sheet of Paper", 5));
		returnMe.add(new InventoryItem("Vial of Perfume"));
		returnMe.add(new InventoryItem("Sealing Wax"));
		returnMe.add(new InventoryItem("Soap"));
		return returnMe;
	}
	public static LinkedList<InventoryItem> getDungeoneersPack() {
		LinkedList<InventoryItem> returnMe = new LinkedList<>();
		returnMe.add(new InventoryItem("Backpack"));
		returnMe.add(new InventoryItem("Crowbar"));
		returnMe.add(new InventoryItem("Hammer"));
		returnMe.add(new InventoryItem("Piton", 10));
		returnMe.add(new InventoryItem("Torch", 10));
		returnMe.add(new InventoryItem("Tinder Box"));
		returnMe.add(new InventoryItem("Daily Ration", 10));
		returnMe.add(new InventoryItem("Waterskin"));
		returnMe.add(new InventoryItem("50' of Hempen Rope"));
		return returnMe;
	}
	public static LinkedList<InventoryItem> getEntertainersPack() {
		LinkedList<InventoryItem> returnMe = new LinkedList<>();
		returnMe.add(new InventoryItem("Backpack"));
		returnMe.add(new InventoryItem("Bedroll"));
		returnMe.add(new InventoryItem("Costume", 2));
		returnMe.add(new InventoryItem("Candle", 5));
		returnMe.add(new InventoryItem("Daily Ration", 5));
		returnMe.add(new InventoryItem("Waterskin"));
		returnMe.add(new InventoryItem("Disguise Kit"));
		return returnMe;
	}
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
	public static LinkedList<InventoryItem> getPriestsPack() {
		LinkedList<InventoryItem> returnMe = new LinkedList<>();
		returnMe.add(new InventoryItem("Backpack"));
		returnMe.add(new InventoryItem("Blanket"));
		returnMe.add(new InventoryItem("Candle", 10));
		returnMe.add(new InventoryItem("Tinder Box"));
		returnMe.add(new InventoryItem("Alms Box"));
		returnMe.add(new InventoryItem("Block of Incense", 2));
		returnMe.add(new InventoryItem("Censer"));
		returnMe.add(new InventoryItem("Vestments"));
		returnMe.add(new InventoryItem("Daily Ration", 2));
		returnMe.add(new InventoryItem("Waterskin"));
		return returnMe;
	}
	public static LinkedList<InventoryItem> getScholarsPack() {
		LinkedList<InventoryItem> returnMe = new LinkedList<>();
		returnMe.add(new InventoryItem("Backpack"));
		returnMe.add(new InventoryItem("Book of Lore"));
		returnMe.add(new InventoryItem("Bottle of Ink"));
		returnMe.add(new InventoryItem("Ink Pen"));
		returnMe.add(new InventoryItem("Sheet of Paper", 10));
		returnMe.add(new InventoryItem("Little Bag of Sand"));
		returnMe.add(new InventoryItem("Small Knife"));
		return returnMe;
	}
	public static String[] INSTRUMENTS = {
		"Bagpipes",
		"Drum",
		"Dulcimer",
		"Flute",
		"Lute",
		"Lyre",
		"Horn",
		"Pan Flute",
		"Shawm",
		"Viol"
	};
	public static String[] ARTISANS_TOOLS = {
		"Alchemist’s supplies",
		"Brewer’s Supplies",
		"Calligrapher's Supplies",
		"Carpenter’s Tools",
		"Cartographer’s Tools",
		"Cobbler’s Tools",
		"Cook’s Utensils",
		"Glassblower’s Tools",
		"Jeweler’s Tools",
		"Leatherworker’s Tools",
		"Mason’s Tools",
		"Painter’s Supplies",
		"Potter’s Tools",
		"Smith’s Tools",
		"Tinker’s Tools",
		"Weaver’s Tools",
		"Woodcarver’s Tools"
	};
	public static final String[] GAMING_SETS = {
		"Dice Set", 
		"Playing Card Set"
	};
	public static final String[] SOLDIER_GAMING_SETS = {
		"Bone Dice",
		"Deck of Cards"
	};
	public static final String[] PRAYER_OBJECTS = {
		"Prayer Book", 
		"Prayer Wheel"
	};
	public static final String[] HOLY_SYMBOLS = {
		"Amulet", 
		"Emblem"
	};
	public static final InventoryItem[] CON_TOOLS = {
		new InventoryItem("Stoppered Bottle Filled with Colored Liquid", 10), 
		new InventoryItem("Set of Weighted Dice"), 
		new InventoryItem("Deck of Marked Cards"), 
		new InventoryItem("Signet Ring of an Imaginary Duke")
	};
	public static final String[] FAVOR_OF_ADMIRER = {
		"Love Letter",
		"Lock of Hair",
		"Trinket"
	};
	public static final String[] LUCKY_CHARMS = {
		"Rabbit Foot",
		"Small Stone with a Hole in the Center",
		"Roll for Trinket (PHB Chapter 5)"
	};
	public static final String[] SOLDIER_TROPHIES = {
		"Dagger",
		"Broken Blade",
		"Piece of a Banner"
	};
}
