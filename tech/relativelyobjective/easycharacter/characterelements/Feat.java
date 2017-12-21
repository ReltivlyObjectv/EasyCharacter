package tech.relativelyobjective.easycharacter.characterelements;

import java.util.TreeSet;
import javax.swing.JOptionPane;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class Feat implements CharacterElement,Comparable {
	public final String name;
	public final String description;
	private final CharacterElementList elements;
	
	public Feat(String newName, String newDesc) {
		name = newName;
		description = newDesc;
		elements = new CharacterElementList();
	}
	public Feat(String newName, String newDesc, TreeSet<CharacterElement> newElements) {
		name = newName;
		description = newDesc;
		elements = new CharacterElementList();
		for (CharacterElement e : newElements) {
			elements.addCharacterElement(e);
		}
	}
	public Feat(Feat f) {
		name = f.name;
		description = f.description;
		elements = new CharacterElementList();
		for (CharacterElement e : f.getElements()) {
			elements.addCharacterElement(e);
		}
	}
	public TreeSet<CharacterElement> getElements() {
		//This will be overwritten by the anonymous final static Feats in the AllFeats class
		CharacterElementList returnMe = new CharacterElementList();
		for (CharacterElement e : elements.getCharacterElements()) {
			returnMe.addCharacterElement(e);
		}
		elements.resetCharacterElements();
		return returnMe.getCharacterElements();
	}
	@Override
	public void edit() {
		JOptionPane.showMessageDialog(
			WindowManager.getMainFrame(),
			"You cannot edit the details of a feat. "
			+ "To add additional ability modifiers, use the Edit menu."
		);
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
