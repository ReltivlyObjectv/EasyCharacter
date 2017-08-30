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
				break;
			case BOSMER:
				Bosmer.setup();
				break;
			case BRETON:
				Breton.setup();
				break;
			case DRAGONBORN:
				Dragonborn.setup();
				break;
			case DUNMER:
				Dunmer.setup();
				break;
			case DWARF_HILL:
				DwarfHill.setup();
				break;
			case DWARF_MOUNTAIN:
				DwarfMountain.setup();
				break;
			case ELF_DARK:
				ElfDark.setup();
				break;
			case ELF_HIGH:
				ElfHigh.setup();
				break;
			case ELF_WOOD:
				ElfWood.setup();
				break;
			case GNOME_FOREST:
				GnomeForest.setup();
				break;
			case GNOME_ROCK:
				GnomeRock.setup();
				break;
			case HALF_ELF:
				HalfElf.setup();
				break;
			case HALF_ORC:
				HalfOrc.setup();
				break;
			case HALFLING:
				Halfling.setup();
				break;
			case HUMAN:
				Human.setup();
				break;
			case IMPERIAL:
				Imperial.setup();
				break;
			case KHAJIIT:
				Khajiit.setup();
				break;
			case NORD:
				Nord.setup();
				break;
			case ORSIMER:
				Orsimer.setup();
				break;
			case REDGUARD:
				Redguard.setup();
				break;
			case SAXHLEEL:
				Saxhleel.setup();
				break;
			case TIEFLING:
				Tiefling.setup();
				break;
			default:
				System.out.println("ERROR: "+race);
				break;
		}
	}
}