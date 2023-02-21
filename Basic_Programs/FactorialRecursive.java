import java.util.Scanner;

public class FactorialRecursive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(factorial(n));
		sc.close();
	}
	
	private static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return factorial(n-1)*n;
	}
}
