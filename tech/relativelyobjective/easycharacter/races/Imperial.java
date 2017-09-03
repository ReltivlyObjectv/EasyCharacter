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
import tech.relativelyobjective.easycharacter.characterelements.*;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Imperial {
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Imperial"));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new SkillProficiency(Lists.Skill.PERSUASION, 1));
		InformationManager.addRaceElement(new OtherProficiency("Heavy Armor", 1));
		InformationManager.addRaceElement(new Language("Cyrodilic"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CHARISMA,3));
		InformationManager.addRaceElement(new DamageModifier("Fire", Lists.DamageMod.RESISTANT));
		Feature voiceOfTheEmperor = new Feature();
		voiceOfTheEmperor.setName("Voice of the Emperor");
		voiceOfTheEmperor.setDescription(
			"Once per long rest you can give yourself advantage on a charisma "+
			"roll, then give the final number +2.");
		InformationManager.addRaceElement(voiceOfTheEmperor);
		WindowManager.getRaceTab().updateRaceElementsList();
		openPrompt();
	}
	private static void openPrompt() {
		//Choice to add one additional language
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Extra Imperial Language", true);
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
		prompt.add(new JLabel("<html><strong>Select an additional language to learn.</strong><html>"), constraints);
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 1;
		prompt.add(new JLabel("Language"), constraints);
		LinkedList<String> languages = new LinkedList<>();
		for (String s : Lists.LANGUAGESTES) {
			boolean hasLanguage = false;
			for (CharacterElement e : InformationManager.getRaceElements()) {
				if (e instanceof Language) {
					Language l = (Language) e;
					if (l.lang.equals(s)) {
						hasLanguage = true;
						break;
					}
				}
			}
			if (!hasLanguage) {
				languages.add(s);
			}
		}
		JComboBox choice = new JComboBox(languages.toArray());
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
