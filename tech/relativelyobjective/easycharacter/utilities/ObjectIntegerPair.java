package tech.relativelyobjective.easycharacter.utilities;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 * @param <T>
 */
public class ObjectIntegerPair<T> {
	public T object;
	public Integer value;
	public ObjectIntegerPair() {
		object = null;
		value = null;
	}
	public ObjectIntegerPair(T o, int v) {
		object = o;
		value = v;
	}
}
