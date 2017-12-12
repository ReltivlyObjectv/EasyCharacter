package tech.relativelyobjective.easycharacter.backgrounds;

import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.Lists;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 */
public class BackgroundChooser {
	public static void setBackground(Lists.Background bg) {
		InformationManager.resetBackgroundElements();
		WindowManager.getBackgroundTab().updateBackgroundElementsList();
		System.out.printf("Some Background: %s\n", bg.toString());
		switch (bg) {
			case ACOLYTE:
				//TODO
				break;
			case CHARLATAN:
				//TODO
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
