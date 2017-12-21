package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class Maneuver implements CharacterElement,Comparable {
	public String name, description;
	public Maneuver() {
		name = "";
		description = "";
	}
	public Maneuver(String n, String d){
		name = n;
		description = d;
	}
	@Override
	public void edit() {
		ObjectPair<String, String> newValues = MiscPrompts.getShortAndLongString(name, description, "Maneuver");
		name = newValues.objectA;
		description = newValues.objectB;
	}
	@Override
	public String toString() {
		return "Maneuver: "+name;
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
