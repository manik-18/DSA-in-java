
public class QuickSort {
	public static void main(String[] args) {
		int[] a = { 3, 2, 5, 3, 6, 56, 7, 3 };
		quickSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void quickSort(int[] a, int l, int h) {
		int loc;
		if (l < h) {
			loc = partition(a, l, h);
			quickSort(a, l, loc - 1);
			quickSort(a, loc + 1, h);
		}

	}

	private static int partition(int[] a, int l, int h) {
		int pivot = a[l];
		int i = l;
		int j = h;
		while (i < j) {
			while (a[i] <= pivot && i < j)
				i++;
			while (a[j] > pivot)
				j--;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[l];
		a[l] = a[j];
		a[j] = temp;
		return j;
	}
}
