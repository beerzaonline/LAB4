package rmuti.lab4;

import java.util.Arrays;

public class ArrayList {
	public Object[] elementData = new Object[1];
	private int size = 0;

	public void add(int i, Object e) {
		ensureCapacity(size + 1);
		for (int j = size; j >= i; j--) {
			elementData[j + 1] = elementData[j];
		}
		elementData[i] = e;
		size++;
	}

	public void add(Object e) {
		ensureCapacity(size + 1);
		elementData[size++] = e;
	}

	public void addFirst(int n) {
		elementData[0] = n;
	}

	public void addLast(int n) {
		elementData[size - 1] = n;
	}

	public void remove(int index) {
		for (int j = index; j < size - 1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[size - 1] = null;
	}
	public int getSize(){
		return size;
	}

	// public void removeEven() {
	// for (int i = 0; i < size - 1; i++) {
	//
	// if (check % 2 == 0) {
	// for (int j = i; j < size - 1; j++) {
	// elementData[j] = elementData[j + 1];
	// }
	// elementData[size - 1] = null;
	// }
	// }
	// }

	public int countItem(Object e) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(e)) {
				count++;
			}
		}
		return count;
	}
	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = elementData.length;
		if (minCapacity > oldCapacity) {
			Object oldData[] = elementData;
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			Object[] arr = new Object[newCapacity];
			for (int i = 0; i < size; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(elementData);
	}

}

