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
	public FrameMain() {
		super("Easy Character");
		menu = new MenuBar();
		super.add(menu);
		super.setJMenuBar(menu);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setPreferredSize(new Dimension(850, 580));
		//super.setMinimumSize(super.getPreferredSize());
		//super.setMaximumSize(super.getPreferredSize());
		super.setSize(super.getPreferredSize());
		super.setLayout(new BorderLayout());
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Base Stats", new JScrollPane(WindowManager.getStatsTab()));
		tabbedPane.addTab("Race", new JScrollPane(WindowManager.getRaceTab()));
		tabbedPane.addTab("Class", new JScrollPane(WindowManager.getClassTab()));
		tabbedPane.addTab("Miscellaneous", new JScrollPane(WindowManager.getMiscTab()));
		super.add(tabbedPane, BorderLayout.CENTER);
	}
}
