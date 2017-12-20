package tech.relativelyobjective.easycharacter.characterelements;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Spell implements CharacterElement,Comparable {
	public String name, description, materialsRequired, castingTime, rangeArea;
	public boolean verbal, somatic, ritual, concentration;
	public Lists.MagicSchool school;
	private int level;
	
	public Spell() {
		name = "New Spell's Name";
		description = "New Spell's Description";
		materialsRequired = "";
		castingTime = Lists.CASTING_TIMES_EXAMPLES[0];
		rangeArea = "Self";
		verbal = somatic = true;
		ritual = concentration = false;
		school = Lists.MagicSchool.ABJURATION;
		level = 0;
	}
	@Override
	public void edit() {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), "Spell", true);
		prompt.setLayout(new BorderLayout());
		prompt.setPreferredSize(new Dimension(400,600));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		JTextField nameBox = new JTextField(name);
		prompt.add(nameBox, BorderLayout.NORTH);
		JPanel mainContent = new JPanel();
			mainContent.setLayout(new GridBagLayout());
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.gridy = 0;
			constraints.gridx = 0;
			constraints.gridwidth = 2;
			constraints.fill = GridBagConstraints.BOTH;
			JTextArea descriptionBox = new JTextArea(description);
			JScrollPane descriptionScroller = new JScrollPane(descriptionBox);
			descriptionScroller.setPreferredSize(new Dimension(400, 200));
			mainContent.add(descriptionScroller, constraints);
			constraints.gridy++;
			constraints.gridwidth = 1;
			mainContent.add(new JLabel("Casting Time"), constraints);
			JComboBox castingTimeBox = new JComboBox(Lists.CASTING_TIMES_EXAMPLES);
			castingTimeBox.setEditable(true);
			castingTimeBox.setSelectedItem(castingTime);
			constraints.gridx++;
			mainContent.add(castingTimeBox, constraints);
			constraints.gridx = 0;
			constraints.gridy++;
			mainContent.add(new JLabel("Spell Level"), constraints);
			JSpinner levelBox = new JSpinner(new SpinnerNumberModel(level, 0, 9, 1));
			constraints.gridx++;
			mainContent.add(levelBox, constraints);
			constraints.gridx = 0;
			constraints.gridy++;
			mainContent.add(new JLabel("School"), constraints);
			JComboBox schoolBox = new JComboBox(Lists.MagicSchool.values());
			schoolBox.setSelectedItem(school);
			constraints.gridx++;
			mainContent.add(schoolBox, constraints);
			constraints.gridx = 0;
			constraints.gridy++;
			mainContent.add(new JLabel("Range (Area)"), constraints);
			constraints.gridx++;
			JComboBox rangeAreaBox = new JComboBox(Lists.SPELL_RANGE_EXAMPLES);
			rangeAreaBox.setEditable(true);
			rangeAreaBox.setSelectedItem(rangeArea);
			mainContent.add(rangeAreaBox, constraints);
			constraints.gridx = 0;
			constraints.gridy++;
			mainContent.add(new JLabel("Material Components"), constraints);
			constraints.gridx++;
			JTextField materialsBox = new JTextField(materialsRequired);
			mainContent.add(materialsBox, constraints);
			constraints.gridx = 0;
			constraints.gridy++;
			mainContent.add(new JLabel("Verbal Component?"), constraints);
			constraints.gridx++;
			JCheckBox verbalBox = new JCheckBox();
			verbalBox.setSelected(verbal);
			mainContent.add(verbalBox, constraints);
			constraints.gridx = 0;
			constraints.gridy++;
			mainContent.add(new JLabel("Somatic Component?"), constraints);
			constraints.gridx++;
			JCheckBox somaticBox = new JCheckBox();
			somaticBox.setSelected(somatic);
			mainContent.add(somaticBox, constraints);
			constraints.gridx = 0;
			constraints.gridy++;
			mainContent.add(new JLabel("Ritual?"), constraints);
			constraints.gridx++;
			JCheckBox ritualBox = new JCheckBox();
			ritualBox.setSelected(ritual);
			mainContent.add(ritualBox, constraints);
			constraints.gridx = 0;
			constraints.gridy++;
			mainContent.add(new JLabel("Concentration?"), constraints);
			constraints.gridx++;
			JCheckBox concentrationBox = new JCheckBox();
			concentrationBox.setSelected(concentration);
			mainContent.add(concentrationBox, constraints);
		prompt.add(mainContent, BorderLayout.CENTER);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener((ActionEvent e)->{
			prompt.dispose();
		});
		prompt.add(saveButton, BorderLayout.SOUTH);
		prompt.setVisible(true);
		name = nameBox.getText();
		description = descriptionBox.getText();
		castingTime = (String) castingTimeBox.getSelectedItem();
		level = (int) levelBox.getValue();
		school = (Lists.MagicSchool) schoolBox.getSelectedItem();
		rangeArea = (String) rangeAreaBox.getSelectedItem();
		materialsRequired = materialsBox.getText();
		verbal = verbalBox.isSelected();
		somatic = somaticBox.isSelected();
		ritual = ritualBox.isSelected();
		concentration = concentrationBox.isSelected();
	}
	@Override
	public String toString() {
		return String.format("Spell: %s (%s)",
			name,
			level < 1 ? "Cantrip" : "Level "+level
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int l) {
		level = l < 1 ? 0 
			: l > 9 ? 9 
			: l;
	}
}
