package tech.relativelyobjective.easycharacter.pieces.tabs;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class TabClass extends JPanel {
	private final ClassChoice classChoice;
	private final ClassElements classElements;
	
	private class ClassChoice extends JPanel {
		private final Map<JRadioButton, Lists.Class> radios;
		private final ButtonGroup group;
		private final JSpinner classLevel;
		
		public ClassChoice() {
			Box box = Box.createVerticalBox();
			radios = new HashMap<>();
			radios.clear();
			group = new ButtonGroup();
			super.setLayout(new GridBagLayout());
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.gridx = 0;
			constraints.gridy = 0;
			Lists.Class[] allClasses = Lists.Class.values();
			for (int i = 0; i < allClasses.length; i++) {
				JRadioButton radioButton = new JRadioButton(
					InformationManager.capitalizeFirstLetterOfWords(allClasses[i])
				);
				radios.put(radioButton, allClasses[i]);
				group.add(radioButton);
				radioButton.setAlignmentX(LEFT_ALIGNMENT);
				box.add(radioButton);
			}
			super.add(box, constraints);
			constraints.gridy++;
			JPanel levelPanel = new JPanel();
				levelPanel.setLayout(new GridBagLayout());
				GridBagConstraints levelConstraints = new GridBagConstraints();
				levelConstraints.gridx = 0;
				levelConstraints.gridy = 0;
				JLabel levelLabel = new JLabel(
					"<html><strong>Class Level</strong></html>"
				);
				levelPanel.add(levelLabel, levelConstraints);
				levelConstraints.gridy++;
				classLevel = new JSpinner(new SpinnerNumberModel(1,1,20,1));
				levelPanel.add(classLevel, levelConstraints);
				levelConstraints.gridy++;
				JButton addClassButton = new JButton("Add Class");
				addClassButton.addActionListener((ActionEvent e)->{
					System.out.printf("Setting up Level %d %s\n",
						(int) classLevel.getValue(),
						getSelectedClass().toString()
					);
				});
				levelPanel.add(addClassButton, levelConstraints);
			super.add(levelPanel, constraints);
		}
		public void resetSpinner() {
			classLevel.setValue(1);
		}
		public Lists.Class getSelectedClass() {
			for (JRadioButton b : radios.keySet()) {
				if (b.isSelected()) {
					return radios.get(b);
				}
			}
			return null;
		}
	}
	private class ClassElements extends JPanel {
		private JList list;
		
		public ClassElements() {
			super.setLayout(new BorderLayout());
			list = new JList();
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			list.setLayoutOrientation(JList.VERTICAL);
			list.setVisibleRowCount(-1);
			list.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent event) {
					if (event.getClickCount() == 2) {
						// Double-click detected
						CharacterElement selectedItem = 
							((CharacterElement) list.getSelectedValue());
						if (selectedItem != null) {
							selectedItem.edit(true);
						}
					}
				}
			});
			JScrollPane scroller = new JScrollPane(list);
			super.add(scroller, BorderLayout.CENTER);
		}
		public void updateList() {
			list.setListData(InformationManager.getClassElements().toArray());
		}
	}
	public TabClass() {
		super.setLayout(new BorderLayout());
		classChoice = new ClassChoice();
		classElements = new ClassElements();
		classElements.updateList();
		super.add(classChoice, BorderLayout.WEST);
		super.add(classElements, BorderLayout.CENTER);
		JButton resetButton = new JButton("Clear Class Selections");
		resetButton.addActionListener((ActionEvent e)->{
			classChoice.group.clearSelection();
			classChoice.resetSpinner();
			InformationManager.resetClassElements();
			classElements.updateList();
		});
		super.add(resetButton, BorderLayout.PAGE_END);
	}
	public void updateClassElementsList() {
		classElements.updateList();
	}
	
}
