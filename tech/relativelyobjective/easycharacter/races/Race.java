package tech.relativelyobjective.easycharacter.races;

import java.util.LinkedList;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;

/**
 *
 * @author ReltivlyObjectv
 */
public class Race {
	public final LinkedList<CharacterElement> modifiers;
	
	public Race() {
		throw new UnsupportedOperationException("Race is a base class and not meant to be instantiated");
	}
}
