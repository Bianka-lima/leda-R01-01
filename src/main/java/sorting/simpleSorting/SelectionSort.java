package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int min;
		for (int i = leftIndex; i < rightIndex; i++) {
			min = i;
			for (int j = i + 1; j < rightIndex; j ++) {
				if  (array[j].compareTo(array[i]) == -1) {
					min = j;
				}
			}
			troque(array, i, min);
		}
	}

	public void troque(T[] array, int indexI, int indexJ){
		T temp = array[indexI];
		array[indexI] = array[indexJ];
		array[indexJ] = temp;

	}
}
