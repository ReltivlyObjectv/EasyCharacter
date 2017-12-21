package tech.relativelyobjective.easycharacter.utilities;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;
import tech.relativelyobjective.easycharacter.characterelements.*;
import tech.relativelyobjective.easycharacter.utilities.Lists.Ability;
import tech.relativelyobjective.easycharacter.utilities.SpellLists.SpellKey;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class AllFeats {
	public static final Feat ACTOR = new Feat(
		"Actor",
		"You have advantage on Charisma (Deception) and Charisma (Performance) "+
		"checks when trying to pass yourself off as a different person. You "+
		"can mimic the speech of another person or the sounds made by other "+
		"creatures. You must have heard the person speaking. or heard the "+
		"creature make the sound, for at least 1 minute. A successful Wisdom "+
		"(Insight) check contested by your Charisma (Deception) check allows "+
		"a listener to determine that the effect is faked."
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			returnMe.addCharacterElement(new AbilityModifier(Ability.CHARISMA, 1));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat ALERT = new Feat(
		"Alert",
		"You can't be surprised while you are conscious. Other creatures don't "+
		"gain advantage on attack rolls against you as a result of being hidden "+
		"from you."
	) {
		@Override
		public TreeSet<CharacterElement> getElements(){
			CharacterElementList returnMe = new CharacterElementList();
			returnMe.addCharacterElement(new InitiativeModifier(5));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat ATHLETE = new Feat(
		"Athlete",
		"When you are prone, standing up uses only 5 feet of movement. "+
		"Climbing doesn't halve your speed. "+
		"You can make a running long jump or a running high jump after "+
		"moving only 5 feet on foot, rather than 10 feet."
	) {
		@Override
		public TreeSet<CharacterElement> getElements(){
			CharacterElementList returnMe = new CharacterElementList();
			Lists.Ability[] skillOptions = {Lists.Ability.STRENGTH, Lists.Ability.DEXTERITY};
			TreeSet<CharacterElement> improvement = MiscPrompts.openAbilityScoreImprovementPrompt(1, skillOptions);
			for (CharacterElement e : improvement) {
				returnMe.addCharacterElement(e);
			}
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat CHARGER = new Feat(
		"Charger",
		"When you use your action to Dash, you can use a bonus action to "+
		"make one melee weapon attack or to shove a creature. If you move "+
		"at least 10 feet in a straight line immediately before taking this "+
		"bonus action, you either gain a +5 bonus to the attack's damage "+
		"roll (if you chose to make a melee attack and hit) or push the "+
		"target up to 10 feet away from you (if you chose to shove and you succeed)."
	);
	public static final Feat CROSSBOW_EXPERT = new Feat(
		"Crossbow Expert",
		"You ignore the loading quality of crossbows with which you are proficient. "+
		"Being within 5 feet of a hostile creature doesn't impose disadvantage "+
		"on your ranged attack rolls. "+
		"When you use the Attack action and attack with a one- handed weapon, "+
		"you can use a bonus action to attack with a loaded hand crossbow you are holding."
	);
	public static final Feat DEFENSIVE_DUELIST = new Feat(
		"Defensive Duelist",
		"When you are wielding a finesse weapon with which you are proficient "
		+ "and another creature hits you with a melee attack, you can use your "
		+ "reaction to add your proficiency bonus to your AC for that attack, "
		+ "potentially causing the attack to miss you."
	);
	public static final Feat DUAL_WIELDER = new Feat(
		"Dual Wielder",
		"You gain a +1 bonus to AC while you are wielding a separate "+
		"melee weapon in each hand. You can use two-weapon fighting even "+
		"when the one-handed melee weapons you are wielding aren't light. "+
		"You can draw or stow two one-handed weapons when you would normally "+
		"be able to draw or stow only one."
	);
	public static final Feat DUNGEON_DELVER = new Feat(
		"Dungeon Delver",
		"You have advantage on Wisdom (Perception) and Intelligence "+ 
		"(Investigation) checks made to detect the presence of secret doors. "+
		"You have advantage on saving throws made to avoid or resist traps. "+
		"You have resistance to the damage dealt by traps. You can search for "+
		"traps while traveling at a normal pace, instead of only at a slow pace."
	);
	public static final Feat DURABLE = new Feat(
		"Durable",
		"When you roll a Hit Die to regain hit points, the minimum number "+
		"of hit points you regain from the roll equals twice your "+
		"Constitution modifier (minimum of 2)."
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			returnMe.addCharacterElement(new AbilityModifier(Lists.Ability.CONSTITUTION, 1));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat ELEMENTAL_ADEPT_ACID = new Feat(
		"Elemental Adept (Acid)",
		"When you gain this feat, choose on of the following damage types: "
		+ "acid, cold, fire, lightning, or thunder. "
		+ "Spells you cast ignore resistance to the chosen type, "
		+ "and whenever you roll damage for a spell that deals damage "
		+ "of the chosen type, treat any rolled 1's as being a 2. "
		+ "You may take this feat multiple times; each time, "
		+ "you must select a different damage type."
	);
	public static final Feat ELEMENTAL_ADEPT_COLD = new Feat(
		"Elemental Adept (Cold)",
		"When you gain this feat, choose on of the following damage types: "
		+ "acid, cold, fire, lightning, or thunder. "
		+ "Spells you cast ignore resistance to the chosen type, "
		+ "and whenever you roll damage for a spell that deals damage "
		+ "of the chosen type, treat any rolled 1's as being a 2. "
		+ "You may take this feat multiple times; each time, "
		+ "you must select a different damage type."
	);
	public static final Feat ELEMENTAL_ADEPT_FIRE = new Feat(
		"Elemental Adept (Fire)",
		"When you gain this feat, choose on of the following damage types: "
		+ "acid, cold, fire, lightning, or thunder. "
		+ "Spells you cast ignore resistance to the chosen type, "
		+ "and whenever you roll damage for a spell that deals damage "
		+ "of the chosen type, treat any rolled 1's as being a 2. "
		+ "You may take this feat multiple times; each time, "
		+ "you must select a different damage type."
	);
	public static final Feat ELEMENTAL_ADEPT_LIGHTNING = new Feat(
		"Elemental Adept (Lightning)",
		"When you gain this feat, choose on of the following damage types: "
		+ "acid, cold, fire, lightning, or thunder. "
		+ "Spells you cast ignore resistance to the chosen type, "
		+ "and whenever you roll damage for a spell that deals damage "
		+ "of the chosen type, treat any rolled 1's as being a 2. "
		+ "You may take this feat multiple times; each time, "
		+ "you must select a different damage type."
	);
	public static final Feat ELEMENTAL_ADEPT_THUNDER = new Feat(
		"Elemental Adept (Thunder)",
		"When you gain this feat, choose on of the following damage types: "
		+ "acid, cold, fire, lightning, or thunder. "
		+ "Spells you cast ignore resistance to the chosen type, "
		+ "and whenever you roll damage for a spell that deals damage "
		+ "of the chosen type, treat any rolled 1's as being a 2. "
		+ "You may take this feat multiple times; each time, "
		+ "you must select a different damage type."
	);
	public static final Feat GRAPPLER = new Feat(
		"Grappler",
		"You have advantage on attack rolls against creatures you are grappling. "
		+ "You can use your action to try to pin a creature grappled by you. "
		+ "To do so, make another grapple check. "
		+ "If you succeed, you and the creature are both restrained until the grapple ends."
	);
	public static final Feat GREAT_WEAPON_MASTER = new Feat(
		"Great Weapon Master",
		"On your turn, when you score a critical hit with a melee weapon or "
		+ "reduce a creature to 0 hit points with one, you can make one "
		+ "melee weapon attack as a bonus action. Before you make a "
		+ "melee attack with a heavy weapon with which you are proficient, "
		+ "you can choose to take a -5 penalty to the attack roll. "
		+ "If you do so and the attack hits, it deals +10 damage."
	);
	public static final Feat HEALER = new Feat(
		"Healer",
		"When you use a healer's kit to stabilize a creature, "
		+ "they also regain 1 hit point. "
		+ "As an action, you can spend one use of a healer's kit to tend to a "
		+ "creature and heal 1d6+4 hit points to it, plus a nuber of hit points "
		+ "equal to the creature's maximum number of Hit Dice. "
		+ "That creature can't regain hit points in this way again until they "
		+ "finish a short or long rest."
	);
	public static final Feat HEAVILY_ARMORED = new Feat(
		"Heavily Armored",
		""
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			returnMe.addCharacterElement(new AbilityModifier(Lists.Ability.STRENGTH, 1));
			returnMe.addCharacterElement(new OtherProficiency("Heavy Armor"));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat HEAVY_ARMOR_MASTER = new Feat(
		"Heavy Armor Master",
		"When wearing heavy armor, bludgeoning, slashing and piercing damage "
		+ "you take from non-magical weapons is reduced by 3"
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			returnMe.addCharacterElement(new AbilityModifier(Lists.Ability.STRENGTH, 1));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat INSPIRING_LEADER = new Feat(
		"Inspiring Leader",
		"You can spend 10 minutes inspiring your companions, shoring up their "
		+ "will to fight. When you do so, choose up to six friendly creatures "
		+ "(which can include yourself) within 30 feet of you can can see or "
		+ "hear you and can understand you. Each creature gains temporary hit "
		+ "point equal to your level + your Charisma modifier. A creature can't "
		+ "gain temporary hit points in this way again until they finish a "
		+ "short or long rest."
	);
	public static final Feat KEEN_MIND = new Feat(
		"Keen Mind",
		"You always know which way is north.\n" +
		"You always know how the number of hours left before the next sunrise or sunset.\n" +
		"You can accurately recall anything you have seen or heard within the past month."
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			returnMe.addCharacterElement(new AbilityModifier(Lists.Ability.INTELLIGENCE, 1));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat LIGHTLY_ARMORED = new Feat(
		"Lightly Armored",
		""
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			returnMe.addCharacterElement(new AbilityModifier(Lists.Ability.DEXTERITY, 1));
			returnMe.addCharacterElement(new OtherProficiency("Light Armor"));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat LINGUIST = new Feat(
		"Linguist",
		"You can ably create written ciphers. Others cannot decipher a code you "
		+ "create unless you teach it to them, they succeed on an Intelligence "
		+ "check (DC = your Intelligence score + your proficiency bonus), "
		+ "or they use magic to decipher it."
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			returnMe.addCharacterElement(new AbilityModifier(Lists.Ability.INTELLIGENCE, 1));
			String[] newLangs = MiscPrompts.openMultipleObjectChooserPrompt(
				InformationManager.getUnknownLanguages(),
				"Linguist Languages",
				3,
				String.class
			);
			for (String s : newLangs) {
				returnMe.addCharacterElement(new Language(s));
			}
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat LUCKY = new Feat(
		"Lucky",
		"You have 3 luck points. Whenever you make an attack roll, ability check, "
		+ "or saving throw, you may spend 1 luck point to roll an additional d20. "
		+ "You can use this ability after the original roll, but before the outcome "
		+ "is revealed. You choose which of the d20s is used for the attack roll, "
		+ "ability check, or saving throw.\n" +
		"You can also spend one luck point when an attack roll is made against you. "
		+ "Roll a d20, and choose whether the attacker's roll uses their d20 roll or yours.\n" +
		"If multiple creatures use a luck point on the same roll, they cancel out, "
		+ "resulting in no additional dice.\n" +
		"You regain expended luck points when you finish a long rest."
	);
	public static final Feat MAGE_SLAYER = new Feat(
		"Mage Slayer",
		"When a creature within reach you can take opportunity attacks casts a spell, "
		+ "you can use your reaction to make a melee weapon attack against that creature. "
		+ "When you damage a creature that is concentrating on a spell, they have "
		+ "disadvantage on the saving throw it makes to maintain concentration. "
		+ "You have advantage on saving against spells cast by creatures with your reach."
	);
	public static final Feat MAGIC_INITIATE = new Feat(
		"Magic Initiate",
		"Choose a class: bard, cleric, sorcerer, warlock, or wizard. "
		+ "You learn two cantrips of your choice from that class's list. "
		+ "In addition, you learn one 1st level spell from the same list. "
		+ "You can cast it at its lowest level; once cast, you cannot do so "
		+ "again until you finish a long rest. "
		+ "Your spellcasting modifier for these spells is the same as the class "
		+ "you chose (Charisma for bard, sorcerer, or warlock; Wisdom for "
		+ "cleric or druid; Intelligence for wizard)"
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			Lists.Class[] classOptions = {
				Lists.Class.BARD,
				Lists.Class.CLERIC,
				Lists.Class.DRUID,
				Lists.Class.SORCERER,
				Lists.Class.WARLOCK,
				Lists.Class.WIZARD
			};
			Lists.Class spellClass = MiscPrompts.openSingleObjectChooserPrompt(
				classOptions,
				Lists.Class.BARD,
				"Choose a class to learn 2 cantrips and a spell from."
			);
			TreeSet<Spell> unknownSpells = new TreeSet<>();
			for (SpellKey s : SpellLists.getClassSpells(spellClass)) {
				Spell spell = AllSpells.getSpell(s);
				if (!InformationManager.knowsSpell(spell)) {
					unknownSpells.add(spell);
				}
			}
			TreeSet<Spell> cantrips = new TreeSet<>();
			TreeSet<Spell> level1 = new TreeSet<>();
			for (Spell spell : unknownSpells) {
				if (spell.getLevel() == 0) {
					cantrips.add(spell);
				} else if (spell.getLevel() == 1) {
					level1.add(spell);
				}
			}
			Spell[] chosenCantrips = MiscPrompts.openMultipleObjectChooserPrompt(
				cantrips.toArray(new Spell[cantrips.size()]),
				"Magic Initiate Cantrips",
				2,
				Spell.class
			);
			for (Spell s : chosenCantrips) {
				returnMe.addCharacterElement(s);
			}
			Spell level1Spell =MiscPrompts.openSingleObjectChooserPrompt(
				level1.toArray(new Spell[level1.size()]),
				null,
				"Magic Initiate Level 1 Spell"
			);
			level1Spell.description = String.format(
				"%s This spell was given by the Magic Initiate Feat "
				+ "and can only be cast at 1st level, once per long rest.",
				level1Spell.description
			);
			returnMe.addCharacterElement(level1Spell);
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat MARTIAL_ADEPT = new Feat(
		"Martial Adept",
		"You learn two maneuvers of your choice from the Battle Master "
		+ "archetype. If the maneuver requires a saving throw, the DC is "
		+ "equal to 8 + your proficiency bonus + your Strength or "
		+ "Dexterity modifier (your choice)."+
		"You also gain 1 superiority die "
		+ "(if you don't already have superiority dice, it is a d6). "
		+ "This die is used to fuel your maneuvers. "
		+ "It is expended when you use it, "
		+ "and is regained when you finish a short or long rest."
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			Maneuver[] chosenManeuvers = MiscPrompts.openMultipleObjectChooserPrompt(
				AllManeuvers.getUnknownManeuvers(),
				"Martial Adept Maneuvers",
				2,
				Maneuver.class
			);
			for (Maneuver m : chosenManeuvers) {
				returnMe.addCharacterElement(m);
			}
			returnMe.addCharacterElement(new SuperiorityDice(1, SuperiorityDice.DiceSides.D6));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat MEDIUM_ARMOR_MASTER = new Feat(
		"Medium Armor Master",
		"Wearing medium armor doesn't impose disadvantage on "
		+ "Dexterity (Stealth) checks.\n" +
		"When wearing medium armor, the maximum Dexterity modifier to AC you "
		+ "can apply increases to 3, instead of 2."
	);
	public static final Feat MOBILE = new Feat(
		"Mobile",
		"When you use the Dash action, difficult terrain doesn't cost extra "
		+ "movement on that turn.\n" +
		"When you make a melee attack against a creature, you don't provoke "
		+ "opportunity attacks from that creature for the rest of the turn, "
		+ "whether you hit or not."
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			int speed = InformationManager.getSpeed();
			returnMe.addCharacterElement(new WalkSpeed(speed + 10));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat MODERATELY_ARMORED = new Feat(
		"Moderately Armored",
		""
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			Lists.Ability[] options = {Lists.Ability.STRENGTH, Lists.Ability.DEXTERITY};
			for (CharacterElement e : MiscPrompts.openAbilityScoreImprovementPrompt(1, options)) {
				returnMe.addCharacterElement(e);
			}
			returnMe.addCharacterElement(new OtherProficiency("Medium Armor"));
			returnMe.addCharacterElement(new OtherProficiency("Shields"));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat MOUNTED_COMBATANT = new Feat(
		"Mounted Combatant",
		"You have advantage on melee attack rolls against unmounted creatures "
		+ "that are smaller than your mount.\n" +
		"You can force an attack targeted at your mount to target you instead.\n" +
		"If your mount is subjected to an effect that allows it to make a "
		+ "Dexterity save to take only half damage, it takes no damage if it "
		+ "succeeds and half damage if it fails."
	);
	public static final Feat OBSERVANT = new Feat(
		"Observant",
		"If you can see a creature's mouth while it is speaking a language you "
		+ "understand, you can interpret their words by reading their lips."
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			Lists.Ability[] options = {Lists.Ability.INTELLIGENCE, Lists.Ability.WISDOM};
			for (CharacterElement e : MiscPrompts.openAbilityScoreImprovementPrompt(1, options)) {
				returnMe.addCharacterElement(e);
			}
			returnMe.addCharacterElement(new SkillModifierPassive(Lists.Skill.INVESTIGATION, 5));
			returnMe.addCharacterElement(new SkillModifierPassive(Lists.Skill.PERCEPTION, 5));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat POLEARM_MASTER = new Feat(
		"Polearm Master",
		"When you take the attack action with a glaive, halberd, or quarterstaff, "
		+ "you can use a bonus action to make a melee attack with the other end "
		+ "of the weapon. The damage die is a d4 (add attribute modifiers as normal) "
		+ "and deals bludgeoning damage. Otherwise, this attack functions just "
		+ "as if you attacked with the weapon in question.\n" +
		"While wielding a glaive, halberd, pike, or quarterstaff, other "
		+ "creatures provoke an opportunity attack from you when they enter "
		+ "your reach."
	);
	public static final Feat RESILIENT = new Feat(
		"Resilient",
		""
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			Lists.Ability chosenAbility = MiscPrompts.openSingleObjectChooserPrompt(
				Lists.Ability.values(),
				Lists.Ability.STRENGTH,
				"Ability Increase and Proficiency"
			);
			returnMe.addCharacterElement(new SavingThrowProficiency(chosenAbility));
			returnMe.addCharacterElement(new AbilityModifier(chosenAbility, 1));
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat RITUAL_CASTER = new Feat(
		"Ritual Caster",
		"You have learned a number of spells you can cast as rituals. "
		+ "These spells are written in a ritual book, which you must have on "
		+ "hand when casting one of them.\n" +
		"When you gain this feat, choose one of the following classes: bard, "
		+ "cleric, druid, sorcerer, warlock, or wizard. You acquire a ritual "
		+ "book holding two 1st level spells with the ritual tag, which must "
		+ "be on the list of the chosen class. Your casting ability for these "
		+ "rituals are the same as the chosen class (Charisma for bard, "
		+ "sorcerer, or warlock; Wisdom for cleric or druid; Intelligence "
		+ "for wizard).\n" +
		"If you come across a spell in written from, such as a magical scroll "
		+ "or a wizard's spellbook, you might be able to add it to your ritual "
		+ "book. The spell must be on the spell list for the class you chose, "
		+ "the spell's level must not be higher than half your level "
		+ "(rounded up), and it must have the ritual tag. "
		+ "The proccess of copying the spell into your ritual books takes 2 "
		+ "hours per level of the spells, and costs 50 gp per level of the spell. "
		+ "This cost represents material components spent on practicing the spell, "
		+ "as well as the fine inks you must use to record it."
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			Lists.Class[] classOptions = {
				Lists.Class.BARD,
				Lists.Class.CLERIC,
				Lists.Class.DRUID,
				Lists.Class.SORCERER,
				Lists.Class.WARLOCK,
				Lists.Class.WIZARD
			};
			Lists.Class spellClass = MiscPrompts.openSingleObjectChooserPrompt(
				classOptions,
				Lists.Class.BARD,
				"Choose a class to learn 2 ritual spells from."
			);
			TreeSet<Spell> unknownSpells = new TreeSet<>();
			for (SpellKey s : SpellLists.getClassSpells(spellClass)) {
				Spell spell = AllSpells.getSpell(s);
				if (!InformationManager.knowsSpell(spell)) {
					if (spell.ritual) {
						unknownSpells.add(spell);
					}
				}
			}
			TreeSet<Spell> level1 = new TreeSet<>();
			for (Spell spell : unknownSpells) {
				if (spell.getLevel() == 1) {
					level1.add(spell);
				}
			}
			Spell[] level1Spell = MiscPrompts.openMultipleObjectChooserPrompt(
				level1.toArray(new Spell[level1.size()]),
				"Ritual Caster Level 1 Spells",
				2,
				Spell.class
			);
			for (Spell s :level1Spell) {
				s.name = String.format("%s (Ritual)", s.name);
				returnMe.addCharacterElement(s);
			}
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat SAVAGE_ATTACKER = new Feat(
		"Savage Attacker",
		"Once per turn when you roll damage for a melee weapon attack, "
		+ "you can reroll the weapon's damage dice and use either total."
	);
	public static final Feat SENTINEL = new Feat(
		"Sentinel",
		"Whenever you hit a creature with an opportunity attack, its speed "
		+ "drops to 0 for the rest of the turn. This stops any movement they "
		+ "may have been taking.\n" +
		"Creatures within your reach provoke opportunity attacks even if they "
		+ "took the Disengage action.\n" +
		"When a creature within your reach makes an attack against a target "
		+ "other than you (and that target doesn't have this feat), you can "
		+ "use your reaction to make a melee weapon attack against the "
		+ "attacking creature."
	);
	public static final Feat SHARPSHOOTER = new Feat(
		"Sharpshooter",
		"Attacking at long range doesn't impose disadvantage on your "
		+ "ranged weapon attack rolls.\n" +
		"Your ranged weapons ignore half cover and three-quarters cover.\n" +
		"Before you make a ranged attack with a ranged weapon with which you "
		+ "are proficient, you can choose to take a -5 penalty to the "
		+ "attack roll. If you do so and the attack hits, it deals +10 damage."
	);
	public static final Feat SHIELD_MASTER = new Feat(
		"Shield Master",
		"You gain the following benefits while wielding a shield:\n" +
		"-If you take the Attack action on your turn, you can use a bonus action "
		+ "to try to shove a creature within 5 feet of you using your shield.\n" +
		"-If you aren't incapacitated, you can add your shield's AC bonus to any "
		+ "Dexterity save made against a spell or other effect that affects only you.\n" +
		"-If you are subjected to an effect which allows you to make a "
		+ "Dexterity save for half damage, you can use your reaction to take "
		+ "no damage, interposing you shield between you and the effect."
	);
	public static final Feat SKILLED = new Feat(
		"Skilled",
		""
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			TreeSet<Lists.Skill> unproficientSkills = new TreeSet<>();
			for (Lists.Skill s : Lists.Skill.values()) {
				if (!InformationManager.isProficient(s)) {
					unproficientSkills.add(s);
				}
			}
			Object[] allProficiencyOptions = 
				Stream.concat(
					Arrays.stream(unproficientSkills.toArray(
						new Object[unproficientSkills.size()]
					)),
					Arrays.stream(ItemLists.ARTISANS_TOOLS)
				).toArray(Object[]::new);
			Object[] chosenProficiencies = MiscPrompts.openMultipleObjectChooserPrompt(
				allProficiencyOptions,
				"Additional Proficiencies",
				3,
				Object.class
			);
			for (Object o : chosenProficiencies) {
				if (o instanceof Lists.Skill) {
					returnMe.addCharacterElement(new SkillProficiency((Lists.Skill) o));
				} else {
					returnMe.addCharacterElement(new OtherProficiency(o.toString()));
				}
			}
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat SKULKER = new Feat(
		"Skulker",
		"You can try to hide when you are only lightly obscured from the "
		+ "creature from which you are hiding.\n" +
		"When you are hidden from a creature and miss it with a ranged "
		+ "weapon attack, making the attack doesn't reveal your position.\n" +
		"Dim light doesn't impose disadvantage on Wisdom (Perception) "
		+ "bonuses made with sight."
	);
	public static final Feat SPELL_SNIPER = new Feat(
		"Spell Sniper",
		"When you cast a spell that requires a ranged attack roll, the spell's "
		+ "range is doubled.\n" +
		"Your ranged spell attacks ignore half cover and three-quarters cover.\n" +
		"You learn a single cantrip that requires an attack roll from a class "
		+ "of your choice: bard, cleric, sorcerer, warlock, or wizard. "
		+ "Your spellcasting modifier for these spells is the same as the "
		+ "class you chose (Charisma for bard, sorcerer, or warlock; Wisdom "
		+ "for cleric or druid; Intelligence for wizard)"
	) {
		@Override
		public TreeSet<CharacterElement> getElements() {
			CharacterElementList returnMe = new CharacterElementList();
			Lists.Class[] classOptions = {
				Lists.Class.BARD,
				Lists.Class.CLERIC,
				Lists.Class.DRUID,
				Lists.Class.SORCERER,
				Lists.Class.WARLOCK,
				Lists.Class.WIZARD
			};
			Lists.Class spellClass = MiscPrompts.openSingleObjectChooserPrompt(
				classOptions,
				Lists.Class.BARD,
				"Choose a class to learn 1 cantrip from."
			);
			TreeSet<Spell> unknownSpells = new TreeSet<>();
			for (SpellKey s : SpellLists.getClassSpells(spellClass)) {
				Spell spell = AllSpells.getSpell(s);
				if (!InformationManager.knowsSpell(spell)) {
					if (spell.ritual) {
						unknownSpells.add(spell);
					}
				}
			}
			TreeSet<Spell> cantrips = new TreeSet<>();
			for (Spell spell : unknownSpells) {
				if (spell.getLevel() == 0) {
					cantrips.add(spell);
				}
			}
			Spell[] cantripsArray = new Spell[cantrips.size()];
			Spell chosenCantrip = MiscPrompts.openSingleObjectChooserPrompt(
				cantripsArray,
				cantripsArray[0],
				"Spell Sniper Cantrip"
			);
			returnMe.addCharacterElement(chosenCantrip);
			return returnMe.getCharacterElements();
		}
	};
	public static final Feat TAVERN_BRAWLER = new Feat(
		"Tavern Brawler",
		""
	);
	public static final Feat TOUGH = new Feat(
		"Tough",
		""
	);
	public static final Feat WAR_CASTER = new Feat(
		"War Caster",
		""
	);
	public static final Feat WEAPON_MASTER = new Feat(
		"Weapon Master",
		""
	);
	public static Feat[] ALL_FEATS = {
		ALERT,
		ATHLETE,
		ACTOR,
		CHARGER,
		CROSSBOW_EXPERT,
		DEFENSIVE_DUELIST,
		DUAL_WIELDER,
		DUNGEON_DELVER,
		DURABLE,
		ELEMENTAL_ADEPT_ACID,
		ELEMENTAL_ADEPT_COLD,
		ELEMENTAL_ADEPT_FIRE,
		ELEMENTAL_ADEPT_LIGHTNING,
		ELEMENTAL_ADEPT_THUNDER,
		GRAPPLER,
		GREAT_WEAPON_MASTER,
		HEALER,
		HEAVILY_ARMORED,
		HEAVY_ARMOR_MASTER,
		INSPIRING_LEADER,
		KEEN_MIND,
		LIGHTLY_ARMORED,
		LINGUIST,
		LUCKY,
		MAGE_SLAYER,
		MAGIC_INITIATE,
		MARTIAL_ADEPT,
		MEDIUM_ARMOR_MASTER,
		MOBILE,
		MODERATELY_ARMORED,
		MOUNTED_COMBATANT,
		OBSERVANT,
		POLEARM_MASTER,
		RESILIENT,
		RITUAL_CASTER,
		SAVAGE_ATTACKER,
		SENTINEL,
		SHARPSHOOTER,
		SHIELD_MASTER,
		SKILLED,
		SKULKER,
		SPELL_SNIPER,
		TAVERN_BRAWLER,
		TOUGH,
		WAR_CASTER,
		WEAPON_MASTER
	};
	
//	public static final Feat SOME_FEAT = new Feat(
//		"",
//		""
//	) {
//		@Override
//		public TreeSet<CharacterElement> getElements() {
//			
//		}
//	};
}
