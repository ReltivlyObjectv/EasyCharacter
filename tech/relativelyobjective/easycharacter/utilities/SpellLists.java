package tech.relativelyobjective.easycharacter.utilities;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class SpellLists {
	public enum SpellKey {
		ACID_SPLASH,
		BLADE_WARD,
		CHILL_TOUCH,
		DANCING_LIGHTS,
		DRUIDCRAFT,
		ELDRITCH_BLAST,
		FIRE_BOLT,
		FRIENDS,
		GUIDANCE,
		LIGHT,
		MAGE_HAND,
		MENDING,
		MESSAGE,
		MINOR_ILLUSION,
		POISON_SPRAY,
		PRESTIDIGITATION,
		PRODUCE_FLAME,
		RAY_OF_FROST,
		RESISTANCE,
		SACRED_FLAME,
		SHILLELAGH,
		SHOCKING_GRASP,
		SPARE_THE_DYING,
		THAUMATURGY,
		THORN_WHIP,
		TRUE_STRIKE,
		VICIOUS_MOCKERY,
		ALARM,
		ANIMAL_FRIENDSHIP,
		ARMOR_OF_AGATHYS,
		ARMS_OF_HADAR,
		BANE,
		BLESS,
		BURNING_HANDS,
		CHARM_PERSON,
		CHROMATIC_ORB,
		COLOR_SPRAY,
		COMMAND,
		COMPELLED_DUEL,
		COMPREHEND_LANGUAGES,
		CREATE_OR_DESTROY_WATER,
		CURE_WOUNDS,
		DETECT_EVIL_AND_GOOD,
		DETECT_MAGIC,
		DETECT_POISON_AND_DISEASE,
		DISGUISE_SELF,
		DISSONANT_WHISPERS,
		DIVINE_FAVOR,
		ENSNARING_STRIKE,
		ENTANGLE,
		EXPEDITIOUS_RETREAT,
		FAERIE_FIRE,
		FALSE_LIFE,
		FEATHER_FALL,
		FIND_FAMILIAR,
		FOG_CLOUD,
		GOODBERRY,
		GREASE,
		GUIDING_BOLT,
		HAIL_OF_THORNS,
		HEALING_WORD,
		HELLISH_REBUKE,
		HEROISM,
		HEX,
		HUNTERS_MARK,
		IDENTIFY,
		ILLUSORY_SCRIPT,
		INFLICT_WOUNDS,
		JUMP,
		LONGSTRIDER,
		MAGE_ARMOR,
		MAGIC_MISSILE,
		PROTECTION_FROM_EVIL_AND_GOOD,
		PURIFY_FOOD_AND_DRINK,
		RAY_OF_SICKNESS,
		SANCTUARY,
		SEARING_SMITE,
		SHIELD,
		SHIELD_OF_FAITH,
		SILENT_IMAGE,
		SLEEP,
		SPEAK_WITH_ANIMALS,
		TASHAS_HIDEOUS_LAUGHTER,
		TENSERS_FLOATING_DISK,
		THUNDEROUS_SMITE,
		THUNDERWAVE,
		UNSEEN_SERVANT,
		WITCH_BOLT,
		WRATHFUL_SMITE,
		AID,
		ALTER_SELF,
		ANIMAL_MESSENGER,
		ARCANE_LOCK,
		AUGURY,
		BARKSKIN,
		BEAST_SENSE,
		BLINDNESS_DEAFNESS,
		BLUR,
		BRANDING_SMITE,
		CALM_EMOTIONS,
		CLOUD_OF_DAGGERS,
		CONTINUAL_FLAME,
		CORDON_OF_ARROWS,
		CROWN_OF_MADNESS,
		DARKNESS,
		DARKVISION,
		DETECT_THOUGHTS,
		ENHANCE_ABILITY,
		ENLARGE_REDUCE,
		ENTHRALL,
		FIND_STEED,
		FIND_TRAPS,
		FLAME_BLADE,
		FLAMING_SPHERE,
		GENTLE_REPOSE,
		GUST_OF_WIND,
		HEAT_METAL,
		HOLD_PERSON,
		INVISIBILITY,
		KNOCK,
		LESSER_RESTORATION,
		LEVITATE,
		LOCATE_ANIMALS_OR_PLANTS,
		LOCATE_OBJECT,
		MAGIC_MOUTH,
		MAGIC_WEAPON,
		MELFS_ACID_ARROW,
		MIRROR_IMAGE,
		MISTY_STEP,
		MOONBEAM,
		NYSTULS_MAGIC_AURA,
		PASS_WITHOUT_TRACE,
		PHANTASMAL_FORCE,
		PRAYER_OF_HEALING,
		PROTECTION_FROM_POISON,
		RAY_OF_ENFEEBLEMENT,
		ROPE_TRICK,
		SCORCHING_RAY,
		SEE_INVISIBILITY,
		SHATTER,
		SILENCE,
		SPIDER_CLIMB,
		SPIKE_GROWTH,
		SPIRITUAL_WEAPON,
		SUGGESTION,
		WARDING_BOND,
		WEB,
		ZONE_OF_TRUTH,
		ANIMATE_DEAD,
		AURA_OF_VITALITY,
		BEACON_OF_HOPE,
		BESTOW_CURSE,
		BLINDING_SMITE,
		BLINK,
		CALL_LIGHTNING,
		CLAIRVOYANCE,
		CONJURE_ANIMALS,
		CONJURE_BARRAGE,
		COUNTERSPELL,
		CREATE_FOOD_AND_WATER,
		CRUSADERS_MANTLE,
		DAYLIGHT,
		DISPEL_MAGIC,
		ELEMENTAL_WEAPON,
		FEAR,
		FEIGN_DEATH,
		FIREBALL,
		FLY,
		GASEOUS_FORM,
		GLYPH_OF_WARDING,
		HASTE,
		HUNGER_OF_HADAR,
		HYPNOTIC_PATTERN,
		LEOMUNDS_TINY_HUT,
		LIGHTNING_ARROW,
		LIGHTNING_BOLT,
		MAGIC_CIRCLE,
		MAJOR_IMAGE,
		MASS_HEALING_WORD,
		MELD_INTO_STONE,
		NONDETECTION,
		PHANTOM_STEED,
		PLANT_GROWTH,
		PROTECTION_FROM_ENERGY,
		REMOVE_CURSE,
		REVIVIFY,
		SENDING,
		SLEET_STORM,
		SLOW,
		SPEAK_WITH_DEAD,
		SPEAK_WITH_PLANTS,
		SPIRIT_GUARDIANS,
		STINKING_CLOUD,
		TONGUES,
		VAMPIRIC_TOUCH,
		WATER_BREATHING,
		WATER_WALK,
		WIND_WALL,
		ARCANE_EYE,
		AURA_OF_LIFE,
		AURA_OF_PURITY,
		BANISHMENT,
		BLIGHT,
		COMPULSION,
		CONFUSION,
		CONJURE_MINOR_ELEMENTALS,
		CONJURE_WOODLAND_BEINGS,
		CONTROL_WATER,
		DEATH_WARD,
		DIMENSION_DOOR,
		DIVINATION,
		DOMINATE_BEAST,
		EVARDS_BLACK_TENTACLES,
		FABRICATE,
		FIRE_SHIELD,
		FREEDOM_OF_MOVEMENT,
		GIANT_INSECT,
		GRASPING_VINE,
		GREATER_INVISIBILITY,
		GUARDIAN_OF_FAITH,
		HALLUCINATORY_TERRAIN,
		ICE_STORM,
		LEOMUNDS_SECRET_CHEST,
		LOCATE_CREATURE,
		MORDENKAINENS_FAITHFUL_HOUND,
		MORDENKAINENS_PRIVATE_SANCTUM,
		OTILUKES_RESILIENT_SPHERE,
		PHANTASMAL_KILLER,
		POLYMORPH,
		STAGGERING_SMITE,
		STONE_SHAPE,
		STONESKIN,
		WALL_OF_FIRE,
		ANIMATE_OBJECTS,
		ANTILIFE_SHELL,
		AWAKEN,
		BANISHING_SMITE,
		BIGBYS_HAND,
		CIRCLE_OF_POWER,
		CLOUDKILL,
		COMMUNE,
		COMMUNE_WITH_NATURE,
		CONE_OF_COLD,
		CONJURE_ELEMENTAL,
		CONJURE_VOLLEY,
		CONTACT_OTHER_PLANE,
		CONTAGION,
		CREATION,
		DESTRUCTIVE_WAVE,
		DISPEL_EVIL_AND_GOOD,
		DOMINATE_PERSON,
		DREAM,
		FLAME_STRIKE,
		GEAS,
		GREATER_RESTORATION,
		HALLOW,
		HOLD_MONSTER,
		INSECT_PLAGUE,
		LEGEND_LORE,
		MASS_CURE_WOUNDS,
		MISLEAD,
		MODIFY_MEMORY,
		PASSWALL,
		PLANAR_BINDING,
		RAISE_DEAD,
		RARYS_TELEPATHIC_BOND,
		REINCARNATE,
		SCRYING,
		SEEMING,
		SWIFT_QUIVER,
		TELEKINESIS,
		TELEPORTATION_CIRCLE,
		TREE_STRIDE,
		WALL_OF_FORCE,
		WALL_OF_STONE,
		ARCANE_GATE,
		BLADE_BARRIER,
		CHAIN_LIGHTNING,
		CIRCLE_OF_DEATH,
		CONJURE_FEY,
		CONTINGENCY,
		CREATE_UNDEAD,
		DISINTEGRATE,
		DRAWMIJS_INSTANT_SUMMONS,
		EYEBITE,
		FIND_THE_PATH,
		FLESH_TO_STONE,
		FORBIDDANCE,
		GLOBE_OF_INVULNERABILITY,
		GUARDS_AND_WARDS,
		HARM,
		HEAL,
		HEROES_FEAST,
		MAGIC_JAR,
		MASS_SUGGESTION,
		MOVE_EARTH,
		OTILUKES_FREEZING_SPHERE,
		OTTOS_IRRESISTIBLE_DANCE,
		PLANAR_ALLY,
		PROGRAMMED_ILLUSION,
		SUNBEAM,
		TRANSPORT_VIA_PLANTS,
		TRUE_SEEING,
		WALL_OF_ICE,
		WALL_OF_THORNS,
		WIND_WALK,
		WORD_OF_RECALL,
		CONJURE_CELESTIAL,
		DELAYED_BLAST_FIREBALL,
		DIVINE_WORD,
		ETHEREALNESS,
		FINGER_OF_DEATH,
		FIRE_STORM,
		FORCECAGE,
		MIRAGE_ARCANE,
		MORDENKAINENS_MAGNIFICENT_MANSION,
		MORDENKAINENS_SWORD,
		PLANE_SHIFT,
		PRISMATIC_SPRAY,
		PROJECT_IMAGE,
		REGENERATE,
		RESURRECTION,
		REVERSE_GRAVITY,
		SEQUESTER,
		SIMULACRUM,
		SYMBOL,
		TELEPORT,
		ANIMAL_SHAPES,
		ANTIMAGIC_FIELD,
		ANTIPATHY_SYMPATHY,
		CLONE,
		CONTROL_WEATHER,
		DEMIPLANE,
		DOMINATE_MONSTER,
		EARTHQUAKE,
		FEEBLEMIND,
		GLIBNESS,
		HOLY_AURA,
		INCENDIARY_CLOUD,
		MAZE,
		MIND_BLANK,
		POWER_WORD_STUN,
		SUNBURST,
		TELEPATHY,
		TSUNAMI,
		ASTRAL_PROJECTION,
		FORESIGHT,
		GATE,
		IMPRISONMENT,
		MASS_HEAL,
		METEOR_SWARM,
		POWER_WORD_HEAL,
		POWER_WORD_KILL,
		PRISMATIC_WALL,
		SHAPECHANGE,
		STORM_OF_VENGEANCE,
		TIME_STOP,
		TRUE_POLYMORPH,
		TRUE_RESURRECTION,
		WEIRD,
		WISH
	}
	public static final SpellKey[] BARD_SPELLS = {
		SpellKey.BLADE_WARD,
		SpellKey.DANCING_LIGHTS,
		SpellKey.FRIENDS,
		SpellKey.LIGHT,
		SpellKey.MAGE_HAND,
		SpellKey.MENDING,
		SpellKey.MESSAGE,
		SpellKey.MINOR_ILLUSION,
		SpellKey.PRESTIDIGITATION,
		SpellKey.TRUE_STRIKE,
		SpellKey.VICIOUS_MOCKERY,
		SpellKey.ANIMAL_FRIENDSHIP,
		SpellKey.BANE,
		SpellKey.CHARM_PERSON,
		SpellKey.COMPREHEND_LANGUAGES,
		SpellKey.CURE_WOUNDS,
		SpellKey.DETECT_MAGIC,
		SpellKey.DISGUISE_SELF,
		SpellKey.DISSONANT_WHISPERS,
		SpellKey.FAERIE_FIRE,
		SpellKey.FEATHER_FALL,
		SpellKey.HEALING_WORD,
		SpellKey.HEROISM,
		SpellKey.IDENTIFY,
		SpellKey.ILLUSORY_SCRIPT,
		SpellKey.LONGSTRIDER,
		SpellKey.SILENT_IMAGE,
		SpellKey.SLEEP,
		SpellKey.SPEAK_WITH_ANIMALS,
		SpellKey.TASHAS_HIDEOUS_LAUGHTER,
		SpellKey.THUNDERWAVE,
		SpellKey.UNSEEN_SERVANT,
		SpellKey.ANIMAL_MESSENGER,
		SpellKey.BLINDNESS_DEAFNESS,
		SpellKey.CALM_EMOTIONS,
		SpellKey.CLOUD_OF_DAGGERS,
		SpellKey.CROWN_OF_MADNESS,
		SpellKey.DETECT_THOUGHTS,
		SpellKey.ENHANCE_ABILITY,
		SpellKey.ENTHRALL,
		SpellKey.HEAT_METAL,
		SpellKey.HOLD_PERSON,
		SpellKey.INVISIBILITY,
		SpellKey.KNOCK,
		SpellKey.LESSER_RESTORATION,
		SpellKey.LOCATE_ANIMALS_OR_PLANTS,
		SpellKey.LOCATE_OBJECT,
		SpellKey.MAGIC_MOUTH,
		SpellKey.PHANTASMAL_FORCE,
		SpellKey.SEE_INVISIBILITY,
		SpellKey.SHATTER,
		SpellKey.SILENCE,
		SpellKey.SUGGESTION,
		SpellKey.ZONE_OF_TRUTH,
		SpellKey.BESTOW_CURSE,
		SpellKey.CLAIRVOYANCE,
		SpellKey.DISPEL_MAGIC,
		SpellKey.FEAR,
		SpellKey.FEIGN_DEATH,
		SpellKey.GLYPH_OF_WARDING,
		SpellKey.HYPNOTIC_PATTERN,
		SpellKey.LEOMUNDS_TINY_HUT,
		SpellKey.MAJOR_IMAGE,
		SpellKey.NONDETECTION,
		SpellKey.PLANT_GROWTH,
		SpellKey.SENDING,
		SpellKey.SPEAK_WITH_DEAD,
		SpellKey.SPEAK_WITH_PLANTS,
		SpellKey.STINKING_CLOUD,
		SpellKey.TONGUES,
		SpellKey.COMPULSION,
		SpellKey.CONFUSION,
		SpellKey.DIMENSION_DOOR,
		SpellKey.FREEDOM_OF_MOVEMENT,
		SpellKey.GREATER_INVISIBILITY,
		SpellKey.HALLUCINATORY_TERRAIN,
		SpellKey.LOCATE_CREATURE,
		SpellKey.POLYMORPH,
		SpellKey.ANIMATE_OBJECTS,
		SpellKey.AWAKEN,
		SpellKey.DOMINATE_PERSON,
		SpellKey.DREAM,
		SpellKey.GEAS,
		SpellKey.GREATER_RESTORATION,
		SpellKey.HOLD_MONSTER,
		SpellKey.LEGEND_LORE,
		SpellKey.MASS_CURE_WOUNDS,
		SpellKey.MISLEAD,
		SpellKey.MODIFY_MEMORY,
		SpellKey.PLANAR_BINDING,
		SpellKey.RAISE_DEAD,
		SpellKey.SCRYING,
		SpellKey.SEEMING,
		SpellKey.TELEPORTATION_CIRCLE,
		SpellKey.EYEBITE,
		SpellKey.FIND_THE_PATH,
		SpellKey.GUARDS_AND_WARDS,
		SpellKey.MASS_SUGGESTION,
		SpellKey.OTTOS_IRRESISTIBLE_DANCE,
		SpellKey.PROGRAMMED_ILLUSION,
		SpellKey.TRUE_SEEING,
		SpellKey.ETHEREALNESS,
		SpellKey.FORCECAGE,
		SpellKey.MIRAGE_ARCANE,
		SpellKey.MORDENKAINENS_MAGNIFICENT_MANSION,
		SpellKey.MORDENKAINENS_SWORD,
		SpellKey.PROJECT_IMAGE,
		SpellKey.REGENERATE,
		SpellKey.RESURRECTION,
		SpellKey.SYMBOL,
		SpellKey.TELEPORT,
		SpellKey.DOMINATE_MONSTER,
		SpellKey.FEEBLEMIND,
		SpellKey.GLIBNESS,
		SpellKey.MIND_BLANK,
		SpellKey.POWER_WORD_STUN,
		SpellKey.FORESIGHT,
		SpellKey.POWER_WORD_HEAL,
		SpellKey.POWER_WORD_KILL,
		SpellKey.TRUE_POLYMORPH
	};
	public static final SpellKey[] CLERIC_SPELLS = {
		SpellKey.GUIDANCE,
		SpellKey.LIGHT,
		SpellKey.MENDING,
		SpellKey.RESISTANCE,
		SpellKey.SACRED_FLAME,
		SpellKey.SPARE_THE_DYING,
		SpellKey.THAUMATURGY,
		SpellKey.BANE,
		SpellKey.BLESS,
		SpellKey.COMMAND,
		SpellKey.CREATE_OR_DESTROY_WATER,
		SpellKey.CURE_WOUNDS,
		SpellKey.DETECT_EVIL_AND_GOOD,
		SpellKey.DETECT_MAGIC,
		SpellKey.DETECT_POISON_AND_DISEASE,
		SpellKey.GUIDING_BOLT,
		SpellKey.HEALING_WORD,
		SpellKey.INFLICT_WOUNDS,
		SpellKey.PROTECTION_FROM_EVIL_AND_GOOD,
		SpellKey.PURIFY_FOOD_AND_DRINK,
		SpellKey.SANCTUARY,
		SpellKey.SHIELD_OF_FAITH,
		SpellKey.AID,
		SpellKey.AUGURY,
		SpellKey.BLINDNESS_DEAFNESS,
		SpellKey.CALM_EMOTIONS,
		SpellKey.CONTINUAL_FLAME,
		SpellKey.ENHANCE_ABILITY,
		SpellKey.FIND_TRAPS,
		SpellKey.GENTLE_REPOSE,
		SpellKey.HOLD_PERSON,
		SpellKey.LESSER_RESTORATION,
		SpellKey.LOCATE_OBJECT,
		SpellKey.PRAYER_OF_HEALING,
		SpellKey.PROTECTION_FROM_POISON,
		SpellKey.SILENCE,
		SpellKey.SPIRITUAL_WEAPON,
		SpellKey.WARDING_BOND,
		SpellKey.ZONE_OF_TRUTH,
		SpellKey.ANIMATE_DEAD,
		SpellKey.BEACON_OF_HOPE,
		SpellKey.BESTOW_CURSE,
		SpellKey.CLAIRVOYANCE,
		SpellKey.CREATE_FOOD_AND_WATER,
		SpellKey.DAYLIGHT,
		SpellKey.DISPEL_MAGIC,
		SpellKey.FEIGN_DEATH,
		SpellKey.GLYPH_OF_WARDING,
		SpellKey.MAGIC_CIRCLE,
		SpellKey.MASS_HEALING_WORD,
		SpellKey.MELD_INTO_STONE,
		SpellKey.PROTECTION_FROM_ENERGY,
		SpellKey.REMOVE_CURSE,
		SpellKey.REVIVIFY,
		SpellKey.SENDING,
		SpellKey.SPEAK_WITH_DEAD,
		SpellKey.SPIRIT_GUARDIANS,
		SpellKey.TONGUES,
		SpellKey.WATER_WALK,
		SpellKey.BANISHMENT,
		SpellKey.CONTROL_WATER,
		SpellKey.DEATH_WARD,
		SpellKey.DIVINATION,
		SpellKey.FREEDOM_OF_MOVEMENT,
		SpellKey.GUARDIAN_OF_FAITH,
		SpellKey.LOCATE_CREATURE,
		SpellKey.STONE_SHAPE,
		SpellKey.COMMUNE,
		SpellKey.CONTAGION,
		SpellKey.DISPEL_EVIL_AND_GOOD,
		SpellKey.FLAME_STRIKE,
		SpellKey.GEAS,
		SpellKey.GREATER_RESTORATION,
		SpellKey.HALLOW,
		SpellKey.INSECT_PLAGUE,
		SpellKey.LEGEND_LORE,
		SpellKey.MASS_CURE_WOUNDS,
		SpellKey.PLANAR_BINDING,
		SpellKey.RAISE_DEAD,
		SpellKey.SCRYING,
		SpellKey.BLADE_BARRIER,
		SpellKey.CREATE_UNDEAD,
		SpellKey.FIND_THE_PATH,
		SpellKey.FORBIDDANCE,
		SpellKey.HARM,
		SpellKey.HEAL,
		SpellKey.HEROES_FEAST,
		SpellKey.PLANAR_ALLY,
		SpellKey.TRUE_SEEING,
		SpellKey.WORD_OF_RECALL,
		SpellKey.CONJURE_CELESTIAL,
		SpellKey.DIVINE_WORD,
		SpellKey.ETHEREALNESS,
		SpellKey.FIRE_STORM,
		SpellKey.PLANE_SHIFT,
		SpellKey.REGENERATE,
		SpellKey.RESURRECTION,
		SpellKey.SYMBOL,
		SpellKey.ANTIMAGIC_FIELD,
		SpellKey.CONTROL_WEATHER,
		SpellKey.EARTHQUAKE,
		SpellKey.HOLY_AURA,
		SpellKey.ASTRAL_PROJECTION,
		SpellKey.GATE,
		SpellKey.MASS_HEAL,
		SpellKey.TRUE_RESURRECTION
	};
	public static final SpellKey[] DRUID_SPELLS = {
		SpellKey.DRUIDCRAFT,
		SpellKey.GUIDANCE,
		SpellKey.MENDING,
		SpellKey.POISON_SPRAY,
		SpellKey.PRODUCE_FLAME,
		SpellKey.RESISTANCE,
		SpellKey.SHILLELAGH,
		SpellKey.THORN_WHIP,
		SpellKey.ANIMAL_FRIENDSHIP,
		SpellKey.CHARM_PERSON,
		SpellKey.CREATE_OR_DESTROY_WATER,
		SpellKey.CURE_WOUNDS,
		SpellKey.DETECT_MAGIC,
		SpellKey.DETECT_POISON_AND_DISEASE,
		SpellKey.ENTANGLE,
		SpellKey.FAERIE_FIRE,
		SpellKey.FOG_CLOUD,
		SpellKey.GOODBERRY,
		SpellKey.HEALING_WORD,
		SpellKey.JUMP,
		SpellKey.LONGSTRIDER,
		SpellKey.PURIFY_FOOD_AND_DRINK,
		SpellKey.SPEAK_WITH_ANIMALS,
		SpellKey.THUNDERWAVE,
		SpellKey.ANIMAL_MESSENGER,
		SpellKey.BARKSKIN,
		SpellKey.BEAST_SENSE,
		SpellKey.DARKVISION,
		SpellKey.ENHANCE_ABILITY,
		SpellKey.FIND_TRAPS,
		SpellKey.FLAME_BLADE,
		SpellKey.FLAMING_SPHERE,
		SpellKey.GUST_OF_WIND,
		SpellKey.HEAT_METAL,
		SpellKey.HOLD_PERSON,
		SpellKey.LESSER_RESTORATION,
		SpellKey.LOCATE_ANIMALS_OR_PLANTS,
		SpellKey.LOCATE_OBJECT,
		SpellKey.MOONBEAM,
		SpellKey.PASS_WITHOUT_TRACE,
		SpellKey.PROTECTION_FROM_POISON,
		SpellKey.SPIKE_GROWTH,
		SpellKey.CALL_LIGHTNING,
		SpellKey.CONJURE_ANIMALS,
		SpellKey.DAYLIGHT,
		SpellKey.DISPEL_MAGIC,
		SpellKey.FEIGN_DEATH,
		SpellKey.MELD_INTO_STONE,
		SpellKey.PLANT_GROWTH,
		SpellKey.PROTECTION_FROM_ENERGY,
		SpellKey.SLEET_STORM,
		SpellKey.SPEAK_WITH_PLANTS,
		SpellKey.WATER_BREATHING,
		SpellKey.WATER_WALK,
		SpellKey.WIND_WALL,
		SpellKey.BLIGHT,
		SpellKey.CONFUSION,
		SpellKey.CONJURE_MINOR_ELEMENTALS,
		SpellKey.CONJURE_WOODLAND_BEINGS,
		SpellKey.CONTROL_WATER,
		SpellKey.DOMINATE_BEAST,
		SpellKey.FREEDOM_OF_MOVEMENT,
		SpellKey.GIANT_INSECT,
		SpellKey.GRASPING_VINE,
		SpellKey.HALLUCINATORY_TERRAIN,
		SpellKey.ICE_STORM,
		SpellKey.LOCATE_CREATURE,
		SpellKey.POLYMORPH,
		SpellKey.STONE_SHAPE,
		SpellKey.STONESKIN,
		SpellKey.WALL_OF_FIRE,
		SpellKey.ANTILIFE_SHELL,
		SpellKey.AWAKEN,
		SpellKey.COMMUNE_WITH_NATURE,
		SpellKey.CONJURE_ELEMENTAL,
		SpellKey.CONTAGION,
		SpellKey.GEAS,
		SpellKey.GREATER_RESTORATION,
		SpellKey.INSECT_PLAGUE,
		SpellKey.MASS_CURE_WOUNDS,
		SpellKey.PLANAR_BINDING,
		SpellKey.REINCARNATE,
		SpellKey.SCRYING,
		SpellKey.TREE_STRIDE,
		SpellKey.WALL_OF_STONE,
		SpellKey.CONJURE_FEY,
		SpellKey.FIND_THE_PATH,
		SpellKey.HEAL,
		SpellKey.HEROES_FEAST,
		SpellKey.MOVE_EARTH,
		SpellKey.SUNBEAM,
		SpellKey.TRANSPORT_VIA_PLANTS,
		SpellKey.WALL_OF_THORNS,
		SpellKey.WIND_WALK,
		SpellKey.FIRE_STORM,
		SpellKey.MIRAGE_ARCANE,
		SpellKey.PLANE_SHIFT,
		SpellKey.REGENERATE,
		SpellKey.REVERSE_GRAVITY,
		SpellKey.ANIMAL_SHAPES,
		SpellKey.ANTIPATHY_SYMPATHY,
		SpellKey.CONTROL_WEATHER,
		SpellKey.EARTHQUAKE,
		SpellKey.FEEBLEMIND,
		SpellKey.SUNBURST,
		SpellKey.TSUNAMI,
		SpellKey.FORESIGHT,
		SpellKey.SHAPECHANGE,
		SpellKey.STORM_OF_VENGEANCE,
		SpellKey.TRUE_RESURRECTION,
	};
	public static final SpellKey[] PALADIN_SPELLS = {
		SpellKey.BLESS,
		SpellKey.COMMAND,
		SpellKey.COMPELLED_DUEL,
		SpellKey.CURE_WOUNDS,
		SpellKey.DETECT_EVIL_AND_GOOD,
		SpellKey.DETECT_MAGIC,
		SpellKey.DETECT_POISON_AND_DISEASE,
		SpellKey.DIVINE_FAVOR,
		SpellKey.HEROISM,
		SpellKey.PROTECTION_FROM_EVIL_AND_GOOD,
		SpellKey.PURIFY_FOOD_AND_DRINK,
		SpellKey.SEARING_SMITE,
		SpellKey.SHIELD_OF_FAITH,
		SpellKey.THUNDEROUS_SMITE,
		SpellKey.WRATHFUL_SMITE,
		SpellKey.AID,
		SpellKey.BRANDING_SMITE,
		SpellKey.FIND_STEED,
		SpellKey.LESSER_RESTORATION,
		SpellKey.LOCATE_OBJECT,
		SpellKey.MAGIC_WEAPON,
		SpellKey.PROTECTION_FROM_POISON,
		SpellKey.ZONE_OF_TRUTH,
		SpellKey.AURA_OF_VITALITY,
		SpellKey.BLINDING_SMITE,
		SpellKey.CREATE_FOOD_AND_WATER,
		SpellKey.CRUSADERS_MANTLE,
		SpellKey.DAYLIGHT,
		SpellKey.DISPEL_MAGIC,
		SpellKey.ELEMENTAL_WEAPON,
		SpellKey.MAGIC_CIRCLE,
		SpellKey.REMOVE_CURSE,
		SpellKey.REVIVIFY,
		SpellKey.AURA_OF_LIFE,
		SpellKey.AURA_OF_PURITY,
		SpellKey.BANISHMENT,
		SpellKey.DEATH_WARD,
		SpellKey.LOCATE_CREATURE,
		SpellKey.STAGGERING_SMITE,
		SpellKey.BANISHING_SMITE,
		SpellKey.CIRCLE_OF_POWER,
		SpellKey.DESTRUCTIVE_WAVE,
		SpellKey.DISPEL_EVIL_AND_GOOD,
		SpellKey.GEAS,
		SpellKey.RAISE_DEAD
	};
	public static final SpellKey[] RANGER_SPELLS = {
		SpellKey.ALARM,
		SpellKey.ANIMAL_FRIENDSHIP,
		SpellKey.CURE_WOUNDS,
		SpellKey.DETECT_MAGIC,
		SpellKey.DETECT_POISON_AND_DISEASE,
		SpellKey.ENSNARING_STRIKE,
		SpellKey.FOG_CLOUD,
		SpellKey.GOODBERRY,
		SpellKey.HAIL_OF_THORNS,
		SpellKey.HUNTERS_MARK,
		SpellKey.JUMP,
		SpellKey.LONGSTRIDER,
		SpellKey.SPEAK_WITH_ANIMALS,
		SpellKey.ANIMAL_MESSENGER,
		SpellKey.BARKSKIN,
		SpellKey.BEAST_SENSE,
		SpellKey.CORDON_OF_ARROWS,
		SpellKey.DARKVISION,
		SpellKey.FIND_TRAPS,
		SpellKey.LESSER_RESTORATION,
		SpellKey.LOCATE_ANIMALS_OR_PLANTS,
		SpellKey.LOCATE_OBJECT,
		SpellKey.PASS_WITHOUT_TRACE,
		SpellKey.PROTECTION_FROM_POISON,
		SpellKey.SILENCE,
		SpellKey.SPIKE_GROWTH,
		SpellKey.CONJURE_ANIMALS,
		SpellKey.CONJURE_BARRAGE,
		SpellKey.DAYLIGHT,
		SpellKey.LIGHTNING_ARROW,
		SpellKey.NONDETECTION,
		SpellKey.PLANT_GROWTH,
		SpellKey.PROTECTION_FROM_ENERGY,
		SpellKey.SPEAK_WITH_PLANTS,
		SpellKey.WATER_BREATHING,
		SpellKey.WATER_WALK,
		SpellKey.WIND_WALL,
		SpellKey.CONJURE_WOODLAND_BEINGS,
		SpellKey.FREEDOM_OF_MOVEMENT,
		SpellKey.GRASPING_VINE,
		SpellKey.LOCATE_CREATURE,
		SpellKey.STONESKIN,
		SpellKey.COMMUNE_WITH_NATURE,
		SpellKey.CONJURE_VOLLEY,
		SpellKey.SWIFT_QUIVER,
		SpellKey.TREE_STRIDE
	};
	public static final SpellKey[] SORCERER_SPELLS = {
		SpellKey.ACID_SPLASH,
		SpellKey.BLADE_WARD,
		SpellKey.CHILL_TOUCH,
		SpellKey.DANCING_LIGHTS,
		SpellKey.FIRE_BOLT,
		SpellKey.FRIENDS,
		SpellKey.LIGHT,
		SpellKey.MAGE_HAND,
		SpellKey.MENDING,
		SpellKey.MESSAGE,
		SpellKey.MINOR_ILLUSION,
		SpellKey.POISON_SPRAY,
		SpellKey.PRESTIDIGITATION,
		SpellKey.RAY_OF_FROST,
		SpellKey.SHOCKING_GRASP,
		SpellKey.TRUE_STRIKE,
		SpellKey.BURNING_HANDS,
		SpellKey.CHARM_PERSON,
		SpellKey.CHROMATIC_ORB,
		SpellKey.COLOR_SPRAY,
		SpellKey.COMPREHEND_LANGUAGES,
		SpellKey.DETECT_MAGIC,
		SpellKey.DISGUISE_SELF,
		SpellKey.EXPEDITIOUS_RETREAT,
		SpellKey.FALSE_LIFE,
		SpellKey.FEATHER_FALL,
		SpellKey.FOG_CLOUD,
		SpellKey.JUMP,
		SpellKey.MAGE_ARMOR,
		SpellKey.MAGIC_MISSILE,
		SpellKey.RAY_OF_SICKNESS,
		SpellKey.SHIELD,
		SpellKey.SILENT_IMAGE,
		SpellKey.SLEEP,
		SpellKey.THUNDERWAVE,
		SpellKey.WITCH_BOLT,
		SpellKey.ALTER_SELF,
		SpellKey.BLINDNESS_DEAFNESS,
		SpellKey.BLUR,
		SpellKey.CLOUD_OF_DAGGERS,
		SpellKey.CROWN_OF_MADNESS,
		SpellKey.DARKNESS,
		SpellKey.DARKVISION,
		SpellKey.DETECT_THOUGHTS,
		SpellKey.ENHANCE_ABILITY,
		SpellKey.ENLARGE_REDUCE,
		SpellKey.GUST_OF_WIND,
		SpellKey.HOLD_PERSON,
		SpellKey.INVISIBILITY,
		SpellKey.KNOCK,
		SpellKey.LEVITATE,
		SpellKey.MIRROR_IMAGE,
		SpellKey.MISTY_STEP,
		SpellKey.PHANTASMAL_FORCE,
		SpellKey.SCORCHING_RAY,
		SpellKey.SEE_INVISIBILITY,
		SpellKey.SHATTER,
		SpellKey.SPIDER_CLIMB,
		SpellKey.SUGGESTION,
		SpellKey.WEB,
		SpellKey.BLINK,
		SpellKey.CLAIRVOYANCE,
		SpellKey.COUNTERSPELL,
		SpellKey.DAYLIGHT,
		SpellKey.DISPEL_MAGIC,
		SpellKey.FEAR,
		SpellKey.FIREBALL,
		SpellKey.FLY,
		SpellKey.GASEOUS_FORM,
		SpellKey.HASTE,
		SpellKey.HYPNOTIC_PATTERN,
		SpellKey.LIGHTNING_BOLT,
		SpellKey.MAJOR_IMAGE,
		SpellKey.PROTECTION_FROM_ENERGY,
		SpellKey.SLEET_STORM,
		SpellKey.SLOW,
		SpellKey.STINKING_CLOUD,
		SpellKey.TONGUES,
		SpellKey.WATER_BREATHING,
		SpellKey.WATER_WALK,
		SpellKey.BANISHMENT,
		SpellKey.BLIGHT,
		SpellKey.CONFUSION,
		SpellKey.DIMENSION_DOOR,
		SpellKey.DOMINATE_BEAST,
		SpellKey.GREATER_INVISIBILITY,
		SpellKey.ICE_STORM,
		SpellKey.POLYMORPH,
		SpellKey.STONESKIN,
		SpellKey.WALL_OF_FIRE,
		SpellKey.ANIMATE_OBJECTS,
		SpellKey.CLOUDKILL,
		SpellKey.CONE_OF_COLD,
		SpellKey.CREATION,
		SpellKey.DOMINATE_PERSON,
		SpellKey.HOLD_MONSTER,
		SpellKey.INSECT_PLAGUE,
		SpellKey.SEEMING,
		SpellKey.TELEKINESIS,
		SpellKey.TELEPORTATION_CIRCLE,
		SpellKey.WALL_OF_STONE,
		SpellKey.ARCANE_GATE,
		SpellKey.CHAIN_LIGHTNING,
		SpellKey.CIRCLE_OF_DEATH,
		SpellKey.DISINTEGRATE,
		SpellKey.EYEBITE,
		SpellKey.GLOBE_OF_INVULNERABILITY,
		SpellKey.MASS_SUGGESTION,
		SpellKey.MOVE_EARTH,
		SpellKey.SUNBEAM,
		SpellKey.TRUE_SEEING,
		SpellKey.DELAYED_BLAST_FIREBALL,
		SpellKey.ETHEREALNESS,
		SpellKey.FINGER_OF_DEATH,
		SpellKey.FIRE_STORM,
		SpellKey.PLANE_SHIFT,
		SpellKey.PRISMATIC_SPRAY,
		SpellKey.REVERSE_GRAVITY,
		SpellKey.TELEPORT,
		SpellKey.DOMINATE_MONSTER,
		SpellKey.EARTHQUAKE,
		SpellKey.INCENDIARY_CLOUD,
		SpellKey.POWER_WORD_STUN,
		SpellKey.SUNBURST,
		SpellKey.GATE,
		SpellKey.METEOR_SWARM,
		SpellKey.POWER_WORD_KILL,
		SpellKey.TIME_STOP,
		SpellKey.WISH
	};
	public static final SpellKey[] WARLOCK_SPELLS = {
		SpellKey.BLADE_WARD,
		SpellKey.CHILL_TOUCH,
		SpellKey.ELDRITCH_BLAST,
		SpellKey.FRIENDS,
		SpellKey.MAGE_HAND,
		SpellKey.MINOR_ILLUSION,
		SpellKey.POISON_SPRAY,
		SpellKey.PRESTIDIGITATION,
		SpellKey.TRUE_STRIKE,
		SpellKey.ARMOR_OF_AGATHYS,
		SpellKey.ARMS_OF_HADAR,
		SpellKey.CHARM_PERSON,
		SpellKey.COMPREHEND_LANGUAGES,
		SpellKey.EXPEDITIOUS_RETREAT,
		SpellKey.HELLISH_REBUKE,
		SpellKey.HEX,
		SpellKey.ILLUSORY_SCRIPT,
		SpellKey.PROTECTION_FROM_EVIL_AND_GOOD,
		SpellKey.UNSEEN_SERVANT,
		SpellKey.WITCH_BOLT,
		SpellKey.CLOUD_OF_DAGGERS,
		SpellKey.CROWN_OF_MADNESS,
		SpellKey.DARKNESS,
		SpellKey.ENTHRALL,
		SpellKey.HOLD_PERSON,
		SpellKey.INVISIBILITY,
		SpellKey.MIRROR_IMAGE,
		SpellKey.MISTY_STEP,
		SpellKey.RAY_OF_ENFEEBLEMENT,
		SpellKey.SHATTER,
		SpellKey.SPIDER_CLIMB,
		SpellKey.SUGGESTION,
		SpellKey.COUNTERSPELL,
		SpellKey.DISPEL_MAGIC,
		SpellKey.FEAR,
		SpellKey.FLY,
		SpellKey.GASEOUS_FORM,
		SpellKey.HUNGER_OF_HADAR,
		SpellKey.HYPNOTIC_PATTERN,
		SpellKey.MAGIC_CIRCLE,
		SpellKey.MAJOR_IMAGE,
		SpellKey.REMOVE_CURSE,
		SpellKey.TONGUES,
		SpellKey.VAMPIRIC_TOUCH,
		SpellKey.BANISHMENT,
		SpellKey.BLIGHT,
		SpellKey.DIMENSION_DOOR,
		SpellKey.HALLUCINATORY_TERRAIN,
		SpellKey.CONTACT_OTHER_PLANE,
		SpellKey.DREAM,
		SpellKey.HOLD_MONSTER,
		SpellKey.SCRYING,
		SpellKey.ARCANE_GATE,
		SpellKey.CIRCLE_OF_DEATH,
		SpellKey.CONJURE_FEY,
		SpellKey.CREATE_UNDEAD,
		SpellKey.EYEBITE,
		SpellKey.FLESH_TO_STONE,
		SpellKey.MASS_SUGGESTION,
		SpellKey.TRUE_SEEING,
		SpellKey.ETHEREALNESS,
		SpellKey.FINGER_OF_DEATH,
		SpellKey.FORCECAGE,
		SpellKey.PLANE_SHIFT,
		SpellKey.DEMIPLANE,
		SpellKey.DOMINATE_MONSTER,
		SpellKey.FEEBLEMIND,
		SpellKey.GLIBNESS,
		SpellKey.POWER_WORD_STUN,
		SpellKey.ASTRAL_PROJECTION,
		SpellKey.FORESIGHT,
		SpellKey.IMPRISONMENT,
		SpellKey.POWER_WORD_KILL,
		SpellKey.TRUE_POLYMORPH
	};
	public static final SpellKey[] WIZARD_SPELLS = {
		SpellKey.ACID_SPLASH,
		SpellKey.BLADE_WARD,
		SpellKey.CHILL_TOUCH,
		SpellKey.DANCING_LIGHTS,
		SpellKey.FIRE_BOLT,
		SpellKey.FRIENDS,
		SpellKey.LIGHT,
		SpellKey.MAGE_HAND,
		SpellKey.MENDING,
		SpellKey.MESSAGE,
		SpellKey.MINOR_ILLUSION,
		SpellKey.POISON_SPRAY,
		SpellKey.PRESTIDIGITATION,
		SpellKey.RAY_OF_FROST,
		SpellKey.SHOCKING_GRASP,
		SpellKey.TRUE_STRIKE,
		SpellKey.ALARM,
		SpellKey.BURNING_HANDS,
		SpellKey.CHARM_PERSON,
		SpellKey.CHROMATIC_ORB,
		SpellKey.COLOR_SPRAY,
		SpellKey.COMPREHEND_LANGUAGES,
		SpellKey.DETECT_MAGIC,
		SpellKey.DISGUISE_SELF,
		SpellKey.EXPEDITIOUS_RETREAT,
		SpellKey.FALSE_LIFE,
		SpellKey.FEATHER_FALL,
		SpellKey.FIND_FAMILIAR,
		SpellKey.FOG_CLOUD,
		SpellKey.GREASE,
		SpellKey.IDENTIFY,
		SpellKey.ILLUSORY_SCRIPT,
		SpellKey.JUMP,
		SpellKey.LONGSTRIDER,
		SpellKey.MAGE_ARMOR,
		SpellKey.MAGIC_MISSILE,
		SpellKey.PROTECTION_FROM_EVIL_AND_GOOD,
		SpellKey.RAY_OF_SICKNESS,
		SpellKey.SHIELD,
		SpellKey.SILENT_IMAGE,
		SpellKey.SLEEP,
		SpellKey.TASHAS_HIDEOUS_LAUGHTER,
		SpellKey.TENSERS_FLOATING_DISK,
		SpellKey.THUNDERWAVE,
		SpellKey.UNSEEN_SERVANT,
		SpellKey.WITCH_BOLT,
		SpellKey.ALTER_SELF,
		SpellKey.ARCANE_LOCK,
		SpellKey.BLINDNESS_DEAFNESS,
		SpellKey.BLUR,
		SpellKey.CLOUD_OF_DAGGERS,
		SpellKey.CONTINUAL_FLAME,
		SpellKey.CROWN_OF_MADNESS,
		SpellKey.DARKNESS,
		SpellKey.DARKVISION,
		SpellKey.DETECT_THOUGHTS,
		SpellKey.ENLARGE_REDUCE,
		SpellKey.FLAMING_SPHERE,
		SpellKey.GENTLE_REPOSE,
		SpellKey.GUST_OF_WIND,
		SpellKey.HOLD_PERSON,
		SpellKey.INVISIBILITY,
		SpellKey.KNOCK,
		SpellKey.LEVITATE,
		SpellKey.LOCATE_OBJECT,
		SpellKey.MAGIC_MOUTH,
		SpellKey.MAGIC_WEAPON,
		SpellKey.MELFS_ACID_ARROW,
		SpellKey.MIRROR_IMAGE,
		SpellKey.MISTY_STEP,
		SpellKey.NYSTULS_MAGIC_AURA,
		SpellKey.PHANTASMAL_FORCE,
		SpellKey.RAY_OF_ENFEEBLEMENT,
		SpellKey.ROPE_TRICK,
		SpellKey.SCORCHING_RAY,
		SpellKey.SEE_INVISIBILITY,
		SpellKey.SHATTER,
		SpellKey.SPIDER_CLIMB,
		SpellKey.SUGGESTION,
		SpellKey.WEB,
		SpellKey.ANIMATE_DEAD,
		SpellKey.BESTOW_CURSE,
		SpellKey.BLINK,
		SpellKey.CLAIRVOYANCE,
		SpellKey.COUNTERSPELL,
		SpellKey.DISPEL_MAGIC,
		SpellKey.FEAR,
		SpellKey.FEIGN_DEATH,
		SpellKey.FIREBALL,
		SpellKey.FLY,
		SpellKey.GASEOUS_FORM,
		SpellKey.GLYPH_OF_WARDING,
		SpellKey.HASTE,
		SpellKey.HYPNOTIC_PATTERN,
		SpellKey.LEOMUNDS_TINY_HUT,
		SpellKey.LIGHTNING_BOLT,
		SpellKey.MAGIC_CIRCLE,
		SpellKey.MAJOR_IMAGE,
		SpellKey.NONDETECTION,
		SpellKey.PHANTOM_STEED,
		SpellKey.PROTECTION_FROM_ENERGY,
		SpellKey.REMOVE_CURSE,
		SpellKey.SENDING,
		SpellKey.SLEET_STORM,
		SpellKey.SLOW,
		SpellKey.STINKING_CLOUD,
		SpellKey.TONGUES,
		SpellKey.VAMPIRIC_TOUCH,
		SpellKey.WATER_BREATHING,
		SpellKey.ARCANE_EYE,
		SpellKey.BANISHMENT,
		SpellKey.BLIGHT,
		SpellKey.CONFUSION,
		SpellKey.CONJURE_MINOR_ELEMENTALS,
		SpellKey.CONTROL_WATER,
		SpellKey.DIMENSION_DOOR,
		SpellKey.EVARDS_BLACK_TENTACLES,
		SpellKey.FABRICATE,
		SpellKey.FIRE_SHIELD,
		SpellKey.GREATER_INVISIBILITY,
		SpellKey.HALLUCINATORY_TERRAIN,
		SpellKey.ICE_STORM,
		SpellKey.LEOMUNDS_SECRET_CHEST,
		SpellKey.LOCATE_CREATURE,
		SpellKey.MORDENKAINENS_FAITHFUL_HOUND,
		SpellKey.MORDENKAINENS_PRIVATE_SANCTUM,
		SpellKey.OTILUKES_RESILIENT_SPHERE,
		SpellKey.PHANTASMAL_KILLER,
		SpellKey.POLYMORPH,
		SpellKey.STONE_SHAPE,
		SpellKey.STONESKIN,
		SpellKey.WALL_OF_FIRE,
		SpellKey.ANIMATE_OBJECTS,
		SpellKey.BIGBYS_HAND,
		SpellKey.CLOUDKILL,
		SpellKey.CONE_OF_COLD,
		SpellKey.CONJURE_ELEMENTAL,
		SpellKey.CONTACT_OTHER_PLANE,
		SpellKey.CREATION,
		SpellKey.DOMINATE_PERSON,
		SpellKey.DREAM,
		SpellKey.GEAS,
		SpellKey.HOLD_MONSTER,
		SpellKey.LEGEND_LORE,
		SpellKey.MISLEAD,
		SpellKey.MODIFY_MEMORY,
		SpellKey.PASSWALL,
		SpellKey.PLANAR_BINDING,
		SpellKey.RARYS_TELEPATHIC_BOND,
		SpellKey.SCRYING,
		SpellKey.SEEMING,
		SpellKey.TELEKINESIS,
		SpellKey.TELEPORTATION_CIRCLE,
		SpellKey.WALL_OF_FORCE,
		SpellKey.WALL_OF_STONE,
		SpellKey.ARCANE_GATE,
		SpellKey.CHAIN_LIGHTNING,
		SpellKey.CIRCLE_OF_DEATH,
		SpellKey.CONTINGENCY,
		SpellKey.CREATE_UNDEAD,
		SpellKey.DISINTEGRATE,
		SpellKey.DRAWMIJS_INSTANT_SUMMONS,
		SpellKey.EYEBITE,
		SpellKey.FLESH_TO_STONE,
		SpellKey.GLOBE_OF_INVULNERABILITY,
		SpellKey.GUARDS_AND_WARDS,
		SpellKey.MAGIC_JAR,
		SpellKey.MASS_SUGGESTION,
		SpellKey.MOVE_EARTH,
		SpellKey.OTILUKES_FREEZING_SPHERE,
		SpellKey.OTTOS_IRRESISTIBLE_DANCE,
		SpellKey.PROGRAMMED_ILLUSION,
		SpellKey.SUNBEAM,
		SpellKey.TRUE_SEEING,
		SpellKey.WALL_OF_ICE,
		SpellKey.DELAYED_BLAST_FIREBALL,
		SpellKey.ETHEREALNESS,
		SpellKey.FINGER_OF_DEATH,
		SpellKey.FORCECAGE,
		SpellKey.MIRAGE_ARCANE,
		SpellKey.MORDENKAINENS_MAGNIFICENT_MANSION,
		SpellKey.MORDENKAINENS_SWORD,
		SpellKey.PLANE_SHIFT,
		SpellKey.PRISMATIC_SPRAY,
		SpellKey.PROJECT_IMAGE,
		SpellKey.REVERSE_GRAVITY,
		SpellKey.SEQUESTER,
		SpellKey.SIMULACRUM,
		SpellKey.SYMBOL,
		SpellKey.TELEPORT,
		SpellKey.ANTIMAGIC_FIELD,
		SpellKey.ANTIPATHY_SYMPATHY,
		SpellKey.CLONE,
		SpellKey.CONTROL_WEATHER,
		SpellKey.DEMIPLANE,
		SpellKey.DOMINATE_MONSTER,
		SpellKey.FEEBLEMIND,
		SpellKey.INCENDIARY_CLOUD,
		SpellKey.MAZE,
		SpellKey.MIND_BLANK,
		SpellKey.POWER_WORD_STUN,
		SpellKey.SUNBURST,
		SpellKey.TELEPATHY,
		SpellKey.ASTRAL_PROJECTION,
		SpellKey.FORESIGHT,
		SpellKey.GATE,
		SpellKey.IMPRISONMENT,
		SpellKey.METEOR_SWARM,
		SpellKey.POWER_WORD_KILL,
		SpellKey.PRISMATIC_WALL,
		SpellKey.SHAPECHANGE,
		SpellKey.TIME_STOP,
		SpellKey.TRUE_POLYMORPH,
		SpellKey.WEIRD,
		SpellKey.WISH
	};
}
