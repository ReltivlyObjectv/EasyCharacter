package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class Race {

	public static void edit() {
		throw new UnsupportedOperationException("Race is a base class and not meant to be instantiated");
	}
	public static void setupRaceChoices(Lists.Race race) {
		InformationManager.selectedRace = race;
		switch (race) {
			case ALTMER:
				Altmer.setup();
			case BOSMER:
				Bosmer.setup();
			case BRETON:
				Breton.setup();
			case DRAGONBORN:
				Dragonborn.setup();
			case DUNMER:
				Dunmer.setup();
			case DWARF_HILL:
				DwarfHill.setup();
			case DWARF_MOUNTAIN:
				DwarfMountain.setup();
			case ELF_DARK:
				ElfDark.setup();
			case ELF_HIGH:
				ElfHigh.setup();
			case ELF_WOOD:
				ElfWood.setup();
			case GNOME_FOREST:
				GnomeForest.setup();
			case GNOME_ROCK:
				GnomeRock.setup();
			case HALF_ELF:
				HalfElf.setup();
			case HALF_ORC:
				HalfOrc.setup();
			case HALFLING:
				Halfling.setup();
			case HUMAN:
				Human.setup();
			case IMPERIAL:
				Imperial.setup();
			case KHAJIIT:
				Khajiit.setup();
			case NORD:
				Nord.setup();
			case ORSIMER:
				Orsimer.setup();
			case REDGUARD:
				Redguard.setup();
			case SAXHLEEL:
				Saxhleel.setup();
			case TIEFLING:
				Tiefling.setup();
			default:
				System.out.println("ERROR");
		}
	}
}