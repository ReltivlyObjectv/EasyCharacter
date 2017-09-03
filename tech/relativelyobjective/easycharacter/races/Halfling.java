package tech.relativelyobjective.easycharacter.races;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.DamageModifier;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.Size;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import static tech.relativelyobjective.easycharacter.utilities.Lists.Ability.*;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Halfling {
	public enum HalflingSubrace {
		LIGHTFOOT,
		STOUT
	}
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Halfling"));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new AbilityModifier(DEXTERITY,2));
		InformationManager.addRaceElement(new WalkSpeed(25));
		InformationManager.addRaceElement(new Feature(
			"Lucky",
			"When you roll a 1 on an attack roll, ability check, or "+
			"saving throw, you can reroll the die and must use the new roll."
		));
		InformationManager.addRaceElement(new Feature(
			"Brave",
			"You have advantage on saving throws against being frightened."
		));
		InformationManager.addRaceElement(new Feature(
			"Halfling Nimbleness",
			"You can move through the space of any creature that is of a "+
			"size larger than yours."
		));
		InformationManager.addRaceElement(new Language("Common"));
		InformationManager.addRaceElement(new Language("Halfling"));
		WindowManager.getRaceTab().updateRaceElementsList();
		showSubracePrompt();
	}
	private static void showSubracePrompt() {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), 
			"Dwarven Subrace", true);
		prompt.setLayout(new BoxLayout(prompt.getContentPane(), BoxLayout.Y_AXIS));
		prompt.setPreferredSize(new Dimension(400,300));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.add(getSubraceHeaderPanel());
		prompt.add(getSubraceDetailsPanel());
		prompt.add(getSubraceInputPanel(prompt));
		prompt.setVisible(true);
	}
	private static JPanel getSubraceHeaderPanel() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new BorderLayout());
		returnMe.add(new JLabel(
			"<html><center><strong>Select your Dwarven subrace to gain "+
			"its benefits.</strong></center></html>", JLabel.CENTER), 
			BorderLayout.CENTER);
		return returnMe;
	}
	private static JPanel getSubraceDetailsPanel() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new BorderLayout());
		returnMe.add(getLightfootHalflingDetailsPanel(), BorderLayout.NORTH);
		returnMe.add(getStoutHalflingDetailsPanel(), BorderLayout.SOUTH);
		return returnMe;
	}
	private static JPanel getLightfootHalflingDetailsPanel() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new BoxLayout(returnMe, BoxLayout.Y_AXIS));
		JLabel header = new JLabel(String.format(
			"<html><center><strong><u>%s</u></strong></center></html>",
			"Lightfoot Halfling"), JLabel.CENTER);
		header.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(header);
		JLabel ability = new JLabel(
			"<html><center><i>Ability Score Increase:</i> +1 Charisma</center></html>",
			JLabel.CENTER);
		ability.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(ability);
		JLabel naturallyStealthy = new JLabel("<html><center><i>Naturally Stealthy:</i> "+
			"You can attempt to hide even when you are obscured only by a creature "+
			"that is at least one size larger than you.</center></html>", JLabel.CENTER);
		naturallyStealthy.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(naturallyStealthy);
		return returnMe;
	}
	private static JPanel getStoutHalflingDetailsPanel() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new BoxLayout(returnMe, BoxLayout.Y_AXIS));
		JLabel header = new JLabel(String.format(
			"<html><center><strong><u>%s</u></strong></center></html>",
			"Stout Halfling"), JLabel.CENTER);
		header.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(header);
		JLabel ability = new JLabel(
			"<html><center><i>Ability Score Increase:</i> +1 Constitution</center></html>",
			JLabel.CENTER);
		ability.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(ability);
		JLabel stoutResilience = new JLabel("<html><center><i>Stout Resilience:</i> "+
			"You have advantage on saving throws against poison, and you have "+
			"resistance against poison damage.",
		JLabel.CENTER);
		stoutResilience.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(stoutResilience);
		return returnMe;
		
	}
	private static JPanel getSubraceInputPanel(JDialog prompt) {
		JPanel returnMe = new JPanel();
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		returnMe.add(new JLabel("Choose Subrace"), constraints);
		JComboBox choice = new JComboBox(HalflingSubrace.values());
		constraints.gridx++;
		returnMe.add(choice, constraints);
		JButton saveButton = new JButton("Save Subrace");
		saveButton.addActionListener((ActionEvent e)->{
			if (choice.getSelectedItem() != null) {
				applySubraceEffects((HalflingSubrace) choice.getSelectedItem());
				prompt.dispose();
			}
		});
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 2;
		returnMe.add(saveButton, constraints);
		return returnMe;
	}
	private static void applySubraceEffects(HalflingSubrace s) {
		if (s == null) {
			return;
		}
		switch(s) {
			case LIGHTFOOT:
				InformationManager.addRaceElement(new Race("Lightfoot Halfling"));
				InformationManager.addRaceElement(new AbilityModifier(CHARISMA,1));
				InformationManager.addRaceElement(new Feature(
					"Naturally Stealthy",
					"You can attempt to hide een when you are obscured only by "+
					"a creature that is at least one size larger than you."
				));
				break;
			case STOUT:
				InformationManager.addRaceElement(new Race("Stout Halfling"));
				InformationManager.addRaceElement(new AbilityModifier(CONSTITUTION,1));
				InformationManager.addRaceElement(new Feature(
					"Stout Resilience",
					"You have advantage on saving throws against poison."
				));
				InformationManager.addRaceElement(new DamageModifier("Poison", 
					Lists.DamageMod.RESISTANT)
				);
				break;
		}
		WindowManager.getRaceTab().updateRaceElementsList();
	}
	
}
