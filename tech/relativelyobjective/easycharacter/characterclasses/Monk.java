package tech.relativelyobjective.easycharacter.characterclasses;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Stream;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;
import tech.relativelyobjective.easycharacter.characterelements.Ki;
import tech.relativelyobjective.easycharacter.characterelements.KiAction;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.SavingThrowProficiency;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.characterelements.Spell;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.ItemLists;
import tech.relativelyobjective.easycharacter.utilities.ItemLists.ItemPack;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;
import tech.relativelyobjective.easycharacter.utilities.spells.CantripLists;

/**
 *
 * @author ReltivlyObjectv
 */
public class Monk {
	public static final Lists.Skill[] MONK_SKILLS = {
		Lists.Skill.ACROBATICS,
		Lists.Skill.ATHLETICS,
		Lists.Skill.HISTORY,
		Lists.Skill.INSIGHT,
		Lists.Skill.RELIGION,
		Lists.Skill.STEALTH
	};
	public static enum MonasticTradition {
		OPEN_HAND,
		SHADOW,
		FOUR_ELEMENTS
	}
	public static enum ElementalDiscipline {
		BREATH_OF_WINTER,
		CLENCH_OF_THE_NORTH_WIND,
		ELEMENTAL_ATTUNEMENT,
		ETERNAL_MOUNTAIN_DEFENSE,
		FANGS_OF_THE_FIRE_SNAKE,
		FIST_OF_FOUR_THUNDERS,
		FIST_OF_UNBROKEN_AIR,
		FLAMES_OF_THE_PHOENIX,
		GONG_OF_THE_SUMMIT,
		MIST_STANCE,
		RIDE_THE_WIND,
		RIVER_OF_HUNGRY_FLAME,
		RUSH_OF_THE_GALE_SPIRITS,
		SHAPE_THE_FLOWING_RIVER,
		SWEEPING_CINDER_STRIKE,
		WATER_WHIP,
		WAVE_OF_ROLLING_EARTH
	}
	private static MonasticTradition tradition = MonasticTradition.SHADOW;
	
