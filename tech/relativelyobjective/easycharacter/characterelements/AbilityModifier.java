package tech.relativelyobjective.easycharacter.characterelements;

import java.util.HashMap;
import tech.relativelyobjective.easycharacter.utilities.Lists;

/**
 *
 * @author ReltivlyObjectv
 */
public class AbilityModifier implements CharacterElement {
	private HashMap<Lists.Ability, Integer> stats;
	
	public AbilityModifier() {
		stats = new HashMap<>();
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	public void setModifier(Lists.Ability key, Integer value) {
		stats.put(key, value);
	}
	public int getModifier(Lists.Ability key) {
		if (stats.containsKey(key)) {
			return stats.get(key);
		} else {
			return 0;
		}
	}
	public HashMap<Lists.Ability, Integer> getAllModifiers() {
		return new HashMap<>(stats);
	}
}
