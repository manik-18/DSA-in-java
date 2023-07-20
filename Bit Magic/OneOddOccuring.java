import java.util.Scanner;

public class OneOddOccuring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 4, 3, 3, 2, 4, 4, 4, 5, 5 };
		System.out.println(oneOddOccuring(arr));
		sc.close();
	}

	private static int oneOddOccuring(int arr[]) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

}
