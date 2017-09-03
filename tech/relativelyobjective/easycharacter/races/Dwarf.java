package tech.relativelyobjective.easycharacter.races;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
import tech.relativelyobjective.easycharacter.characterelements.Darkvision;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.Size;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Dwarf {
	public enum DwarfSubrace {
		HILL,
		MOUNTAIN
	}
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Dwarf"));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new WalkSpeed(25));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CONSTITUTION,2));
		InformationManager.addRaceElement(new Darkvision(60));
		InformationManager.addRaceElement(new Language("Common"));
		InformationManager.addRaceElement(new Language("Dwarvish"));
		InformationManager.addRaceElement(new Feature("Dwarven Resilience",
			"You have advantage on saving throws against poison (explained further "+
			"in chapter 9 of the PHB)"
		));
		InformationManager.addRaceElement(new DamageModifier("Poison",Lists.DamageMod.RESISTANT));
		InformationManager.addRaceElement(new OtherProficiency("Battleaxe",1));
		InformationManager.addRaceElement(new OtherProficiency("Handaxe",1));
		InformationManager.addRaceElement(new OtherProficiency("Throwing Hammer",1));
		InformationManager.addRaceElement(new OtherProficiency("Warhammer",1));
		WindowManager.getRaceTab().updateRaceElementsList();
		showToolProficiencyPrompt();
	}
	private static void showToolProficiencyPrompt() {
		//Choice to add one additional ability point
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), 
			"Dwarf Tool Proficiency", true);
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
		prompt.add(new JLabel("<html><center><strong>Select an Artisan's Tool to be "+
			"proficient in</strong><html><center>"), constraints);
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 1;
		prompt.add(new JLabel("Ability"), constraints);
		String[] options = {
			"Smith's Tools",
			"Brewer's Suppliies",
			"Mason's Tools"
		};
		JComboBox choice = new JComboBox(options);
		constraints.gridx++;
		prompt.add(choice, constraints);
		JButton saveButton = new JButton("Add Tool Proficiency");
		saveButton.addActionListener((ActionEvent e)->{
			if (choice.getSelectedItem() != null) {
				InformationManager.addRaceElement(
					new OtherProficiency((String) choice.getSelectedItem(),1)
				);
				WindowManager.getRaceTab().updateRaceElementsList();
				prompt.dispose();
				showSubracePrompt();
			}
		});
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 2;
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
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
		returnMe.add(getHillDwarfDetailsPanel(), BorderLayout.NORTH);
		returnMe.add(getMountainDwarfDetailsPanel(), BorderLayout.SOUTH);
		return returnMe;
	}
	private static JPanel getHillDwarfDetailsPanel() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new BoxLayout(returnMe, BoxLayout.Y_AXIS));
		JLabel header = new JLabel(String.format(
			"<html><center><strong><u>%s</u></strong></center></html>",
			"Hill Dwarf"), JLabel.CENTER);
		header.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(header);
		JLabel ability = new JLabel(
			"<html><center><i>Ability Score Increase:</i> +1 Wisdom</center></html>",
			JLabel.CENTER);
		ability.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(ability);
		JLabel dwarvenToughness = new JLabel("<html><center><i>Dwarven Toughness:</i> "+
			"Your hit point maximum increases by 1, and it increases by 1 every "+
			"time you gain a level.</center></html>", JLabel.CENTER);
		dwarvenToughness.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(dwarvenToughness);
		return returnMe;
	}
	private static JPanel getMountainDwarfDetailsPanel() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new BoxLayout(returnMe, BoxLayout.Y_AXIS));
		JLabel header = new JLabel(String.format(
			"<html><center><strong><u>%s</u></strong></center></html>",
			"Mountain Dwarf"), JLabel.CENTER);
		header.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(header);
		JLabel ability = new JLabel(
			"<html><center><i>Ability Score Increase:</i> +2 Strength</center></html>",
			JLabel.CENTER);
		ability.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(ability);
		JLabel dwarvenArmorTraining = new JLabel("<html><center><i>Dwarven Armor Training:</i> "+
			"You have proficiency with light and medium armor",
		JLabel.CENTER);
		dwarvenArmorTraining.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnMe.add(dwarvenArmorTraining);
		return returnMe;
		
	}
	private static JPanel getSubraceInputPanel(JDialog prompt) {
		JPanel returnMe = new JPanel();
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		returnMe.add(new JLabel("Choose Subrace"), constraints);
		JComboBox choice = new JComboBox(Dwarf.DwarfSubrace.values());
		constraints.gridx++;
		returnMe.add(choice, constraints);
		JButton saveButton = new JButton("Save Subrace");
		saveButton.addActionListener((ActionEvent e)->{
			if (choice.getSelectedItem() != null) {
				if (choice.getSelectedItem().equals(DwarfSubrace.HILL)) {
					//Hill Dwarf
					InformationManager.addRaceElement(
						new AbilityModifier(Lists.Ability.WISDOM,1));
					InformationManager.addRaceElement(new Feature(
						"Dwarven Toughness",
						"Your hit point maximum increases by 1, and it increases by "+
						"1 every time you gain a level."
					));
					
				} else if (choice.getSelectedItem().equals(DwarfSubrace.MOUNTAIN)) {
					//Mountain Dwarf
					InformationManager.addRaceElement(
						new AbilityModifier(Lists.Ability.STRENGTH,2));
					InformationManager.addRaceElement(
						new OtherProficiency("Light Armor",1));
					InformationManager.addRaceElement(
						new OtherProficiency("Medium Armor",1));
				}
				WindowManager.getRaceTab().updateRaceElementsList();
				InformationManager.addRaceElement(
					new Race(InformationManager.capitalizeFirstLetterOfWords(
					choice.getSelectedItem())+" Dwarf")
				);
				prompt.dispose();
			}
		});
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 2;
		returnMe.add(saveButton, constraints);
		return returnMe;
	}
}
