package tech.relativelyobjective.easycharacter.utilities;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;

/**
 *
 * @author ReltivlyObjectv
 */
public class MiscPrompts {
	public static String openSingleStringChooserPrompt(String[] options, String windowTitle) {
		return openSingleStringChooserPrompt(options, windowTitle, false);
	}
	public static String openSingleStringChooserPrompt(String[] options, String windowTitle, boolean editable) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(),
			windowTitle, true);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridy = 0;
		constraints.gridx = 0;
		prompt.setPreferredSize(new Dimension(400,100));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		((JPanel)prompt.getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
		JComboBox selection = new JComboBox(options);
		selection.setEditable(editable);
		prompt.add(selection, constraints);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		constraints.gridy++;
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
		return (String) selection.getSelectedItem();
	}
	public static <T> T[] openMultipleObjectChooserPrompt(T[] options, String windowTitle, int count, Class<T> classType) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(),
			windowTitle, true);
		JPanel content = new JPanel();
		content.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridy = 0;
		constraints.gridx = 0;
		prompt.setMinimumSize(new Dimension(300,300));
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		HashMap<T, JCheckBox> checkBoxes = new HashMap<>();
		for (T o : options) {
			JCheckBox box = new JCheckBox(InformationManager.capitalizeFirstLetterOfWords(o.toString()));
			checkBoxes.put(o, box);
			content.add(box, constraints);
			constraints.gridy++;
		}
		T[] returnMe = (T[]) Array.newInstance(classType, count);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			int selectedCount = 0;
			for (T o : options) {
				if (checkBoxes.get(o).isSelected()) {
					selectedCount++;
				}
			}
			if (selectedCount == count) {
				//Correct
				int pos = 0;
				for (T o : options) {
					if (checkBoxes.get(o).isSelected()) {
						returnMe[pos] = o;
						pos++;
					}
				}
				prompt.dispose();
			} else {
				//Incorrect
				JOptionPane.showMessageDialog(prompt, 
					String.format(
						"Select exactly %d choice%s.",
					count,
					count == 1 ? "" : "s"
					)
				);
			}
		});
		constraints.gridy++;
		content.add(saveButton, constraints);
		JScrollPane scroller = new JScrollPane(content);
		prompt.add(scroller);
		prompt.setVisible(true);
		return (T[]) returnMe;
	}
	public static <T> T openSingleObjectChooserPrompt(T[] options, String windowTitle) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(),
			windowTitle, true);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridy = 0;
		constraints.gridx = 0;
		prompt.setPreferredSize(new Dimension(400,100));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		((JPanel)prompt.getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
		JComboBox selection = new JComboBox(options);
		prompt.add(selection, constraints);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		constraints.gridy++;
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
		return (T) selection.getSelectedItem();
	}

	public static TreeSet<AbilityModifier> openAbilityScoreImprovementPrompt() {
		return openAbilityScoreImprovementPrompt(2, Lists.Ability.values());
	}

	public static TreeSet<AbilityModifier> openAbilityScoreImprovementPrompt(int maxPoints) {
		return openAbilityScoreImprovementPrompt(maxPoints, Lists.Ability.values());
	}

	public static TreeSet<AbilityModifier> openAbilityScoreImprovementPrompt(int maxPoints, Lists.Ability[] options) {
		TreeSet<AbilityModifier> returnMe = new TreeSet<>();
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Ability Score Improvement", true);
		prompt.setPreferredSize(new Dimension(350, 400));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		HashMap<Lists.Ability, Integer> skills = InformationManager.getAbilityScores();
		HashMap<Lists.Ability, JSpinner> spinners = new HashMap<>();
		HashMap<Lists.Ability, JLabel> labels = new HashMap<>();
		for (Lists.Ability a : options) {
			labels.put(a, new JLabel(skills.get(a).toString()));
		}
		//TODO take into account if skills dont have enough room for improvement (e.g. all at 20)
		for (Lists.Ability a : options) {
			//TODO implement increasing max stat
			int skillMax = maxPoints;
			if (skills.get(a) + maxPoints > 20) {
				if (skills.get(a) >= 20) {
					skillMax = 0;
				} else {
					skillMax = (skills.get(a) + maxPoints) - 20;
				}
			}
			JSpinner s = new JSpinner(new SpinnerNumberModel( //Starting Value
			0, //Min
			0, skillMax, //Step
			1));
			s.addChangeListener((ChangeEvent e) -> {
				labels.get(a).setText(Integer.toString(skills.get(a) + (int) s.getValue()));
				prompt.revalidate();
			});
			spinners.put(a, s);
		}
		for (Lists.Ability a : options) {
			constraints.gridx = 0;
			prompt.add(new JLabel(InformationManager.capitalizeFirstLetterOfWords(a)), constraints);
			constraints.gridx = 1;
			prompt.add(spinners.get(a), constraints);
			constraints.gridx = 2;
			prompt.add(labels.get(a), constraints);
			constraints.gridy++;
		}
		constraints.gridx = 0;
		constraints.gridwidth = 3;
		JButton saveButton = new JButton("Save Skill Improvement");
		saveButton.addActionListener((ActionEvent e) -> {
			int totalPoints = 0;
			for (Lists.Ability a : options) {
				totalPoints += (int) (spinners.get(a).getValue());
			}
			if (totalPoints == maxPoints) {
				//Correct
				for (Lists.Ability a : options) {
					if ((int) spinners.get(a).getValue() > 0) {
						returnMe.add(new AbilityModifier(a, (int) spinners.get(a).getValue()));
					}
				}
				prompt.dispose();
			} else {
				//Incorrect
				JOptionPane.showMessageDialog(prompt, String.format("Allocate exactly %d skill point%s. " + "You have allocated %d.", maxPoints, maxPoints != 1 ? "s" : "", totalPoints));
			}
		});
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
		return returnMe;
	}
}
