package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Language implements CharacterElement {
	public String lang;

	public Language() {
		lang = "New Language";
	}
	public Language(String l) {
		lang = l;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return "Language: "+lang;
	}
}
