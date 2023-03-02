import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sumOfDigits(n));
		sc.close();
	}

	private static int sumOfDigits(int n) {
		if(n==0) {
			return 0;
		}
		return sumOfDigits(n/10)+n%10;
		
	}

}
