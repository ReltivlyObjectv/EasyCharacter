package tech.relativelyobjective.easycharacter.pieces;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class MenuBar extends JMenuBar {
	private final JMenu fileMenu;
	private final JMenu editMenu;
	private final JMenu toolsMenu;
	public MenuBar() {
		fileMenu = new JMenu("File");
		initializeFileMenu();
		super.add(fileMenu);
		editMenu = new JMenu("Edit");
		initializeEditMenu();
		super.add(editMenu);
		toolsMenu = new JMenu("Tools");
		initializeToolsMenu();
		super.add(toolsMenu);
	}
	private void initializeFileMenu() {
			JMenuItem newFile = new JMenuItem("New Character");
			newFile.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_N, 
				Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
			newFile.addActionListener((ActionEvent e) -> {
				newFile();
			});
			fileMenu.add(newFile);
			JMenuItem save = new JMenuItem("Save");
			save.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_S, 
				Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
			save.addActionListener((ActionEvent e) -> {
				saveFile();
			});
			fileMenu.add(save);
			JMenuItem saveAs = new JMenuItem("Save As...");
			saveAs.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_S, 
				Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()
				| InputEvent.SHIFT_DOWN_MASK));
			saveAs.addActionListener((ActionEvent e) -> {
				saveFileAs();
			});
			fileMenu.add(saveAs);
			JMenuItem load = new JMenuItem("Load...");
			load.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_O, 
				Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
			load.addActionListener((ActionEvent e) -> {
				loadFile();
			});
			fileMenu.add(load);
			fileMenu.addSeparator();
			JMenuItem render = new JMenuItem("Render");
			render.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_R, 
				Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
			render.addActionListener((ActionEvent e) -> {
				renderPage();
			});
			fileMenu.add(render);
			JMenuItem renderToFile = new JMenuItem("Render to File");
			renderToFile.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_R, 
				Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()
				| InputEvent.SHIFT_DOWN_MASK));
			renderToFile.addActionListener((ActionEvent e) -> {
				renderPageToFile();
			});
			fileMenu.add(renderToFile);
	}
	private void initializeToolsMenu() {
			JCheckBoxMenuItem dndLore = new JCheckBoxMenuItem("D&D Lore");
			dndLore.setSelected(true);
			JCheckBoxMenuItem tesLore = new JCheckBoxMenuItem("The Elder Scrolls Lore");
			dndLore.addActionListener((ActionEvent e) -> {
				InformationManager.setLoreSet(Lists.LoreSet.DUNGEONS_AND_DRAGONS);
				dndLore.setSelected(true);
				tesLore.setSelected(false);
			});
			toolsMenu.add(dndLore);
			tesLore.addActionListener((ActionEvent e) -> {
				InformationManager.setLoreSet(Lists.LoreSet.THE_ELDER_SCROLLS);
				dndLore.setSelected(false);
				tesLore.setSelected(true);
			});
			toolsMenu.add(tesLore);
	}
	private void initializeEditMenu() {
	}
	private void newFile() {
	}
	private void saveFile() {
	}
	private void saveFileAs() {
	}
	private void loadFile() {
	}
	private void renderPage() {
	}
	private void renderPageToFile() {
	}
}
