package tech.relativelyobjective.easycharacter.characterclasses;

import java.util.Arrays;
import java.util.stream.Stream;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
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
public class Monk {
	public static final Lists.Skill[] MONK_SKILLS = {
		Lists.Skill.ACROBATICS,
		Lists.Skill.ATHLETICS,
		Lists.Skill.HISTORY,
		Lists.Skill.INSIGHT,
		Lists.Skill.RELIGION,
		Lists.Skill.STEALTH
	};
	public static void setup(int level) {
		if (level >= 1) {
			InformationManager.addClassElement(new OtherProficiency("Simple Weapons",1));
			InformationManager.addClassElement(new OtherProficiency("Shortswords",1));
			InformationManager.addClassElement(
				new SavingThrowProficiency(Lists.Ability.STRENGTH)
			);
			InformationManager.addClassElement(
				new SavingThrowProficiency(Lists.Ability.DEXTERITY)
			);
			WindowManager.getClassTab().updateClassElementsList();
			String[] allMiscProfsOptions = 
				Stream.concat(
					Arrays.stream(ItemLists.ARTISANS_TOOLS), 
					Arrays.stream(ItemLists.INSTRUMENTS)
				).toArray(String[]::new);
			InformationManager.addClassElement(
				new OtherProficiency(
					MiscPrompts.openSingleStringChooserPrompt(
						allMiscProfsOptions,"Monk Tool or Instrument"
					),1
				)
			);
			WindowManager.getClassTab().updateClassElementsList();
			for (Lists.Skill s : ClassChoices.openProficiencyPrompt(MONK_SKILLS, 2)) {
				InformationManager.addClassElement(new SkillProficiency(s, 1));
			}
			InformationManager.addClassElement(new InventoryItem("Shortsword", 1));
			InformationManager.addClassElement(new InventoryItem("Dart", 10));
			WindowManager.getClassTab().updateClassElementsList();
			for (InventoryItem i : ItemLists.openItemPackPrompt(new ItemPack[]{
				ItemPack.DUNGEONEER, ItemPack.EXPLORER
				})) {
				InformationManager.addClassElement(i);
			}
			InformationManager.addClassElement(new Feature(
				"Unarmored Defense",
				"While you are wearing no armor and not wielding a shield, "+
				"your AC equals 10 + your Dexterity modifier + your Wisdom modifier."
			));
			InformationManager.addClassElement(new Feature(
				"Martial Arts",
				""
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 2) {
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
		System.out.println("//TODO Setup Class: "+Monk.class);
	}
}
