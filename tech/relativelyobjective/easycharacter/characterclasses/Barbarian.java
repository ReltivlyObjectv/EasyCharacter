package tech.relativelyobjective.easycharacter.characterclasses;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.ProficiencyBonus;
import tech.relativelyobjective.easycharacter.characterelements.SavingThrowProficiency;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.ItemLists;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Barbarian {
	public static Lists.Skill[] barbarianSkills = {
		Lists.Skill.ANIMAL_HANDLING,
		Lists.Skill.ATHLETICS,
		Lists.Skill.INTIMIDATION,
		Lists.Skill.NATURE,
		Lists.Skill.PERCEPTION,
		Lists.Skill.SURVIVAL
	};
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
		//Gain proficiency in two skills
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Barbarian Skills", true);
		prompt.setPreferredSize(new Dimension(450,500));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		JLabel header = new JLabel(
			"<html><strong>Choose two different skills to gain proficiency in</strong></html>", 
			JLabel.CENTER);
		prompt.add(header, constraints);
		constraints.gridy++;
		HashMap<Lists.Skill, JCheckBox> checkBoxes = new HashMap<>();
		for (int i = 0; i < barbarianSkills.length; i++) {
			JCheckBox box = new JCheckBox(Lists.SKILLS[Lists.getSkillIndex(barbarianSkills[i])]);
			checkBoxes.put(barbarianSkills[i], box);
			prompt.add(box, constraints);
			constraints.gridy++;
		}
		JButton saveButton = new JButton("Add Proficiencies");
		saveButton.addActionListener((ActionEvent e)->{
			int checkedBoxes = 0;
			for (Lists.Skill s : barbarianSkills) {
				if (checkBoxes.get(s).isSelected()) {
					checkedBoxes++;
				}
			}
			if (checkedBoxes == 2) {
				//Correct
				for (Lists.Skill s : barbarianSkills) {
					if (checkBoxes.get(s).isSelected()) {
						InformationManager.addClassElement(new SkillProficiency(s,1));
					}
				}
				WindowManager.getClassTab().updateClassElementsList();
				prompt.dispose();
			} else {
				//Incorrect
				JOptionPane.showMessageDialog(prompt, "Select exactly two skills.");
			}
		});
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
	}
	private static void showStartingEquipmentPrompt() {
		//phb p48
		//(a) a greataxe or (b) any martial melee weapon
		//AND
		//(a) two handaxes or (b) any simple weapon
	}
}
