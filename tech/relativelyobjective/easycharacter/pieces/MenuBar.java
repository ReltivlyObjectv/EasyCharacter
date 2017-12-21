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
import tech.relativelyobjective.easycharacter.characterelements.*;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class MenuBar extends JMenuBar {
	public enum ElementLists {
		Race,
		Class,
		Background
	}
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
	private void initializeEditMenu() {
		JMenuItem abMod = new JMenuItem("Add Ability Modifier");
		abMod.addActionListener((ActionEvent e)->{
			addAndEditElement(new AbilityModifier());
		});
		editMenu.add(abMod);
		JMenuItem conMod = new JMenuItem("Add Condition Modifier");
		conMod.addActionListener((ActionEvent e)->{
			addAndEditElement(new ConditionModifier());
		});
		editMenu.add(conMod);
		JMenuItem damMod = new JMenuItem("Add Damage Modifier");
		damMod.addActionListener((ActionEvent e)->{
			addAndEditElement(new DamageModifier());
		});
		editMenu.add(damMod);
		JMenuItem dv = new JMenuItem("Add Darkvision");
		dv.addActionListener((ActionEvent e)->{
			addAndEditElement(new Darkvision());
		});
		editMenu.add(dv);
		JMenuItem ft = new JMenuItem("Add Feat");
		ft.addActionListener((ActionEvent e)->{
			addAndEditElement(new Feat(MiscPrompts.openSingleObjectChooserPrompt(
				InformationManager.getNonPossessedFeats(), 
				null, 
				"Add Feat"
			)));
		});
		editMenu.add(ft);
		JMenuItem ftr = new JMenuItem("Add Feature");
		ftr.addActionListener((ActionEvent e)->{
			addAndEditElement(new Feature());
		});
		editMenu.add(ftr);
		JMenuItem inMod = new JMenuItem("Add Initiative Modifier");
		inMod.addActionListener((ActionEvent e)->{
			addAndEditElement(new InitiativeModifier());
		});
		editMenu.add(inMod);
		JMenuItem invItem = new JMenuItem("Add Inventory Item");
		invItem.addActionListener((ActionEvent e)->{
			addAndEditElement(new InventoryItem());
		});
		editMenu.add(invItem);
		JMenuItem lang = new JMenuItem("Add Language");
		lang.addActionListener((ActionEvent e)->{
			addAndEditElement(new Language());
		});
		editMenu.add(lang);
		JMenuItem otherProf = new JMenuItem("Add Other Proficiency");
		otherProf.addActionListener((ActionEvent e)->{
			addAndEditElement(new OtherProficiency());
		});
		editMenu.add(otherProf);
		JMenuItem svProf = new JMenuItem("Add Saving Throw Proficiency");
		svProf.addActionListener((ActionEvent e)->{
			addAndEditElement(new SavingThrowProficiency());
		});
		editMenu.add(svProf);
		JMenuItem skProf = new JMenuItem("Add Skill Proficiency");
		skProf.addActionListener((ActionEvent e)->{
			addAndEditElement(new SkillProficiency());
		});
		editMenu.add(skProf);
		JMenuItem sp = new JMenuItem("Add Spell");
		sp.addActionListener((ActionEvent e)->{
			Spell newSpell = MiscPrompts.openSingleObjectChooserPrompt(
				InformationManager.getUnknownSpells(), 
				null, 
				"Additional Spell"
			);
			addAndEditElement(newSpell);
		});
		editMenu.add(sp);
	}
	private void initializeToolsMenu() {
		JMenuItem loreHeader = new JMenuItem("Lore Set");
		loreHeader.setEnabled(false);
		toolsMenu.add(loreHeader);
		JCheckBoxMenuItem dndLore = new JCheckBoxMenuItem("D&D");
		dndLore.setSelected(true);
		JCheckBoxMenuItem tesLore = new JCheckBoxMenuItem("The Elder Scrolls");
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
		toolsMenu.addSeparator();
		//Homebrew
		JMenuItem homebrewHeader = new JMenuItem("Class Set");
		homebrewHeader.setEnabled(false);
		toolsMenu.add(homebrewHeader);
		
		JCheckBoxMenuItem homebrewOff = new JCheckBoxMenuItem("RAW Classes");
		JCheckBoxMenuItem homebrewOn = new JCheckBoxMenuItem("Homebrew Classes");
		homebrewOff.setSelected(true);
		homebrewOff.addActionListener((ActionEvent e) -> {
			homebrewOn.setSelected(false);
			homebrewOff.setSelected(true);
		});
		toolsMenu.add(homebrewOff);
		
		homebrewOn.setSelected(false);
		homebrewOn.addActionListener((ActionEvent e) -> {
			homebrewOff.setSelected(false);
			homebrewOn.setSelected(true);
		});
		toolsMenu.add(homebrewOn);
	}
	private void newFile() {
	}
	private void saveFile() {
	}
	private void saveFileAs() {
	}
	private void loadFile() {
	}
	private void addAndEditElement(CharacterElement e) {
		if (!(e instanceof Feat) && !(e instanceof Spell)) {
			e.edit();
		}
		switch((ElementLists) MiscPrompts.openSingleObjectChooserPrompt(ElementLists.values(), null, "Where to add?")) {
			case Race:
				InformationManager.addRaceElement(e);
				WindowManager.getRaceTab().updateRaceElementsList();
				WindowManager.getMainFrame().setActiveTab(WindowManager.getMainFrame().raceTab);
				break;
			case Class:
				InformationManager.addClassElement(e);
				WindowManager.getClassTab().updateClassElementsList();
				WindowManager.getMainFrame().setActiveTab(WindowManager.getMainFrame().classTab);
				break;
			case Background:
				InformationManager.addBackgroundElement(e);
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				WindowManager.getMainFrame().setActiveTab(WindowManager.getMainFrame().backgroundTab);
				break;
		}
	}
	private void renderPage() {
	}
	private void renderPageToFile() {
	}
}
