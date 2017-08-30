package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.*;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Altmer {
	public static void setup() {
		InformationManager.raceElements.clear();
		InformationManager.raceElements.add(new Language("Common"));
		InformationManager.raceElements.add(new Language("High Elvish"));
		InformationManager.raceElements.add(new AbilityModifier(Lists.Ability.INTELLIGENCE,1));
		InformationManager.raceElements.add(new AbilityModifier(Lists.Ability.WISDOM,1));
		WindowManager.getRaceTab().updateRaceElementsList();
		System.out.println("//TODO -- Setup Race: "+InformationManager.selectedRace);
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
