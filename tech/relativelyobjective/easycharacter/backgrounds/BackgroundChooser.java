package tech.relativelyobjective.easycharacter.backgrounds;

import tech.relativelyobjective.easycharacter.characterelements.Background;
import tech.relativelyobjective.easycharacter.characterelements.CriminalSpecialty;
import tech.relativelyobjective.easycharacter.characterelements.EntertainerRoutine;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.ItemLists;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class BackgroundChooser {
	public static void setBackground(Lists.Background bg) {
		InformationManager.resetBackgroundElements();
		WindowManager.getBackgroundTab().updateBackgroundElementsList();
		InformationManager.addBackgroundElement(new Background(bg));
		switch (bg) {
			case ACOLYTE:
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.INSIGHT));
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.RELIGION));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				String[] langOptions = InformationManager.getUnknownLanguages();
				String[] languages = MiscPrompts.openMultipleObjectChooserPrompt(
					langOptions,
					"Additional Languages",
					2,
					String.class
				);
				for (String lang : languages) {
					InformationManager.addBackgroundElement(new Language(lang));
				}
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new InventoryItem("Incense Stick",5));
				InformationManager.addBackgroundElement(new InventoryItem("Vestments",1));
				InformationManager.addBackgroundElement(new InventoryItem("Common Clothes",1));
				InformationManager.addBackgroundElement(new InventoryItem("Gold",15));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(
					new InventoryItem(
						String.format(
							"%s (Holy Symbol)",
							MiscPrompts.openSingleStringChooserPrompt(
								ItemLists.HOLY_SYMBOLS, 
								"Holy Symbol",
								true
							)
						),
						1
					)
				);
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(
					new InventoryItem(
						MiscPrompts.openSingleStringChooserPrompt(
							ItemLists.PRAYER_OBJECTS, 
							"Prayer Object",
							true
						),
						1
					)
				);
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new Feature(
					"Shelter of the Faithful",
					"As an acolyte, you command the respect of those who share "+
					"your faith, and you can perform the religious ceremonies of "+
					"your deity. You and your adventuring companions can expect "+
					"to receive free healing and care at a temple, shrine, or "+
					"other established presence of your faith, though you must "+
					"provide any material components needed for spells. Those "+
					"who share your religion will support you (but only you) at "+
					"a modest lifestyle. You might also have ties to a specific "+
					"temple dedicated to your chosen deity or pantheon, and you "+
					"have a residence there, This could be the temple where you "+
					"used to serve, if you remain on good terms with it, or a "+
					"temple where you have found a new home. While near your temple, "+
					"you can call upon the priests for assistance, provided the "+
					"assistance you ask for is not hazardous and you remain in "+
					"good standing with your temple."
				));
				break;
			case CHARLATAN:
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.DECEPTION));
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.SLEIGHT_OF_HAND));
				InformationManager.addBackgroundElement(new OtherProficiency("Disguise Kit"));
				InformationManager.addBackgroundElement(new OtherProficiency("Forgery Kit"));
				InformationManager.addBackgroundElement(new InventoryItem("Fine Clothes",1));
				InformationManager.addBackgroundElement(new InventoryItem("Disguise Kit",1));
				InformationManager.addBackgroundElement(new InventoryItem("Gold",15));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InventoryItem conTool = MiscPrompts.openSingleObjectChooserPrompt(ItemLists.CON_TOOLS, "Con Tool");
				InformationManager.addBackgroundElement((InventoryItem) conTool);
				InformationManager.addBackgroundElement(new Feature(
					"False Identity",
					"You have created a second identity that includes documentation, "+
					"established acquaintances, and disguises that allow you to "+
					"assume that persona. Additionally, you can forge documents "+
					"including official papers and personal letters, as long as "+
					"you have seen an example of the kind of document or the "+
					"handwriting you are trying to copy."
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				break;
			case CRIMINAL:
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.DECEPTION));
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.STEALTH));
				InformationManager.addBackgroundElement(new OtherProficiency("Thieves' Tools"));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new OtherProficiency(
					MiscPrompts.openSingleStringChooserPrompt(ItemLists.GAMING_SETS, "Gaming Set", true)
				));
				InformationManager.addBackgroundElement(new InventoryItem("Crowbar",1));
				InformationManager.addBackgroundElement(new InventoryItem("Hooded Dark Common Clothes",1));
				InformationManager.addBackgroundElement(new InventoryItem("Gold",15));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new CriminalSpecialty(
					MiscPrompts.openSingleObjectChooserPrompt(
						Lists.CriminalSpecialty.values(),
						"Criminal Specialty"
					)
				));
				InformationManager.addBackgroundElement(new Feature(
					"Criminal Contact",
					"You have a reliable and trustworthy contact who acts as "+
					"your liaison to a network of other criminals. You know how "+
					"to get messages to and from your contact, even over great "+
					"distances; specifically, you know lhe local messengers, "+
					"corrupt caravan masters, and seedy sailors who can deliver "+
					"messages for you."
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				break;
			case ENTERTAINER:
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.ACROBATICS));
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.PERFORMANCE));
				InformationManager.addBackgroundElement(new OtherProficiency("Disguise Kit"));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				String instrument = MiscPrompts.openSingleStringChooserPrompt(
					ItemLists.INSTRUMENTS,
					"Instrument Proficiency/Item",
					true
				);
				InformationManager.addBackgroundElement(new OtherProficiency(instrument));
				InformationManager.addBackgroundElement(new InventoryItem(instrument));
				InformationManager.addBackgroundElement(new InventoryItem("Costume"));
				InformationManager.addBackgroundElement(new InventoryItem("Gold",15));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new InventoryItem(String.format(
					"%s from an Admirer",
					MiscPrompts.openSingleStringChooserPrompt(
						ItemLists.FAVOR_OF_ADMIRER,
						"Favor from an Admirer (Item)",
						true
					)
				)));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new EntertainerRoutine(
					MiscPrompts.openSingleObjectChooserPrompt(
						Lists.EntertainerRountine.values(),
					"Entertainer Routine"
					)
				));
				InformationManager.addBackgroundElement(new Feature(
					"Popular by Demand",
					"You can always find a place to perform, usually in an inn "+
					"or tavern but possibly with a circus, at a theater, or even "+
					"in a noble's court. At such a place, you receive free "+
					"lodging and food of a modest or comfortable standard "+
					"(depending on the quality of the establishment), "+
					"as long as you perform each night. In addition, your "+
					"performance makes you something of a local figure. When "+
					"strangers recognize you in a town where you have performed, "+
					"they typically take a liking to you."
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				break;
			case FOLK_HERO:
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.ANIMAL_HANDLING));
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.SURVIVAL));
				InformationManager.addBackgroundElement(new OtherProficiency("Vehicles (Land)"));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				String folkTool = MiscPrompts.openSingleStringChooserPrompt(
					ItemLists.ARTISANS_TOOLS,
					"Artisan's Tools Proficiency",
					true
				);
				InformationManager.addBackgroundElement(new OtherProficiency(folkTool));
				InformationManager.addBackgroundElement(new InventoryItem(folkTool));
				InformationManager.addBackgroundElement(new InventoryItem("Shovel"));
				InformationManager.addBackgroundElement(new InventoryItem("Iron Pot"));
				InformationManager.addBackgroundElement(new InventoryItem("Common Clothes"));
				InformationManager.addBackgroundElement(new InventoryItem("Gold",10));
				InformationManager.addBackgroundElement(new Feature(
					"Folk Hero",
					"You come from a humble social rank, but you are destined "+
					"for so much more. Already the people of your home village "+
					"regard you as their champion, and your destiny calls you "+
					"to stand against the tyrants and monsters that threaten the "+
					"common folk everywhere."
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				break;
			case GUILD_ARTISAN:
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.INSIGHT));
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.PERSUASION));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new Language(
					MiscPrompts.openSingleStringChooserPrompt(
						InformationManager.getUnknownLanguages(),
						"Additional Language",
						true
					)
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				String guildTool = MiscPrompts.openSingleObjectChooserPrompt(ItemLists.ARTISANS_TOOLS, "Artisan's Tools Proficiency/Item");
				InformationManager.addBackgroundElement(new OtherProficiency(guildTool));
				InformationManager.addBackgroundElement(new InventoryItem(guildTool));
				InformationManager.addBackgroundElement(new InventoryItem("A Letter of Introduction from Your Guild"));
				InformationManager.addBackgroundElement(new InventoryItem("Traveler's Clothes"));
				InformationManager.addBackgroundElement(new InventoryItem("Gold",15));
				InformationManager.addBackgroundElement(new Feature(
					"Guild Membership",
					"As an established and respected member of a guild, you can "+
					"rely on certain benefits that membership provides. Your "+
					"fellow guild members will provide you with lodging and food "+
					"if necessary, and pay for your funeral if needed. In some "+
					"cities and towns, a guildhall offers a central place to meet "+
					"other members of your profession, which can be a good place "+
					"to meet potential patrons, allies, or hirelings. Guilds "+
					"often wield tremendous political power. If you are accused "+
					"of a crime, your guild will support you if a good case can "+
					"be made for your innocence or the crime is justifiable. "+
					"You can also gain access to powerful political figures "+
					"through the guild, if you are a member in good standing. "+
					"Such connections might require the donation of money or "+
					"magic items to the guild's coffers. You must pay dues of "+
					"5 gp per month to the guild. If you miss payments, you must "+
					"make up back dues to remain in the guild's good graces."
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				break;
			case HERMIT:
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.MEDICINE));
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.RELIGION));
				InformationManager.addBackgroundElement(new OtherProficiency("Herbalism Kit"));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new Language(
					MiscPrompts.openSingleStringChooserPrompt(
						InformationManager.getUnknownLanguages(),
						"Additional Language",
						true
					)
				));
				InformationManager.addBackgroundElement(new InventoryItem(
					"A scroll case stuffed full of notes from your studies or prayers"
				));
				InformationManager.addBackgroundElement(new InventoryItem("Winter Blanket"));
				InformationManager.addBackgroundElement(new InventoryItem("Common Clothes"));
				InformationManager.addBackgroundElement(new InventoryItem("Herbalism Kit"));
				InformationManager.addBackgroundElement(new InventoryItem("Gold",5));
				InformationManager.addBackgroundElement(new Feature(
					"Discovery",
					"The quiet seclusion of your extended hermitage gave you "+
					"access to a unique and powerful discovery. The exact nature "+
					"of this revelation depends on the nature of your seclusion. "+
					"It might be a great truth about the cosmos, the deities, the "+
					"powerful beings of the outer planes, or the forces of nature. "+
					"It could be a site that no one else has ever seen. "+
					"You might have uncovered a fact that has long been forgotten, "+
					"or unearthed some relic of the past that could rewrite history. "+
					"It might be information that would be damaging to the people "+
					"who or consigned you to exile, and hence the reason for your "+
					"return to society. Work with your DM to determine the details "+
					"of your discovery and its impact on the campaign."
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				break;
			case NOBLE:
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.HISTORY));
				InformationManager.addBackgroundElement(new SkillProficiency(Lists.Skill.PERSUASION));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new Language(
					MiscPrompts.openSingleStringChooserPrompt(
						InformationManager.getUnknownLanguages(),
						"Additional Language",
						true
					)
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				InformationManager.addBackgroundElement(new OtherProficiency(
					MiscPrompts.openSingleStringChooserPrompt(ItemLists.GAMING_SETS, "Gaming Set Proficiency", true)
				));
				InformationManager.addBackgroundElement(new InventoryItem("Fine Clothes"));
				InformationManager.addBackgroundElement(new InventoryItem("Signet Ring"));
				InformationManager.addBackgroundElement(new InventoryItem("Scroll of Pedigree"));
				InformationManager.addBackgroundElement(new InventoryItem("Gold",25));
				InformationManager.addBackgroundElement(new Feature(
					"Position of Privilege",
					"Thanks to your noble birth, people are inclined to think "+
					"the best of you. You are welcome in high society, and "+
					"people assume you have the right to be wherever you are. "+
					"The common folk make every effort to accommodate you and "+
					"avoid your displeasure, and other people of high birth treat "+
					"you as a member of the same social sphere. You can secure "+
					"an audience with a local noble if you need to."
				));
				WindowManager.getBackgroundTab().updateBackgroundElementsList();
				break;
			case OUTLANDER:
				//TODO
				break;
			case SAGE:
				//TODO
				break;
			case SAILOR:
				//TODO
				break;
			case SOLDIER:
				//TODO
				break;
			case URCHIN:
				//TODO
				break;
		}
		WindowManager.getBackgroundTab().updateBackgroundElementsList();
		WindowManager.getMainFrame().setCompletedBackgroundTab(true);
	}
}
