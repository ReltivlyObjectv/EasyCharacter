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
		mainTabbedPane.addTab("Base Stats", new JScrollPane(WindowManager.getStatsTab()));
		mainTabbedPane.addTab("Race", new JScrollPane(WindowManager.getRaceTab()));
		mainTabbedPane.addTab("Class", new JScrollPane(WindowManager.getClassTab()));
		mainTabbedPane.addTab("Background", new JScrollPane(WindowManager.getBackgroundTab()));
		mainTabbedPane.addTab("Miscellaneous", new JScrollPane(WindowManager.getMiscTab()));
		super.add(mainTabbedPane, BorderLayout.CENTER);
	}
	public void setCompletedBaseStatsTab(boolean completed) {
		setCompletedTab(0,completed,"Base Stats");
	}
	public void setCompletedRaceTab(boolean completed) {
		setCompletedTab(1,completed,"Race");
	}
	public void setCompletedClassTab(boolean completed) {
		setCompletedTab(2,completed,"Class");
	}
	public void setCompletedBackgroundTab(boolean completed) {
		setCompletedTab(3,completed,"Background");
	}
	public void setCompletedMiscellaneousTab(boolean completed) {
		setCompletedTab(4,completed,"Miscellaneous");
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
