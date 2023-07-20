public class MergeSort {
	public static void main(String[] args) {
		int[] a = { 3, 2, 5, 3, 6, 56, 7, 3 };
		mergeSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void mergeSort(int[] a, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(a, l, mid);
			mergeSort(a, mid + 1, r);
			merge(a, l, mid, r);
		}
	}

	private static void merge(int[] a, int l, int mid, int r) {
		int[] b = new int[a.length];
		int i = l;
		int j = mid + 1;
		int k = l;
		while (i <= mid && j <= r) {
			if (a[i] < a[j]) {
				b[k] = a[i];
				i++;
			} else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			b[k] = a[i];
			i++;
			k++;
		}
		while (j <= r) {
			b[k] = a[j];
			j++;
			k++;
		}
		for (k = l; k <= r; k++) {
			a[k] = b[k];
		}

	}
}
