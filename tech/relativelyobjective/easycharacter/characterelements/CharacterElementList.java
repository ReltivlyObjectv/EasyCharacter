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
		if (e instanceof AbilityModifier) {
			addCharacterElement((AbilityModifier) e);
		} else if (e instanceof ConditionModifier) {
			addCharacterElement((ConditionModifier) e);
		} else if (e instanceof DamageModifier) {
			addCharacterElement((DamageModifier) e);
		} else if (e instanceof Darkvision) {
			addCharacterElement((Darkvision) e);
		} else if (e instanceof Feat) {
			addCharacterElement((Feat) e);
		} else if (e instanceof Feature) {
			addCharacterElement((Feature) e);
		} else if (e instanceof Language) {
			addCharacterElement((Language) e);
		} else if (e instanceof OtherProficiency) {
			addCharacterElement((OtherProficiency) e);
		} else if (e instanceof OtherEffect) {
			addCharacterElement((OtherEffect) e);
		} else if (e instanceof SavingThrowProficiency) {
			addCharacterElement((SavingThrowProficiency) e);
		} else if (e instanceof SkillProficiency) {
			addCharacterElement((SkillProficiency) e);
		} else if (e instanceof TextElement) {
			addCharacterElement((TextElement) e);
		} else {
			throw new UnsupportedOperationException("Not a supported type.");
		}
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
	public void addCharacterElement(ConditionModifier newModifier) {
		for (CharacterElement c : characterElements) {
			if (c instanceof ConditionModifier) {
				ConditionModifier existingModifier = (ConditionModifier) c;
				if (existingModifier.type.equals(newModifier.type)) {
					if (existingModifier.modifier == Lists.DamageMod.IMMUNE || 
						newModifier.modifier == Lists.DamageMod.IMMUNE) {
						//Immune cannot be overwritten
						existingModifier.modifier = Lists.DamageMod.IMMUNE;
					} else if (existingModifier.modifier == Lists.DamageMod.UNMODIFIED &&
						newModifier.modifier != Lists.DamageMod.UNMODIFIED) {
						//Overwrite unmodified
						existingModifier.modifier = newModifier.modifier;
					} else if (newModifier.modifier == Lists.DamageMod.UNMODIFIED) {
						//Adding a neutral modifier -- Do nothing
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
	public void addCharacterElement(DamageModifier newModifier) {
		for (CharacterElement c : characterElements) {
			if (c instanceof DamageModifier) {
				DamageModifier existingModifier = (DamageModifier) c;
				if (existingModifier.type.equals(newModifier.type)) {
					if (existingModifier.modifier == Lists.DamageMod.IMMUNE || 
						newModifier.modifier == Lists.DamageMod.IMMUNE) {
						//Immune cannot be overwritten
						existingModifier.modifier = Lists.DamageMod.IMMUNE;
					} else if (existingModifier.modifier == Lists.DamageMod.UNMODIFIED &&
						newModifier.modifier != Lists.DamageMod.UNMODIFIED) {
						//Overwrite unmodified
						existingModifier.modifier = newModifier.modifier;
					} else if (newModifier.modifier == Lists.DamageMod.UNMODIFIED) {
						//Adding a neutral modifier -- Do nothing
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
	public void addCharacterElement(Darkvision newDV) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Darkvision) {
				Darkvision oldDV = (Darkvision) e;
				oldDV.distance = newDV.distance > oldDV.distance 
					? newDV.distance 
					: oldDV.distance;
				return;
			}
		}
		characterElements.add(newDV);
	}
	public void addCharacterElement(Feat newFeat) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Feat) {
				Feat oldFeat = (Feat) e;
				if (oldFeat.name.equals(newFeat.name)) {
					//Do not add the same feat twice
					return;
				}
			}
		}
		characterElements.add(newFeat);
	}
	public void addCharacterElement(Feature newFeature) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Feature) {
				Feature oldFeature = (Feature) e;
				if (oldFeature.name.equals(newFeature.name)) {
					//Adjust description of same feature
					oldFeature.description = newFeature.description;
					return;
				}
			}
		}
		characterElements.add(newFeature);
	}
	public void addCharacterElement(Language newLanguage) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Language) {
				Language existingLanguage = (Language) e;
				if (existingLanguage.lang.equals(newLanguage.lang)) {
					//Character already knows language
					return;
				}
			}
		}
		characterElements.add(newLanguage);
	}
	public void addCharacterElement(OtherEffect newEffect) {
		for (CharacterElement e : characterElements) {
			if (e instanceof OtherEffect) {
				OtherEffect existingLanguage = (OtherEffect) e;
				if (existingLanguage.effect.equals(newEffect.effect)) {
					//Character already has effect
					return;
				}
			}
		}
		characterElements.add(newEffect);
	}
	public void addCharacterElement(OtherProficiency newProficiency) {
		for (CharacterElement e : characterElements) {
			if (e instanceof OtherProficiency) {
				OtherProficiency oldProficiency = (OtherProficiency) e;
				if (newProficiency.prof.equals(oldProficiency.prof)) {
					//Use the larger magnitude, but do not make them stack
					if (newProficiency.getProficiencyMagnitude() > oldProficiency.getProficiencyMagnitude()) {
						oldProficiency.setProficiencyMagnitude(newProficiency.getProficiencyMagnitude());
					}
					return;
				}
			}
		}
		characterElements.add(newProficiency);
	}
	public void addCharacterElement(SavingThrowProficiency newProficiency) {
		for (CharacterElement e : characterElements) {
			if (e instanceof SavingThrowProficiency) {
				SavingThrowProficiency oldProficiency = (SavingThrowProficiency) e;
				if (newProficiency.ability.equals(oldProficiency.ability)) {
					//Use the larger magnitude, but do not make them stack
					if (newProficiency.getProficiencyMagnitude() > oldProficiency.getProficiencyMagnitude()) {
						oldProficiency.setProficiencyMagnitude(newProficiency.getProficiencyMagnitude());
					}
					return;
				}
			}
		}
		characterElements.add(newProficiency);
	}
	public void addCharacterElement(SkillProficiency newProficiency) {
		for (CharacterElement e : characterElements) {
			if (e instanceof SkillProficiency) {
				SkillProficiency oldProficiency = (SkillProficiency) e;
				if (newProficiency.skill.equals(oldProficiency.skill)) {
					//Use the larger magnitude, but do not make them stack
					if (newProficiency.getProficiencyMagnitude() > oldProficiency.getProficiencyMagnitude()) {
						oldProficiency.setProficiencyMagnitude(newProficiency.getProficiencyMagnitude());
					}
					return;
				}
			}
		}
		characterElements.add(newProficiency);
	}
}
