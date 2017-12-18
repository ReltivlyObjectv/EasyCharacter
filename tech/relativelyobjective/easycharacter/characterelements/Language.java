package tech.relativelyobjective.easycharacter.characterelements;

import java.util.Arrays;
import java.util.stream.Stream;
import tech.relativelyobjective.easycharacter.utilities.InformationManager;
import tech.relativelyobjective.easycharacter.utilities.MiscPrompts;

/**
 *
 * @author ReltivlyObjectv
 */
public class Language implements CharacterElement,Comparable {
	public String lang;

	public Language() {
		lang = "New Language";
	}
	public Language(String l) {
		lang = l;
	}
	@Override
	public void edit() {
		String[] languageOptions;
		if (lang.equals("") || lang.equals("New Language")) {
			languageOptions = InformationManager.getUnknownLanguages();
		} else {
			String[] currentLanguage = {lang};
			languageOptions = Stream.concat(
				Arrays.stream(currentLanguage), 
				Arrays.stream(InformationManager.getUnknownLanguages())
			).toArray(String[]::new);
		}
		lang = MiscPrompts.openSingleStringChooserPrompt(languageOptions, "Language", true);
	}
	@Override
	public String toString() {
		return "Language: "+lang;
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
}
