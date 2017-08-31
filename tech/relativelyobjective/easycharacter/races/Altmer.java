package tech.relativelyobjective.easycharacter.races;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
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
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new Language("Altmeris"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.INTELLIGENCE,1));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.WISDOM,1));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.ARCANA, 1));
		InformationManager.addRaceElement(new DamageModifier(
			"Lightning", Lists.DamageMod.VULNERABLE)
		);
		WindowManager.getRaceTab().updateRaceElementsList();
		openPrompt();
	}
	private static void openPrompt() {
		//Add choice to add one additional ability point
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Altmer Ability Bonus", true);
		prompt.setPreferredSize(new Dimension(500,100));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		prompt.add(new JLabel("<html><strong>Select an ability score to receive an additional +1</strong><html>"), constraints);
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 1;
		prompt.add(new JLabel("Ability"), constraints);
		Lists.Ability[] options = {
			Lists.Ability.INTELLIGENCE, 
			Lists.Ability.WISDOM
		};
		JComboBox choice = new JComboBox(options);
		constraints.gridx++;
		prompt.add(choice, constraints);
		JButton saveButton = new JButton("Add Modifier");
		saveButton.addActionListener((ActionEvent e)->{
			if (choice.getSelectedItem() != null) {
				InformationManager.addRaceElement(
					new AbilityModifier((Lists.Ability) choice.getSelectedItem(),1)
				);
				WindowManager.getRaceTab().updateRaceElementsList();
				prompt.dispose();
			}
		});
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 2;
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
	}
}
