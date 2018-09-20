public class TestSelectionSort {

	public static void main(String[] args) {
		
		SelectionSort ss = new SelectionSort(); 		
		int[] vetorA = {1,20,0,0,-5,0,98,1,0,2,-9};
		vetorA = ss.selectionSort(vetorA);

		for (int i: vetorA) {
			System.out.println(i);
		}

	}
}