package tech.relativelyobjective.easycharacter.utilities;

import java.awt.BorderLayout;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import tech.relativelyobjective.easycharacter.characterelements.AbilityModifier;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;
import tech.relativelyobjective.easycharacter.characterelements.Feat;

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
	public static String openStringPrompt(String windowTitle) {
		return openStringPrompt(windowTitle, "");
	}
	public static String openStringPrompt(String windowTitle, String existingText) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), windowTitle, true);
		prompt.setLayout(new BorderLayout());
		prompt.setPreferredSize(new Dimension(400,75));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		JTextField textBox = new JTextField(existingText);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		prompt.add(textBox, BorderLayout.NORTH);
		prompt.add(saveButton, BorderLayout.SOUTH);
		prompt.setVisible(true);
		return textBox.getText();
	}
	public static ObjectPair<String, String> getShortAndLongString(String shortText, String longText, String windowTitle) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), windowTitle, true);
		prompt.setLayout(new BorderLayout());
		prompt.setPreferredSize(new Dimension(300,300));
		prompt.setMinimumSize(new Dimension(300,300));
		prompt.setMaximumSize(new Dimension(300,300));
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		JTextField shortField = new JTextField(shortText);
		JTextArea longField = new JTextArea(longText);
		longField.setLineWrap(true);
		longField.setWrapStyleWord(true);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		prompt.add(shortField, BorderLayout.NORTH);
		JScrollPane longScroller = new JScrollPane(longField);
		prompt.add(longScroller, BorderLayout.CENTER);
		prompt.add(saveButton, BorderLayout.SOUTH);
		prompt.setVisible(true);
		return new ObjectPair<>(
			shortField.getText(),
			longField.getText()
		);
	}
	public static <T> T[] openMultipleObjectChooserPrompt(T[] options, String windowTitle, int count, Class<T> classType) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), windowTitle, true);
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
	public static <T> T openSingleObjectChooserPrompt(T[] options, T selected, String windowTitle) {
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
		if (selected != null) {
			selection.setSelectedItem(selected);
		}
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
	public static <T, U> ObjectPair<T, U> openStringAndObjectChooserPrompt(T[] optionsA, T selectedA, String[] optionsB, String selectedB, String windowTitle) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(),
			windowTitle, true);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		prompt.setPreferredSize(new Dimension(400,100));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		JComboBox selectionA = new JComboBox(optionsA);
		selectionA.setSelectedItem(selectedA);
		prompt.add(selectionA, constraints);
		JComboBox selectionB = new JComboBox(optionsB);
		selectionB.setEditable(true);
		selectionB.setSelectedItem(selectedB);
		constraints.gridx++;
		prompt.add(selectionB, constraints);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
		ObjectPair<T, U> returnMe = new ObjectPair<>(
			(T) selectionA.getSelectedItem(),
			(U) selectionB.getSelectedItem()
		);
		return returnMe;
	}
	public static <T, U> ObjectPair<T, U> openTwoMultipleObjectChooserPrompt(T[] optionsA, T selectedA, U[] optionsB, U selectedB, String windowTitle) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(),
			windowTitle, true);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		prompt.setPreferredSize(new Dimension(400,100));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		JComboBox selectionA = new JComboBox(optionsA);
		selectionA.setSelectedItem(selectedA);
		prompt.add(selectionA, constraints);
		JComboBox selectionB = new JComboBox(optionsB);
		selectionB.setSelectedItem(selectedB);
		constraints.gridx++;
		prompt.add(selectionB, constraints);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
		ObjectPair<T, U> returnMe = new ObjectPair<>(
			(T) selectionA.getSelectedItem(),
			(U) selectionB.getSelectedItem()
		);
		return returnMe;
	}
	public static ObjectIntegerPair<String> openStringSpinnerPrompt(String text, int startValue, int minValue, int maxValue, String title, int step) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), title, true);
		prompt.setPreferredSize(new Dimension(350, 50));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new BorderLayout());
		JTextField textBox = new JTextField(text);
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(startValue, minValue, maxValue, step));
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		prompt.add(spinner, BorderLayout.WEST);
		prompt.add(textBox, BorderLayout.CENTER);
		prompt.add(saveButton, BorderLayout.LINE_END);
		prompt.setVisible(true);
		return new ObjectIntegerPair<>(textBox.getText(), (int) spinner.getValue());
	}
	public static ObjectSet<String, String, Integer> openShortAndLongStringSpinnerPrompt(String shortText, String longText, int startValue, int minValue, int maxValue, String title, int step) {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), title, true);
		prompt.setPreferredSize(new Dimension(350, 400));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new BorderLayout());
		JTextField shortField = new JTextField(shortText);
		JTextArea longField = new JTextArea(longText);
		longField.setLineWrap(true);
		longField.setWrapStyleWord(true);
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(startValue, minValue, maxValue, step));
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		prompt.add(shortField, BorderLayout.NORTH);
		prompt.add(longField, BorderLayout.CENTER);
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new BorderLayout());
		southPanel.add(spinner, BorderLayout.NORTH);
		southPanel.add(saveButton, BorderLayout.SOUTH);
		prompt.add(southPanel, BorderLayout.SOUTH);
		prompt.setVisible(true);
		return new ObjectSet<>(shortField.getText(), longField.getText(), (int) spinner.getValue());
	}
	public static int openSpinnerPrompt(int startValue, int minValue, int maxValue, String title) {
		return openSpinnerPrompt(startValue, minValue, maxValue, title, 1);
	}
	public static int openSpinnerPrompt(int startValue, int minValue, int maxValue, String title, int step) {
		int returnValue;
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), title, true);
		prompt.setPreferredSize(new Dimension(350, 75));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new BorderLayout());
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(startValue, minValue, maxValue, step));
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});		
		prompt.add(spinner, BorderLayout.PAGE_START);
		prompt.add(saveButton, BorderLayout.PAGE_END);
		prompt.setVisible(true);
		returnValue = (int) spinner.getValue();
		return returnValue;
	}
	public static <T> ObjectIntegerPair openObjectChooserSpinner(T[] options, T selected, int startValue, int minValue, int maxValue, String title, int step) {
		ObjectIntegerPair returnMe = new ObjectIntegerPair();
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), title, true);
		prompt.setPreferredSize(new Dimension(350, 100));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new BorderLayout());
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(startValue, minValue, maxValue, step));
		JComboBox selection = new JComboBox(options);
		selection.setSelectedItem(selected);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		prompt.add(spinner, BorderLayout.PAGE_START);
		prompt.add(selection, BorderLayout.CENTER);
		prompt.add(saveButton, BorderLayout.PAGE_END);
		prompt.setVisible(true);
		returnMe.object = (T) selection.getSelectedItem();
		returnMe.value = (int) spinner.getValue();
		return returnMe;
	}
	public static TreeSet<CharacterElement> openAbilityScoreImprovementPrompt() {
		return openAbilityScoreImprovementPrompt(2, Lists.Ability.values());
	}
	public static TreeSet<CharacterElement> openAbilityScoreImprovementPrompt(int maxPoints) {
		return openAbilityScoreImprovementPrompt(maxPoints, Lists.Ability.values());
	}
	public static TreeSet<CharacterElement> openAbilityScoreImprovementPrompt(int maxPoints, Lists.Ability[] options) {
		TreeSet<CharacterElement> returnMe = new TreeSet<>();
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
		HashMap<Lists.Ability, Integer> maxStats = InformationManager.getMaxAbilityScores();
		for (Lists.Ability a : options) {
			Integer calcValue = skills.get(a);
			Integer maxValue = maxStats.get(a);
			labels.put(a, new JLabel(calcValue > maxValue ? maxValue.toString() : calcValue.toString()));
		}
		//TODO take into account if skills dont have enough room for improvement (e.g. all at 20)
		for (Lists.Ability a : options) {
			int skillMax = maxPoints;
			if (skills.get(a) + maxPoints > maxStats.get(a)) {
				if (skills.get(a) >= maxStats.get(a)) {
					skillMax = 0;
				} else {
					skillMax = (skills.get(a) + maxPoints) - maxStats.get(a);
				}
			}
			JSpinner s = new JSpinner(new SpinnerNumberModel(
			0, //Starting Value
			0, //Min
			skillMax, 
			1//Step
			));
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
		if (maxPoints == 2 && options.length == 6) { //A standard ability score improvement\
			constraints.gridy++;
			JButton featButton = new JButton("Receive a feat instead");
			featButton.addActionListener((ActionEvent e)->{
				prompt.dispose();
				Feat chosenFeat = new Feat(MiscPrompts.openSingleObjectChooserPrompt(
					InformationManager.getNonPossessedFeats(), 
					null, 
					"Add Feat"
				));
				returnMe.add(chosenFeat);
			});
			prompt.add(featButton, constraints);
		}
		prompt.setVisible(true);
		return returnMe;
	}
	public static String[] openNStringChooserPrompt(String[] options, int count, String title) {
		if (count < 1) {
			throw new IndexOutOfBoundsException("Cannot choose less than one String");
		}
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), title, true);
		prompt.setLayout(new BorderLayout());
		prompt.setPreferredSize(new Dimension(350, 400));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		JPanel content = new JPanel();
		content.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.ipady = 5;
		constraints.fill = GridBagConstraints.BOTH;
		JComboBox[] inputs = new JComboBox[count];
		for (int i = 0; i < count; i++) {
			inputs[i] = new JComboBox(options);
			inputs[i].setEditable(true);
			inputs[i].setPreferredSize(new Dimension(prompt.getPreferredSize().width - 30, 20));
			content.add(inputs[i], constraints);
			constraints.gridy++;
		}
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		content.add(saveButton, constraints);
		JScrollPane scroller = new JScrollPane(content);
		scroller.setPreferredSize(prompt.getPreferredSize());
		prompt.add(scroller);
		prompt.setVisible(true);
		String[] returnMe = new String[count];
		for (int i = 0; i < count; i++) {
			returnMe[i] = (String) inputs[i].getSelectedItem();
		}
		return returnMe;
	}
}
