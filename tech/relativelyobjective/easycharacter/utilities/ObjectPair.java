package tech.relativelyobjective.easycharacter.utilities;

/**
 *
 * @author Christian Russell (me@relativelyobjective.tech)
 * @param <T>
 * @param <U>
 */
public class ObjectPair<T, U> {
	public T objectA;
	public U objectB;
	public ObjectPair() {
		objectA = null;
		objectB = null;
	}
	public ObjectPair(T objA, U objB) {
		objectA = objA;
		objectB = objB;
	}
}
