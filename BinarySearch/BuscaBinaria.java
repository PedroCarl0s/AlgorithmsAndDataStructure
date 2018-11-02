public class BuscaBinaria {

	public static int buscar(int[] a, int chave) {
		int n = a.length;
		int lo = 0;
		int hi = n-1;

		while (lo <= hi) {

			int mid = lo + (hi - lo) / 2;
			if (chave < a[mid]) hi = mid - 1;
			else if (chave > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {10,89,99,102,999};
		int res = BuscaBinaria.busca(a, 10);
		System.out.println(res);
	}

}