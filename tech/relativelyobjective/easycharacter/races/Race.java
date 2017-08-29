package tech.relativelyobjective.easycharacter.races;

import java.util.LinkedList;
import tech.relativelyobjective.easycharacter.characterelements.CharacterElement;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class Race {
	public final LinkedList<CharacterElement> modifiers;
	
	public Race() {
		throw new UnsupportedOperationException("Race is a base class and not meant to be instantiated");
	}
	public static void setupRaceChoices(Lists.Race race) {
		System.out.println("//TODO -- Setup Race: "+race);
	}
}
