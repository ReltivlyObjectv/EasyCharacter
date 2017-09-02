package tech.relativelyobjective.easycharacter.races;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElementList;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Human {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Human"));
		for (Lists.Ability a : Lists.Ability.values()) {
			InformationManager.addRaceElement(new AbilityModifier(a,1));
		}
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Language("Common"));
		WindowManager.getRaceTab().updateRaceElementsList();
		showLanguagePrompt();
	}
	private static void showLanguagePrompt() {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Human Language", true);
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
		prompt.add(new JLabel("<html><strong>Select an additional language to learn</strong><html>"), 
			constraints);
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 1;
		prompt.add(new JLabel("Language"), constraints);
		LinkedList unknownLanguages = new LinkedList();
		for (String l : Lists.LANGUAGESDND) {
			if (!CharacterElementList.hasLanguage(InformationManager.getRaceElements(), l)) {
				unknownLanguages.add(l);
			}
		}
		JComboBox choice = new JComboBox(unknownLanguages.toArray());
		choice.setEditable(true);
		constraints.gridx++;
		prompt.add(choice, constraints);
		JButton saveButton = new JButton("Add Language");
		saveButton.addActionListener((ActionEvent e)->{
			if (choice.getSelectedItem() != null) {
				InformationManager.addRaceElement(
					new Language((String) choice.getSelectedItem())
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
