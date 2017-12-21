package tech.relativelyobjective.easycharacter.utilities;

import tech.relativelyobjective.easycharacter.characterelements.Spell;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class AllSpells {
	public static Spell getSpell(SpellLists.SpellKey s) {
		switch (s) {
			case ACID_SPLASH: return getAcidSplash();
			case BLADE_WARD: return getBladeWard();
			case CHILL_TOUCH: return getChillTouch();
			case DANCING_LIGHTS: return getDancingLights();
			case DRUIDCRAFT: return getDruidcraft();
			case ELDRITCH_BLAST: return getEldritchBlast();
			case FIRE_BOLT: return getFireBolt();
			case FRIENDS: return getFriends();
			case GUIDANCE: return getGuidance();
			case LIGHT: return getLight();
			case MAGE_HAND: return getMageHand();
			case MENDING: return getMending();
			case MESSAGE: return getMessage();
			case MINOR_ILLUSION: return getMinorIllusion();
			case POISON_SPRAY: return getPoisonSpray();
			case PRESTIDIGITATION: return getPrestidigitation();
			case PRODUCE_FLAME: return getProduceFlame();
			case RAY_OF_FROST: return getRayofFrost();
			case RESISTANCE: return getResistance();
			case SACRED_FLAME: return getSacredFlame();
			case SHILLELAGH: return getShillelagh();
			case SHOCKING_GRASP: return getShockingGrasp();
			case SPARE_THE_DYING: return getSparetheDying();
			case THAUMATURGY: return getThaumaturgy();
			case THORN_WHIP: return getThornWhip();
			case TRUE_STRIKE: return getTrueStrike();
			case VICIOUS_MOCKERY: return getViciousMockery();
			case ALARM: return getAlarm();
			case ANIMAL_FRIENDSHIP: return getAnimalFriendship();
			case ARMOR_OF_AGATHYS: return getArmorofAgathys();
			case ARMS_OF_HADAR: return getArmsofHadar();
			case BANE: return getBane();
			case BLESS: return getBless();
			case BURNING_HANDS: return getBurningHands();
			case CHARM_PERSON: return getCharmPerson();
			case CHROMATIC_ORB: return getChromaticOrb();
			case COLOR_SPRAY: return getColorSpray();
			case COMMAND: return getCommand();
			case COMPELLED_DUEL: return getCompelledDuel();
			case COMPREHEND_LANGUAGES: return getComprehendLanguages();
			case CREATE_OR_DESTROY_WATER: return getCreateorDestroyWater();
			case CURE_WOUNDS: return getCureWounds();
			case DETECT_EVIL_AND_GOOD: return getDetectEvilandGood();
			case DETECT_MAGIC: return getDetectMagic();
			case DETECT_POISON_AND_DISEASE: return getDetectPoisonandDisease();
			case DISGUISE_SELF: return getDisguiseSelf();
			case DISSONANT_WHISPERS: return getDissonantWhispers();
			case DIVINE_FAVOR: return getDivineFavor();
			case ENSNARING_STRIKE: return getEnsnaringStrike();
			case ENTANGLE: return getEntangle();
			case EXPEDITIOUS_RETREAT: return getExpeditiousRetreat();
			case FAERIE_FIRE: return getFaerieFire();
			case FALSE_LIFE: return getFalseLife();
			case FEATHER_FALL: return getFeatherFall();
			case FIND_FAMILIAR: return getFindFamiliar();
			case FOG_CLOUD: return getFogCloud();
			case GOODBERRY: return getGoodberry();
			case GREASE: return getGrease();
			case GUIDING_BOLT: return getGuidingBolt();
			case HAIL_OF_THORNS: return getHailofThorns();
			case HEALING_WORD: return getHealingWord();
			case HELLISH_REBUKE: return getHellishRebuke();
			case HEROISM: return getHeroism();
			case HEX: return getHex();
			case HUNTERS_MARK: return getHuntersMark();
			case IDENTIFY: return getIdentify();
			case ILLUSORY_SCRIPT: return getIllusoryScript();
			case INFLICT_WOUNDS: return getInflictWounds();
			case JUMP: return getJump();
			case LONGSTRIDER: return getLongstrider();
			case MAGE_ARMOR: return getMageArmor();
			case MAGIC_MISSILE: return getMagicMissile();
			case PROTECTION_FROM_EVIL_AND_GOOD: return getProtectionfromEvilandGood();
			case PURIFY_FOOD_AND_DRINK: return getPurifyFoodandDrink();
			case RAY_OF_SICKNESS: return getRayofSickness();
			case SANCTUARY: return getSanctuary();
			case SEARING_SMITE: return getSearingSmite();
			case SHIELD: return getShield();
			case SHIELD_OF_FAITH: return getShieldofFaith();
			case SILENT_IMAGE: return getSilentImage();
			case SLEEP: return getSleep();
			case SPEAK_WITH_ANIMALS: return getSpeakwithAnimals();
			case TASHAS_HIDEOUS_LAUGHTER: return getTashasHideousLaughter();
			case TENSERS_FLOATING_DISK: return getTensersFloatingDisk();
			case THUNDEROUS_SMITE: return getThunderousSmite();
			case THUNDERWAVE: return getThunderwave();
			case UNSEEN_SERVANT: return getUnseenServant();
			case WITCH_BOLT: return getWitchBolt();
			case WRATHFUL_SMITE: return getWrathfulSmite();
			case AID: return getAid();
			case ALTER_SELF: return getAlterSelf();
			case ANIMAL_MESSENGER: return getAnimalMessenger();
			case ARCANE_LOCK: return getArcaneLock();
			case AUGURY: return getAugury();
			case BARKSKIN: return getBarkskin();
			case BEAST_SENSE: return getBeastSense();
			case BLINDNESS_DEAFNESS: return getBlindnessDeafness();
			case BLUR: return getBlur();
			case BRANDING_SMITE: return getBrandingSmite();
			case CALM_EMOTIONS: return getCalmEmotions();
			case CLOUD_OF_DAGGERS: return getCloudofDaggers();
			case CONTINUAL_FLAME: return getContinualFlame();
			case CORDON_OF_ARROWS: return getCordonofArrows();
			case CROWN_OF_MADNESS: return getCrownofMadness();
			case DARKNESS: return getDarkness();
			case DARKVISION: return getDarkvision();
			case DETECT_THOUGHTS: return getDetectThoughts();
			case ENHANCE_ABILITY: return getEnhanceAbility();
			case ENLARGE_REDUCE: return getEnlargeReduce();
			case ENTHRALL: return getEnthrall();
			case FIND_STEED: return getFindSteed();
			case FIND_TRAPS: return getFindTraps();
			case FLAME_BLADE: return getFlameBlade();
			case FLAMING_SPHERE: return getFlamingSphere();
			case GENTLE_REPOSE: return getGentleRepose();
			case GUST_OF_WIND: return getGustofWind();
			case HEAT_METAL: return getHeatMetal();
			case HOLD_PERSON: return getHoldPerson();
			case INVISIBILITY: return getInvisibility();
			case KNOCK: return getKnock();
			case LESSER_RESTORATION: return getLesserRestoration();
			case LEVITATE: return getLevitate();
			case LOCATE_ANIMALS_OR_PLANTS: return getLocateAnimalsorPlants();
			case LOCATE_OBJECT: return getLocateObject();
			case MAGIC_MOUTH: return getMagicMouth();
			case MAGIC_WEAPON: return getMagicWeapon();
			case MELFS_ACID_ARROW: return getMelfsAcidArrow();
			case MIRROR_IMAGE: return getMirrorImage();
			case MISTY_STEP: return getMistyStep();
			case MOONBEAM: return getMoonbeam();
			case NYSTULS_MAGIC_AURA: return getNystulsMagicAura();
			case PASS_WITHOUT_TRACE: return getPasswithoutTrace();
			case PHANTASMAL_FORCE: return getPhantasmalForce();
			case PRAYER_OF_HEALING: return getPrayerofHealing();
			case PROTECTION_FROM_POISON: return getProtectionfromPoison();
			case RAY_OF_ENFEEBLEMENT: return getRayofEnfeeblement();
			case ROPE_TRICK: return getRopeTrick();
			case SCORCHING_RAY: return getScorchingRay();
			case SEE_INVISIBILITY: return getSeeInvisibility();
			case SHATTER: return getShatter();
			case SILENCE: return getSilence();
			case SPIDER_CLIMB: return getSpiderClimb();
			case SPIKE_GROWTH: return getSpikeGrowth();
			case SPIRITUAL_WEAPON: return getSpiritualWeapon();
			case SUGGESTION: return getSuggestion();
			case WARDING_BOND: return getWardingBond();
			case WEB: return getWeb();
			case ZONE_OF_TRUTH: return getZoneofTruth();
			case ANIMATE_DEAD: return getAnimateDead();
			case AURA_OF_VITALITY: return getAuraofVitality();
			case BEACON_OF_HOPE: return getBeaconofHope();
			case BESTOW_CURSE: return getBestowCurse();
			case BLINDING_SMITE: return getBlindingSmite();
			case BLINK: return getBlink();
			case CALL_LIGHTNING: return getCallLightning();
			case CLAIRVOYANCE: return getClairvoyance();
			case CONJURE_ANIMALS: return getConjureAnimals();
			case CONJURE_BARRAGE: return getConjureBarrage();
			case COUNTERSPELL: return getCounterspell();
			case CREATE_FOOD_AND_WATER: return getCreateFoodandWater();
			case CRUSADERS_MANTLE: return getCrusadersMantle();
			case DAYLIGHT: return getDaylight();
			case DISPEL_MAGIC: return getDispelMagic();
			case ELEMENTAL_WEAPON: return getElementalWeapon();
			case FEAR: return getFear();
			case FEIGN_DEATH: return getFeignDeath();
			case FIREBALL: return getFireball();
			case FLY: return getFly();
			case GASEOUS_FORM: return getGaseousForm();
			case GLYPH_OF_WARDING: return getGlyphofWarding();
			case HASTE: return getHaste();
			case HUNGER_OF_HADAR: return getHungerofHadar();
			case HYPNOTIC_PATTERN: return getHypnoticPattern();
			case LEOMUNDS_TINY_HUT: return getLeomundsTinyHut();
			case LIGHTNING_ARROW: return getLightningArrow();
			case LIGHTNING_BOLT: return getLightningBolt();
			case MAGIC_CIRCLE: return getMagicCircle();
			case MAJOR_IMAGE: return getMajorImage();
			case MASS_HEALING_WORD: return getMassHealingWord();
			case MELD_INTO_STONE: return getMeldintoStone();
			case NONDETECTION: return getNondetection();
			case PHANTOM_STEED: return getPhantomSteed();
			case PLANT_GROWTH: return getPlantGrowth();
			case PROTECTION_FROM_ENERGY: return getProtectionfromEnergy();
			case REMOVE_CURSE: return getRemoveCurse();
			case REVIVIFY: return getRevivify();
			case SENDING: return getSending();
			case SLEET_STORM: return getSleetStorm();
			case SLOW: return getSlow();
			case SPEAK_WITH_DEAD: return getSpeakwithDead();
			case SPEAK_WITH_PLANTS: return getSpeakwithPlants();
			case SPIRIT_GUARDIANS: return getSpiritGuardians();
			case STINKING_CLOUD: return getStinkingCloud();
			case TONGUES: return getTongues();
			case VAMPIRIC_TOUCH: return getVampiricTouch();
			case WATER_BREATHING: return getWaterBreathing();
			case WATER_WALK: return getWaterWalk();
			case WIND_WALL: return getWindWall();
			case ARCANE_EYE: return getArcaneEye();
			case AURA_OF_LIFE: return getAuraofLife();
			case AURA_OF_PURITY: return getAuraofPurity();
			case BANISHMENT: return getBanishment();
			case BLIGHT: return getBlight();
			case COMPULSION: return getCompulsion();
			case CONFUSION: return getConfusion();
			case CONJURE_MINOR_ELEMENTALS: return getConjureMinorElementals();
			case CONJURE_WOODLAND_BEINGS: return getConjureWoodlandBeings();
			case CONTROL_WATER: return getControlWater();
			case DEATH_WARD: return getDeathWard();
			case DIMENSION_DOOR: return getDimensionDoor();
			case DIVINATION: return getDivination();
			case DOMINATE_BEAST: return getDominateBeast();
			case EVARDS_BLACK_TENTACLES: return getEvardsBlackTentacles();
			case FABRICATE: return getFabricate();
			case FIRE_SHIELD: return getFireShield();
			case FREEDOM_OF_MOVEMENT: return getFreedomofMovement();
			case GIANT_INSECT: return getGiantInsect();
			case GRASPING_VINE: return getGraspingVine();
			case GREATER_INVISIBILITY: return getGreaterInvisibility();
			case GUARDIAN_OF_FAITH: return getGuardianofFaith();
			case HALLUCINATORY_TERRAIN: return getHallucinatoryTerrain();
			case ICE_STORM: return getIceStorm();
			case LEOMUNDS_SECRET_CHEST: return getLeomundsSecretChest();
			case LOCATE_CREATURE: return getLocateCreature();
			case MORDENKAINENS_FAITHFUL_HOUND: return getMordenkainensFaithfulHound();
			case MORDENKAINENS_PRIVATE_SANCTUM: return getMordenkainensPrivateSanctum();
			case OTILUKES_RESILIENT_SPHERE: return getOtilukesResilientSphere();
			case PHANTASMAL_KILLER: return getPhantasmalKiller();
			case POLYMORPH: return getPolymorph();
			case STAGGERING_SMITE: return getStaggeringSmite();
			case STONE_SHAPE: return getStoneShape();
			case STONESKIN: return getStoneskin();
			case WALL_OF_FIRE: return getWallofFire();
			case ANIMATE_OBJECTS: return getAnimateObjects();
			case ANTILIFE_SHELL: return getAntilifeShell();
			case AWAKEN: return getAwaken();
			case BANISHING_SMITE: return getBanishingSmite();
			case BIGBYS_HAND: return getBigbysHand();
			case CIRCLE_OF_POWER: return getCircleofPower();
			case CLOUDKILL: return getCloudkill();
			case COMMUNE: return getCommune();
			case COMMUNE_WITH_NATURE: return getCommunewithNature();
			case CONE_OF_COLD: return getConeofCold();
			case CONJURE_ELEMENTAL: return getConjureElemental();
			case CONJURE_VOLLEY: return getConjureVolley();
			case CONTACT_OTHER_PLANE: return getContactOtherPlane();
			case CONTAGION: return getContagion();
			case CREATION: return getCreation();
			case DESTRUCTIVE_WAVE: return getDestructiveWave();
			case DISPEL_EVIL_AND_GOOD: return getDispelEvilandGood();
			case DOMINATE_PERSON: return getDominatePerson();
			case DREAM: return getDream();
			case FLAME_STRIKE: return getFlameStrike();
			case GEAS: return getGeas();
			case GREATER_RESTORATION: return getGreaterRestoration();
			case HALLOW: return getHallow();
			case HOLD_MONSTER: return getHoldMonster();
			case INSECT_PLAGUE: return getInsectPlague();
			case LEGEND_LORE: return getLegendLore();
			case MASS_CURE_WOUNDS: return getMassCureWounds();
			case MISLEAD: return getMislead();
			case MODIFY_MEMORY: return getModifyMemory();
			case PASSWALL: return getPasswall();
			case PLANAR_BINDING: return getPlanarBinding();
			case RAISE_DEAD: return getRaiseDead();
			case RARYS_TELEPATHIC_BOND: return getRarysTelepathicBond();
			case REINCARNATE: return getReincarnate();
			case SCRYING: return getScrying();
			case SEEMING: return getSeeming();
			case SWIFT_QUIVER: return getSwiftQuiver();
			case TELEKINESIS: return getTelekinesis();
			case TELEPORTATION_CIRCLE: return getTeleportationCircle();
			case TREE_STRIDE: return getTreeStride();
			case WALL_OF_FORCE: return getWallofForce();
			case WALL_OF_STONE: return getWallofStone();
			case ARCANE_GATE: return getArcaneGate();
			case BLADE_BARRIER: return getBladeBarrier();
			case CHAIN_LIGHTNING: return getChainLightning();
			case CIRCLE_OF_DEATH: return getCircleofDeath();
			case CONJURE_FEY: return getConjureFey();
			case CONTINGENCY: return getContingency();
			case CREATE_UNDEAD: return getCreateUndead();
			case DISINTEGRATE: return getDisintegrate();
			case DRAWMIJS_INSTANT_SUMMONS: return getDrawmijsInstantSummons();
			case EYEBITE: return getEyebite();
			case FIND_THE_PATH: return getFindthePath();
			case FLESH_TO_STONE: return getFleshtoStone();
			case FORBIDDANCE: return getForbiddance();
			case GLOBE_OF_INVULNERABILITY: return getGlobeofInvulnerability();
			case GUARDS_AND_WARDS: return getGuardsandWards();
			case HARM: return getHarm();
			case HEAL: return getHeal();
			case HEROES_FEAST: return getHeroesFeast();
			case MAGIC_JAR: return getMagicJar();
			case MASS_SUGGESTION: return getMassSuggestion();
			case MOVE_EARTH: return getMoveEarth();
			case OTILUKES_FREEZING_SPHERE: return getOtilukesFreezingSphere();
			case OTTOS_IRRESISTIBLE_DANCE: return getOttosIrresistibleDance();
			case PLANAR_ALLY: return getPlanarAlly();
			case PROGRAMMED_ILLUSION: return getProgrammedIllusion();
			case SUNBEAM: return getSunbeam();
			case TRANSPORT_VIA_PLANTS: return getTransportviaPlants();
			case TRUE_SEEING: return getTrueSeeing();
			case WALL_OF_ICE: return getWallofIce();
			case WALL_OF_THORNS: return getWallofThorns();
			case WIND_WALK: return getWindWalk();
			case WORD_OF_RECALL: return getWordofRecall();
			case CONJURE_CELESTIAL: return getConjureCelestial();
			case DELAYED_BLAST_FIREBALL: return getDelayedBlastFireball();
			case DIVINE_WORD: return getDivineWord();
			case ETHEREALNESS: return getEtherealness();
			case FINGER_OF_DEATH: return getFingerofDeath();
			case FIRE_STORM: return getFireStorm();
			case FORCECAGE: return getForcecage();
			case MIRAGE_ARCANE: return getMirageArcane();
			case MORDENKAINENS_MAGNIFICENT_MANSION: return getMordenkainensMagnificentMansion();
			case MORDENKAINENS_SWORD: return getMordenkainensSword();
			case PLANE_SHIFT: return getPlaneShift();
			case PRISMATIC_SPRAY: return getPrismaticSpray();
			case PROJECT_IMAGE: return getProjectImage();
			case REGENERATE: return getRegenerate();
			case RESURRECTION: return getResurrection();
			case REVERSE_GRAVITY: return getReverseGravity();
			case SEQUESTER: return getSequester();
			case SIMULACRUM: return getSimulacrum();
			case SYMBOL: return getSymbol();
			case TELEPORT: return getTeleport();
			case ANIMAL_SHAPES: return getAnimalShapes();
			case ANTIMAGIC_FIELD: return getAntimagicField();
			case ANTIPATHY_SYMPATHY: return getAntipathySympathy();
			case CLONE: return getClone();
			case CONTROL_WEATHER: return getControlWeather();
			case DEMIPLANE: return getDemiplane();
			case DOMINATE_MONSTER: return getDominateMonster();
			case EARTHQUAKE: return getEarthquake();
			case FEEBLEMIND: return getFeeblemind();
			case GLIBNESS: return getGlibness();
			case HOLY_AURA: return getHolyAura();
			case INCENDIARY_CLOUD: return getIncendiaryCloud();
			case MAZE: return getMaze();
			case MIND_BLANK: return getMindBlank();
			case POWER_WORD_STUN: return getPowerWordStun();
			case SUNBURST: return getSunburst();
			case TELEPATHY: return getTelepathy();
			case TSUNAMI: return getTsunami();
			case ASTRAL_PROJECTION: return getAstralProjection();
			case FORESIGHT: return getForesight();
			case GATE: return getGate();
			case IMPRISONMENT: return getImprisonment();
			case MASS_HEAL: return getMassHeal();
			case METEOR_SWARM: return getMeteorSwarm();
			case POWER_WORD_HEAL: return getPowerWordHeal();
			case POWER_WORD_KILL: return getPowerWordKill();
			case PRISMATIC_WALL: return getPrismaticWall();
			case SHAPECHANGE: return getShapechange();
			case STORM_OF_VENGEANCE: return getStormofVengeance();
			case TIME_STOP: return getTimeStop();
			case TRUE_POLYMORPH: return getTruePolymorph();
			case TRUE_RESURRECTION: return getTrueResurrection();
			case WEIRD: return getWeird();
			case WISH: return getWish();
			default: throw new UnsupportedOperationException(s+" is not a known spell");
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
			"5th level (2d6), 11th level (3d6), and 17th level (4d6).";
		return returnMe;
	}
	public static Spell getBladeWard() {
		Spell returnMe = new Spell("Blade Ward",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 round";
  		returnMe.description = "You extend your hand and trace a sigil of warding "
		+ "in the air. Until the end of your next turn, you have resistance "
		+ "against bludgeoning, piercing, and slashing damage dealt by weapon "
		+ "attacks. ";
  		return returnMe;
	}
	public static Spell getChillTouch() {
		Spell returnMe = new Spell("Chill Touch",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "120 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 round";
  		returnMe.description = "You create a ghostly, skeletal hand in the space "
		+ "of a creature within range. Make a ranged spell attack against the "
		+ "creature to assail it with the chill of the grave. On a hit, the "
		+ "target takes 1d8 necrotic damage, and it can't regain hit points "
		+ "until the start of your next turn. Until then, the hand clings to the "
		+ "target.\n"
		+ "If you hit an undead target, it also has disadvantage on attack rolls "
		+ "against you until the end of your next turn.\n"
		+ "This spell's damage increases by 1d8 when you reach 5th level (2d8), "
		+ "11th level (3d8), and 17th level (4d8).";
  		return returnMe;
	}
	public static Spell getDancingLights() {
		Spell returnMe = new Spell("Dancing Lights",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "120 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a bit of phosphorus, or wychwood, or a glowworm";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "You create up to four torch sized lights within "
		+ "range, making them appear as torches, lanterns, or glowing orbs that "
		+ "hover in the air for the duration. You can also combine the four "
		+ "lights into one glowing vaguely humanoid form of Medium size. "
		+ "Whichever form you choose, each light sheds dim light in a 10 foot "
		+ "radius.\n"
		+ "As a bonus action on your turn, you can move the lights up to 60 feet "
		+ "to a new spot within range. A light must be within 20 feet of another "
		+ "light created by this spell, and a light winks out if it exceeds the "
		+ "spell's range.";
  		return returnMe;
	}
	public static Spell getDruidcraft() {
		Spell returnMe = new Spell("Druidcraft",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "Whispering to the spirits of nature, you create "
		+ "one of the following effects within range:\n" +
		"-You create a tiny, harmless sensory effect that predicts what the "
		+ "weather will be at your location for the next 24 hours. The effect "
		+ "might manifest as a golden orb for clear skies, a cloud for rain, "
		+ "falling snowflakes for snow, and so on. This effect persists for 1 round.\n" +
		"-You instantly make a flower blossom, a seed pod open, or a leaf bud "
		+ "bloom.\n" +
		"-You create an instantaneous, harmless sensory effect, such as falling "
		+ "leaves, a puff of wind, the sound of a small animal, or the faint "
		+ "odor of skunk. The effect must fit in a 5-foot cube.\n" +
		"-You instantly light or snuff out a candle, a torch, or a small campfire.";
  		return returnMe;
	}
	public static Spell getEldritchBlast() {
		Spell returnMe = new Spell("Eldritch Blast",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "120 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "A beam of crackling energy streaks toward a "
		+ "creature within range. Make a ranged spell attack against the target. "
		+ "On a hit, the target takes 1d10 force damage.\n" +
		"The spell creates more than one beam when you reach higher levels: "
		+ "two beams at 5th level, three beams at 11th level, and four beams at "
		+ "17th level. You can direct the beams at the same target or at "
		+ "different ones. Make a separate attack roll for each beam.";
  		return returnMe;
	}
	public static Spell getFireBolt() {
		Spell returnMe = new Spell("Fire Bolt",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "120 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You hurl a mote of fire at a creature or object "
		+ "within range. Make a ranged spell attack against the target. "
		+ "On a hit, the target takes 1d10 fire damage. A flammable object hit "
		+ "by this spell ignites if it isn't being worn or carried.\n" +
		"This spell's damage increases by 1d10 when you reach 5th level (2d10), "
		+ "11th level (3d10), and 17th level (4d10).";
  		return returnMe;
	}
	public static Spell getFriends() {
		Spell returnMe = new Spell("Friends",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a small amount of makeup applied to the "
		+ "face as this spell is cast";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "For the duration, you have advantage on all "
		+ "Charisma checks directed at one creature of your choice that isn't "
		+ "hostile toward you. When the spell ends, the creature realizes that "
		+ "you used magic to influence its mood and becomes hostile toward you. "
		+ "A creature prone to violence might attack you. Another creature might "
		+ "seek retribution in other ways (at the DM's discretion), "
		+ "depending on the nature of your interaction with it.";
  		return returnMe;
	}
	public static Spell getGuidance() {
		Spell returnMe = new Spell("Guidance",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "You touch one willing creature. Once before the "
		+ "spell ends, the target can roll a d4 and add the number rolled to "
		+ "one ability check of its choice. It can roll the die before or after "
		+ "making the ability check. The spell then ends.";
  		return returnMe;
	}
	public static Spell getLight() {
		Spell returnMe = new Spell("Light",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "a firefly or phosphorescent moss";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 hour";
  		returnMe.description = "You touch one object that is no larger than "
		+ "10 feet in any dimension. Until the spell ends, the object sheds "
		+ "bright light in a 20 foot radius and dim light for an additional "
		+ "20 feet. The light can be colored as you like. Completely covering "
		+ "the object with something opaque blocks the light. The spell ends if "
		+ "you cast it again or dismiss it as an action.\n" +
		"If you target an object held or worn by a hostile creature, that creature "
		+ "must succeed on a Dexterity saving throw to avoid the spell.";
  		return returnMe;
	}
	public static Spell getMageHand() {
		Spell returnMe = new Spell("Mage Hand",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 minute";
  		returnMe.description = "A spectral, floating hand appears at a point you "
		+ "choose within range. The hand lasts for the duration or until you "
		+ "dismiss it as an action. The hand vanishes if it is ever more than "
		+ "30 feet away from you or if you cast this spell again.\n" +
		"You can use your action to control the hand. You can use the hand to "
		+ "manipulate an object, open an unlocked door or container, stow or "
		+ "retrieve an item from an open container, or pour the contents out "
		+ "of a vial. You can move the hand up to 30 feet each time you use it.\n" +
		"The hand can't attack, activate magic items, or carry more than 10 pounds.";
  		return returnMe;
	}
	public static Spell getMending() {
		Spell returnMe = new Spell("Mending",0);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "two lodestones";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "This spell repairs a single break or tear in an "
		+ "object you touch, such as a broken chain link, two halves of a broken "
		+ "key, a torn cloak, or a leaking wineskin. As long as the break or "
		+ "tear is no larger than 1 foot in any dimension, you mend it, leaving "
		+ "no trace of the former damage.\n" +
		"This spell can physically repair a magic item or construct, but the "
		+ "spell can't restore magic to such an object.";
  		return returnMe;
	}
	public static Spell getMessage() {
		Spell returnMe = new Spell("Message",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "120 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a short piece of copper wire";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 round";
  		returnMe.description = "You point your finger toward a creature within "
		+ "range and whisper a message. The target (and only the target) hears "
		+ "the message and can reply in a whisper that only you can hear.\n" +
		"You can cast this spell through solid objects if you are familiar with "
		+ "the target and know it is beyond the barrier. Magical silence, 1 foot "
		+ "of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet "
		+ "of wood blocks the spell. The spell doesn't have to follow a "
		+ "straight line and can travel freely around corners or through "
		+ "openings.";
  		return returnMe;
	}
	public static Spell getMinorIllusion() {
		Spell returnMe = new Spell("Minor Illusion",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a bit of fleece";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 minute";
  		returnMe.description = "You create a sound or an image of an object "
		+ "within range that lasts for the duration. The illusion also ends if "
		+ "you dismiss it as an action or cast this spell again.\n" +
		"If you create a sound, its volume can range from a whisper to a scream. "
		+ "It can be your voice, someone else's voice, a lion's roar, a beating "
		+ "of drums, or any other sound you choose. The sound continues unabated "
		+ "throughout the duration, or you can make discrete sounds at different "
		+ "times before the spell ends.\n" +
		"If you create an image of an object--such as a chair, muddy footprints, "
		+ "or a small chest--it must be no larger than a 5-foot cube. The image "
		+ "can't create sound, light, smell, or any other sensory effect. "
		+ "Physical interaction with the image reveals it to be an illusion, "
		+ "because things can pass through it.\n" +
		"If a creature uses its action to examine the sound or image, the "
		+ "creature can determine that it is an illusion with a successful "
		+ "Intelligence (Investigation) check against your spell save DC. "
		+ "If a creature discerns the illusion for what it is, the illusion "
		+ "becomes faint to the creature.";
  		return returnMe;
	}
	public static Spell getPoisonSpray() {
		Spell returnMe = new Spell("Poison Spray",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "10 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You extend your hand toward a creature you can "
		+ "see within range and project a puff of noxious gas from your palm. "
		+ "The creature must succeed on a Constitution saving throw or take "
		+ "1d12 poison damage.\n" +
		"This spell's damage increases by 1d12 when you reach 5th level (2d12), "
		+ "11th level (3d12), and 17th level (4d12).";
  		return returnMe;
	}
	public static Spell getPrestidigitation() {
		Spell returnMe = new Spell("Prestidigitation",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "10 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 hour";
  		returnMe.description = "This spell is a minor magical trick that novice "
		+ "spellcasters use for practice. You create one of the following magical "
		+ "effects within range:\n" +
		"-You create an instantaneous, harmless sensory effect, such as a shower "
		+ "of sparks, a puff of wind, faint musical notes, or an odd odor.\n" +
		"-You instantaneously light or snuff out a candle, a torch, or a small "
		+ "campfire.\n" +
		"-You instantaneously clean or soil an object no larger than 1 cubic foot.\n" +
		"-You chill, warm, or flavor up to 1 cubic foot of nonliving material "
		+ "for 1 hour.\n" +
		"-You make a color, a small mark, or a symbol appear on an object or a "
		+ "surface for 1 hour.\n" +
		"-You create a nonmagical trinket or an illusory image that can fit in "
		+ "your hand and that lasts until the end of your next turn.\n" +
		"If you cast this spell multiple times, you can have up to three of its "
		+ "non-instantaneous effects active at a time, and you can dismiss such "
		+ "an effect as an action.";
  		return returnMe;
	}
	public static Spell getProduceFlame() {
		Spell returnMe = new Spell("Produce Flame",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "10 minutes";
  		returnMe.description = "A flickering flame appears in your hand. "
		+ "The flame remains there for the duration and harms neither you nor "
		+ "your equipment. The flame sheds bright light in a 10-foot radius and "
		+ "dim light for an additional 10 feet. The spell ends if you dismiss "
		+ "it as an action or if you cast it again.\n" +
		"You can also attack with the flame, although doing so ends the spell. "
		+ "When you cast this spell, or as an action on a later turn, you can "
		+ "hurl the flame at a creature within 30 feet of you. Make a ranged "
		+ "spell attack. On a hit, the target takes 1d8 fire damage.\n" +
		"This spell's damage increases by 1d8 when you reach 5th level (2d8), "
		+ "11th level (3d8), and 17th level (4d8).";
  		return returnMe;
	}
	public static Spell getRayofFrost() {
		Spell returnMe = new Spell("Ray of Frost",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "60 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "A frigid beam of blue-white light streaks "
		+ "toward a creature within range. Make a ranged spell attack against "
		+ "the target. On a hit, it takes 1d8 cold damage, and its speed is "
		+ "reduced by 10 feet until the start of your next turn.\n" +
		"The spell's damage increases by 1d8 when you reach 5th level (2d8), "
		+ "11th level (3d8), and 17th level (4d8).";
  		return returnMe;
	}
	public static Spell getResistance() {
		Spell returnMe = new Spell("Resistance",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a miniature cloak";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 Minute";
  		returnMe.description = "You touch one willing creature. Once before the "
		+ "spell ends, the target can roll a d4 and add the number rolled to "
		+ "one saving throw of its choice. It can roll the die before or after "
		+ "making the saving throw. The spell then ends.";
  		return returnMe;
	}
	public static Spell getSacredFlame() {
		Spell returnMe = new Spell("Sacred Flame",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "60 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "Flame-like radiance descends on a creature that "
		+ "you can see within range. The target must succeed on a Dexterity "
		+ "saving throw or take 1d8 radiant damage. The target gains no benefit "
		+ "from cover for this saving throw.\n" +
		"The spell's damage increases by 1d8 when you reach 5th level (2d8), "
		+ "11th level (3d8), and 17th level (4d8).";
  		return returnMe;
	}
	public static Spell getShillelagh() {
		Spell returnMe = new Spell("Shillelagh",0);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "mistletoe, a shamrock leaf, and a club or quarterstaff";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 minute";
  		returnMe.description = "The wood of a club or quarterstaff you are "
		+ "holding is imbued with nature's power. For the duration, you can use "
		+ "your spellcasting ability instead of Strength for the attack and "
		+ "damage rolls of melee attacks using that weapon, and the weapon's "
		+ "damage die becomes a d8. The weapon also becomes magical, if it isn't "
		+ "already. The spell ends if you cast it again or if you let go of the weapon.";
  		return returnMe;
	}
	public static Spell getShockingGrasp() {
		Spell returnMe = new Spell("Shocking Grasp",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "Lightning springs from your hand to deliver a "
		+ "shock to a creature you try to touch. Make a melee spell attack "
		+ "against the target. You have advantage on the attack roll if the "
		+ "target is wearing armor made of metal. On a hit, the target takes "
		+ "1d8 lightning damage, and it can't take reactions until the start "
		+ "of its next turn.\n" +
		"The spell's damage increases by 1d8 when you reach 5th level (2d8), "
		+ "11th level (3d8), and 17th level (4d8).";
  		return returnMe;
	}
	public static Spell getSparetheDying() {
		Spell returnMe = new Spell("Spare the Dying",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You touch a living creature that has 0 hit points. "
		+ "The creature becomes stable. This spell has no effect on undead or "
		+ "constructs.";
  		return returnMe;
	}
	public static Spell getThaumaturgy() {
		Spell returnMe = new Spell("Thaumaturgy",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 minute";
  		returnMe.description = "You manifest a minor wonder, a sign of "
		+ "supernatural power, within range. You create one of the following "
		+ "magical effects within range:\n" +
		"-Your voice booms up to three times as loud as normal for 1 minute.\n" +
		"-You cause flames to flicker, brighten, dim, or change color for 1 minute.\n" +
		"-You cause harmless tremors in the ground for 1 minute.\n" +
		"-You create an instantaneous sound that originates from a point of "
		+ "your choice within range, such as a rumble of thunder, the cry of a "
		+ "raven, or ominous whispers.\n" +
		"-You instantaneously cause an unlocked door or window to fly open or "
		+ "slam shut.\n" +
		"-You alter the appearance of your eyes for 1 minute.\n" +
		"If you cast this spell multiple times, you can have up to three of its "
		+ "1-minute effects active at a time, and you can dismiss such an "
		+ "effect as an action.";
  		return returnMe;
	}
	public static Spell getThornWhip() {
		Spell returnMe = new Spell("Thorn Whip",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "the stem of a plant with thorns";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You create a long, vine-like whip covered in "
		+ "thorns that lashes out at your command toward a creature in range. "
		+ "Make a melee spell attack against the target. If the attack hits, "
		+ "the creature takes 1d6 piercing damage, and if the creature is "
		+ "Large or smaller, you pull the creature up to 10 feet closer to you.\n" +
		"This spell’s damage increases by 1d6 when you reach 5th level (2d6), "
		+ "11th level (3d6), and 17th level (4d6). ";
  		return returnMe;
	}
	public static Spell getTrueStrike() {
		Spell returnMe = new Spell("True Strike",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 round";
  		returnMe.description = "You extend your hand and point a finger at a "
		+ "target in range. Your magic grants you a brief insight into the "
		+ "target's defenses. On your next turn, you gain advantage on your "
		+ "first attack roll against the target, provided that this "
		+ "spell hasn't ended.";
  		return returnMe;
	}
	public static Spell getViciousMockery() {
		Spell returnMe = new Spell("Vicious Mockery",0);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "60 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You unleash a string of insults laced with "
		+ "subtle enchantments at a creature you can see within range. "
		+ "If the target can hear you (though it need not understand you), "
		+ "it must succeed on a Wisdom saving throw or take 1d4 psychic damage "
		+ "and have disadvantage on the next attack roll it makes before the "
		+ "end of its next turn.\n" +
		"This spell's damage increases by 1d4 when you reach 5th level (2d4), "
		+ "11th level (3d4), and 17th level (4d4).";
  		return returnMe;
	}
	public static Spell getAlarm() {
		Spell returnMe = new Spell("Alarm",1);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a tiny bell and a piece of fine silver wire";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "8 hours";
  		returnMe.description = "You set an alarm against unwanted intrusion. "
		+ "Choose a door, a window, or an area within range that is no larger "
		+ "than a 20-foot cube. Until the spell ends, an alarm alerts you "
		+ "whenever a Tiny or larger creature touches or enters the warded area. "
		+ "When you cast the spell, you can designate creatures that won’t set "
		+ "off the alarm. You also choose whether the alarm is mental or audible. "
		+ "A mental alarm alerts you with a ping in your mind if you are within "
		+ "1 mile of the warded area. This ping awakens you if you are sleeping. "
		+ "An audible alarm produces the sound of a hand bell for 10 seconds "
		+ "within 60 feet.";
  		return returnMe;
	}
	public static Spell getAnimalFriendship() {
		Spell returnMe = new Spell("Animal Friendship",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a morsel of food";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "24 hours";
  		returnMe.description = "This spell lets you convince a beast that you "
		+ "mean it no harm. Choose a beast that you can see within range. "
		+ "It must see and hear you. If the beast’s Intelligence is 4 or higher, "
		+ "the spell fails. Otherwise, the beast must succeed on a Wisdom saving "
		+ "throw or be charmed by you for the spell’s duration. If you or one of "
		+ "your companions harms the target, the spell ends.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, you can affect one additional beast for each "
		+ "slot level above 1st.";
  		return returnMe;
	}
	public static Spell getArmorofAgathys() {
		Spell returnMe = new Spell("Armor of Agathys",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a cup of water";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 hour";
  		returnMe.description = "A protective magical force surrounds you, "
		+ "manifesting as a spectral frost that covers you and your gear. "
		+ "You gain 5 temporary hit points for the duration. If a creature hits "
		+ "you with a melee attack while you have these hit points, the creature "
		+ "takes 5 cold damage.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, both the temporary hit points and the cold damage "
		+ "increase by 5 for each slot level above 1st.";
  		return returnMe;
	}
	public static Spell getArmsofHadar() {
		Spell returnMe = new Spell("Arms of Hadar",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You invoke the power of Hadar, the Dark Hunger.\n" +
		"Tendrils of dark energy erupt from you and batter all creatures within "
		+ "10 feet of you. Each creature in that area must make a Strength "
		+ "saving throw. On a failed save, a target takes 2d6 necrotic damage "
		+ "and can’t take reactions until its next turn. On a successful save, "
		+ "the creature takes half damage, but suffers no other effect.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, the damage increases by 1d6 for each slot level "
		+ "above 1st.";
  		return returnMe;
	}
	public static Spell getBane() {
		Spell returnMe = new Spell("Bane",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a drop of blood";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "Up to three creatures of your choice that you "
		+ "can see within range must make Charisma saving throws. Whenever a "
		+ "target that fails this saving throw makes an attack roll or a "
		+ "saving throw before the spell ends, the target must roll a d4 and "
		+ "subtract the number rolled from the attack roll or saving throw.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, you can target one additional creature for "
		+ "each slot level above 1st.";
  		return returnMe;
	}
	public static Spell getBless() {
		Spell returnMe = new Spell("Bless",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a sprinkling of holy water";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "You bless up to three creatures of your choice "
		+ "within range. Whenever a target makes an attack roll or a saving throw "
		+ "before the spell ends, the target can roll a d4 and add the number "
		+ "rolled to the attack roll or saving throw.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, you can target one additional creature for each "
		+ "slot level above 1st.";
  		return returnMe;
	}
	public static Spell getBurningHands() {
		Spell returnMe = new Spell("Burning Hands",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "Self (15-foot cone)";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "As you hold your hands with thumbs touching and "
		+ "fingers spread, a thin sheet of flames shoots forth from your "
		+ "outstretched fingertips. Each creature in a 15-foot cone must make a "
		+ "Dexterity saving throw. A creature takes 3d6 fire damage on a failed save, "
		+ "or half as much damage on a successful one. \n" +
		"The fire ignites any flammable objects in the area that aren’t being "
		+ "worn or carried. \n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, the damage increases by 1d6 for each slot level "
		+ "above 1st.";
  		return returnMe;
	}
	public static Spell getCharmPerson() {
		Spell returnMe = new Spell("Charm Person",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 hour";
  		returnMe.description = "You attempt to charm a humanoid you can see "
		+ "within range. It must make a Wisdom saving throw, and does so with "
		+ "advantage if you or your companions are fighting it. If it fails it "
		+ "is charmed by you until the spell ends or until you or your companions "
		+ "do something harmful to it. The charmed creature regards you as a "
		+ "friendly acquaintance. When the spell ends it knows it has been charmed.\n" +
		"At higher levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, you can target one additional creature for each "
		+ "slot level above 1st.They must be within 30ft of each other when you "
		+ "target them.";
  		return returnMe;
	}
	public static Spell getChromaticOrb() {
		Spell returnMe = new Spell("Chromatic Orb",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "90 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a diamond worth at least 50 gp";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You hurl a 4-inch-diameter sphere of energy at "
		+ "a creature that you can see within range. You choose acid, cold, fire, "
		+ "lightning, poison, or thunder for the type of orb you create, and "
		+ "then make a ranged spell attack against the target. If the attack hits, "
		+ "the creature takes 3d8 damage of the type you chose.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, the damage increases by 1d8 for each slot level "
		+ "above 1st.";
  		return returnMe;
	}
	public static Spell getColorSpray() {
		Spell returnMe = new Spell("Color Spray",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "Self (15-foot cone)";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a pinch of powder or sand that is colored red, yellow, and blue";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 Round";
  		returnMe.description = "A dazzling array of flashing, colored light "
		+ "springs from your hand. Roll 6d10; the total is how many hit points "
		+ "of creatures this spell can affect. Creatures in a 15-foot cone "
		+ "originating from you are affected in ascending order of their "
		+ "current hit points (ignoring unconscious creatures and creatures "
		+ "that can't see).\n" +
		"Starting with the creature that has the lowest current hit points, "
		+ "each creature affected by this spell is blinded until the spell ends. "
		+ "Subtract each creature's hit points from the total before moving on "
		+ "to the creature with the next lowest hit points. A creature's "
		+ "hit points must be equal to or less than the remaining total for "
		+ "that creature to be affected.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, roll an additional 2d10 for each slot level above 1st.";
  		return returnMe;
	}
	public static Spell getCommand() {
		Spell returnMe = new Spell("Command",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "60 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 round";
  		returnMe.description = "You speak a one-word command to a creature you "
		+ "can see within range. The target must succeed on a Wisdom saving throw "
		+ "or follow the command on its next turn. The spell has no effect if "
		+ "the target is undead, if it doesn’t understand your language, or if "
		+ "your command is directly harmful to it.\n" +
		"Some typical commands and their effects follow. You might issue a "
		+ "command other than one described here. If you do so, the DM determines "
		+ "how the target behaves. If the target can’t follow your command, the "
		+ "spell ends.\n" +
		"<strong>Approach.</strong> The target moves toward you by the shortest "
		+ "and most direct route, ending its turn if it moves within 5 feet of you.\n" +
		"<strong>Drop.</strong> The target drops whatever it is holding and then "
		+ "ends its turn.\n" +
		"<strong>Flee.</strong> The target spends its turn moving away from you "
		+ "by the fastest available means.\n" +
		"<strong>Grovel.</strong> The target falls prone and then ends its turn.\n" +
		"<strong>Halt.</strong> The target doesn’t move and takes no actions. "
		+ "A flying creature stays aloft, provided that it is able to do so. "
		+ "If it must move to stay aloft, it flies the minimum distance needed "
		+ "to remain in the air.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, you can affect one additional creature for each "
		+ "slot level above 1st. The creatures must be within 30 feet of each "
		+ "other when you target them.";
  		return returnMe;
	}
	public static Spell getCompelledDuel() {
		Spell returnMe = new Spell("Compelled Duel",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "You attempt to compel a creature into a duel. "
		+ "One creature that you can see within range must make a Wisdom "
		+ "saving throw. On a failed save, the creature is drawn to you, "
		+ "compelled by your divine demand. For the duration, it has disadvantage "
		+ "on attack rolls against creatures other than you, and must make a "
		+ "Wisdom saving throw each time it attempts to move to a space that is "
		+ "more than 30 feet away from you; if it succeeds on this saving throw, "
		+ "this spell doesn't restrict the target's movement for that turn\n" +
		"The spell ends if you attack any other creature, if you cast a spell "
		+ "that targets a hostile creature other than the target, if a creature "
		+ "friendly to you damages the target or casts a harmful spell on it, "
		+ "or if you end your turn more than 30 feet away from the target.";
  		return returnMe;
	}
	public static Spell getComprehendLanguages() {
		Spell returnMe = new Spell("Comprehend Languages",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a pinch of soot and salt";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "1 hour";
  		returnMe.description = "For the duration, you understand the literal "
		+ "meaning of any spoken language that you hear. You also understand "
		+ "any written language that you see, but you must be touching the "
		+ "surface on which the words are written. It takes about 1 minute to "
		+ "read one page of text.\n" +
		"This spell doesn’t decode secret messages in a text or a glyph, such "
		+ "as an arcane sigil, that isn’t part of a written language.";
  		return returnMe;
	}
	public static Spell getCreateorDestroyWater() {
		Spell returnMe = new Spell("Create or Destroy Water",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "30 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a drop of water if creating water or a few grains of sand if destroying it";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You either create or destroy water.\n" +
		"<strong>Create Water.</strong> You create up to 10 gallons of clean water "
		+ "within range in an open container. Alternatively, the water falls as rain in "
		+ "a 30-foot cube within range, extinguishing exposed flames in the area.\n" +
		"<strong>Destroy Water.</strong> You destroy up to 10 gallons of water "
		+ "in an open container within range. Alternatively, you destroy fog in "
		+ "a 30-foot cube within range.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, you create or destroy 10 additional gallons of water, "
		+ "or the size of the cube increases by 5 feet, for each slot level above 1st.";
  		return returnMe;
	}
	public static Spell getCureWounds() {
		Spell returnMe = new Spell("Cure Wounds",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "A creature you touch regains a number of hit "
		+ "points equal to 1d8 + your spellcasting ability modifier. This spell "
		+ "has no effect on undead or constructs.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, the healing increases by 1d8 for each slot "
		+ "level above 1st.";
  		return returnMe;
	}
	public static Spell getDetectEvilandGood() {
		Spell returnMe = new Spell("Detect Evil and Good",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "10 minutes";
  		returnMe.description = "For the duration, you know if there is an aberration, "
		+ "celestial, elemental, fey, fiend, or undead within 30 feet of you, "
		+ "as well as where the creature is located. Similarly, you know if there "
		+ "is a place or object within 30 feet of you that has been magically "
		+ "consecrated or desecrated.\n" +
		"The spell can penetrate most barriers, but it is blocked by 1 foot of "
		+ "stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood "
		+ "or dirt.";
  		return returnMe;
	}
	public static Spell getDetectMagic() {
		Spell returnMe = new Spell("Detect Magic",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = true;
  		returnMe.duration = "10 minutes";
  		returnMe.description = "For the duration, you sense the presence of "
		+ "magic within 30 feet of you. If you sense magic in this way, you can "
		+ "use your action to see a faint aura around any visible creature or "
		+ "object in the area that bears magic, and you learn its "
		+ "school of magic, if any.\n" +
		"The spell can penetrate most barriers, but it is blocked by 1 foot "
		+ "of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet "
		+ "of wood or dirt. ";
  		return returnMe;
	}
	public static Spell getDetectPoisonandDisease() {
		Spell returnMe = new Spell("Detect Poison and Disease",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a yew leaf";
  		returnMe.ritual = true;
  		returnMe.concentration = true;
  		returnMe.duration = "10 minutes";
  		returnMe.description = "For the duration, you can sense the presence "
		+ "and location of poisons, poisonous creatures, and diseases within "
		+ "30 feet of you. You also identify the kind of poison, poisonous "
		+ "creature, or disease in each case.\n" +
		"The spell can penetrate most barriers, but it is blocked by 1 foot "
		+ "of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet "
		+ "of wood or dirt.";
  		return returnMe;
	}
	public static Spell getDisguiseSelf() {
		Spell returnMe = new Spell("Disguise Self",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 hour";
  		returnMe.description = "You make yourself—including your clothing, "
		+ "armor, weapons, and other belongings on your person—look different "
		+ "until the spell ends or until you use your action to dismiss it. "
		+ "You can seem 1 foot shorter or taller and can appear thin, fat, or "
		+ "in between. You can't change your body type, so you must adopt a form "
		+ "that has the same basic arrangement of limbs. Otherwise, the extent "
		+ "of the illusion is up to you.\n" +
		"The changes wrought by this spell fail to hold up to physical inspection. "
		+ "For example, if you use this spell to add a hat to your outfit, "
		+ "objects pass through the hat, and anyone who touches it would feel "
		+ "nothing or would feel your head and hair. If you use this spell to "
		+ "appear thinner that you are, the hand of someone who reaches out to "
		+ "touch you would bump into you while it was seemingly still in mid air.\n" +
		"To discern that you are disguised, a creature can use its action to inspect "
		+ "your appearance and must succeed on an Intelligence (Investigation) "
		+ "check against your spell save DC.";
  		return returnMe;
	}
	public static Spell getDissonantWhispers() {
		Spell returnMe = new Spell("Dissonant Whispers",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "60 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You whisper a discordant melody that only one "
		+ "creature of your choice within range can hear, wracking it with "
		+ "terrible pain. The target must make a Wisdom saving throw. "
		+ "On a failed save, it takes 3d6 psychic damage and must immediately "
		+ "use its reaction, if available, to move as far as its speed allows "
		+ "away from you. The creature doesn’t move into obviously dangerous "
		+ "ground, such as a fire or a pit. On a successful save, the target "
		+ "takes half as much damage and doesn’t have to move away. A deafened "
		+ "creature automatically succeeds on the save.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, the damage increases by 1d6 for each slot level "
		+ "above 1st.";
  		return returnMe;
	}
	public static Spell getDivineFavor() {
		Spell returnMe = new Spell("Divine Favor",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "Your prayer empowers you with divine radiance. "
		+ "Until the spell ends, your weapon attacks deal an extra "
		+ "1d4 radiant damage on a hit";
  		return returnMe;
	}
	public static Spell getEnsnaringStrike() {
		Spell returnMe = new Spell("Ensnaring Strike",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "The next time you hit a creature with a weapon "
		+ "attack before this spell ends, a writhing mass of thorny vines appears "
		+ "at the point of impact, and the target must succeed on a Strength "
		+ "saving throw or be restrained by the magical vines until the spell ends. "
		+ "A Large or larger creature has advantage on this saving throw. "
		+ "If the target succeeds on the save, the vines shrivel away.\n" +
		"While restrained by this spell, the target takes 1d6 piercing damage "
		+ "at the start of each of its turns. A creature restrained by the vines "
		+ "or one that can touch the creature can use its action to make a "
		+ "Strength check against your spell save DC. On a success, "
		+ "the target is freed.\n" +
		"At Higher Levels. If you cast this spell using a spell slot of "
		+ "2nd level or higher, the damage increases by 1d6 for each slot "
		+ "level above 1st.";
  		return returnMe;
	}
	public static Spell getEntangle() {
		Spell returnMe = new Spell("Entangle",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "90 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "Grasping weeds and vines sprout from the ground "
		+ "in a 20-foot square starting from a point within range. "
		+ "For the duration, these plants turn the ground in the area into "
		+ "difficult terrain.\n" +
		"A creature in the area when you cast the spell must succeed on a "
		+ "Strength saving throw or be restrained by the entangling plants "
		+ "until the spell ends. A creature restrained by the plants can use "
		+ "its action to make a Strength check against your spell save DC. "
		+ "On a success, it frees itself.\n" +
		"When the spell ends, the conjured plants wilt away.";
  		return returnMe;
	}
	public static Spell getExpeditiousRetreat() {
		Spell returnMe = new Spell("Expeditious Retreat",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "10 minutes";
  		returnMe.description = "This spell allows you to move at an incredible pace. "
		+ "When you cast this spell, and then as a bonus action on each of your "
		+ "turns until the spell ends, you can take the Dash action.";
  		return returnMe;
	}
	public static Spell getFaerieFire() {
		Spell returnMe = new Spell("Faerie Fire",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "60 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 minute";
  		returnMe.description = "Each object in a 20-foot cube within range is "
		+ "outlined by blue, green, or violet light (your choice). Any creature "
		+ "in the area when the spell is cast is also outlined in light if it "
		+ "fails a Dexterity saving throw. For the duration, objects and "
		+ "affected creatures shed dim light in a 10-foot radius. Any attack "
		+ "roll against an affected creature or object has advantage if the "
		+ "attacker can see it, and the affected creature or object can't "
		+ "benefit from being invisible.";
  		return returnMe;
	}
	public static Spell getFalseLife() {
		Spell returnMe = new Spell("False Life",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "Self";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a small amount of alcohol or distilled spirits";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 hour";
  		returnMe.description = "Bolstering your self with a necromantic "
		+ "facsimile of life, you gain 1d4+4 temporary hitpoints for the duration.\n" +
		"At Higher Levels: When you cast this spell using a spell slot of "
		+ "2nd level or higher, you gain 5 additional temporary hit points for "
		+ "each slot level above 1st.";
  		return returnMe;
	}
	public static Spell getFeatherFall() {
		Spell returnMe = new Spell("Feather Fall",1);
  		returnMe.castingTime = "1 reaction";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "60 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "a small feather or piece of down";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "1 minute";
  		returnMe.description = "Choose up to five falling creatures within range. "
		+ "A falling creature's rate of descent slows to 60 feet per round until "
		+ "the spell ends. If the creature lands before the spell ends, it takes "
		+ "no falling damage and can land on its feet, and the spell ends for "
		+ "that creature.";
  		return returnMe;
	}
	public static Spell getFindFamiliar() {
		Spell returnMe = new Spell("Find Familiar",1);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "10 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "10 gp worth of charcoal, incense, and "
		+ "herbs that must be consumed by fire in a brass brazier";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "You gain the service of a familiar, a spirit "
		+ "that takes an animal form you choose: bat, cat, crab, frog (toad), "
		+ "hawk, lizard, octopus, owl, poisonous snake, fish (quipper), rat, "
		+ "raven, sea horse, spider, or weasel. Appearing in an unoccupied "
		+ "space within range, the familiar has the statistics of the chosen "
		+ "form, though it is a celestial, fey, or fiend (your choice) instead "
		+ "of a beast.\n" +
		"Your familiar acts independently of you, but it always obeys your "
		+ "commands. In combat, it rolls its own initiative and acts on its own "
		+ "turn. A familiar can’t attack, but it can take other actions as normal.\n" +
		"When the familiar drops to 0 hit points, it disappears, leaving behind "
		+ "no physical form. It reappears after you cast this spell again.\n" +
		"While your familiar is within 100 feet of you, you can communicate with "
		+ "it telepathically. Additionally, as an action, you can see through "
		+ "your familiar’s eyes and hear what it hears until the start of your "
		+ "next turn, gaining the benefits of any special senses that the "
		+ "familiar has. During this time, you are deaf and blind with regard "
		+ "to your own senses.\n" +
		"As an action, you can temporarily dismiss your familiar. It disappears "
		+ "into a pocket dimension where it awaits your summons. Alternatively, "
		+ "you can dismiss it forever. As an action while it is temporarily "
		+ "dismissed, you can cause it to reappear in any unoccupied space within "
		+ "30 feet of you.\n" +
		"You can’t have more than one familiar at a time. If you cast this "
		+ "spell while you already have a familiar, you instead cause it to "
		+ "adopt a new form. Choose one of the forms from the above list. "
		+ "Your familiar transforms into the chosen creature.\n" +
		"Finally, when you cast a spell with a range of touch, your familiar "
		+ "can deliver the spell as if it had cast the spell. Your familiar "
		+ "must be within 100 feet of you, and it must use its reaction to "
		+ "deliver the spell when you cast it. If the spell requires an attack "
		+ "roll, you use your attack modifier for the roll.";
  		return returnMe;
	}
	public static Spell getFogCloud() {
		Spell returnMe = new Spell("Fog Cloud",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "120 feet";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "1 hour";
  		returnMe.description = "You create a 20-foot-radius of fog centered on "
		+ "a point within range. The sphere spreads around corners, and its "
		+ "area is heavily obscured. It lasts for the duration or until a wind "
		+ "of moderate or greater speed (at least 10 miles per hour) disperses it.\n" +
		"At Higher Levels. When you cast this spell using a spell slot of "
		+ "2nd level or higher, the radius of the fog increases by 20 feet for "
		+ "each slot level above 1st.";
  		return returnMe;
	}
	public static Spell getGoodberry() {
		Spell returnMe = new Spell("Goodberry",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "Touch";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "a sprig of mistletoe";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "Instantaneous";
  		returnMe.description = "Up to ten berries appear in your hand and are "
		+ "infused with magic for the duration. A creature can use its action "
		+ "to eat one berry. Eating a berry restores 1 hit point, and the berry "
		+ "provides enough nourishment to sustain a creature for one day.\n" +
		"The berries lose their potency if they have not been consumed within "
		+ "24 hours of the casting of this spell.  ";
  		return returnMe;
	}
	public static Spell getGrease() {Spell returnMe = new Spell("Grease",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGuidingBolt() {Spell returnMe = new Spell("Guiding Bolt",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHailofThorns() {Spell returnMe = new Spell("Hail of Thorns",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHealingWord() {Spell returnMe = new Spell("Healing Word",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHellishRebuke() {Spell returnMe = new Spell("Hellish Rebuke",1);
  		returnMe.castingTime = "1 reaction";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHeroism() {Spell returnMe = new Spell("Heroism",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHex() {Spell returnMe = new Spell("Hex",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHuntersMark() {Spell returnMe = new Spell("Hunter's Mark",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getIdentify() {Spell returnMe = new Spell("Identify",1);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getIllusoryScript() {Spell returnMe = new Spell("Illusory Script",1);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getInflictWounds() {Spell returnMe = new Spell("Inflict Wounds",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getJump() {Spell returnMe = new Spell("Jump",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLongstrider() {Spell returnMe = new Spell("Longstrider",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMageArmor() {Spell returnMe = new Spell("Mage Armor",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMagicMissile() {Spell returnMe = new Spell("Magic Missile",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getProtectionfromEvilandGood() {Spell returnMe = new Spell("Protection from Evil and Good",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPurifyFoodandDrink() {Spell returnMe = new Spell("Purify Food and Drink",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getRayofSickness() {Spell returnMe = new Spell("Ray of Sickness",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSanctuary() {Spell returnMe = new Spell("Sanctuary",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSearingSmite() {Spell returnMe = new Spell("Searing Smite",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getShield() {Spell returnMe = new Spell("Shield",1);
  		returnMe.castingTime = "1 reaction";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getShieldofFaith() {Spell returnMe = new Spell("Shield of Faith",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSilentImage() {Spell returnMe = new Spell("Silent Image",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSleep() {Spell returnMe = new Spell("Sleep",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSpeakwithAnimals() {Spell returnMe = new Spell("Speak with Animals",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTashasHideousLaughter() {Spell returnMe = new Spell("Tasha's Hideous Laughter",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTensersFloatingDisk() {Spell returnMe = new Spell("Tenser's Floating Disk",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getThunderousSmite() {Spell returnMe = new Spell("Thunderous Smite",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getThunderwave() {Spell returnMe = new Spell("Thunderwave",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getUnseenServant() {Spell returnMe = new Spell("Unseen Servant",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWitchBolt() {Spell returnMe = new Spell("Witch Bolt",1);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWrathfulSmite() {Spell returnMe = new Spell("Wrathful Smite",1);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAid() {Spell returnMe = new Spell("Aid",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAlterSelf() {Spell returnMe = new Spell("Alter Self",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAnimalMessenger() {Spell returnMe = new Spell("Animal Messenger",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getArcaneLock() {Spell returnMe = new Spell("Arcane Lock",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAugury() {Spell returnMe = new Spell("Augury",2);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBarkskin() {Spell returnMe = new Spell("Barkskin",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBeastSense() {Spell returnMe = new Spell("Beast Sense",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBlindnessDeafness() {Spell returnMe = new Spell("Blindness/Deafness",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBlur() {Spell returnMe = new Spell("Blur",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBrandingSmite() {Spell returnMe = new Spell("Branding Smite",2);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCalmEmotions() {Spell returnMe = new Spell("Calm Emotions",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCloudofDaggers() {Spell returnMe = new Spell("Cloud of Daggers",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getContinualFlame() {Spell returnMe = new Spell("Continual Flame",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCordonofArrows() {Spell returnMe = new Spell("Cordon of Arrows",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCrownofMadness() {Spell returnMe = new Spell("Crown of Madness",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDarkness() {Spell returnMe = new Spell("Darkness",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDarkvision() {Spell returnMe = new Spell("Darkvision",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDetectThoughts() {Spell returnMe = new Spell("Detect Thoughts",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getEnhanceAbility() {Spell returnMe = new Spell("Enhance Ability",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getEnlargeReduce() {Spell returnMe = new Spell("Enlarge/Reduce",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getEnthrall() {Spell returnMe = new Spell("Enthrall",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFindSteed() {Spell returnMe = new Spell("Find Steed",2);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFindTraps() {Spell returnMe = new Spell("Find Traps",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFlameBlade() {Spell returnMe = new Spell("Flame Blade",2);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFlamingSphere() {Spell returnMe = new Spell("Flaming Sphere",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGentleRepose() {Spell returnMe = new Spell("Gentle Repose",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGustofWind() {Spell returnMe = new Spell("Gust of Wind",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHeatMetal() {Spell returnMe = new Spell("Heat Metal",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHoldPerson() {Spell returnMe = new Spell("Hold Person",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getInvisibility() {Spell returnMe = new Spell("Invisibility",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getKnock() {Spell returnMe = new Spell("Knock",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLesserRestoration() {Spell returnMe = new Spell("Lesser Restoration",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLevitate() {Spell returnMe = new Spell("Levitate",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLocateAnimalsorPlants() {Spell returnMe = new Spell("Locate Animals or Plants",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLocateObject() {Spell returnMe = new Spell("Locate Object",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMagicMouth() {Spell returnMe = new Spell("Magic Mouth",2);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMagicWeapon() {Spell returnMe = new Spell("Magic Weapon",2);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMelfsAcidArrow() {Spell returnMe = new Spell("Melf's Acid Arrow",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMirrorImage() {Spell returnMe = new Spell("Mirror Image",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMistyStep() {Spell returnMe = new Spell("Misty Step",2);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMoonbeam() {Spell returnMe = new Spell("Moonbeam",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getNystulsMagicAura() {Spell returnMe = new Spell("Nystul's Magic Aura",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPasswithoutTrace() {Spell returnMe = new Spell("Pass without Trace",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPhantasmalForce() {Spell returnMe = new Spell("Phantasmal Force",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPrayerofHealing() {Spell returnMe = new Spell("Prayer of Healing",2);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getProtectionfromPoison() {Spell returnMe = new Spell("Protection from Poison",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getRayofEnfeeblement() {Spell returnMe = new Spell("Ray of Enfeeblement",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getRopeTrick() {Spell returnMe = new Spell("Rope Trick",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getScorchingRay() {Spell returnMe = new Spell("Scorching Ray",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSeeInvisibility() {Spell returnMe = new Spell("See Invisibility",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getShatter() {Spell returnMe = new Spell("Shatter",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSilence() {Spell returnMe = new Spell("Silence",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSpiderClimb() {Spell returnMe = new Spell("Spider Climb",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSpikeGrowth() {Spell returnMe = new Spell("Spike Growth",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSpiritualWeapon() {Spell returnMe = new Spell("Spiritual Weapon",2);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSuggestion() {Spell returnMe = new Spell("Suggestion",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWardingBond() {Spell returnMe = new Spell("Warding Bond",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWeb() {Spell returnMe = new Spell("Web",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getZoneofTruth() {Spell returnMe = new Spell("Zone of Truth",2);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAnimateDead() {Spell returnMe = new Spell("Animate Dead",3);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAuraofVitality() {Spell returnMe = new Spell("Aura of Vitality",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBeaconofHope() {Spell returnMe = new Spell("Beacon of Hope",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBestowCurse() {Spell returnMe = new Spell("Bestow Curse",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBlindingSmite() {Spell returnMe = new Spell("Blinding Smite",3);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBlink() {Spell returnMe = new Spell("Blink",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCallLightning() {Spell returnMe = new Spell("Call Lightning",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getClairvoyance() {Spell returnMe = new Spell("Clairvoyance",3);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConjureAnimals() {Spell returnMe = new Spell("Conjure Animals",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConjureBarrage() {Spell returnMe = new Spell("Conjure Barrage",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCounterspell() {Spell returnMe = new Spell("Counterspell",3);
  		returnMe.castingTime = "1 reaction";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCreateFoodandWater() {Spell returnMe = new Spell("Create Food and Water",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCrusadersMantle() {Spell returnMe = new Spell("Crusader's Mantle",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDaylight() {Spell returnMe = new Spell("Daylight",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDispelMagic() {Spell returnMe = new Spell("Dispel Magic",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getElementalWeapon() {Spell returnMe = new Spell("Elemental Weapon",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFear() {Spell returnMe = new Spell("Fear",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFeignDeath() {Spell returnMe = new Spell("Feign Death",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFireball() {Spell returnMe = new Spell("Fireball",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFly() {Spell returnMe = new Spell("Fly",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGaseousForm() {Spell returnMe = new Spell("Gaseous Form",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGlyphofWarding() {Spell returnMe = new Spell("Glyph of Warding",3);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHaste() {Spell returnMe = new Spell("Haste",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHungerofHadar() {Spell returnMe = new Spell("Hunger of Hadar",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHypnoticPattern() {Spell returnMe = new Spell("Hypnotic Pattern",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLeomundsTinyHut() {Spell returnMe = new Spell("Leomund's Tiny Hut",3);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLightningArrow() {Spell returnMe = new Spell("Lightning Arrow",3);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLightningBolt() {Spell returnMe = new Spell("Lightning Bolt",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMagicCircle() {Spell returnMe = new Spell("Magic Circle",3);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMajorImage() {Spell returnMe = new Spell("Major Image",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMassHealingWord() {Spell returnMe = new Spell("Mass Healing Word",3);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMeldintoStone() {Spell returnMe = new Spell("Meld into Stone",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getNondetection() {Spell returnMe = new Spell("Nondetection",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPhantomSteed() {Spell returnMe = new Spell("Phantom Steed",3);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPlantGrowth() {Spell returnMe = new Spell("Plant Growth",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getProtectionfromEnergy() {Spell returnMe = new Spell("Protection from Energy",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getRemoveCurse() {Spell returnMe = new Spell("Remove Curse",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getRevivify() {Spell returnMe = new Spell("Revivify",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSending() {Spell returnMe = new Spell("Sending",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSleetStorm() {Spell returnMe = new Spell("Sleet Storm",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSlow() {Spell returnMe = new Spell("Slow",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSpeakwithDead() {Spell returnMe = new Spell("Speak with Dead",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSpeakwithPlants() {Spell returnMe = new Spell("Speak with Plants",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSpiritGuardians() {Spell returnMe = new Spell("Spirit Guardians",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getStinkingCloud() {Spell returnMe = new Spell("Stinking Cloud",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTongues() {Spell returnMe = new Spell("Tongues",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getVampiricTouch() {Spell returnMe = new Spell("Vampiric Touch",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWaterBreathing() {Spell returnMe = new Spell("Water Breathing",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWaterWalk() {Spell returnMe = new Spell("Water Walk",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWindWall() {Spell returnMe = new Spell("Wind Wall",3);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getArcaneEye() {Spell returnMe = new Spell("Arcane Eye",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAuraofLife() {Spell returnMe = new Spell("Aura of Life",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAuraofPurity() {Spell returnMe = new Spell("Aura of Purity",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBanishment() {Spell returnMe = new Spell("Banishment",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBlight() {Spell returnMe = new Spell("Blight",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCompulsion() {Spell returnMe = new Spell("Compulsion",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConfusion() {Spell returnMe = new Spell("Confusion",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConjureMinorElementals() {Spell returnMe = new Spell("Conjure Minor Elementals",4);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConjureWoodlandBeings() {Spell returnMe = new Spell("Conjure Woodland Beings",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getControlWater() {Spell returnMe = new Spell("Control Water",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDeathWard() {Spell returnMe = new Spell("Death Ward",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDimensionDoor() {Spell returnMe = new Spell("Dimension Door",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDivination() {Spell returnMe = new Spell("Divination",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDominateBeast() {Spell returnMe = new Spell("Dominate Beast",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getEvardsBlackTentacles() {Spell returnMe = new Spell("Evard's Black Tentacles",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFabricate() {Spell returnMe = new Spell("Fabricate",4);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFireShield() {Spell returnMe = new Spell("Fire Shield",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFreedomofMovement() {Spell returnMe = new Spell("Freedom of Movement",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGiantInsect() {Spell returnMe = new Spell("Giant Insect",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGraspingVine() {Spell returnMe = new Spell("Grasping Vine",4);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGreaterInvisibility() {Spell returnMe = new Spell("Greater Invisibility",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGuardianofFaith() {Spell returnMe = new Spell("Guardian of Faith",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHallucinatoryTerrain() {Spell returnMe = new Spell("Hallucinatory Terrain",4);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getIceStorm() {Spell returnMe = new Spell("Ice Storm",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLeomundsSecretChest() {Spell returnMe = new Spell("Leomund's Secret Chest",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLocateCreature() {Spell returnMe = new Spell("Locate Creature",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMordenkainensFaithfulHound() {Spell returnMe = new Spell("Mordenkainen's Faithful Hound",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMordenkainensPrivateSanctum() {Spell returnMe = new Spell("Mordenkainen's Private Sanctum",4);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getOtilukesResilientSphere() {Spell returnMe = new Spell("Otiluke's Resilient Sphere",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPhantasmalKiller() {Spell returnMe = new Spell("Phantasmal Killer",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPolymorph() {Spell returnMe = new Spell("Polymorph",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getStaggeringSmite() {Spell returnMe = new Spell("Staggering Smite",4);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getStoneShape() {Spell returnMe = new Spell("Stone Shape",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getStoneskin() {Spell returnMe = new Spell("Stoneskin",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWallofFire() {Spell returnMe = new Spell("Wall of Fire",4);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAnimateObjects() {Spell returnMe = new Spell("Animate Objects",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAntilifeShell() {Spell returnMe = new Spell("Antilife Shell",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAwaken() {Spell returnMe = new Spell("Awaken",5);
  		returnMe.castingTime = "8 hours";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBanishingSmite() {Spell returnMe = new Spell("Banishing Smite",5);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBigbysHand() {Spell returnMe = new Spell("Bigby's Hand",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCircleofPower() {Spell returnMe = new Spell("Circle of Power",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCloudkill() {Spell returnMe = new Spell("Cloudkill",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCommune() {Spell returnMe = new Spell("Commune",5);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCommunewithNature() {Spell returnMe = new Spell("Commune with Nature",5);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConeofCold() {Spell returnMe = new Spell("Cone of Cold",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConjureElemental() {Spell returnMe = new Spell("Conjure Elemental",5);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConjureVolley() {Spell returnMe = new Spell("Conjure Volley",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getContactOtherPlane() {Spell returnMe = new Spell("Contact Other Plane",5);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getContagion() {Spell returnMe = new Spell("Contagion",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCreation() {Spell returnMe = new Spell("Creation",5);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDestructiveWave() {Spell returnMe = new Spell("Destructive Wave",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDispelEvilandGood() {Spell returnMe = new Spell("Dispel Evil and Good",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDominatePerson() {Spell returnMe = new Spell("Dominate Person",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDream() {Spell returnMe = new Spell("Dream",5);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFlameStrike() {Spell returnMe = new Spell("Flame Strike",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGeas() {Spell returnMe = new Spell("Geas",5);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGreaterRestoration() {Spell returnMe = new Spell("Greater Restoration",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHallow() {Spell returnMe = new Spell("Hallow",5);
  		returnMe.castingTime = "24 hours";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHoldMonster() {Spell returnMe = new Spell("Hold Monster",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getInsectPlague() {Spell returnMe = new Spell("Insect Plague",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getLegendLore() {Spell returnMe = new Spell("Legend Lore",5);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMassCureWounds() {Spell returnMe = new Spell("Mass Cure Wounds",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMislead() {Spell returnMe = new Spell("Mislead",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getModifyMemory() {Spell returnMe = new Spell("Modify Memory",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPasswall() {Spell returnMe = new Spell("Passwall",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPlanarBinding() {Spell returnMe = new Spell("Planar Binding",5);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getRaiseDead() {Spell returnMe = new Spell("Raise Dead",5);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getRarysTelepathicBond() {Spell returnMe = new Spell("Rary's Telepathic Bond",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getReincarnate() {Spell returnMe = new Spell("Reincarnate",5);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getScrying() {Spell returnMe = new Spell("Scrying",5);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSeeming() {Spell returnMe = new Spell("Seeming",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSwiftQuiver() {Spell returnMe = new Spell("Swift Quiver",5);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTelekinesis() {Spell returnMe = new Spell("Telekinesis",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTeleportationCircle() {Spell returnMe = new Spell("Teleportation Circle",5);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTreeStride() {Spell returnMe = new Spell("Tree Stride",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWallofForce() {Spell returnMe = new Spell("Wall of Force",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWallofStone() {Spell returnMe = new Spell("Wall of Stone",5);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getArcaneGate() {Spell returnMe = new Spell("Arcane Gate",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getBladeBarrier() {Spell returnMe = new Spell("Blade Barrier",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getChainLightning() {Spell returnMe = new Spell("Chain Lightning",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCircleofDeath() {Spell returnMe = new Spell("Circle of Death",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConjureFey() {Spell returnMe = new Spell("Conjure Fey",6);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getContingency() {Spell returnMe = new Spell("Contingency",6);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getCreateUndead() {Spell returnMe = new Spell("Create Undead",6);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDisintegrate() {Spell returnMe = new Spell("Disintegrate",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDrawmijsInstantSummons() {Spell returnMe = new Spell("Drawmij's Instant Summons",6);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getEyebite() {Spell returnMe = new Spell("Eyebite",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFindthePath() {Spell returnMe = new Spell("Find the Path",6);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFleshtoStone() {Spell returnMe = new Spell("Flesh to Stone",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getForbiddance() {Spell returnMe = new Spell("Forbiddance",6);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = true;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGlobeofInvulnerability() {Spell returnMe = new Spell("Globe of Invulnerability",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGuardsandWards() {Spell returnMe = new Spell("Guards and Wards",6);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHarm() {Spell returnMe = new Spell("Harm",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHeal() {Spell returnMe = new Spell("Heal",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHeroesFeast() {Spell returnMe = new Spell("Heroes' Feast",6);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMagicJar() {Spell returnMe = new Spell("Magic Jar",6);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMassSuggestion() {Spell returnMe = new Spell("Mass Suggestion",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMoveEarth() {Spell returnMe = new Spell("Move Earth",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getOtilukesFreezingSphere() {Spell returnMe = new Spell("Otiluke's Freezing Sphere",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getOttosIrresistibleDance() {Spell returnMe = new Spell("Otto's Irresistible Dance",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPlanarAlly() {Spell returnMe = new Spell("Planar Ally",6);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getProgrammedIllusion() {Spell returnMe = new Spell("Programmed Illusion",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSunbeam() {Spell returnMe = new Spell("Sunbeam",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTransportviaPlants() {Spell returnMe = new Spell("Transport via Plants",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTrueSeeing() {Spell returnMe = new Spell("True Seeing",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWallofIce() {Spell returnMe = new Spell("Wall of Ice",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWallofThorns() {Spell returnMe = new Spell("Wall of Thorns",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWindWalk() {Spell returnMe = new Spell("Wind Walk",6);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWordofRecall() {Spell returnMe = new Spell("Word of Recall",6);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getConjureCelestial() {Spell returnMe = new Spell("Conjure Celestial",7);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDelayedBlastFireball() {Spell returnMe = new Spell("Delayed Blast Fireball",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDivineWord() {Spell returnMe = new Spell("Divine Word",7);
  		returnMe.castingTime = "1 bonus action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getEtherealness() {Spell returnMe = new Spell("Etherealness",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFingerofDeath() {Spell returnMe = new Spell("Finger of Death",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFireStorm() {Spell returnMe = new Spell("Fire Storm",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getForcecage() {Spell returnMe = new Spell("Forcecage",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMirageArcane() {Spell returnMe = new Spell("Mirage Arcane",7);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMordenkainensMagnificentMansion() {Spell returnMe = new Spell("Mordenkainen's Magnificent Mansion",7);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMordenkainensSword() {Spell returnMe = new Spell("Mordenkainen's Sword",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPlaneShift() {Spell returnMe = new Spell("Plane Shift",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPrismaticSpray() {Spell returnMe = new Spell("Prismatic Spray",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getProjectImage() {Spell returnMe = new Spell("Project Image",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getRegenerate() {Spell returnMe = new Spell("Regenerate",7);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getResurrection() {Spell returnMe = new Spell("Resurrection",7);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getReverseGravity() {Spell returnMe = new Spell("Reverse Gravity",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSequester() {Spell returnMe = new Spell("Sequester",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSimulacrum() {Spell returnMe = new Spell("Simulacrum",7);
  		returnMe.castingTime = "12 hours";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSymbol() {Spell returnMe = new Spell("Symbol",7);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTeleport() {Spell returnMe = new Spell("Teleport",7);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAnimalShapes() {Spell returnMe = new Spell("Animal Shapes",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAntimagicField() {Spell returnMe = new Spell("Antimagic Field",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAntipathySympathy() {Spell returnMe = new Spell("Antipathy/Sympathy",8);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getClone() {Spell returnMe = new Spell("Clone",8);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getControlWeather() {Spell returnMe = new Spell("Control Weather",8);
  		returnMe.castingTime = "10 minutes";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDemiplane() {Spell returnMe = new Spell("Demiplane",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = false;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getDominateMonster() {Spell returnMe = new Spell("Dominate Monster",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getEarthquake() {Spell returnMe = new Spell("Earthquake",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getFeeblemind() {Spell returnMe = new Spell("Feeblemind",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGlibness() {Spell returnMe = new Spell("Glibness",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getHolyAura() {Spell returnMe = new Spell("Holy Aura",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getIncendiaryCloud() {Spell returnMe = new Spell("Incendiary Cloud",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMaze() {Spell returnMe = new Spell("Maze",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMindBlank() {Spell returnMe = new Spell("Mind Blank",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPowerWordStun() {Spell returnMe = new Spell("Power Word Stun",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getSunburst() {Spell returnMe = new Spell("Sunburst",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTelepathy() {Spell returnMe = new Spell("Telepathy",8);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTsunami() {Spell returnMe = new Spell("Tsunami",8);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getAstralProjection() {Spell returnMe = new Spell("Astral Projection",9);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getForesight() {Spell returnMe = new Spell("Foresight",9);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.DIVINATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getGate() {Spell returnMe = new Spell("Gate",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getImprisonment() {Spell returnMe = new Spell("Imprisonment",9);
  		returnMe.castingTime = "1 minute";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMassHeal() {Spell returnMe = new Spell("Mass Heal",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getMeteorSwarm() {Spell returnMe = new Spell("Meteor Swarm",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPowerWordHeal() {Spell returnMe = new Spell("Power Word Heal",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.EVOCATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPowerWordKill() {Spell returnMe = new Spell("Power Word Kill",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ENCHANTMENT;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getPrismaticWall() {Spell returnMe = new Spell("Prismatic Wall",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ABJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getShapechange() {Spell returnMe = new Spell("Shapechange",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getStormofVengeance() {Spell returnMe = new Spell("Storm of Vengeance",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTimeStop() {Spell returnMe = new Spell("Time Stop",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTruePolymorph() {Spell returnMe = new Spell("True Polymorph",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.TRANSMUTATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getTrueResurrection() {Spell returnMe = new Spell("True Resurrection",9);
  		returnMe.castingTime = "1 hour";
  		returnMe.school = Lists.MagicSchool.NECROMANCY;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "TODO";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWeird() {Spell returnMe = new Spell("Weird",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.ILLUSION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = true;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = true;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
	public static Spell getWish() {Spell returnMe = new Spell("Wish",9);
  		returnMe.castingTime = "1 action";
  		returnMe.school = Lists.MagicSchool.CONJURATION;
  		returnMe.rangeArea = "TODO";
  		returnMe.verbal = true;
  		returnMe.somatic = false;
  		returnMe.materialsRequired = "";
  		returnMe.ritual = false;
  		returnMe.concentration = false;
  		returnMe.duration = "TODO";
  		returnMe.description = "TODO";
  		return returnMe;
	}
}