	public static void setup(int level) {
		if (level >= 1) {
			InformationManager.addClassElement(new OtherProficiency("Simple Weapons",1));
			InformationManager.addClassElement(new OtherProficiency("Shortswords",1));
			InformationManager.addClassElement(
				new SavingThrowProficiency(Lists.Ability.STRENGTH)
			);
			InformationManager.addClassElement(
				new SavingThrowProficiency(Lists.Ability.DEXTERITY)
			);
			WindowManager.getClassTab().updateClassElementsList();
			String[] allMiscProfsOptions = 
				Stream.concat(
					Arrays.stream(ItemLists.ARTISANS_TOOLS), 
					Arrays.stream(ItemLists.INSTRUMENTS)
				).toArray(String[]::new);
			InformationManager.addClassElement(
				new OtherProficiency(
					MiscPrompts.openSingleStringChooserPrompt(
						allMiscProfsOptions, "Tool or Instrument Proficiency", true
					),
					1
				)
			);
			WindowManager.getClassTab().updateClassElementsList();
			for (Lists.Skill s : ClassChoices.openProficiencyPrompt(MONK_SKILLS, 2)) {
				InformationManager.addClassElement(new SkillProficiency(s, 1));
			}
			InformationManager.addClassElement(new InventoryItem("Shortsword", 1));
			InformationManager.addClassElement(new InventoryItem("Dart", 10));
			WindowManager.getClassTab().updateClassElementsList();
			for (InventoryItem i : ItemLists.openItemPackPrompt(new ItemPack[]{
				ItemPack.DUNGEONEER, ItemPack.EXPLORER
				})) {
				InformationManager.addClassElement(i);
			}
			InformationManager.addClassElement(new Feature(
				"Unarmored Defense",
				"While you are wearing no armor and not wielding a shield, "+
				"your AC equals 10 + your Dexterity modifier + your Wisdom modifier."
			));
			InformationManager.addClassElement(new Feature(
				"Martial Arts",
				"Your practice of martial arts gives you mastery of combat "+
				"styles that use unarmed strikes and monk weapons, which are "+
				"shortswords and any simple melee weapons that don't have the "+
				"two-handed or heavy property.\n" +
				"You gain the following benefits while you are unarmed or "+
				"wielding only monk weapons and you aren't wearing armor or "+
				"wielding a shield:\n"+
				"- You can use Dexterity instead of Strength for the attack and "+
				"damage rolls of your unarmed strikes and monk weapons.\n"+
				"- You can roll a d4 in place of the normal damage of your "+
				"unarmed strike or monk weapon. This die changes as you gain "+
				"monk leveis, as shown in the Martial Arts column of the Monk table "+
				"(PHB p78).\n"+
				"- When you use the Attack action with an unarmed strike or a "+
				"monk weapon on your turn, you can make one unarmed strike as "+
				"a bonus action. For example, if you take the Attack action and "+
				"attack with a quarter-staff, you can also make an unarmed strike "+
				"as a bonus action, assuming you haven't already taken a bonus "+
				"action this turn."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 2) {
			InformationManager.addClassElement(new Feature(
				"Ki",
				"Your training allows you to harness the mystic energy of ki. "+
				"Your access to this energy is represented by a number of ki points. "+
				"Your monk level determines the number of points you have, as "+
				"shown in the Ki Points column of the Monk table (PHB p77). "+
				"You can spend these points to fuel various ki features. "+
				"You learn more ki features as you gain levels in this class, "+
				"When you spend a ki point, it is unavailable until "+
				"you finish a short or long rest, at the end of which you draw all "+
				"of your expended ki back into yourself. You must spend at least "+
				"30 minutes of the rest meditating to regain your ki points, "+
				"Some of your ki features require your target to make a saving "+
				"throw to resist the feature's effects. The saving throw DC is "+
				"calculated as follows: "+
				"8 + your proficiency bonus + your Wisom modifier."
			));
			InformationManager.addClassElement(new Ki(level));
			InformationManager.addClassElement(new KiAction(
				1,
				"Flurry of Blows",
				"Immediately after you take the Attack action on your turn, "+
				"you can spend 1 ki point to make two unarmed strikes as a "+
				"bonus action."
			));
			InformationManager.addClassElement(new KiAction(
				1,
				"Patient Defense",
				"You can spend 1 ki point to take the Dodge action as a "+
				"bonus action on your turn."
			));
			InformationManager.addClassElement(new KiAction(
				1,
				"Step of the Wind",
				"You can spend 1 ki point to take the Disengage or Dash action "+
				"as a bonus action on your turn, and your jump distance is "+
				"doubled for the turn."
			));
			InformationManager.addClassElement(new Feature(
				"Unarmored Movement",
				"Your speed increases by 10 feet while you are not wearing armor "+
				"or wielding a shield."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 3) {
			InformationManager.addClassElement(new Feature(
				"Deflect Missiles",
				"You can use your reaction to deflect or catch the missile when "+
				"you are hit by a ranged weapon attack. When you do so, the "+
				"damage you take from the attack is reduced by "+
				"1d1O + your Dexterity modifier + your monk level. "+
				"If you reduce the damage to O,you can catch the missile if it "+
				"is small enough for you to hold in one hand and you have at "+
				"least one hand free. If you catch a missile in this way, you "+
				"can spend 1 ki point to make a ranged attack with the weapon "+
				"or piece of ammunition you just caught, as part of the same reaction. "+
				"You make this attack with proficiency, regardless of your weapon "+
				"proficiencies, and the missile counts as a monk weapon for the attack."
			));
			WindowManager.getClassTab().updateClassElementsList();
			openTraditionPrompt();
			switch (tradition) {
				case OPEN_HAND:
					InformationManager.addClassElement(new Feature(
						"Open Hand Technique",
						"You can manipulate your enemy's ki when you harness your own. "+
						"Whenever you hit a creature with one of the altacks granted "+
						"by your Flurry of Blows, you can impose one of the following "+
						"effects on that target:\n" +
						"- It must succeed on a Dexterity saving throw or be knocked prone.\n" +
						"- It must make a Strength saving throw. Or it fails, you can push "+
						"it up to 15 feet away from you.\n" +
						"- It can't take reactions until the end of your next turn."
					));
					break;
				case SHADOW:
					InformationManager.addClassElement(new KiAction(
						2,
						"Darkness",
						"You can spend 2 ki points to cast the Darkness spell "+
						"(PHB p230) without providing material components."
					));
					InformationManager.addClassElement(new KiAction(
						2,
						"Darkvision",
						"You can spend 2 ki points to cast the Darkvision spell "+
						"(PHB p230) without providing material components."
					));
					InformationManager.addClassElement(new KiAction(
						2,
						"Pass Without Trace",
						"You can spend 2 ki points to cast the Pass Without Trace spell "+
						"(PHB 264) without providing material components."
					));
					InformationManager.addClassElement(new KiAction(
						2,
						"Silence",
						"You can spend 2 ki points to cast the Silence spell (PHB p275)."
					));
					InformationManager.addClassElement(CantripLists.getMinorIllusion());
					break;
				case FOUR_ELEMENTS:
					InformationManager.addClassElement(new Feature(
						"Disciple of the Elements",
						"You learn magical disciplines that harness the power "+
						"of the four elements. A discipline requires you to "+
						"spend ki points each time you use it. "+
						"Some elemenlal disciplines allow you to cast spells. "+
						"See chapter 10 of the PHB for lhe general rules of "+
						"spellcasling. To cast one of lhese spells, you use its "+
						"casting time and other rules, but you don't need to "+
						"provide material components for it."
					));
					WindowManager.getClassTab().updateClassElementsList();
					showDisciplinesPrompt(level);
					break;
			}
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 4) {
			InformationManager.addClassElement(new Feature(
				"Slow Fall",
				"You can use your reaction when you fall to reduce any falling "+
				"damage you take by an amount equal to five times your monk level."
			));
			WindowManager.getClassTab().updateClassElementsList();
			ClassChoices.openSkillImprovement();
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 5) {
			InformationManager.addClassElement(new Feature(
				"Extra Attack",
				"You can attack twice, instead of once, whenver you take the "+
				"Attack action on your turn."
			));
			InformationManager.addClassElement(new KiAction(
				1,
				"Stunning Strike",
				"You can interfere with the flow of ki in an opponent's body. "+
				"When you hit another creature with a melee weapon attack, "+
				"you can spend 1 ki point to attempt a stunning strike. "+
				"The target must succeed on a Constitution saving throw or be "+
				"stunned until the end of your next turn."
			));
			if (tradition.equals(MonasticTradition.FOUR_ELEMENTS)) {
				InformationManager.addClassElement(new Feature(
					"Disciple of the Elements",
					"You learn magical disciplines that harness the power "+
					"of the four elements. A discipline requires you to "+
					"spend ki points each time you use it. "+
					"Some elemenlal disciplines allow you to cast spells. "+
					"See chapter 10 of the PHB for lhe general rules of "+
					"spellcasling. To cast one of lhese spells, you use its "+
					"casting time and other rules, but you don't need to "+
					"provide material components for it. You can spend additional ki "+
					"points to increase the level of an elemental discipline "+
					"spell that you cast, provided that the spell has an enhanced "+
					"effect at a higher level, as burning hands does. "+
					"The spell's level increases by 1 for each additional "+
					"ki point you spend. "+
					"The maximum number of ki points you can spend to cast a "+
					"spell in this way (including its base ki point cost and "+
					"any additional ki points you spend to increase its level) "+
					"is 3."
				));
			}
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 6) {
			InformationManager.addClassElement(new Feature(
				"Unarmored Movement",
				"Your speed increases by 15 feet while you are not wearing armor "+
				"or wielding a shield."
			));
			InformationManager.addClassElement(new Feature(
				"Ki-Empowered Strikes",
				"Your unarmed strikes count as magical for the purpose of overcoming "+
				"resistance and immunity to nonmagical attacks and damage."
			));
			switch (tradition) {
				case OPEN_HAND:
					InformationManager.addClassElement(new Feature(
						"Wholeness of Body",
						"You gain the ability to heal yourself. As an action, "+
						"you can regain hit points equal to three times your "+
						"monk level. You must finish a long rest before you can "+
						"use this feature again."
					));
					break;
				case SHADOW:
					InformationManager.addClassElement(new Feature(
						"Shadow Step",
						"You gain the ability to step from one shadow into another. "+
						"When you are in dim light or darkness, as a bonus action "+
						"you can teleport up to 60 feet to an unoccupied space you "+
						"can see that is also in dim light or darkness. "+
						"You then have advantage on the first melee attack you "+
						"make before the end of the turn."
					));
					break;
				case FOUR_ELEMENTS:
					//There is nothing to do here, because the disciplines
					//are handled at level three
					break;
			}
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 7) {
			InformationManager.addClassElement(new Feature(
				"Evasion",
				"Your instinctive agility lets you dodge out of the way of "+
				"certain area effects, such as a blue dragon's lightning breath "+
				"or a fireball spell. When you are subjected to an effect that "+
				"allows you to make a Dexterity saving throw to take only "+
				"half damage, you instead take no damage if you succeed on the "+
				"saving throw, and only half damage if you fail."
			));
			InformationManager.addClassElement(new Feature(
				"Stillness of Mind",
				"You can use your action to end one effect on yourself that is "+
				"causing you to be charmed or frightened."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 8) {
			ClassChoices.openSkillImprovement();
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 9) {
			InformationManager.addClassElement(new Feature(
				"Unarmored Movement",
				"Your speed increases by 15 feet while you are not wearing armor "+
				"or wielding a shield. You can also move along vertical surfaces "+
				"and across liquids on your turn without fallind during the same move."
			));
			if (tradition.equals(MonasticTradition.FOUR_ELEMENTS)) {
				InformationManager.addClassElement(new Feature(
					"Disciple of the Elements",
					"You learn magical disciplines that harness the power "+
					"of the four elements. A discipline requires you to "+
					"spend ki points each time you use it. "+
					"Some elemenlal disciplines allow you to cast spells. "+
					"See chapter 10 of the PHB for lhe general rules of "+
					"spellcasling. To cast one of lhese spells, you use its "+
					"casting time and other rules, but you don't need to "+
					"provide material components for it. You can spend additional ki "+
					"points to increase the level of an elemental discipline "+
					"spell that you cast, provided that the spell has an enhanced "+
					"effect at a higher level, as burning hands does. "+
					"The spell's level increases by 1 for each additional "+
					"ki point you spend. "+
					"The maximum number of ki points you can spend to cast a "+
					"spell in this way (including its base ki point cost and "+
					"any additional ki points you spend to increase its level) "+
					"is 4."
				));
			}
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 10) {
			InformationManager.addClassElement(new Feature(
				"Unarmored Movement",
				"Your speed increases by 20 feet while you are not wearing armor "+
				"or wielding a shield. You can also move along vertical surfaces "+
				"and across liquids on your turn without fallind during the same move."
			));
			InformationManager.addClassElement(new Feature(
				"Purity of Body",
				"Your mastery of the ki flowing through you makes you immune "+
				"to disease and poison."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 11) {
			switch (tradition) {
				case OPEN_HAND:
					InformationManager.addClassElement(new Feature(
						"Tranquility",
						"You can enter a special meditation that surrounds you "+
						"with an aura of peace. At the end of a long rest, you "+
						"gain the effect of a sanctuary spell that lasts until the "+
						"start of your next long rest (the spell can end early as normal). "+
						"The saving throw DC for lhe spell equals "+
						"8 + your Wisdom modifier + your proficiency bonus."
					));
					break;
				case SHADOW:
					InformationManager.addClassElement(new Feature(
						"Cloak of Shadows",
						"You have learned to become one with the shadows. "+
						"When you are in an area of dim light or darkness, "+
						"you can use your action to become invisible. "+
						"You remain invisible until you make an attack, "+
						"cast a spell, or are in an area of bright light."
					));
					break;
				case FOUR_ELEMENTS:
					//There is nothing to do here, because the disciplines
					//are handled at level three
					break;
			}
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 12) {
			ClassChoices.openSkillImprovement();
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 13) {
			InformationManager.addClassElement(new Feature(
				"Tongue of the Sun and Moon",
				"You learn to touch the ki of other minds so that you "+
				"understand all spoken languages. Moreover, any creature that "+
				"can understand a language can understand what you say."
			));
			if (tradition.equals(MonasticTradition.FOUR_ELEMENTS)) {
				InformationManager.addClassElement(new Feature(
					"Disciple of the Elements",
					"You learn magical disciplines that harness the power "+
					"of the four elements. A discipline requires you to "+
					"spend ki points each time you use it. "+
					"Some elemenlal disciplines allow you to cast spells. "+
					"See chapter 10 of the PHB for lhe general rules of "+
					"spellcasling. To cast one of lhese spells, you use its "+
					"casting time and other rules, but you don't need to "+
					"provide material components for it. You can spend additional ki "+
					"points to increase the level of an elemental discipline "+
					"spell that you cast, provided that the spell has an enhanced "+
					"effect at a higher level, as burning hands does. "+
					"The spell's level increases by 1 for each additional "+
					"ki point you spend. "+
					"The maximum number of ki points you can spend to cast a "+
					"spell in this way (including its base ki point cost and "+
					"any additional ki points you spend to increase its level) "+
					"is 5."
				));
			}
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 14) {
			InformationManager.addClassElement(new Feature(
				"Unarmored Movement",
				"Your speed increases by 25 feet while you are not wearing armor "+
				"or wielding a shield. You can also move along vertical surfaces "+
				"and across liquids on your turn without fallind during the same move."
			));
			InformationManager.addClassElement(new SavingThrowProficiency(Lists.Ability.CHARISMA, 1));
			InformationManager.addClassElement(new SavingThrowProficiency(Lists.Ability.CONSTITUTION, 1));
			InformationManager.addClassElement(new SavingThrowProficiency(Lists.Ability.DEXTERITY, 1));
			InformationManager.addClassElement(new SavingThrowProficiency(Lists.Ability.INTELLIGENCE, 1));
			InformationManager.addClassElement(new SavingThrowProficiency(Lists.Ability.STRENGTH, 1));
			InformationManager.addClassElement(new SavingThrowProficiency(Lists.Ability.WISDOM, 1));
			InformationManager.addClassElement(new KiAction(
				1,
				"Diamond Soul",
				"Whenever you make a saving throw and fail, you can "+
				"spend 1 ki point to reroll it and take the second result."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 15) {
			InformationManager.addClassElement(new Feature(
				"Timeless Body",
				"Your ki sustains you so that you suffer none of the frailty of "+
				"old age, and you can't be aged magically. You can still die of "+
				"old age, however. In addition, you no longer need food or water."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 16) {
			ClassChoices.openSkillImprovement();
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 17) {
			switch (tradition) {
				case OPEN_HAND:
					InformationManager.addClassElement(new KiAction(
						3,
						"Quivering Palm",
						"You gain lhe ability lo set up lethal vibrations in "+
						"someone's body. When you hit a creature with an "+
						"unarmed strike, you can spend 3 ki points to start "+
						"these imperceptible vibrations, which last for a "+
						"number of days equal to your monk level. "+
						"The vibrations are harmless unless you use your action "+
						"to end them. To do so, you and the target must be on "+
						"the same plane of existence. When you use this action, "+
						"the crealure must make a Constitution saving throw. "+
						"If it fails, it is reduced to O hit points. If it succeeds, "+
						"it takes 10d10 necrotic damage. You can have only one "+
						"creature under the effect of this feature at a time. "+
						"You can choose to end the vibrations harmlessly without "+
						"using an action."
					));
					break;
				case SHADOW:
					InformationManager.addClassElement(new Feature(
						"Opportunistic",
						"You can exploit a creature's momentary distraction "+
						"when it is hit by an altack. Whenever a creature within "+
						"5 feet of you is hit by an attack made by a creature "+
						"other than you, you can use your reaction to make a "+
						"melee attack against that creature."
					));
					break;
				case FOUR_ELEMENTS:
					InformationManager.addClassElement(new Feature(
						"Disciple of the Elements",
						"You learn magical disciplines that harness the power "+
						"of the four elements. A discipline requires you to "+
						"spend ki points each time you use it. "+
						"Some elemenlal disciplines allow you to cast spells. "+
						"See chapter 10 of the PHB for lhe general rules of "+
						"spellcasling. To cast one of lhese spells, you use its "+
						"casting time and other rules, but you don't need to "+
						"provide material components for it. You can spend additional ki "+
						"points to increase the level of an elemental discipline "+
						"spell that you cast, provided that the spell has an enhanced "+
						"effect at a higher level, as burning hands does. "+
						"The spell's level increases by 1 for each additional "+
						"ki point you spend. "+
						"The maximum number of ki points you can spend to cast a "+
						"spell in this way (including its base ki point cost and "+
						"any additional ki points you spend to increase its level) "+
						"is 6."
					));
					break;
			}
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 18) {
			InformationManager.addClassElement(new Feature(
				"Unarmored Movement",
				"Your speed increases by 30 feet while you are not wearing armor "+
				"or wielding a shield. You can also move along vertical surfaces "+
				"and across liquids on your turn without fallind during the same move."
			));
			InformationManager.addClassElement(new KiAction(
				4,
				"Empty Body (Invisibility)",
				"You can use your action to spend 4 ki points to "+
				"become invisible for 1 minute. During that time, "+
				"you also have resistance to all damage but force damage."
			));
			InformationManager.addClassElement(new KiAction(
				8,
				"Empty Body (Astral Projection)",
				"You can spend 8 ki points to cast the astral projection spell, "+
				"without needing material components. When you do so, you can't "+
				"take any other creatures with you."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 19) {
			ClassChoices.openSkillImprovement();
			WindowManager.getClassTab().updateClassElementsList();
		}
		if (level >= 20) {
			InformationManager.addClassElement(new Feature(
				"Perfect Self",
				"When you roll for initiative and have no ki points "+
				"remaining, you regain 4 ki points."
			));
			WindowManager.getClassTab().updateClassElementsList();
		}
	}
	private static void openTraditionPrompt() {
		JDialog prompt = new JDialog(WindowManager.getMainFrame(),
			"Monastic Tradition", true);
		prompt.setLayout(new BoxLayout(prompt.getContentPane(), BoxLayout.PAGE_AXIS));
		prompt.setPreferredSize(new Dimension(500,225));
		prompt.setSize(prompt.getPreferredSize());
		prompt.setMaximumSize(prompt.getPreferredSize());
		prompt.setMinimumSize(prompt.getPreferredSize());
		prompt.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		((JPanel)prompt.getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
		JLabel title = new JLabel(
			"<html><strong>Choose your Monastic Tradition.<strong><br><br></html>",
			SwingConstants.CENTER
		);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		prompt.add(title);
		JLabel traditionDescription = new JLabel(
			"<html><strong></strong><i>"+
			"You commit yourself to a monastic tradition: "+
			"the Way of the Open Hand, the Way of Shadow, or the Way of the Four Elements, "+
			"all detailed in the PHB on pages 79-81. Your tradition grants you "+
			"features at 3rd level and again at 6th, 11th, and 17th level.</i><br><br></html>",
			SwingConstants.CENTER
		);
		traditionDescription.setAlignmentX(Component.CENTER_ALIGNMENT);
		prompt.add(traditionDescription);
		JComboBox selection = new JComboBox(MonasticTradition.values());
		prompt.add(selection);
		JButton saveButton = new JButton("Save Tradition");
		saveButton.addActionListener((ActionEvent e)->{
			tradition = (MonasticTradition) selection.getSelectedItem();
			prompt.dispose();
		});
		prompt.add(saveButton);
		prompt.setVisible(true);
		WindowManager.getClassTab().updateClassElementsList();
	}
	private static void showDisciplinesPrompt(int level) {
		if (level < 3) {
			//Have not unlocked disciplines yet
			return;
		}
		HashMap<ElementalDiscipline, Integer> discLevels = new HashMap<>();
		discLevels.put(ElementalDiscipline.BREATH_OF_WINTER, 17);
		discLevels.put(ElementalDiscipline.CLENCH_OF_THE_NORTH_WIND, 6);
		discLevels.put(ElementalDiscipline.ELEMENTAL_ATTUNEMENT, 3);
		discLevels.put(ElementalDiscipline.ETERNAL_MOUNTAIN_DEFENSE, 11);
		discLevels.put(ElementalDiscipline.FANGS_OF_THE_FIRE_SNAKE, 3);
		discLevels.put(ElementalDiscipline.FIST_OF_FOUR_THUNDERS, 3);
		discLevels.put(ElementalDiscipline.FIST_OF_UNBROKEN_AIR, 3);
		discLevels.put(ElementalDiscipline.FLAMES_OF_THE_PHOENIX, 11);
		discLevels.put(ElementalDiscipline.GONG_OF_THE_SUMMIT, 6);
		discLevels.put(ElementalDiscipline.MIST_STANCE, 11);
		discLevels.put(ElementalDiscipline.RIDE_THE_WIND, 11);
		discLevels.put(ElementalDiscipline.RIVER_OF_HUNGRY_FLAME, 17);
		discLevels.put(ElementalDiscipline.RUSH_OF_THE_GALE_SPIRITS, 3);
		discLevels.put(ElementalDiscipline.SHAPE_THE_FLOWING_RIVER, 3);
		discLevels.put(ElementalDiscipline.SWEEPING_CINDER_STRIKE, 3);
		discLevels.put(ElementalDiscipline.WATER_WHIP, 3);
		discLevels.put(ElementalDiscipline.WAVE_OF_ROLLING_EARTH, 17);
		TreeSet<ElementalDiscipline> availableDisciplines = new TreeSet<>();
		LinkedList<ElementalDiscipline> chosenDisciplines = new LinkedList<>();
		for (ElementalDiscipline d : discLevels.keySet()) {
			if (discLevels.get(d) <= level) {
				if (level < 6 && d.equals(ElementalDiscipline.ELEMENTAL_ATTUNEMENT)) {
					//By default, Elemental Attunement is known, but can be changed at level 6
					chosenDisciplines.add(ElementalDiscipline.ELEMENTAL_ATTUNEMENT);
					continue;
				}
				availableDisciplines.add(d);
			}
		}
		ElementalDiscipline[] availDisc = new ElementalDiscipline[availableDisciplines.size()];
		int i = 0;
		for (ElementalDiscipline d : availableDisciplines) {
			availDisc[i++] = d;
		}
		ElementalDiscipline[] promptResults =  MiscPrompts.openMultipleObjectChooserPrompt(
			availDisc, 
			"Elemental Disciplines", 
			level < 6 ? 1 : level < 11 ? 3 : 4,
			ElementalDiscipline.class
		);
		chosenDisciplines.addAll(Arrays.asList(promptResults));
		for (ElementalDiscipline d : chosenDisciplines) {
			switch (d) {
				case BREATH_OF_WINTER:
					InformationManager.addClassElement(new KiAction(
						6,
						"Breath of Winter",
						"You can spend 6 ki points to cast cone of cold."
					));
					break;
				case CLENCH_OF_THE_NORTH_WIND:
					InformationManager.addClassElement(new KiAction(
						3,
						"Clench of the North Wind",
						"You can spend 3 ki points to cast hold person."
					));
					break;
				case ELEMENTAL_ATTUNEMENT:
					InformationManager.addClassElement(new Feature(
						"Elemental Attunement",
						"You can use your action to briefly control elemental "+
						"forces nearby, causing one of the following effects of "+
						"your choice:\n"+
						"- Create a harmless, instantaneous sensory "+
						"effect related to air, earth, fire, or water, such as "+
						"a shower of sparks, a puff of wind, a spray of light mist, "+
						"or a gentle rumbling of stone.\n"+
						"- Instantaneously light or snuff out a candle, a torch, "+
						"or a small campfire.\n"+
						"- Chill or warm up to 1 pound of nonliving material for "+
						"up to 1 hour.\n"+
						"- Cause earth, fire, water, or mist that "+
						"can fit within a 1-foot cube to shape itself into a "+
						"crude form you designate for 1 minute."
					));
					break;
				case ETERNAL_MOUNTAIN_DEFENSE:
					InformationManager.addClassElement(new KiAction(
						5,
						"Eternal Mountain Defense",
						"You can spend 5 ki points to cast stoneskin, targeting yourself."
					));
					break;
				case FANGS_OF_THE_FIRE_SNAKE:
					InformationManager.addClassElement(new KiAction(
						1,
						"Fangs of the Fire Snake",
						"When you use the Attack action on your turn, you can "+
						"spend 1 ki point to cause tendrils of flame to stretch "+
						"out from your fists and feet. Your reach with your "+
						"unarmed strikes increases by 10 feet for that action, "+
						"as well as the rest of the turn. A hit with such an "+
						"attack deals fire damage instead of bludgeoning damage, "+
						"and if you spend 1 ki point when the attack hits, it "+
						"also deals an extra 1d1O fire damage."
					));
					break;
				case FIST_OF_FOUR_THUNDERS:
					InformationManager.addClassElement(new KiAction(
						2,
						"Fist of Four Thunders",
						"You can spend 2 ki points to cast thunderwave."
					));
					break;
				case FIST_OF_UNBROKEN_AIR:
					InformationManager.addClassElement(new KiAction(
						2,
						"Fist of Unbroken Air",
						"You can create a blast of compressed air that strikes "+
						"like a mighty fist. As an action, you can spend 2 ki "+
						"points and choose a creature within 30 feet of you. "+
						"That creature must make a Strength saving throw. "+
						"On a failed save, the creature takes 3d10 bludgeoning "+
						"damage, plus an extra 1d1O bludgeoning damage for each "+
						"additional ki point you spend, and you can push the "+
						"creature up to 20 feet away from you and knock it prone. "+
						"On a successful save, the creature takes half as much "+
						"damage, and you don't push it or knock it prone."
					));
					break;
				case FLAMES_OF_THE_PHOENIX:
					InformationManager.addClassElement(new KiAction(
						4,
						"Flames of the Phoenix",
						"You can spend 4 ki points to cast fireball."
					));
					break;
				case GONG_OF_THE_SUMMIT:
					InformationManager.addClassElement(new KiAction(
						3,
						"Gong of the Summit",
						"You can spend 3 ki points to cast shatter."
					));
					break;
				case MIST_STANCE:
					InformationManager.addClassElement(new KiAction(
						4,
						"Mist Stance",
						"You can spend 4 ki points to cast gaseous form, targeting yourself."
					));
					break;
				case RIDE_THE_WIND:
					InformationManager.addClassElement(new KiAction(
						4,
						"Ride the Wind",
						"You can spend 4 ki points to cast fly, targeting yourself."
					));
					break;
				case RIVER_OF_HUNGRY_FLAME:
					InformationManager.addClassElement(new KiAction(
						5,
						"River of Hungry Flame",
						"You can spend 5 ki points to cast wall of fire."
					));
					break;
				case RUSH_OF_THE_GALE_SPIRITS:
					InformationManager.addClassElement(new KiAction(
						2,
						"Rush of the Gale Spirits",
						"You can spend 2 ki points to cast gust of wind."
					));
					break;
				case SHAPE_THE_FLOWING_RIVER:
					InformationManager.addClassElement(new KiAction(
						1,
						"Shape of the Flowing River",
						"As an action, you can spend 1 ki point to choose an "+
						"area of ice or water no larger than 30 feet on a side "+
						"within 120 feet of you. You can change water to ice "+
						"within the area and vice versa, and you can reshape "+
						"ice in the area in any manner you choose. You can raise "+
						"or lower the ice's elevation, create or fill in a trench, "+
						"erect or flatten a wall, or form a pillar. The extent "+
						"of any such changes can't exceed half the area's largest "+
						"dimension. For example, if you affect a 30-foot square, "+
						"you can create a pillar up to 15 feet high, raise or "+
						"lower the square's elevation by up to 15 feet, dig a "+
						"trench up to 15 feet deep, and so on. You can't shape "+
						"the ice to trap or injure a creature in the area."
					));
					break;
				case SWEEPING_CINDER_STRIKE:
					InformationManager.addClassElement(new KiAction(
						2,
						"Sweeping Cinder Strike",
						"You can spend 2 ki points to cast burning hands."
					));
					break;
				case WATER_WHIP:
					InformationManager.addClassElement(new KiAction(
						2,
						"Water Whip",
						"You can spend 2 ki points as a bonus action to create "+
						"a whip of water that shoves and pulls a creature to "+
						"unbalance it. A creature that you can see that is "+
						"within 30 feet of you must make a Dexterity saving throw. "+
						"On a failed save, the creature takes 3d10 bludgeoning "+
						"damage, plus an extra 1d1O bludgeoning damage for each "+
						"additional ki point you spend, and you can either knock "+
						"it prone or pull it up to 25 feet closer to you. "+
						"On a successful save, the creature takes half as much "+
						"damage, and you don't pull it or knock it prone."
					));
					break;
				case WAVE_OF_ROLLING_EARTH:
					InformationManager.addClassElement(new KiAction(
						6,
						"Wave of Rolling Earth",
						"You can spend 6 ki points to cast wall of stone."
					));
					break;
			}
		}
	}
}
