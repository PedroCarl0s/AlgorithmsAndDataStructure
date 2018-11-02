public class BuscaBinariaRecursiva {

	public static int buscaBinaria(int[] a, int chave, int lo, int hi) {
		
		if (lo <= hi) {

			int mid = lo + (hi - lo) / 2;
			
			if (chave < a[mid]) {
				return buscaBinaria(a, chave, lo, mid-1);
			
			} else if (chave > a[mid]) {
				return buscaBinaria(a, chave, mid+1, hi);
			
			} else{ 
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int res = buscaBinaria(a, 30, 0, a.length-1);
		System.out.println(res);
	}
}