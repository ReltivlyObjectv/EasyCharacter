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
import tech.relativelyobjective.easycharacter.characterelements.DamageModifier;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.Language;
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
public class Dragonborn {
	//The position in each array corresponds to the 
	//--other elements in the same position
	public enum DragonColor {
		BLACK,
		BLUE,
		BRASS,
		BRONZE,
		COPPER,
		GOLD,
		GREEN,
		RED,
		SILVER,
		WHITE
	}
	private static final String[] BREATH_WEAPONS = {
		"5 by 30 ft. line (Dex. save)",
		"5 by 30 ft. line (Dex. save)",
		"5 by 30 ft. line (Dex. save)",
		"5 by 30 ft. line (Dex. save)",
		"5 by 30 ft. line (Dex. save)",
		"15 ft. cone (Dex. save)",
		"15 ft. cone (Con. save)",
		"15 ft. cone (Dex. save)",
		"15 ft. cone (Con. save)",
		"15 ft. cone (Con. save)"
	};
	private static final String[] DAMAGE_TYPE = {
		"Acid",
		"Lightning",
		"Fire",
		"Lightning",
		"Acid",
		"Fire",
		"Poison",
		"Fire",
		"Cold",
		"Cold"
		};
	public static void setup() {
		InformationManager.resetRaceElements();
		InformationManager.addRaceElement(new Race("Dragonborn"));
		InformationManager.addRaceElement(new Size(Lists.Size.MEDIUM));
		InformationManager.addRaceElement(new WalkSpeed(30));
		InformationManager.addRaceElement(new Language("Common"));
		InformationManager.addRaceElement(new Language("Draconic"));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.STRENGTH,2));
		InformationManager.addRaceElement(new AbilityModifier(Lists.Ability.CHARISMA,1));
		WindowManager.getRaceTab().updateRaceElementsList();
		openAncestryPrompt();
	}
	private static void openAncestryPrompt() {
		//Chooose draconic ancestry
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Draconic Ancestry", true);
		prompt.setLayout(new BoxLayout(prompt.getContentPane(), BoxLayout.Y_AXIS));
		prompt.setPreferredSize(new Dimension(400,300));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.add(getDialogHeader());
		prompt.add(getAncestryTable());
		prompt.add(getInputPanel(prompt));
		prompt.setVisible(true);
	}
	private static JPanel getDialogHeader() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new BorderLayout());
		returnMe.add(new JLabel("<html><center>Select your Draconic ancestry to gain a breath weapon \n"+
			"and a resisitance to its damage type.<center><html>"), BorderLayout.CENTER);
		return returnMe;
	}
	private static JPanel getAncestryTable() {
		JPanel returnMe = new JPanel();
		returnMe.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.ipadx = 3;
		constraints.gridx = 0;
		constraints.gridy = 0;
		returnMe.add(new JLabel("<html><strong>Dragon Color</strong></html>"), constraints);
		constraints.gridx++;
		returnMe.add(new JLabel("<html><strong>Damage Type</strong></html>"), constraints);
		constraints.gridx++;
		returnMe.add(new JLabel("<html><strong>Breath Weapon</strong></html>"), constraints);
		constraints.gridx = 0;
		for (int i = 0; i < DragonColor.values().length; i++) {
			constraints.gridy = i+1;
			returnMe.add(new JLabel(
				InformationManager.capitalizeFirstLetterOfWords(DragonColor.values()[i])
			), constraints);
		}
		constraints.gridx = 1;
		for (int i = 0; i < DAMAGE_TYPE.length; i++) {
			constraints.gridy = i+1;
			returnMe.add(new JLabel(DAMAGE_TYPE[i]), constraints);
		}
		constraints.gridx = 2;
		for (int i = 0; i < BREATH_WEAPONS.length; i++) {
			constraints.gridy = i+1;
			returnMe.add(new JLabel(BREATH_WEAPONS[i]), constraints);
		}
		return returnMe;
	}
	private static JPanel getInputPanel(JDialog prompt) {
		JPanel returnMe = new JPanel();
		GridBagConstraints constraints = new GridBagConstraints();
		//constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridx = 0;
		constraints.gridy = 0;
		returnMe.add(new JLabel("Choose Color"), constraints);
		JComboBox choice = new JComboBox(DragonColor.values());
		constraints.gridx++;
		returnMe.add(choice, constraints);
		JButton saveButton = new JButton("Save Color");
		saveButton.addActionListener((ActionEvent e)->{
			if (choice.getSelectedItem() != null) {
				Feature newFeature = new Feature();
				newFeature.setName(String.format(
					"Breath Weapon (%s)",
					InformationManager.capitalizeFirstLetterOfWords(
						choice.getSelectedItem().toString()
					)
				));
				int arrayPos = -1;
				for (int i = 0; i < DragonColor.values().length; i++) {
					if (choice.getSelectedItem().equals(DragonColor.values()[i])) {
						arrayPos = i;
						break;
					}
				}
				if (arrayPos < 0) {
					//Invalid selection
					return;
				}
				newFeature.setDescription(String.format(
					"You can use your action to exhale "+
					"destructive energy. Your draconic ancestry determines the "+
					"size, shape, and damage type of the exhalation. "+
					"When you use your breath weapon, each creature in the area "+
					"of the exhalation must make a saving throw. The type of "+
					"which is determined by your draconic ancestry. The DC for "+
					"this saving throw equals 8 + your Constitution modifier + "+
					"your proficiency bonus. A creature takes 2d6 damage on a "+
					"failed save, and half as much damage on a successful one. "+
					"The damage increases to 3d6 at 6th level. 4d6 at 11th level, "+
					"and 5d6 at 16th level. You have %s ancestry, which makes your "+
					"breath weapon a %s that deals %s damage.",
					InformationManager.capitalizeFirstLetterOfWords(
						choice.getSelectedItem().toString()),
					BREATH_WEAPONS[arrayPos],
					DAMAGE_TYPE[arrayPos]
				));
				InformationManager.addRaceElement(newFeature);
				InformationManager.addRaceElement(new DamageModifier(DAMAGE_TYPE[arrayPos], 
					Lists.DamageMod.RESISTANT));
				WindowManager.getRaceTab().updateRaceElementsList();
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
