import java.util.Scanner;

public class TwoOddOccuring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {3,4,3,4,5,4,4,6,7,7};
		twoOddOccuring(arr);
		sc.close();
	}

	private static void twoOddOccuring(int arr[]) {
		int x=arr[0];
		for(int i=1;i<arr.length;i++) {
			x=x^arr[i];
		}
		int k=(x&(~(x-1)));
		int res=0,res2=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]&k)!=0) {
				res=res^arr[i];
			}
			else {
				res2=res2^arr[i];
			}
		}
		System.out.println(res+" "+res2);
	}
}
