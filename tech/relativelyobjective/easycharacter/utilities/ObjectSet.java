package tech.relativelyobjective.easycharacter.utilities;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 * @param <T>
 * @param <U>
 * @param <V>
 */
public class ObjectSet<T, U, V> {
	public T objectA;
	public U objectB;
	public V objectC;
	public ObjectSet() {
		objectA = null;
		objectB = null;
		objectC = null;
	}
	public ObjectSet(T objA, U objB, V objC) {
		objectA = objA;
		objectB = objB;
		objectC = objC;
	}
}
