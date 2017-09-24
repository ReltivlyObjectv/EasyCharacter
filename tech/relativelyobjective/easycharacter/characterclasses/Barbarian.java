package tech.relativelyobjective.easycharacter.characterclasses;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import tech.relativelyobjective.easycharacter.characterelements.BarbarianPath;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.Rages;
import tech.relativelyobjective.easycharacter.characterelements.SavingThrowProficiency;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.characterelements.WalkSpeed;
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
	public static enum PrimalPath {
		BERSERKER,
		TOTEM_WARRIOR
	}
	public static enum TotemSpirit {
		BEAR,
		EAGLE,
		WOLF
	}
	private static PrimalPath path = PrimalPath.BERSERKER;
	private static TotemSpirit spirit = TotemSpirit.BEAR;
	
	public static void setup(int level) {
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
			for (InventoryItem i : ItemLists.getExplorersPack()) {
				InformationManager.addClassElement(i);
			}
			InformationManager.addClassElement(new InventoryItem("Greataxe", 1));
			InformationManager.addClassElement(new InventoryItem("Handaxe", 2));
			InformationManager.addClassElement(new InventoryItem("Javelin", 4));
			InformationManager.addClassElement(new Feature(
				"Rage",
				"In battle, you fight with primal ferocity. On your turn, you "+
				"can enter a rage as a bonus action. While raging, you gain the "+
				"following benefits if you aren't wearing heavy armor:\n"+
				"- You have advantage on Strength checks and Strength saving "+
				"throws.\n"+
				"- When you make a melee weapon attack using Strength, you gain "+
				"a bonus to the damage roll that increases as you gain levels as "+
				"a barbarian, as shown in the Rage Damage column of the Barbarian table.\n"
			));
			InformationManager.addClassElement(new Rages(2));
			InformationManager.addClassElement(new Feature(
				"Unarmored Defense",
				"While you are not wearing any armor, your Armor Class equals "+
				"10 + your Dexterity modifier + your Constitution modifier. "+
				"You can use a shield and gain this benefit."
			));
			WindowManager.getClassTab().updateClassElementsList();
			showLevelOneSkillProficiencyPrompt();
		}
		if (level >= 2) {
			InformationManager.addClassElement(new Feature(
				"Reckless Attack",
				"You can throw aside all concern for defense to attack with "+
				"fierce desperation. When you make your first attack on your "+
				"turn, you can decide to attack recklessly. Doing so gives you "+
				"advantage on melee weapon attack rolls using Strength during "+
				"this turn, but attack rolls against you have advantage until "+
				"your next turn."
			));
			InformationManager.addClassElement(new Feature(
				"Danger Sense",
				"You gain an uncanny sense of when things nearby aren't as they "+
				"should be, giving you an edge when you dodge away from danger. "+
				"You have advantage on Dexterity saving throws against effects "+
				"that you can see, such as traps and spells. To gain this benefit, "+
				"you can't be blinded, deafened, or incapacitated."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 3) {
			InformationManager.addClassElement(new Rages(3));
			WindowManager.getClassTab().updateClassElementsList();
			openPathPrompt();
			InformationManager.addClassElement(new BarbarianPath(path));
			switch (path) {
				case BERSERKER:
					InformationManager.addClassElement(new Feature(
						"Frenzy",
						"You can go into a frenzy when you rage. If you do so, "+
						"for the duration of you rage you can make a single "+
						"melee weapon attack as a bonus action on each of your "+
						"turns after this one. When your rage ends, you suffer "+
						"one level of exhaustion."
					));
					break;
				case TOTEM_WARRIOR:
					InformationManager.addClassElement(new Feature(
						"Spirit Seeker",
						"You gain the ability to cast the beast sense and speak "+
						"with animals spells, but only as rituals, as described "+
						"in chapter 10 of the PHB."
					));
					WindowManager.getClassTab().updateClassElementsList();
					openTotemSpiritPrompt();
					switch (spirit) {
						case BEAR:
							//TODO
							break;
						case EAGLE:
							//TODO
							break;
						case WOLF:
							//TODO
							break;
					}
					break;
			}
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 4) {
			ClassChoices.openSkillImprovement();
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 5) {
			InformationManager.addClassElement(new Feature(
				"Extra Attack",
				"You can attack twice, instead of once, whenever you take the "+
				"Attack action on your turn."
			));
			InformationManager.addClassElement(
				new WalkSpeed(InformationManager.getSpeed() + 10)
			);
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 6) {
			InformationManager.addClassElement(new Rages(4));
			switch (path) {
				case BERSERKER:
					InformationManager.addClassElement(new Feature(
						"Mindless Rage",
						""
					));
					break;
				case TOTEM_WARRIOR:
					switch (spirit) {
						case BEAR:
							//TODO
							break;
						case EAGLE:
							//TODO
							break;
						case WOLF:
							//TODO
							break;
					}
					break;
			}
		}
		if (level >= 7) {
			
		}
		if (level >= 8) {
			ClassChoices.openSkillImprovement();
			
		}
		if (level >= 9) {
			
		}
		if (level >= 10) {
			
		}
		if (level >= 11) {
			
		}
		if (level >= 12) {
			InformationManager.addClassElement(new Rages(5));
			ClassChoices.openSkillImprovement();
			
		}
		if (level >= 13) {
			
		}
		if (level >= 14) {
			
		}
		if (level >= 15) {
			
		}
		if (level >= 16) {
			ClassChoices.openSkillImprovement();
			
		}
		if (level >= 17) {
			InformationManager.addClassElement(new Rages(6));
			
		}
		if (level >= 18) {
			
		}
		if (level >= 19) {
			ClassChoices.openSkillImprovement();
			
		}
		if (level >= 20) {
			InformationManager.addClassElement(new Rages(Integer.MAX_VALUE));
			
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
			JLabel.CENTER
		);
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
	private static void openPathPrompt() {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), 
			"Primal Path", true);
		prompt.setLayout(new BoxLayout(prompt.getContentPane(), BoxLayout.PAGE_AXIS));
		prompt.setPreferredSize(new Dimension(500,300));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		((JPanel)prompt.getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
		JLabel title = new JLabel(
			"<html><strong>Choose your Barbarian's Primal Path.<strong><br><br></html>",
			SwingConstants.CENTER
		);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		prompt.add(title);
		JLabel pathB = new JLabel(
			"<html><strong>Path of the Berserker</strong><i> For some barbarians. "+
			"rage is a means to an end - that end being violence. "+
			"The Path of the Berserker is a path of untrammeled fury, slick "+
			"with blood. As you enter the berserker's rage, you thrill in the "+
			"chaos of battle, heedless of your own health or well-being.</i><br><br></html>",
			SwingConstants.CENTER
		);
		pathB.setAlignmentX(Component.CENTER_ALIGNMENT);
		prompt.add(pathB);
		JLabel pathT = new JLabel(
			"<html><strong>Path of the Totem Warrior</strong><i> The Path of the "+
			"Totem Warrior is a spiritual journey, as the barbarian accepts a "+
			"spirit animal as guide, protector, and inspiration. In battle, "+
			"your totem spirit fills you with supernatural might, adding magical "+
			"fuel to your barbarian rage.</i><br><br></html>",
			SwingConstants.CENTER
		);
		pathT.setAlignmentX(Component.CENTER_ALIGNMENT);
		prompt.add(pathT);
		JComboBox selection = new JComboBox(PrimalPath.values());
		prompt.add(selection);
		JButton saveButton = new JButton("Save Path");
		saveButton.addActionListener((ActionEvent e)->{
			path = (PrimalPath) selection.getSelectedItem();
			prompt.dispose();
		});
		prompt.add(saveButton);
		prompt.setVisible(true);
		WindowManager.getClassTab().updateClassElementsList();
	}
	private static void openTotemSpiritPrompt() {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), 
			"Totem Spirit", true);
		prompt.setLayout(new BoxLayout(prompt.getContentPane(), BoxLayout.PAGE_AXIS));
		prompt.setPreferredSize(new Dimension(500,225));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		((JPanel)prompt.getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
		JLabel title = new JLabel(
			"<html><strong>Choose your Totem Spirit.<strong><br><br></html>",
			SwingConstants.CENTER
		);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		prompt.add(title);
		JLabel totemDescription = new JLabel(
			"<html><strong>Spirit Animal Effects</strong><i> You gain verious "+
			"effects from your spirit animal (detailed in the PHB p50). The Bear "+
			"gives you advantages having to do with might, the Eagle gives you "+
			"more mobility and flight, and the Wolf gives you advantages having "+
			"to do with perception.</i><br><br></html>",
			SwingConstants.CENTER
		);
		totemDescription.setAlignmentX(Component.CENTER_ALIGNMENT);
		prompt.add(totemDescription);
		JComboBox selection = new JComboBox(TotemSpirit.values());
		prompt.add(selection);
		JButton saveButton = new JButton("Save Path");
		saveButton.addActionListener((ActionEvent e)->{
			spirit = (TotemSpirit) selection.getSelectedItem();
			prompt.dispose();
		});
		prompt.add(saveButton);
		prompt.setVisible(true);
		WindowManager.getClassTab().updateClassElementsList();
	}
}
