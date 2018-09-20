public class TestCountingSort {

	public static void main(String[] args) {
		CountingSort cs = new CountingSort();
		int[] vetorA = {380,1,9,5,0,181,0,88880,10,0,9,1};
		int[] vetorOrdenado = new int[vetorA.length];
		vetorOrdenado = cs.sort(vetorA);

		System.out.println("VETOR A ORDENADO: \n");
		for (int i: vetorOrdenado) {
			System.out.println(i);
		}
	}

}