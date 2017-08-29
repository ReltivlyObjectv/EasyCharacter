package tech.relativelyobjective.easycharacter.pieces.tabs;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class TabStats extends JPanel {
	private final JSpinner[] stats;
	private final JLabel[] modifiers;
	public TabStats() {
		super.setLayout(new GridBagLayout());
		stats = new JSpinner[6];
		modifiers = new JLabel[6];
		GridBagConstraints constraints = new GridBagConstraints();
		for (int i = 0; i < 6; i++) {
			constraints.gridy = i;
			constraints.gridx = 0;
			JLabel label = new JLabel(Lists.ABILITIES[i]);
			label.setFont(new Font(label.getFont().getFontName(), Font.BOLD, label.getFont().getSize()));
			super.add(label, constraints);
			constraints.gridx++;
			stats[i] = getNewStatSpinner();
			modifiers[i] = new JLabel(InformationManager.calculateStatModifierString((int) stats[i].getValue()));
			super.add(stats[i], constraints);
			constraints.gridx++;
			super.add(modifiers[i], constraints);
			createStatLabelListener(stats[i], modifiers[i]);
		}
	}
	private JSpinner getNewStatSpinner() {
		return new JSpinner(new SpinnerNumberModel(10,1,30,1));
	}
	private void createStatLabelListener(JSpinner spinner, JLabel label) {
		spinner.addChangeListener((ChangeEvent e) -> {
			label.setText(InformationManager.calculateStatModifierString((int) spinner.getValue()));
		});
	}
	public int getStrength() {
		return (int) stats[0].getValue();
	}
	public int getDexterity() {
		return (int) stats[1].getValue();
	}
	public int getConstitution() {
		return (int) stats[2].getValue();
	}
	public int getIntelligence() {
		return (int) stats[3].getValue();
	}
	public int getWisdom() {
		return (int) stats[4].getValue();
	}
	public int getCharisma() {
		return (int) stats[5].getValue();
	}
}
