public class TestInsertionSort {

	public static void main(String[] args) {
		
		InsertionSort is = new InsertionSort();
		int[] vetorA = {9,5,1,3,2,0,80,1000,0,9,102,3,20,10,-1};
		vetorA = is.sort(vetorA);

		for (int i: vetorA) {
			System.out.println(i);
		}
	}
}