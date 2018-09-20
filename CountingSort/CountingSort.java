public class CountingSort {

	public CountingSort() {};

	public int[] sort(int[] vetorA) {

		int tamanho = vetorA.length;
		int maiorElemento = vetorA[0];
		for (int i = 1; i < vetorA.length; i++) {
			if (vetorA[i] > maiorElemento) maiorElemento = vetorA[i];
		}

		// vetor auxiliar
		int[] vetorAux = new int[maiorElemento+1];

		for (int i = 0; i < vetorAux.length; i++) {	// preenchendo o vetor auxiliar com zero
			vetorAux[i] = 0;
		}

		// contando os elementos
		for (int j = 0; j < tamanho; j++) {
			vetorAux[vetorA[j]]++;
		}

		// elementos menores ou iguais a i
		for (int i = 1; i < vetorAux.length; i++) {
			vetorAux[i] += vetorAux[i-1];
		}

		int[] vetorOrdenado = new int[tamanho];
		for (int j = tamanho-1; j >= 0; j--) {
			vetorOrdenado[vetorAux[vetorA[j]]-1] = vetorA[j];
			vetorAux[vetorA[j]]--;
		}
		return vetorOrdenado; // vetor auxiliar que foi ordenado
	}

}