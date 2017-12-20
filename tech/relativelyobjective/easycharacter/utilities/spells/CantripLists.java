package tech.relativelyobjective.easycharacter.utilities.spells;

import tech.relativelyobjective.easycharacter.characterelements.Spell;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class CantripLists {
	public enum Cantrip {
		Acid_Splash,
		Blade_Ward,
		Chill_Touch,
		Control_Flames,
		Create_Bonfire,
		Dancing_Lights,
		Druidcraft,
		Eldritch_Blast,
		Fire_Bolt,
		Friends,
		Frostbite,
		Guidance,
		Gust,
		Infestation,
		Light,
		Mage_Hand,
		Magic_Stone,
		Mending,
		Message,
		Minor_Illusion,
		Mold_Earth,
		Poison_Spray,
		Prestidigitation,
		Primal_Savagery,
		Produce_Flame,
		Ray_of_Frost,
		Resistance,
		Sacred_Flame,
		Shape_Water,
		Shillelagh,
		Shocking_Grasp,
		Spare_the_Dying,
		Thaumaturgy,
		Thorn_Whip,
		Thunderclap,
		Toll_the_Dead,
		True_Strike,
		Vicious_Mockery,
		Word_of_Radiance
	}
	public static final Cantrip[] BARD_CANTRIPS = {
		Cantrip.Blade_Ward,
		Cantrip.Dancing_Lights,
		Cantrip.Friends,
		Cantrip.Light,
		Cantrip.Mage_Hand,
		Cantrip.Mending,
		Cantrip.Message,
		Cantrip.Minor_Illusion,
		Cantrip.Prestidigitation,
		Cantrip.True_Strike,
		Cantrip.Vicious_Mockery
	};
	public static final Cantrip[] CLERIC_CANTRIPS = {
		Cantrip.Guidance,
		Cantrip.Light,
		Cantrip.Mending,
		Cantrip.Resistance,
		Cantrip.Sacred_Flame,
		Cantrip.Spare_the_Dying,
		Cantrip.Thaumaturgy
	};
	public static final Cantrip[] DRUID_CANTRIPS = {
		Cantrip.Druidcraft,
		Cantrip.Guidance,
		Cantrip.Mending,
		Cantrip.Poison_Spray,
		Cantrip.Produce_Flame,
		Cantrip.Resistance,
		Cantrip.Shillelagh,
		Cantrip.Thorn_Whip
	};
	public static final Cantrip[] SORCERER_CANTRIPS = {
		Cantrip.Acid_Splash,
		Cantrip.Blade_Ward,
		Cantrip.Chill_Touch,
		Cantrip.Dancing_Lights,
		Cantrip.Fire_Bolt,
		Cantrip.Friends,
		Cantrip.Light,
		Cantrip.Mage_Hand,
		Cantrip.Mending,
		Cantrip.Message,
		Cantrip.Minor_Illusion,
		Cantrip.Poison_Spray,
		Cantrip.Prestidigitation,
		Cantrip.Ray_of_Frost,
		Cantrip.Shocking_Grasp,
		Cantrip.True_Strike
	};
	public static final Cantrip[] WARLOCK_CANTRIPS = {
		Cantrip.Blade_Ward,
		Cantrip.Chill_Touch,
		Cantrip.Eldritch_Blast,
		Cantrip.Friends,
		Cantrip.Mage_Hand,
		Cantrip.Minor_Illusion,
		Cantrip.Poison_Spray,
		Cantrip.Prestidigitation,
		Cantrip.True_Strike
	};
	public static final Cantrip[] WIZARD_CANTRIPS = {
		Cantrip.Acid_Splash,
		Cantrip.Blade_Ward,
		Cantrip.Chill_Touch,
		Cantrip.Dancing_Lights,
		Cantrip.Fire_Bolt,
		Cantrip.Friends,
		Cantrip.Light,
		Cantrip.Mage_Hand,
		Cantrip.Mending,
		Cantrip.Message,
		Cantrip.Minor_Illusion,
		Cantrip.Poison_Spray,
		Cantrip.Prestidigitation,
		Cantrip.Ray_of_Frost,
		Cantrip.Shocking_Grasp,
		Cantrip.True_Strike
	};
	public static Spell getCantrip(Cantrip c) {
		switch (c) {
			case Acid_Splash:
				return getAcidSplash();
			case Blade_Ward:
				return getBladeWard();
			case Chill_Touch:
				return getChillTouch();
			case Control_Flames:
				return getControlFlames();
			case Create_Bonfire:
				return getCreateBonfire();
			case Dancing_Lights:
				return getDancingLights();
			case Druidcraft:
				return getDruidcraft();
			case Eldritch_Blast:
				return getEldritchBlast();
			case Fire_Bolt:
				return getFireBolt();
			case Friends:
				return getFriends();
			case Frostbite:
				return getFrostbite();
			case Guidance:
				return getGuidance();
			case Gust:
				return getGust();
			case Infestation:
				return getInfestation();
			case Light:
				return getLight();
			case Mage_Hand:
				return getMageHand();
			case Magic_Stone:
				return getMagicStone();
			case Mending:
				return getMending();
			case Message:
				return getMessage();
			case Minor_Illusion:
				return getMinorIllusion();
			case Mold_Earth:
				return getMoldEarth();
			case Poison_Spray:
				return getPoisonSpray();
			case Prestidigitation:
				return getPrestidigitation();
			case Primal_Savagery:
				return getPrimalSavagery();
			case Produce_Flame:
				return getProduceFlame();
			case Ray_of_Frost:
				return getRayOfFrost();
			case Resistance:
				return getResistance();
			case Sacred_Flame:
				return getSacredFlame();
			case Shape_Water:
				return getShapeWater();
			case Shillelagh:
				return getShillelagh();
			case Shocking_Grasp:
				return getShockingGrasp();
			case Spare_the_Dying:
				return getSpareTheDying();
			case Thaumaturgy:
				return getThaumaturgy();
			case Thorn_Whip:
				return getThornWhip();
			case Thunderclap:
				return getThunderclap();
			case Toll_the_Dead:
				return getTollTheDead();
			case True_Strike:
				return getTrueStrike();
			case Vicious_Mockery:
				return getViciousMockery();
			case Word_of_Radiance:
				return getWordOfRadiance();
			default:
				throw new UnsupportedOperationException(c+" is not a known cantrip");
		}
	}
	public static Spell getAcidSplash() {
		Spell returnMe = new Spell("Acid Splash", 0);
		returnMe.castingTime = "1 action";
		returnMe.school = Lists.MagicSchool.CONJURATION;
		returnMe.rangeArea = "60 feet";
		returnMe.verbal = returnMe.somatic = true;
		returnMe.ritual = returnMe.concentration = false;
		returnMe.duration = "Instantaneous";
		returnMe.description = 
			"You hurl a bubble of acid. Choose one creature within range, "+
			"or choose two creatures within range that are within 5 feet "+
			"of each other. A target must succeed on a Dexterity saving "+
			"throw or lake 1d6 acid damage.\n" +
			"This spell's damage increases by 1d6 when you reach "+
			"5th level (2d6), 11th level (3d6), and 17lh level (4d6).";
		return returnMe;
	}
	//TODO replace these with actual spells
	public static Spell getBladeWard() { return new Spell(); }
	public static Spell getChillTouch() { return new Spell(); }
	public static Spell getControlFlames() { return new Spell(); }
	public static Spell getCreateBonfire() { return new Spell(); }
	public static Spell getDancingLights() { return new Spell(); }
	public static Spell getDruidcraft() { return new Spell(); }
	public static Spell getEldritchBlast() { return new Spell(); }
	public static Spell getFireBolt() { return new Spell(); }
	public static Spell getFriends() { return new Spell(); }
	public static Spell getFrostbite() { return new Spell(); }
	public static Spell getGuidance() { return new Spell(); }
	public static Spell getGust() { return new Spell(); }
	public static Spell getInfestation() { return new Spell(); }
	public static Spell getLight() { return new Spell(); }
	public static Spell getMageHand() { return new Spell(); }
	public static Spell getMagicStone() { return new Spell(); }
	public static Spell getMending() { return new Spell(); }
	public static Spell getMessage() { return new Spell(); }
	public static Spell getMinorIllusion() { return new Spell(); }
	public static Spell getMoldEarth() { return new Spell(); }
	public static Spell getPoisonSpray() { return new Spell(); }
	public static Spell getPrestidigitation() { return new Spell(); }
	public static Spell getPrimalSavagery() { return new Spell(); }
	public static Spell getProduceFlame() { return new Spell(); }
	public static Spell getRayOfFrost() { return new Spell(); }
	public static Spell getResistance() { return new Spell(); }
	public static Spell getSacredFlame() { return new Spell(); }
	public static Spell getShapeWater() { return new Spell(); }
	public static Spell getShillelagh() { return new Spell(); }
	public static Spell getShockingGrasp() { return new Spell(); }
	public static Spell getSpareTheDying() { return new Spell(); }
	public static Spell getThaumaturgy() { return new Spell(); }
	public static Spell getThornWhip() { return new Spell(); }
	public static Spell getThunderclap() { return new Spell(); }
	public static Spell getTollTheDead() { return new Spell(); }
	public static Spell getTrueStrike() { return new Spell(); }
	public static Spell getViciousMockery() { return new Spell(); }
	public static Spell getWordOfRadiance() { return new Spell(); }
}
