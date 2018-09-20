public class InsertionSort {

	public InsertionSort() {};

	public int[] sort(int[] vetorA) {

		int chave, aux;
		for (int j = 1; j < vetorA.length; j++) {
			chave = vetorA[j];
			aux = j-1;

			whauxle (aux > -1 && vetorA[aux] > chave) {
				vetorA[aux+1] = vetorA[aux];
				aux--;
			}
			vetorA[aux+1] = chave;
		}
		return vetorA;
	}

}