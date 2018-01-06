package tech.relativelyobjective.easycharacter.characterclasses;

import tech.relativelyobjective.easycharacter.backgrounds.BackgroundChooser;
import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.SavingThrowProficiency;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.ItemLists;
import tech.relativelyobjective.easycharacter.utilities.ItemLists.ItemPack;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Bard {
	public static void setup(int level) {
		if (level >= 1) {
			InformationManager.addClassElement(new OtherProficiency("Light Armor",1));
			InformationManager.addClassElement(new OtherProficiency("Simple Weapons",1));
			InformationManager.addClassElement(new OtherProficiency("Crossbow, Hand",1));
			InformationManager.addClassElement(new OtherProficiency("Longsword",1));
			InformationManager.addClassElement(new OtherProficiency("Rapier",1));
			InformationManager.addClassElement(new OtherProficiency("Shortsword",1));
			InformationManager.addClassElement(
				new SavingThrowProficiency(Lists.Ability.DEXTERITY)
			);
			InformationManager.addClassElement(
				new SavingThrowProficiency(Lists.Ability.CHARISMA)
			);
			WindowManager.getClassTab().updateClassElementsList();
			for (Lists.Skill s : ClassChoices.openProficiencyPrompt(Lists.Skill.values(), 3)) {
				InformationManager.addClassElement(new SkillProficiency(s, 1));
			}
			WindowManager.getClassTab().updateClassElementsList();
			String[] instruments = MiscPrompts.openNStringChooserPrompt(
				ItemLists.INSTRUMENTS,
				3,
				"Instrument Proficiency"
			);
			for (String s : instruments) {
				InformationManager.addClassElement(new OtherProficiency(s));
			}
			WindowManager.getClassTab().updateClassElementsList();
			InformationManager.addClassElement(new InventoryItem(
				MiscPrompts.openSingleStringChooserPrompt(
					ItemLists.INSTRUMENTS,
					"Starting Instrument",
					true
				)
			));
			WindowManager.getClassTab().updateClassElementsList();
			ItemPack[] packChoices = {ItemPack.DIPLOMAT, ItemPack.ENTERTAINER};
			ItemPack pack = MiscPrompts.openSingleObjectChooserPrompt(packChoices, packChoices[0], "Starting Item Pack");
			for (InventoryItem p : ItemLists.getItemPack(pack)) {
				InformationManager.addClassElement(p);
			}
		}
		if (level >= 2) {
			BackgroundChooser.openBackgroundPrompt();
		}
		if (level >= 3) {
		}
		if (level >= 4) {
		}
		if (level >= 5) {
		}
		if (level >= 6) {
		}
		if (level >= 7) {
		}
		if (level >= 8) {
		}
		if (level >= 9) {
		}
		if (level >= 10) {
		}
		if (level >= 11) {
		}
		if (level >= 12) {
		}
		if (level >= 13) {
		}
		if (level >= 14) {
		}
		if (level >= 15) {
		}
		if (level >= 16) {
		}
		if (level >= 17) {
		}
		if (level >= 18) {
		}
		if (level >= 19) {
		}
		if (level >= 20) {
		}
		System.out.println("//TODO Setup Class: "+Bard.class);
	}
}
