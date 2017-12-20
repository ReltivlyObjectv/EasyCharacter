package tech.relativelyobjective.easycharacter.races;

import java.awt.BorderLayout;
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
import tech.relativelyobjective.easycharacter.characterelements.Darkvision;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.Race;
import tech.relativelyobjective.easycharacter.characterelements.Size;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
import tech.relativelyobjective.easycharacter.utilities.AllSpells;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;
import tech.relativelyobjective.easycharacter.utilities.SpellLists;

/**
 *
 * @author ReltivlyObjectv
 */
public class Gnome {
	public enum GnomeSubrace {
		FOREST,
		ROCK
	}
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Gnome"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.INTELLIGENCE,2));
		InformationManager.addRaceElement(new Size(Lists.Size.SMALL));
		InformationManager.addRaceElement(new WalkSpeed(25));
		InformationManager.addRaceElement(new Darkvision(60));
		InformationManager.addRaceElement(new Language("Common"));
		InformationManager.addRaceElement(new Language("Gnomish"));
		InformationManager.addRaceElement(new Feature(
			"Gnome Cunning",
			"You have advantage on all Intelligence, Wisdom, and Charisma "+
			"saving throws against magic."
		));
		WindowManager.getRaceTab().updateRaceElementsList();
		showSubracePrompt();
	}
	private static void showSubracePrompt() {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), 
			"Gnome Subrace", true);
		prompt.setLayout(new BoxLayout(prompt.getContentPane(), BoxLayout.Y_AXIS));
		prompt.setPreferredSize(new Dimension(550,250));
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
			"<html><center><strong>Select your Gnomish subrace to gain "+
			"its benefits.</strong></center></html>", JLabel.CENTER), 
			BorderLayout.CENTER);
		return returnMe;
	}
	private static JPanel getSubraceDetailsPanel() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.ipadx = 5;
		constraints.ipady = 5;
		returnMe.add(new JLabel("<html><strong>Ability Score</strong></html>"), constraints);
		constraints.gridx++;
		returnMe.add(new JLabel("<html><strong>Features</strong></html>"), constraints);
		constraints.gridx++;
		returnMe.add(new JLabel("<html><strong>Proficiencies</strong></html>"), constraints);
		//Forest Gnome
		constraints.gridy = 1;
		constraints.gridx = 0;
		returnMe.add(new JLabel("<html><strong>Forest</strong></html>"), constraints);
		constraints.gridx++;
		returnMe.add(new JLabel("Dexterity +1"), constraints);
		constraints.gridx++;
		returnMe.add(new JLabel(
			"<html><ul><li>Speak with Small Beasts (PHB p37)</li></ul></html>"), 
			constraints);
		constraints.gridx++;
		returnMe.add(new JLabel("-"), constraints);
		//Rock Gnome
		constraints.gridy = 2;
		constraints.gridx = 0;
		returnMe.add(new JLabel("<html><strong>Rock</strong></html>"), constraints);
		constraints.gridx++;
		returnMe.add(new JLabel("Constitution +1"), constraints);
		constraints.gridx++;
		returnMe.add(new JLabel(String.format(
			"<html><ul><li>%s</li><li>%s</li></ul></html>",
			"Artificer's Lore",
			"Tinker")), 
			constraints);
		constraints.gridx++;
		returnMe.add(new JLabel("Tinker's Tools"), constraints);
		return returnMe;
	}
	private static JPanel getSubraceInputPanel(JDialog prompt) {
		JPanel returnMe = new JPanel();
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		returnMe.add(new JLabel("Choose Subrace"), constraints);
		JComboBox choice = new JComboBox(Gnome.GnomeSubrace.values());
		constraints.gridx++;
		returnMe.add(choice, constraints);
		JButton saveButton = new JButton("Save Subrace");
		saveButton.addActionListener((ActionEvent e)->{
			if (choice.getSelectedItem() != null) {
				InformationManager.addRaceElement(
					new Race(InformationManager.capitalizeFirstLetterOfWords(
					choice.getSelectedItem())+" Gnome")
				);
				WindowManager.getRaceTab().updateRaceElementsList();
				prompt.dispose();
				applySubraceEffects((Gnome.GnomeSubrace) choice.getSelectedItem());
			}
		});
		constraints.gridx = 0;
		constraints.gridy++;
		constraints.gridwidth = 2;
		returnMe.add(saveButton, constraints);
		return returnMe;
	}
	private static void applySubraceEffects(GnomeSubrace s) {
		if (s == null) {
			return;
		}
		switch (s) {
			case FOREST:
				InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.DEXTERITY,1));
				InformationManager.addRaceElement(AllSpells.getMinorIllusion());
				InformationManager.addRaceElement(new Feature(
					"Speak with Small Beasts",
					"Through sounds and gestures, you can communicate simple "+
					"ideas with Small ar smaller beasts. Forest gnomes love "+
					"animaIs and often keep squirrels, badgers, rabbits, moles, "+
					"woodpeckers, and other creatures as beloved pets."
				));
				break;
			case ROCK:
				InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CONSTITUTION,1));
				InformationManager.addRaceElement(new Feature(
					"Artificer's Lore",
					"Whenever you make an Intelligence (History) check related "+
					"to magic items, alchemical objects, or technological "+
					"devices, you can add twice your proficiency bonus, "+
					"instead of any proficiency bonus you normally apply."
				));
				InformationManager.addRaceElement(new OtherProficiency("Tinker's Tools",1));
				InformationManager.addRaceElement(new Feature(
					"Tinker",
					"Using artisan's tools (tinker's tools), you can spend 1 "+
					"hour and 10 gp worth of materiaIs to construct a Tiny "+
					"clockwork device (AC 5, 1 hp). The device ceases to "+
					"function after 24 hours (unless you spend 1 hour repairing "+
					"it to keep the device functioning), or when you use your "+
					"action to dismantle it; at that time, you can reclaim the "+
					"materiaIs used to create it. You can have up to three such "+
					"devices active at a time. When you create a device, choose one "+
					"of the following options:\n"+
					"Clockwork Toy: This toy is a clockwork animal, monster, or "+
					"person, such as a frog, mouse, bird, dragon, ar soldier. "+
					"When placed on the ground, the toy moves 5 feet across the "+
					"ground on each of your turns in a random direction. "+
					"It makes noises as appropriate to the creature it represents.\n"+
					"Fire Starter: The device produces a miniature flame, which "+
					"you can use to light a candle, torch, or campfire. Using "+
					"the device requires your action.\n"+
					"Music Box: When opened, this music box plays a single song "+
					"at a moderate volume. The box stops playing when it reaches "+
					"the song's end or when it is closed."
				));
				break;
		}
		WindowManager.getRaceTab().updateRaceElementsList();
	}
}
