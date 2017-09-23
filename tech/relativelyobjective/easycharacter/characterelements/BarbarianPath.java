package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.characterclasses.Barbarian;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;

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
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
