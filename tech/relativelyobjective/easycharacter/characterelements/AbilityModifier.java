package tech.relativelyobjective.easycharacter.characterelements;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.event.ChangeEvent;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.Lists.Ability;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class AbilityModifier implements CharacterElement, Comparable {
	public Lists.Ability ability;
	public Integer modifier;
	
	public AbilityModifier() {
		ability = null;
		modifier = null;
	}
	public AbilityModifier(Lists.Ability ab, int mod) {
		ability = ab;
		modifier = mod;
	}
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Ability Modifier: %s%d %s",
			modifier < 0 ? "" : "+",
			modifier,
			InformationManager.capitalizeFirstLetterOfWords(ability)
			);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public static TreeSet<AbilityModifier> openAbilityScoreImprovementPrompt() {
		TreeSet<AbilityModifier> returnMe = new TreeSet<>();
		JDialog prompt = new JDialog(WindowManager.getMainFrame(), 
			"Ability Score Improvement", true);
		prompt.setPreferredSize(new Dimension(350,400));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		prompt.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		HashMap<Ability, Integer> skills = InformationManager.getCurrentSkills();
		HashMap<Ability, JSpinner> spinners = new HashMap<>();
		HashMap<Ability, JLabel> labels = new HashMap<>();
		for (Lists.Ability a : Lists.Ability.values()) {
			labels.put(a, new JLabel(skills.get(a).toString()));
		}
		for (Lists.Ability a : Lists.Ability.values()) {
			JSpinner s = new JSpinner(
				new SpinnerNumberModel(
					//Starting Value
					0,
					//Min
					0,
					//Max
					//TODO implement increasing max stat
					(int) skills.get(a) <= 18 ? 2 
						: skills.get(a) == 19 ? 1 
						: 0,
					//Step
					1
				)
			);
			s.addChangeListener((ChangeEvent e) -> {
				labels.get(a).setText(Integer.toString(skills.get(a)+(int)s.getValue()));
				prompt.revalidate();
			});
			spinners.put(a, s);
		}
		for (Lists.Ability a : Lists.Ability.values()) {
			constraints.gridx = 0;
			prompt.add(
				new JLabel(InformationManager.capitalizeFirstLetterOfWords(a)), 
				constraints
			);
			constraints.gridx = 1;
			prompt.add(
				spinners.get(a), 
				constraints
			);
			constraints.gridx = 2;
			prompt.add(
				labels.get(a), 
				constraints
			);
			constraints.gridy++;
		}
		constraints.gridx = 0;
		constraints.gridwidth = 3;
		JButton saveButton = new JButton("Save Skill Improvement");
		saveButton.addActionListener((ActionEvent e)->{
			int totalPoints = 0;
			for (Lists.Ability a : Lists.Ability.values()) {
				totalPoints += (int) (spinners.get(a).getValue());
			}
			if (totalPoints == 2) {
				//Correct
				for (Lists.Ability a : Lists.Ability.values()) {
					if ((int) spinners.get(a).getValue() > 0) {
						returnMe.add(new AbilityModifier(a, (int) spinners.get(a).getValue()));
					}
				}
				prompt.dispose();
			} else {
				//Incorrect
				JOptionPane.showMessageDialog(prompt, 
					"Allocate exactly two skill points. "+
					"You have allocated "+totalPoints+"."
				);
			}
		});
		prompt.add(saveButton, constraints);
		prompt.setVisible(true);
		return returnMe;
	}
}
