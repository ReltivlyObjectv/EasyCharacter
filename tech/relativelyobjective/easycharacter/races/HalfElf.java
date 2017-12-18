package tech.relativelyobjective.easycharacter.races;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElementList;
import tech.relativelyobjective.easycharacter.characterelements.Darkvision;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.Size;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class HalfElf {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Half-Elf"));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CHARISMA,2));
		InformationManager.addRaceElement(new Language("Common"));
		InformationManager.addRaceElement(new Language("Elvish"));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Darkvision(60));
		InformationManager.addRaceElement(new Feature(
			"Fey Ancestry",
			"You have advantage on saving throws against being charmed, and "+
			"magic can't put you to sleep."
		));
		WindowManager.getRaceTab().updateRaceElementsList();
		showAbilityPrompt();
	}
	private static void showAbilityPrompt() {
		//Gain one point in any two abilities (not charisma)
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Half-Elf Ability Increase", true);
		prompt.setPreferredSize(new Dimension(400,250));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		JLabel header = new JLabel(
			"<html><strong>Choose two abilities from below to gain +1</strong></html>", 
			JLabel.CENTER);
		prompt.add(header, constraints);
		constraints.gridy++;
		HashMap<Lists.Ability, JCheckBox> checkBoxes = new HashMap<>();
		for (int i = 0; i < Lists.Ability.values().length; i++) {
			if (Lists.Ability.values()[i] != Lists.Ability.CHARISMA) {
				JCheckBox box = new JCheckBox(Lists.ABILITIES[i]);
				checkBoxes.put(Lists.Ability.values()[i], box);
				prompt.add(box, constraints);
				constraints.gridy++;
			}
		}
		JButton saveButton = new JButton("Add Ability Points");
		saveButton.addActionListener((ActionEvent e)->{
			int checkedBoxes = 0;
			for (Lists.Ability a : checkBoxes.keySet()) {
				if (checkBoxes.get(a).isSelected()) {
					checkedBoxes++;
				}
			}
			if (checkedBoxes == 2) {
				//Correct
				for (Lists.Ability a : checkBoxes.keySet()) {
					if (checkBoxes.get(a).isSelected()) {
						InformationManager.addRaceElement(new AbilityModifier(a,1));
					}
				}
				WindowManager.getRaceTab().updateRaceElementsList();
				prompt.dispose();
				showSkillPrompt();
			} else {
				//Incorrect
				JOptionPane.showMessageDialog(prompt, "Select exactly two abilities.");
			}
		});
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
	}
	private static void showSkillPrompt() {
		//Gain proficiency in two skills
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Half-Elf Skills", true);
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
		for (int i = 0; i < Lists.Skill.values().length; i++) {
			JCheckBox box = new JCheckBox(Lists.SKILLS[i]);
			checkBoxes.put(Lists.Skill.values()[i], box);
			prompt.add(box, constraints);
			constraints.gridy++;
		}
		JButton saveButton = new JButton("Add Proficiencies");
		saveButton.addActionListener((ActionEvent e)->{
			int checkedBoxes = 0;
			for (Lists.Skill s : Lists.Skill.values()) {
				if (checkBoxes.get(s).isSelected()) {
					checkedBoxes++;
				}
			}
			if (checkedBoxes == 2) {
				//Correct
				for (Lists.Skill s : Lists.Skill.values()) {
					if (checkBoxes.get(s).isSelected()) {
						InformationManager.addRaceElement(new SkillProficiency(s,1));
					}
				}
				WindowManager.getRaceTab().updateRaceElementsList();
				prompt.dispose();
				InformationManager.addRaceElement(new Language(
					MiscPrompts.openSingleStringChooserPrompt(
						InformationManager.getUnknownLanguages(),
						"Additional Half-Elf Language",
						true
					)
				));
			} else {
				//Incorrect
				JOptionPane.showMessageDialog(prompt, "Select exactly two skills.");
			}
		});
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
	}
}
