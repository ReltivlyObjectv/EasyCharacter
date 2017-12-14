package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class EntertainerRoutine implements CharacterElement,Comparable {
	public Lists.EntertainerRountine routine;

	public EntertainerRoutine() {
		routine = null;
	}
	public EntertainerRoutine(Lists.EntertainerRountine r) {
		routine = r;
	}
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Entertainer Routine: %s",
		routine == Lists.EntertainerRountine.FIRE_EATER 
			? "Fire-eater"
			: InformationManager.capitalizeFirstLetterOfWords(routine)
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
