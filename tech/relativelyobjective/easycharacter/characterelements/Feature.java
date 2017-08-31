package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Feature extends TextElement {
	public Feature() {
		name = "";
		description = "";
	}
	public Feature(String n, String d){
		name = n;
		description = d;
	}
	@Override
	public void editElement() {
		openEditWindow("Feature");
	}
	@Override
	public String toString() {
		return "Feature: "+name;
	}
}
