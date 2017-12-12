package tech.relativelyobjective.easycharacter.characterclasses;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.ProficiencyBonus;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class ClassChoices {
	public static void setupClassChoices(Lists.Class characterClass, int level) {
		if (characterClass == null) {
			throw new NullPointerException();
		} else if (level < 1 || level > 20) {
			//Out of Bounds
			return;
		}
		InformationManager.resetClassElements();
		InformationManager.addClassElement(
			new tech.relativelyobjective.easycharacter.characterelements.Class(characterClass, level)
		);
		InformationManager.addClassElement(
			new ProficiencyBonus(ClassChoices.getProficiencyBonus(level))
		);
		switch (characterClass) {
			case BARBARIAN:
				Barbarian.setup(level);
				break;
			case BARD:
				Bard.setup(level);
				break;
			case CLERIC:
				Cleric.setup(level);
				break;
			case DRUID:
				Druid.setup(level);
				break;
			case FIGHTER:
				Fighter.setup(level);
				break;
			case MONK:
				Monk.setup(level);
				break;
			case PALADIN:
				Paladin.setup(level);
				break;
			case RANGER:
				Ranger.setup(level);
				break;
			case ROGUE:
				Rogue.setup(level);
				break;
			case SORCERER:
				Sorcerer.setup(level);
				break;
			case WARLOCK:
				Warlock.setup(level);
				break;
			case WIZARD:
				Wizard.setup(level);
				break;
			default:
				throw new UnsupportedOperationException();
		}
		WindowManager.getMainFrame().setCompletedClassTab(true);
	}
	public static int getProficiencyBonus(int level) {
		if (level < 1) {
			return 0;
		} else if (level >= 20) {
			return 6;
		}
		switch (level) {
			case 1:
			case 2:
			case 3:
			case 4:
				return 2;
			case 5:
			case 6:
			case 7:
			case 8:
				return 3;
			case 9:
			case 10:
			case 11:
			case 12:
				return 4;
			case 13:
			case 14:
			case 15:
			case 16:
				return 5;
			case 17:
			case 18:
			case 19:
			case 20:
				return 6;
			default:
				return 0;
		}
	}
	public static void openSkillImprovement() {
		TreeSet<AbilityModifier> mods = 
			AbilityModifier.openAbilityScoreImprovementPrompt();
		for (AbilityModifier m : mods) {
			InformationManager.addClassElement(m);
		}
	}
	public static LinkedList<Lists.Skill> openProficiencyPrompt(Lists.Skill[] allOptions, int count) {
		//Gain proficiency in (count) skills
		if (count < 1) {
			throw(new IndexOutOfBoundsException("Must add at least one skill proficiency"));
		}
		//Exclude options that the player already has
		LinkedList<Lists.Skill> options = new LinkedList<>();
		for (int i = 0; i < allOptions.length; i++) {
			if (!InformationManager.isProficient(allOptions[i])) {
				options.add(allOptions[i]);
			}
		}
		//Check if there are fewer options than count
		if (count > options.size()) {
			return options;
		}
		//Show Prompt
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Skill Proficiencies", true);
		prompt.setPreferredSize(new Dimension(450,500));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		JLabel header = new JLabel(String.format(
			"<html><strong>Choose %d different skill%s to gain proficiency in</strong></html>",
				count,
				count == 1 ? "" : "s"), 
			JLabel.CENTER
		);
		prompt.add(header, constraints);
		constraints.gridy++;
		HashMap<Lists.Skill, JCheckBox> checkBoxes = new HashMap<>();
		for (Lists.Skill s : options) {
			JCheckBox box = new JCheckBox(Lists.SKILLS[Lists.getSkillIndex(s)]);
			checkBoxes.put(s, box);
			prompt.add(box, constraints);
			constraints.gridy++;
		}
		JButton saveButton = new JButton("Add Proficiencies");
		LinkedList<Lists.Skill> returnMe = new LinkedList<>();
		saveButton.addActionListener((ActionEvent e)->{
			int checkedBoxes = 0;
			for (Lists.Skill s : options) {
				if (checkBoxes.get(s).isSelected()) {
					checkedBoxes++;
				}
			}
			if (checkedBoxes == count) {
				//Correct
				for (Lists.Skill s : options) {
					if (checkBoxes.get(s).isSelected()) {
						returnMe.add(s);
					}
				}
				prompt.dispose();
			} else {
				//Incorrect
				JOptionPane.showMessageDialog(prompt, 
					String.format(
						"Select exactly %d skill%s.",
					count,
					count == 1 ? "" : "s"
					)
				);
			}
		});
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
		return returnMe;
	}
}
