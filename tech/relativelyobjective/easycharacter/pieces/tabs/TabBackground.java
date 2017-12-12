package tech.relativelyobjective.easycharacter.pieces.tabs;

import java.awt.BorderLayout;
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
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import tech.relativelyobjective.easycharacter.backgrounds.BackgroundChooser;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class TabBackground extends JPanel {
	private final BackgroundChoice backgroundChoice;
	private final BackgroundElements backgroundElements;
	
	private class BackgroundChoice extends JPanel {
		private final Map<JRadioButton, Lists.Background> radios;
		private final ButtonGroup group;
		private final Box box;
		
		public BackgroundChoice() {
			radios = new HashMap<>();
			box = Box.createVerticalBox();
			group = new ButtonGroup();
			super.setLayout(new GridBagLayout());
			Lists.Background[] backgrounds = Lists.Background.values();
			for (int i = 0; i < backgrounds.length; i++) {
				JRadioButton radioButton = new JRadioButton(InformationManager.capitalizeFirstLetterOfWords(backgrounds[i]));
				radios.put(radioButton, backgrounds[i]);
				group.add(radioButton);
				box.add(radioButton);
				radioButton.addItemListener((ItemEvent e) -> {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						if (e.getSource() instanceof JRadioButton) {
							if (radios.containsKey((JRadioButton) e.getSource())) {
								BackgroundChooser.setBackground(radios.get((JRadioButton) e.getSource()));
							}
						}
					}
				});
			}
			super.add(box);
		}
	}
	private class BackgroundElements extends JPanel {
		private JList list;
		
		public BackgroundElements() {
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
			list.setListData(InformationManager.getRaceElements().toArray());
		}
	}
	public TabBackground() {
		super.setLayout(new BorderLayout());
		backgroundChoice = new BackgroundChoice();
		backgroundElements = new BackgroundElements();
		super.add(backgroundChoice, BorderLayout.WEST);
		super.add(backgroundElements, BorderLayout.CENTER);
		JButton resetButton = new JButton("Deselect Background");
		resetButton.addActionListener((ActionEvent e)->{
			backgroundChoice.group.clearSelection();
			InformationManager.resetBackgroundElements();
			backgroundElements.updateList();
		});
		super.add(resetButton, BorderLayout.PAGE_END);
	}
	public void updateBackgroundElementsList() {
		backgroundElements.updateList();
	}
}
