package tech.relativelyobjective.easycharacter.pieces.tabs;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;
import tech.relativelyobjective.easycharacter.races.RaceChoices;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class TabRace extends JPanel {
	private final RaceChoice raceChoice;
	private final RaceElements raceElements;
	
	private class RaceChoice extends JPanel {
		private final Map<JRadioButton, Lists.Race> radios;
		private ButtonGroup group;
		private Box box;
		
		public RaceChoice() {
			//super.setBackground(Color.red);
			radios = new HashMap<>();
			box = Box.createVerticalBox();
			super.setLayout(new GridBagLayout());
		}
		public void updateList() {
			Lists.LoreSet set = InformationManager.getLoreSet();
			super.remove(box);
			box = Box.createVerticalBox();
			radios.clear();
			group = new ButtonGroup();
			Lists.Race[] array;
			if (null == set) {
				return;
			} else switch (set) {
				case DUNGEONS_AND_DRAGONS:
					array = Lists.RacesDND;
					break;
				case THE_ELDER_SCROLLS:
					array = Lists.RacesTES;
					break;
				default:
					return;
			}
			for (int i = 0; i < array.length; i++) {
				JRadioButton radioButton = new JRadioButton(
					Lists.getUserFriendlyRace(array[i])
				);
				radios.put(radioButton, array[i]);
				group.add(radioButton);
				box.add(radioButton);
				radioButton.addItemListener((ItemEvent e) -> {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						if (e.getSource() instanceof JRadioButton) {
							if (radios.containsKey((JRadioButton) e.getSource())) {
								RaceChoices.setupRaceChoices(radios.get((JRadioButton) e.getSource()));
							}
						}
					}
				});
			}
			group.clearSelection();
			InformationManager.resetRaceElements();
			if (raceElements != null) {
				raceElements.updateList();
			}
			super.add(box);
			revalidate();
		}
	}
	private class RaceElements extends JPanel {
		private JList list;
		
		public RaceElements() {
			//super.setBackground(Color.blue);
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
							selectedItem.edit();
							InformationManager.revalidateRaceElements();
							updateRaceElementsList();
						}
					}
				}
			});
			list.addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent e) {}
				@Override
				public void keyReleased(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_DELETE || e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
						if (list.getSelectedValue() instanceof CharacterElement) {
							CharacterElement el = (CharacterElement) list.getSelectedValue();
							InformationManager.removeRaceElement(el);
							updateList();
						}
					}
				}
				@Override
				public void keyTyped(KeyEvent e) {}
			});
			JScrollPane scroller = new JScrollPane(list);
			super.add(scroller, BorderLayout.CENTER);
		}
		public void updateList() {
			list.setListData(InformationManager.getRaceElements().toArray());
		}
	}
	public TabRace() {
		super.setLayout(new BorderLayout());
		raceChoice = new RaceChoice();
		raceChoice.updateList();
		raceElements = new RaceElements();
		raceElements.updateList();
		super.add(raceChoice, BorderLayout.WEST);
		super.add(raceElements, BorderLayout.CENTER);
		JButton resetButton = new JButton("Deselect Race");
		resetButton.addActionListener((ActionEvent e)->{
			raceChoice.group.clearSelection();
			InformationManager.resetRaceElements();
			raceElements.updateList();
			WindowManager.getMainFrame().setCompletedRaceTab(false);
		});
		super.add(resetButton, BorderLayout.PAGE_END);
	}
	public void updateRaceList() {
		raceChoice.updateList();
	}
	public void updateRaceElementsList() {
		raceElements.updateList();
	}
}
