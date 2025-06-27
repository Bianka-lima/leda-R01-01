package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		boolean trocaOcorreu = true;
		while (trocaOcorreu) {
			trocaOcorreu = false;
			for (int i = leftIndex; i < rightIndex; i++) {
				if (array[i].compareTo(array[i+1]) == 1) {
					troque(array, i, i+1);
					trocaOcorreu = true;
				}
			}
		}
	}
	public void troque(T[] array, int indexI, int indexJ) {
		T temp = array[indexI];
		array[indexI] = array[indexJ];
		array[indexJ] = temp; 
	}
}
