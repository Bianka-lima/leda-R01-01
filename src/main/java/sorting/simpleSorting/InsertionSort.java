package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		boolean foraDeOrdem = true;
		int indexI = rightIndex;
		while (foraDeOrdem && indexI > leftIndex) {
			foraDeOrdem = false;
			int indexJ = indexI -1;
			if (array[indexI].compareTo(array[indexJ]) == -1) {
				troque(array, indexI, indexJ);
				foraDeOrdem = true;
			}
			indexI--;
		}
	}
	public void troque(T[] array, int indexI, int indexJ) {
		T temp = array[indexI];
		array[indexI] = array[indexJ];
		array[indexJ] = temp;
	}
}
