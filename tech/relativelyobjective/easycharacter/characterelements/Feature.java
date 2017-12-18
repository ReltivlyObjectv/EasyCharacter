package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.ObjectPair;

/**
 *
 * @author ReltivlyObjectv
 */
public class Feature implements CharacterElement,Comparable {
	public String name, description;
	public Feature() {
		name = "";
		description = "";
	}
	public Feature(String n, String d){
		name = n;
		description = d;
	}
	@Override
	public void edit() {
		ObjectPair<String, String> newValues = MiscPrompts.getShortAndLongString(name, description, "Feature");
		name = newValues.objectA;
		description = newValues.objectB;
	}
	@Override
	public String toString() {
		return "Feature: "+name;
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
