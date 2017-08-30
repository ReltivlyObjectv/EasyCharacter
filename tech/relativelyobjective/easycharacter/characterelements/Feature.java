package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Feature extends TextElement {
	@Override
	public void editElement() {
		openEditWindow("Feature");
	}
	@Override
	public String toString() {
		return "Feature: "+name;
	}
}
