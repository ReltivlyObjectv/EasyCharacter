package tech.relativelyobjective.easycharacter.characterelements;

/**
 *
 * @author ReltivlyObjectv
 */
public class Spell implements CharacterElement,Comparable {
	public String name;
	private int level;
	public Spell() {
		name = "";
		level = 0;
	}
	public Spell(String n, int l) {
		name = n;
		level = l;
	}
	@Override
	public void edit() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public String toString() {
		return String.format("Spell: %s (%s)",
			name,
			level < 1 ? "Cantrip" : "Level "+level);
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int l) {
		level = l < 1 ? 0 
			: l > 9 ? 9 
			: l;
	}
}
