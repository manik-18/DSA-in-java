import java.util.Scanner;

public class FindDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDivisors(n);
		sc.close();
	}

	static void printDivisors(int n) {
		int i = 1;
		for (i = 1; i * i < n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		for (; i >= 1; i--) {
			if (n % i == 0) {
				System.out.print((n / i) + " ");
			}
		}
	}
}
