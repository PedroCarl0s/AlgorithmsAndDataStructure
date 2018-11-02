public class Quick {

	private Quick() {};

	public static void shuffle(Object[] a) {	// embaralha o vetor
		if (a == null) throw new NullPointerException("O array é nulo");

		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + StdRandom.uniform(n-1);
			Object temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}

	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length-1);
	}

	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		Comparable v = a[lo];

		while (true) {

			// buscando o item do índice mais baixo(lo) para troca
			while (less(a[++i], v)) {
				if (i == hi) break;
			}

			// buscando o índice mais alto(hi) para troca
			while (less(v, a[--j])) {
				if (j == lo) break;
			}

			// checando se os índices se encontraram 
			if (i >= j) break;

			exch(a, i, j);
		}

		exch(a, lo, j);

		// agora, a[lo..j-1] <= a[j] <= a[j+1..hi]
		return j;
	}

	// será v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// troca a[i] com a[j]
	private static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	// imprimir o array com a saída padrão
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.println(a[i]);
		}
	}

	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		Quick.sort(a);
		show(a);


	}
}