package tech.relativelyobjective.easycharacter.pieces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class FrameMain extends JFrame {
	private final MenuBar menu;
	private final JTabbedPane mainTabbedPane;
	public final int baseStatsTab, raceTab, classTab, backgroundTab, miscTab;
	public FrameMain() {
		super("Easy Character");
		menu = new MenuBar();
		super.add(menu);
		super.setJMenuBar(menu);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setPreferredSize(new Dimension(850, 580));
		super.setSize(super.getPreferredSize());
		super.setLayout(new BorderLayout());
		mainTabbedPane = new JTabbedPane();
		int currentIndex = 0;
		mainTabbedPane.addTab("Base Stats", new JScrollPane(WindowManager.getStatsTab()));
		baseStatsTab = currentIndex;
		currentIndex++;
		mainTabbedPane.addTab("Race", new JScrollPane(WindowManager.getRaceTab()));
		raceTab = currentIndex;
		currentIndex++;
		mainTabbedPane.addTab("Class", new JScrollPane(WindowManager.getClassTab()));
		classTab = currentIndex;
		currentIndex++;
		mainTabbedPane.addTab("Background", new JScrollPane(WindowManager.getBackgroundTab()));
		backgroundTab = currentIndex;
		currentIndex++;
		mainTabbedPane.addTab("Miscellaneous", new JScrollPane(WindowManager.getMiscTab()));
		miscTab = currentIndex;
		currentIndex++;
		super.add(mainTabbedPane, BorderLayout.CENTER);
	}
	public void setActiveTab(int index) {
		mainTabbedPane.setSelectedIndex(index);
	}
	public void setCompletedBaseStatsTab(boolean completed) {
		setCompletedTab(baseStatsTab,completed,"Base Stats");
	}
	public void setCompletedRaceTab(boolean completed) {
		setCompletedTab(raceTab,completed,"Race");
	}
	public void setCompletedClassTab(boolean completed) {
		setCompletedTab(classTab,completed,"Class");
	}
	public void setCompletedBackgroundTab(boolean completed) {
		setCompletedTab(backgroundTab,completed,"Background");
	}
	public void setCompletedMiscellaneousTab(boolean completed) {
		setCompletedTab(miscTab,completed,"Miscellaneous");
	}
	private void setCompletedTab(int tabIndex, boolean completed, String title) {
		if (completed) {
			mainTabbedPane.setTitleAt(
				tabIndex, 
				"☑ "+title
			);
		} else {
			mainTabbedPane.setTitleAt(
				tabIndex, 
				title
			);
		}
		super.repaint();
		super.revalidate();
	}
}
