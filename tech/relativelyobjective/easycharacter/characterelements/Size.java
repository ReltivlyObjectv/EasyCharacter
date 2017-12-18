package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class Size implements CharacterElement,Comparable {
	public Lists.Size size;

	public Size() {
		size = Lists.Size.MEDIUM;
	}
	public Size(Lists.Size s) {
		size = s;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return "Size: "+InformationManager.capitalizeFirstLetterOfWords(size);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
