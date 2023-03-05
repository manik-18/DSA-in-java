public class SelectionSort {
	
	static void selectionSort(int a[], int n) {
	    for (int i=0;i<n-1;i++) {
	        int min=i;
	        for (int j=i+1;j<n;j++) {
	            if (a[j]<a[min]) {
	                min=j;
	            }
	        }
	        if (min!=i) {
	            int temp=a[min];
	            a[min]=a[i];
	            a[i]=temp;
	        }
	    }
	}

	public static void main(String[] args) {
		int []a= {3,1,2,5,7,12,78,2,1};
		selectionSort(a,a.length);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
