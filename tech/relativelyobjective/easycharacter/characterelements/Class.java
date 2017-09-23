package tech.relativelyobjective.easycharacter.characterelements;

import java.util.TreeSet;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class Class implements CharacterElement,Comparable {
	public Lists.Class className;
	private Integer classLevel;
	
	public Class() {
		className = null;
		classLevel = null;
	}
	public Class(Lists.Class c, int l) {
		className = c;
		classLevel = l;
	}
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Class: %s (Level %d)", 
			InformationManager.capitalizeFirstLetterOfWords(className),
			classLevel
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public void setClassLevel(Integer newLevel) {
		classLevel = newLevel;
		if (newLevel <= 1) {
			classLevel = 1;
		} else if (newLevel >= 20) {
			classLevel = 20;
		}
	}
	public int getClassLevel() {
		return classLevel;
	}
}
