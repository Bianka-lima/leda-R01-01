package sorting.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sorting.AbstractSorting;
import sorting.simpleSorting.*;
import sorting.variationsOfBubblesort.BidirectionalBubbleSort;
import sorting.variationsOfBubblesort.RecursiveBubbleSort;
import sorting.variationsOfSelectionsort.RecursiveSelectionSort;

public class StudentSortingTest {

	private Integer[] vetorTamPar;
	private Integer[] vetorTamImpar;
	private Integer[] vetorVazio = {};
	private Integer[] vetorValoresRepetidos;
	private Integer[] vetorValoresIguais;

	public AbstractSorting<Integer> bubble;
	public AbstractSorting<Integer> insertion;
	public AbstractSorting<Integer> selection;
	public AbstractSorting<Integer> bubbleBidirecional;
	public AbstractSorting<Integer> bubbleRecursivo;
	public AbstractSorting<Integer> selectionRecursivo;

	@Before
	public void setUp() {
		populaVetorTamanhoPar(new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23,
				31 });
		populaVetorTamanhoImpar(new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49,
				11, 18, 36 });
		populaVetorRepetido(new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 });
		populaVetorIgual(new Integer[] { 6, 6, 6, 6, 6, 6 });

		getBubble();
		getInsertion();
		getSelection();
		getBubbleBidirecional();
		getBubbleRecursivo();
		getSelectionRecursivo();
		//getImplementation2();
	}

	// // MÉTODOS AUXILIARES DA INICIALIZAÇÃO
	/**
	 * Método que inicializa a implementação a ser testada com a implementação
	 * do aluno
	 */
	private void getBubble() {
		this.bubble = new BubbleSort<>();
	}

	private void getInsertion() {
		this.insertion = new InsertionSort<>();
	}

	private void getSelection() {
		this.selection = new SelectionSort<>();
	}

	private void getBubbleBidirecional() {
		this.bubbleBidirecional = new BidirectionalBubbleSort<>();
	}

	private void getBubbleRecursivo() {
		this.bubbleRecursivo = new RecursiveBubbleSort<>();
	}

	private void getSelectionRecursivo() {
		this.selectionRecursivo = new RecursiveSelectionSort<>();
	}

	public void populaVetorTamanhoPar(Integer[] arrayPadrao) {
		this.vetorTamPar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
	}

	public void populaVetorTamanhoImpar(Integer[] arrayPadrao) {
		this.vetorTamImpar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
	}

	public void populaVetorRepetido(Integer[] arrayPadrao) {
		this.vetorValoresRepetidos = Arrays.copyOf(arrayPadrao,
				arrayPadrao.length);
	}

	public void populaVetorIgual(Integer[] arrayPadrao) {
		this.vetorValoresIguais = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}

	// FIM DOS METODOS AUXILIARES DA INICIALIZAÇÃO

	// MÉTODOS DE TESTE

	public void bubbleTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		bubble.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	public void insertionTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		insertion.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	public void selectionTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		selection.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	public void bubbleBidirecionalTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		bubbleBidirecional.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	public void bubbleRecursivoTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		bubbleRecursivo.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	public void selectionRecursivoTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		selectionRecursivo.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}


	@Test
	public void testSort01() {
		bubbleTest(vetorTamPar);
		insertionTest(vetorTamPar);
		selectionTest(vetorTamPar);
		bubbleBidirecionalTest(vetorTamPar);
		bubbleRecursivoTest(vetorTamPar);
		selectionRecursivoTest(vetorTamPar);
	}

	@Test
	public void testSort02() {
		bubbleTest(vetorTamImpar);
		insertionTest(vetorTamImpar);
		selectionTest(vetorTamImpar);
		bubbleBidirecionalTest(vetorTamImpar);
		bubbleRecursivoTest(vetorTamImpar);
		selectionRecursivoTest(vetorTamImpar);
	}

	@Test
	public void testSort03() {
		bubbleTest(vetorVazio);
		insertionTest(vetorVazio);
		selectionTest(vetorVazio);
		bubbleBidirecionalTest(vetorVazio);
		bubbleRecursivoTest(vetorVazio);
		selectionRecursivoTest(vetorVazio);
	}

	@Test
	public void testSort04() {
		bubbleTest(vetorValoresIguais);
		insertionTest(vetorValoresIguais);
		selectionTest(vetorValoresIguais);
		bubbleBidirecionalTest(vetorValoresIguais);
		bubbleRecursivoTest(vetorValoresIguais);
		selectionRecursivoTest(vetorValoresIguais);
	}

	@Test
	public void testSort05() {
		bubbleTest(vetorValoresRepetidos);
		insertionTest(vetorValoresRepetidos);
		selectionTest(vetorValoresRepetidos);
		bubbleBidirecionalTest(vetorValoresRepetidos);
		bubbleRecursivoTest(vetorValoresRepetidos);
		selectionRecursivoTest(vetorValoresRepetidos);
	}

	// MÉTODOS QUE OS ALUNOS PODEM CRIAR
	/**
	 * O ALUNO PODE IMPLEMENTAR METODOS DE ORDENAÇÃO TESTANDO O SORT COM TRES
	 * ARGUMENTOS PARA TESTAR A ORDENACAO EM UM PEDAÇO DO ARRAY. DICA: PROCUREM
	 * SEGUIR A ESTRUTURA DOS MÉTODOS DE TESTE ACIMA DESCRITOS, ORDENANDO APENAS
	 * UMA PARTE DO ARRAY.
	 */
}