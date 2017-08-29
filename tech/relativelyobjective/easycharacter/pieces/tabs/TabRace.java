package tech.relativelyobjective.easycharacter.pieces.tabs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import tech.relativelyobjective.easycharacter.races.*;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class TabRace extends JPanel {
	private final RaceChoice raceChoice;
	private final RaceElements raceElements;
	
	public class RaceChoice extends JPanel {
		private final Map<JRadioButton, Lists.Race> radios;
		private ButtonGroup group;
		private Box box;
		
		public RaceChoice() {
			super.setBackground(Color.red);
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
				JRadioButton button = new JRadioButton(Lists.getUserFriendlyRace(array[i]));
				radios.put(button, array[i]);
				group.add(button);
				box.add(button);
			}
			super.add(box);
			revalidate();
		}
	}
	public class RaceElements extends JPanel {
		public RaceElements() {
			super.setBackground(Color.blue);
		}
	}
	public TabRace() {
		super.setLayout(new BorderLayout());
		raceChoice = new RaceChoice();
		raceChoice.updateList();
		raceElements = new RaceElements();
		super.add(raceChoice, BorderLayout.WEST);
		super.add(raceElements, BorderLayout.CENTER);
	}
	public void updateRaceList() {
		raceChoice.updateList();
	}
}
