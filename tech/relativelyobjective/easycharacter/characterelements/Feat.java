package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Feat implements CharacterElement,Comparable {
	public String name;
	public Feat(String newName) {
		name = newName;
	}
	@Override
	public void edit() {
	}
	@Override
	public String toString() {
		return "Feat: "+name;
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
