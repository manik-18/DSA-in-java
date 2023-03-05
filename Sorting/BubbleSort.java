
public class BubbleSort {
	
	static void bubbleSort(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			boolean swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					swapped = true;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int []a= {3,1,2,5,7,12,78,2,1};
		bubbleSort(a,a.length);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
