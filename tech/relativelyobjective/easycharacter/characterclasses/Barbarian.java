package tech.relativelyobjective.easycharacter.characterclasses;

import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.ProficiencyBonus;
import tech.relativelyobjective.easycharacter.characterelements.SavingThrowProficiency;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.ItemLists;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Barbarian {
	public static void setup(int level) {
		InformationManager.addClassElement(
			new ProficiencyBonus(ClassChoices.getProficiencyBonus(level))
		);
		if (level >= 1) {
			InformationManager.addClassElement(new OtherProficiency("Light Armor",1));
			InformationManager.addClassElement(new OtherProficiency("Medium Armor",1));
			InformationManager.addClassElement(new OtherProficiency("Shields",1));
			InformationManager.addClassElement(new OtherProficiency("Simple Weapons",1));
			InformationManager.addClassElement(new OtherProficiency("Martial Weapons",1));
			InformationManager.addClassElement(
				new SavingThrowProficiency(Lists.Ability.STRENGTH)
			);
			InformationManager.addClassElement(
				new SavingThrowProficiency(Lists.Ability.CONSTITUTION)
			);
			WindowManager.getClassTab().updateClassElementsList();
			showLevelOneSkillProficiencyPrompt();
			showStartingEquipmentPrompt();
			for (InventoryItem i : ItemLists.getExplorersPack()) {
				InformationManager.addClassElement(i);
			}
			
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
		
		System.out.println("//TODO Setup Class: "+Barbarian.class);
		WindowManager.getClassTab().updateClassElementsList();
	}
	private static void showLevelOneSkillProficiencyPrompt() {
		//Choose proficiency in two: Animal Handle, Athletics, Intim, Nature, Perception, Survival
	}
	private static void showStartingEquipmentPrompt() {
		//phb p48
		//(a) a greataxe or (b) any martial melee weapon
		//AND
		//(a) two handaxes or (b) any simple weapon
	}
}
