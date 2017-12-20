package tech.relativelyobjective.easycharacter.races;

import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.DamageModifier;
import tech.relativelyobjective.easycharacter.characterelements.Darkvision;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.Size;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;
import tech.relativelyobjective.easycharacter.utilities.spells.CantripLists;

/**
 *
 * @author ReltivlyObjectv
 */
public class Tiefling {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Tiefling"));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CHARISMA,2));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.INTELLIGENCE,1));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Darkvision(60));
		InformationManager.addRaceElement(new DamageModifier(
			"Fire", Lists.DamageMod.RESISTANT)
		);
		InformationManager.addRaceElement(CantripLists.getThaumaturgy());
		InformationManager.addRaceElement(new Feature(
			"Infernal Legacy",
			"When you reach 3rd level, you can cast the hellish rebuke "+
			"spell once per day as a 2nd-level spell. Once you reach 5th level, "+
			"you can cast the darkness spell once per day. Charisma is your "+
			"spellcasting abilily for these spells."
		));
		InformationManager.addRaceElement(new Language("Common"));
		InformationManager.addRaceElement(new Language("Infernal"));
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
