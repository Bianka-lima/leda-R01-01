package sorting.variationsOfSelectionsort;

import java.util.Arrays;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int max = leftIndex;
		if (leftIndex != rightIndex && array.length > 0) {
			for (int i = leftIndex; i <= rightIndex; i++) {
				if (array[i].compareTo(array[max]) == 1) 
					max = i;
			}
			Util.swap(array, max, rightIndex);
			sort(array, leftIndex, rightIndex-1);
		}
		
	}

}
