package tech.relativelyobjective.easycharacter.characterelements;

import java.util.TreeSet;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class CharacterElementList {
	private final TreeSet<CharacterElement> characterElements;
	
	public CharacterElementList() {
		characterElements = new TreeSet<>();
	}
	public void resetCharacterElements() {
		characterElements.clear();
	}
	public TreeSet<CharacterElement> getCharacterElements() {
		return new TreeSet<>(characterElements);
	}
	public void addCharacterElement(CharacterElement e) {
		//TODO sort through to find the right function
	}
	public void addCharacterElement(AbilityModifier ab) {
		for (CharacterElement c : characterElements) {
			if (c instanceof AbilityModifier) {
				AbilityModifier cMod = (AbilityModifier) c;
				if (cMod.ability.equals(ab.ability)) {
					cMod.modifier += ab.modifier;
					return;
				}
			}
		}
		characterElements.add(ab);
	}
	public void addCharacterElement(DamageModifier newModifier) {
		for (CharacterElement c : characterElements) {
			if (c instanceof DamageModifier) {
				DamageModifier existingModifier = (DamageModifier) c;
				if (existingModifier.type.equals(existingModifier.type)) {
					if (existingModifier.modifier == Lists.DamageMod.IMMUNE || 
						newModifier.modifier == Lists.DamageMod.IMMUNE) {
						//Immune cannot be overwritten
						existingModifier.modifier = Lists.DamageMod.IMMUNE;
					} else if (existingModifier.modifier == Lists.DamageMod.UNMODIFIED &&
						newModifier.modifier != Lists.DamageMod.UNMODIFIED) {
						//Overwrite unmodified
						existingModifier.modifier = newModifier.modifier;
					} else if (existingModifier.modifier != Lists.DamageMod.UNMODIFIED &&
						newModifier.modifier == Lists.DamageMod.UNMODIFIED) {
						//Remove modifier == set to unmodified
						characterElements.remove(existingModifier);
					} else if (existingModifier.modifier == Lists.DamageMod.RESISTANT &&
						existingModifier.modifier == Lists.DamageMod.VULNERABLE
						) {
						//Cancelled effects
						characterElements.remove(existingModifier);
					} else if (existingModifier.modifier == Lists.DamageMod.VULNERABLE &&
						existingModifier.modifier == Lists.DamageMod.RESISTANT
						) {
						//Cancelled effects
						characterElements.remove(existingModifier);
					} else if (existingModifier.modifier.equals(newModifier.modifier)) {
						//No change
						return;
					}
					return;
				}
			}
		}
		if (newModifier.modifier == Lists.DamageMod.UNMODIFIED) {
			//Don't want to add a new modifier that does nothing
			return;
		}
		characterElements.add(newModifier);
	}
	public void addCharacterElement(Feat newFeat) {
		//TODO
	}
	public void addCharacterElement(Feature newFeature) {
		//TODO
	}
	public void addCharacterElement(Language newLanguage) {
		for (CharacterElement c : characterElements) {
			if (c instanceof Language) {
				Language existingLanguage = (Language) c;
				if (existingLanguage.lang.equals(newLanguage.lang)) {
					//Character already knows language
					return;
				}
			}
		}
		characterElements.add(newLanguage);
	}
	public void addCharacterElement(SavingThrowProficiency newProficiency) {
		//TODO
	}
	public void addCharacterElement(SkillProficiency newProficiency) {
		//TODO
	}
}
