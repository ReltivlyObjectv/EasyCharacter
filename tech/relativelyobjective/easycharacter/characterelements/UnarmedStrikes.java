package tech.relativelyobjective.easycharacter.characterelements;

import tech.relativelyobjective.easycharacter.utilities.Lists.Die;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class UnarmedStrikes implements CharacterElement,Comparable {
	public Die sides;
	
	public UnarmedStrikes() {
		sides = Die.D8;
	}
	public UnarmedStrikes(Die d) {
		sides = d;
	}
	@Override
	public void edit() {
		sides = MiscPrompts.openSingleObjectChooserPrompt(
			Die.values(),
			sides,
			"Unarmed Strikes Die"
		);
	}
	@Override
	public String toString() {
		return String.format("Unarmed Strikes Die: %s",
			sides.toString().toLowerCase()
		);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
