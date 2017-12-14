package tech.relativelyobjective.easycharacter.utilities;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.lang.reflect.Array;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EmptyBorder;

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
}
