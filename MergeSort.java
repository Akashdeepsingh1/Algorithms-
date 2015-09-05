public class MergeSort {

	public void mergeSortDivide(int a[], int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergeSortDivide(a, low, mid);
			mergeSortDivide(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}

	public void merge(int a[], int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;

		int a1[] = new int[n1 + 1];
		int a2[] = new int[n2 + 1];
		int indexA = low;

		for (int i = 0; i < n1; i++) {
			a1[i] = a[indexA];
			indexA++;
		}
		a1[n1] = Integer.MAX_VALUE;

		for (int j = 0; j < n2; j++) {
			a2[j] = a[j + mid + 1];
		}
		a2[n2] = Integer.MAX_VALUE;

		int a1Count = 0;
		int a2Count = 0;

		for (int i = low; i <= high; i++) {

			if (a1[a1Count] >= a2[a2Count]) {
				a[i] = a2[a2Count];
				a2Count++;
			} else {
				a[i] = a1[a1Count];
				a1Count++;
			}
		}
	}

	public static void main(String args[]) {

		MergeSort obj = new MergeSort();
		int a[] = new int[] { 5, 8, 1, 3, 6, 2, 0, 4, 54, -12 };
		obj.mergeSortDivide(a, 0, a.length - 1);
		
		for(int i  = 0 ; i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
