package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Feat implements CharacterElement,Comparable {
	public String name;
	public String description;
	private final CharacterElementList effects;
	
	public Feat() {
		name = "New Feat";
		description = "";
		effects = new CharacterElementList();
	}
	public Feat(String newName) {
		name = newName;
		description = "";
		effects = new CharacterElementList();
	}
	public Feat(String newName, String newDesc) {
		name = newName;
		description = newDesc;
		effects = new CharacterElementList();
	}
	public void addFeatElement(CharacterElement e) {
		if (e instanceof Feat) {
			throw new UnsupportedOperationException("You cannot store a Feat inside of a Feat");
		}
		effects.addCharacterElement(e);
	}
	public void resetFeatElements() {
		effects.resetCharacterElements();
	}
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
