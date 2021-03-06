package tech.relativelyobjective.easycharacter.characterelements;

import java.util.TreeSet;
import javax.swing.JOptionPane;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
public class CharacterElementList {
	private TreeSet<CharacterElement> characterElements;
	
	public CharacterElementList() {
		characterElements = new TreeSet<>();
	}
	public void resetCharacterElements() {
		characterElements.clear();
	}
	public TreeSet<CharacterElement> getCharacterElements() {
		return new TreeSet<>(characterElements);
	}
	public void removeCharacterElement(CharacterElement e) {
		String warning = null;
		if (e instanceof Background) {
			warning = "It is ill-advised to delete your background. "
			+ "To change your background, change it in the radio buttons on the background tab";
		} else if (e instanceof BarbarianPath) {
			warning = "It is ill-advised to delete your Barbarian Path. "
			+ "To change your Barbarian Path, reset your class on the class tab.";
		} else if (e instanceof Class) {
			warning = "It is ill-advised to delete your Class. "
			+ "To change your class, change it in the radio buttons on the class tab";
		} else if (e instanceof Feat) {
			warning = "It is ill-advised to delete a Feat. "
			+ "Any feat elements have already been unpacked. "
			+ "To make sure you completely remove a Feat, reset this tab.";
		} else if (e instanceof Ki) {
			warning = "It is ill-advised to delete Ki. "
			+ "It is an essential part of the Monk Class.";
		} else if (e instanceof KiAction) {
			warning = "It is ill-advised to delete Ki Actions. "
			+ "They are an essential part of the Monk Class.";
		} else if (e instanceof Maneuver) {
			warning = "It is ill-advised to delete Maneuvers. "
			+ "They are central to your subclass or a chosen Feat.";
		} else if (e instanceof Race) {
			warning = "It is ill-advised to delete your race. "
			+ "Try changing it instead.";
		} else if (e instanceof Rages) {
			warning = "It is ill-advised to delete Rages. "
			+ "They are an essential part of the Barbarian Class.";
		} else if (e instanceof Size) {
			warning = "It is ill-advised to delete your size. "
			+ "Try changing it instead.";
		} else if (e instanceof SuperiorityDice) {
			warning = "It is ill-advised to delete Superiority Dice. "
			+ "They are central to your subclass or a chosen Feat.";
		} else if (e instanceof UnarmedStrikes) {
			warning = "It is ill-advised to delete Unarmed Strikes. "
			+ "They are central to your class, subclass, or a chosen Feat.";
		} else if (e instanceof WalkSpeed) {
			warning = "It is ill-advised to delete your walk speed. "
			+ "Try changing it instead.";
		}
		boolean confirmed = true;
		if (warning != null) {
			warning = String.format("%s %s",
				warning,
				"Are you sure you wish to do this?"
			);
			confirmed = (0 == JOptionPane.showConfirmDialog(
				WindowManager.getMainFrame(),
				warning,
				"Warning!",
				JOptionPane.YES_NO_OPTION
			));
		}
		if (confirmed) {
			characterElements.remove(e);
		}
	}
	public void addCharacterElement(CharacterElement e) {
		if (e instanceof AbilityModifier) {
			addCharacterElement((AbilityModifier) e);
		} else if (e instanceof Background) {
			addCharacterElement((Background) e);
		} else if (e instanceof BarbarianPath) {
			addCharacterElement((BarbarianPath) e);
		} else if (e instanceof ConditionModifier) {
			addCharacterElement((ConditionModifier) e);
		} else if (e instanceof Class) {
			addCharacterElement((Class) e);
		} else if (e instanceof DamageModifier) {
			addCharacterElement((DamageModifier) e);
		} else if (e instanceof Darkvision) {
			addCharacterElement((Darkvision) e);
		} else if (e instanceof Feat) {
			addCharacterElement((Feat) e);
		} else if (e instanceof Feature) {
			addCharacterElement((Feature) e);
		} else if (e instanceof HitPointModifierPerLevel) {
			addCharacterElement((HitPointModifierPerLevel) e);
		} else if (e instanceof InventoryItem) {
			addCharacterElement((InventoryItem) e);
		} else if (e instanceof InitiativeModifier) {
			addCharacterElement((InitiativeModifier) e);
		} else if (e instanceof Ki) {
			addCharacterElement((Ki) e);
		} else if (e instanceof KiAction) {
			addCharacterElement((KiAction) e);
		} else if (e instanceof Language) {
			addCharacterElement((Language) e);
		} else if (e instanceof Maneuver) {
			addCharacterElement((Maneuver) e);
		} else if (e instanceof MaxAbilityScore) {
			addCharacterElement((MaxAbilityScore) e);
		} else if (e instanceof OtherProficiency) {
			addCharacterElement((OtherProficiency) e);
		} else if (e instanceof ProficiencyBonus) {
			addCharacterElement((ProficiencyBonus) e);
		} else if (e instanceof Race) {
			addCharacterElement((Race) e);
		} else if (e instanceof Rages) {
			addCharacterElement((Rages) e);
		} else if (e instanceof SavingThrowProficiency) {
			addCharacterElement((SavingThrowProficiency) e);
		} else if (e instanceof SkillModifier) {
			addCharacterElement((SkillModifier) e);
		} else if (e instanceof SkillModifierPassive) {
			addCharacterElement((SkillModifierPassive) e);
		} else if (e instanceof SkillProficiency) {
			addCharacterElement((SkillProficiency) e);
		} else if (e instanceof Spell) {
			addCharacterElement((Spell) e);
		} else if (e instanceof Size) {
			addCharacterElement((Size) e);
		} else if (e instanceof SuperiorityDice) {
			addCharacterElement((SuperiorityDice) e);
		} else if (e instanceof UnarmedStrikes) {
			addCharacterElement((UnarmedStrikes) e);
		} else if (e instanceof WalkSpeed) {
			addCharacterElement((WalkSpeed) e);
		} else {
			throw new UnsupportedOperationException("Not a supported type: "+e.getClass());
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
	public void addCharacterElement(BarbarianPath newPath) {
		for (CharacterElement e : characterElements) {
			if (e instanceof BarbarianPath) {
				BarbarianPath oldPath = (BarbarianPath) e;
				oldPath.path = newPath.path;
				return;
			}
		}
		characterElements.add(newPath);
	}
	public void addCharacterElement(Background newBackground) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Background) {
				Background oldBackground = (Background) e;
				oldBackground.bg = newBackground.bg;
				return;
			}
		}
		characterElements.add(newBackground);
	}
	public void addCharacterElement(Class newClass) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Class) {
				Class oldClass = (Class) e;
				if (oldClass.className.equals(newClass.className)) {
					//Adjust level of existing class
					oldClass.setClassLevel(newClass.getClassLevel());
					return;
				}
			}
		}
		characterElements.add(newClass);
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
		for (CharacterElement e : newFeat.getElements()) {
			this.addCharacterElement(e);
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
	public void addCharacterElement(HitPointModifierPerLevel newMod) {
		for (CharacterElement e : characterElements) {
			if (e instanceof HitPointModifierPerLevel) {
				HitPointModifierPerLevel oldMod = (HitPointModifierPerLevel) e;
				oldMod.mod += newMod.mod;
				return;
			}
		}
		characterElements.add(newMod);
	}
	public void addCharacterElement(InitiativeModifier mod) {
		for (CharacterElement c : characterElements) {
			if (c instanceof InitiativeModifier) {
				InitiativeModifier cMod = (InitiativeModifier) c;
				cMod.modifier += mod.modifier;
				return;
			}
		}
		characterElements.add(mod);
	}
	public void addCharacterElement(InventoryItem newItem) {
		if (newItem.count <= 0) {
			return;
		}
		for (CharacterElement e : characterElements) {
			if (e instanceof InventoryItem) {
				InventoryItem oldItem = (InventoryItem) e;
				if (oldItem.item.equals(newItem.item)) {
					oldItem.count += newItem.count;
					return;
				}
			}
		}
		characterElements.add(newItem);
	}
	public void addCharacterElement(Ki newKi) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Ki) {
				//Overwrite ki count
				((Ki) e).setKiCount(newKi.getKiCount());
				return;
			}
		}
		characterElements.add(newKi);
	}
	public void addCharacterElement(KiAction newKiAction) {
		for (CharacterElement e : characterElements) {
			if (e instanceof KiAction) {
				KiAction oldAction = (KiAction) e;
				if (oldAction.t.equals(newKiAction.t)) {
					//Replace same action
					oldAction.d = newKiAction.d;
					oldAction.setKiCount(newKiAction.getKiCount());
					return;
				}
			}
		}
		characterElements.add(newKiAction);
	}
	public void addCharacterElement(Language newLanguage) {
		if (newLanguage.lang.equals("") || newLanguage.lang.equals("New Language")) {
			return;
		}
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
	public void addCharacterElement(Maneuver newManeuver) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Maneuver) {
				Maneuver oldManeuver = (Maneuver) e;
				if (oldManeuver.name.equals(newManeuver.name)) {
					//Adjust description of same maneuver
					oldManeuver.description = newManeuver.description;
					return;
				}
			}
		}
		characterElements.add(newManeuver);
	}
	public void addCharacterElement(MaxAbilityScore newMax) {
		for (CharacterElement e : characterElements) {
			if (e instanceof MaxAbilityScore) {
				MaxAbilityScore m = (MaxAbilityScore) e;
				if (m.ability.equals(newMax.ability)) {
					m.maxScore = newMax.maxScore > m.maxScore 
						? newMax.maxScore
						: m.maxScore;
				}
			}
		}
		characterElements.add(newMax);
	}
	public void addCharacterElement(OtherProficiency newProficiency) {
		if (newProficiency.getProficiencyMagnitude() <= 0) {
			return;
		}
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
	public void addCharacterElement(ProficiencyBonus newProficiency) {
		for (CharacterElement e : characterElements) {
			if (e instanceof ProficiencyBonus) {
				ProficiencyBonus oldProficiency = (ProficiencyBonus) e;
				//Use the larger magnitude, but do not make them stack
				if (newProficiency.getBonus() > oldProficiency.getBonus()) {
					oldProficiency.setBonus(newProficiency.getBonus());
				}
				return;
			}
		}
		characterElements.add(newProficiency);
	}
	public void addCharacterElement(Race newRace) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Race) {
				//Can only have one race; overwrite
				((Race)e).race = newRace.race;
				return;
			}
		}
		characterElements.add(newRace);
	}
	public void addCharacterElement(Rages newRace) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Rages) {
				//Overwrite rage count
				((Rages) e).setRageCount(newRace.getRageCount());
				return;
			}
		}
		characterElements.add(newRace);
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
	public void addCharacterElement(Size newSize) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Size) {
				//Can only have one size; overwrite
				((Size)e).size = newSize.size;
				return;
			}
		}
		characterElements.add(newSize);
	}
	public void addCharacterElement(SkillModifier mod) {
		for (CharacterElement c : characterElements) {
			if (c instanceof SkillModifier) {
				SkillModifier cMod = (SkillModifier) c;
				if (cMod.skill.equals(mod.skill)) {
					cMod.modifier += mod.modifier;
					return;
				}
			}
		}
		characterElements.add(mod);
	}
	public void addCharacterElement(SkillModifierPassive mod) {
		for (CharacterElement c : characterElements) {
			if (c instanceof SkillModifierPassive) {
				SkillModifierPassive cMod = (SkillModifierPassive) c;
				if (cMod.skill.equals(mod.skill)) {
					cMod.modifier += mod.modifier;
					return;
				}
			}
		}
		characterElements.add(mod);
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
	public void addCharacterElement(Spell newSpell) {
		for (CharacterElement e : characterElements) {
			if (e instanceof Spell) {
				Spell s = (Spell) e;
				if (s.name.equals(newSpell.name)) {
					//Already present
					return;
				}
			}
		}
		characterElements.add(newSpell);
	}
	public void addCharacterElement(SuperiorityDice newDice) {
		if (newDice.count < 1) {
			return;
		}
		for (CharacterElement e : characterElements) {
			if (e instanceof SuperiorityDice) {
				SuperiorityDice d = (SuperiorityDice) e;
				d.count += newDice.count;
				if (newDice.sides.toString().compareTo(d.sides.toString()) > 0) {
					d.sides = newDice.sides;
				}
				return;
			}
		}
		characterElements.add(newDice);
	}
	public void addCharacterElement(UnarmedStrikes newDice) {
		for (CharacterElement e : characterElements) {
			if (e instanceof UnarmedStrikes) {
				UnarmedStrikes d = (UnarmedStrikes) e;
				if (newDice.sides.toString().compareTo(d.sides.toString()) > 0) {
					d.sides = newDice.sides;
				}
				return;
			}
		}
		characterElements.add(newDice);
	}
	public void addCharacterElement(WalkSpeed newSpeed) {
		for (CharacterElement e : characterElements) {
			if (e instanceof WalkSpeed) {
				WalkSpeed oldSpeed = (WalkSpeed) e;
				oldSpeed.distance = newSpeed.distance > oldSpeed.distance 
					? newSpeed.distance 
					: oldSpeed.distance;
				return;
			}
		}
		characterElements.add(newSpeed);
	}
	public void revalidate() {
		TreeSet<CharacterElement> oldElements = characterElements;
		characterElements = new TreeSet<>();
		for (CharacterElement e : oldElements) {
			addCharacterElement(e);
		}
	}
	public static boolean hasLanguage(TreeSet<CharacterElement> list, Language l) {
		for (CharacterElement e : list) {
			if (e instanceof Language) {
				Language oldLang = (Language) e;
				if (oldLang.lang.equals(l.lang)) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean hasLanguage(TreeSet<CharacterElement> list, String l) {
		return hasLanguage(list, new Language(l));
	}
	public static boolean hasLanguage(CharacterElementList list, String l) {
		return hasLanguage(list.getCharacterElements(), new Language(l));
	}
	public static boolean hasLanguage(CharacterElementList list, Language l) {
		return hasLanguage(list.getCharacterElements(), l);
	}
}
