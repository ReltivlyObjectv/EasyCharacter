package tech.relativelyobjective.easycharacter.characterelements;

import javax.swing.JOptionPane;
import tech.relativelyobjective.easycharacter.characterclasses.Barbarian;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class BarbarianPath implements CharacterElement,Comparable {
	public Barbarian.PrimalPath path;

	public BarbarianPath() {
		path = Barbarian.PrimalPath.BERSERKER;
	}
	public BarbarianPath(Barbarian.PrimalPath p) {
		path = p;
	}
	@Override
	public void edit() {
		JOptionPane.showMessageDialog(
			WindowManager.getMainFrame(),
			"To change your Barbarian Path, reset your class on the background tab"
		);
	}
	@Override
	public String toString() {
		return "Primal Path: "+InformationManager.capitalizeFirstLetterOfWords(path);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
