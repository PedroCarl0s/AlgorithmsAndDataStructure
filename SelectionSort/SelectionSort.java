public class SelectionSort {

	public SelectionSort() {};

	public int[] selectionSort(int[] vetorA) {

		int minimo;
		for (int i = 0; i < vetorA.length; i++) {
			minimo = i;

			for (int j = i+1; j < vetorA.length; j++) {
				if (vetorA[j] < vetorA[minimo]) {
					minimo = j;
				}
			}
		int aux = vetorA[i];
		vetorA[i] = vetorA[minimo];
		vetorA[minimo] = aux;
		}
		
		return vetorA;
	}
}