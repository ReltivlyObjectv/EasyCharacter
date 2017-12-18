package tech.relativelyobjective.easycharacter.characterelements;


import javax.swing.JOptionPane;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Background implements CharacterElement,Comparable {
	public Lists.Background bg;

	public Background() {
		bg = null;
	}
	public Background(Lists.Background b) {
		bg = b;
	}
	@Override
	public void edit() {
		JOptionPane.showMessageDialog(
			WindowManager.getMainFrame(),
			"To change your background, change it in the radio buttons on the background tab"
		);
	}
	@Override
	public String toString() {
		return "Background: "+InformationManager.capitalizeFirstLetterOfWords(bg);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
