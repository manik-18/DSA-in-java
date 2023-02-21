import java.util.Scanner;

public class FactorialIterative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(factorial(n));
		sc.close();
	}
	
	private static int factorial(int n) {
		int res=1;
		for(int i=2;i<=n;i++) {
			res=res*i;
		}
		return res;
	}
}
