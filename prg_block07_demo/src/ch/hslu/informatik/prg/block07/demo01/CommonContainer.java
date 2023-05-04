package ch.hslu.informatik.prg.block07.demo01;

public class CommonContainer<T> {

	private static final int INITIAL_SIZE = 10;

	private int index = 0;

	private T[] liste;

	@SuppressWarnings("unchecked")
	public CommonContainer(int initialSize) {
		liste = (T[]) new Object[initialSize];

	}

	public CommonContainer() {
		this(CommonContainer.INITIAL_SIZE);
	}

	public boolean add(T obj) {
		if (index < liste.length) {
			liste[index++] = obj;
			return true;
		}

		return false;
	}

	public T get(int index) {
		if (index >= 0 && index < liste.length) {
			return liste[index];
		}

		return null;
	}

	public boolean remove(T obj) {

		for (int i = 0; i < index; i++) {
		
			if (liste[i].equals(obj)) {
				
				liste[i] = null;

				shiftLeft(i);

				index--;

				return true;
			}
		}

		return false;
	}

	public void removeAll() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = null;
		}

		index = 0;
	}

	public int size() {
		return index;
	}

	/*
	 * Helper Method
	 */
	private void shiftLeft(int index) {
		for (int i = index; i < liste.length - 1; i++) {
			liste[i] = liste[i + 1];
		}
		liste[liste.length - 1] = null;
	}
}
