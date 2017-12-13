package tech.relativelyobjective.easycharacter.backgrounds;

import tech.relativelyobjective.easycharacter.characterelements.Background;
import tech.relativelyobjective.easycharacter.characterelements.Feature;
import tech.relativelyobjective.easycharacter.characterelements.InventoryItem;
import tech.relativelyobjective.easycharacter.characterelements.Language;
import tech.relativelyobjective.easycharacter.characterelements.OtherProficiency;
import tech.relativelyobjective.easycharacter.characterelements.SkillProficiency;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
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
				Object[] pickedLanguages = MiscPrompts.openMultipleObjectChooserPrompt(langOptions, "Acolyte Languages", 2);
				String[] languages = new String[pickedLanguages.length];
				for (int i = 0; i < pickedLanguages.length; i++) {
					languages[i] = pickedLanguages[i].toString();
				}
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
								Lists.HOLY_SYMBOLS, 
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
							Lists.PRAYER_OBJECTS, 
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
				Object conTool = MiscPrompts.openSingleObjectChooserPrompt(Lists.CON_TOOLS, "Con Tool");
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
				//TODO
				break;
			case ENTERTAINER:
				//TODO
				break;
			case FOLK_HERO:
				//TODO
				break;
			case GUILD_ARTISAN:
				//TODO
				break;
			case HERMIT:
				//TODO
				break;
			case NOBLE:
				//TODO
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
