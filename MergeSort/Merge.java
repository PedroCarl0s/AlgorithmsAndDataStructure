public class Merge {

	private Merge() {};

	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		// pré condição: a[lo..mid] e a[mid+1..hi] são subarrays ordenados
		//assert isSorted(a, lo, mid);
		//assert isSorted(a, mid+1, hi);

		// copiando para o aux[]   | Vai do índice mais baixo até o índice mais alto
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		// fazer o merge novamente com o a[]
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) 					a[k] = aux[j++];   // índice mais baixo ultrapassa o índice do meio
			else if (j > hi)				a[k] = aux[i++];   // índice do meio+1 ultrapassa o índice mais alto
			else if (less(aux[j], aux[i]))	a[k] = aux[j++];	
			else 							a[k] = aux[i++];	
		}

		// pós condição: a[lo..hi] "vetor a do índice mais baixo ao mais alto está ordenado"
		//assert isSorted(a, lo, hi);
	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if (hi <= lo) return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}

	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length-1);
		//assert isSorted(a);
	}

	// será v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// troca a[i] e a[j]
	private static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
 	
	// imprima o array com a saída padrão da biblioteca StdOut
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.println(a[i]);
		}
	}

	public static void main(String[] args) {
		String[] a = StdIn.readAllStrings();
		Merge.sort(a);
		show(a);
	}
}