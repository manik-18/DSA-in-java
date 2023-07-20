import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sieve(n);
		sc.close();
	}

	private static void sieve(int n) {
		if (n <= 1)
			return;
		boolean isPrime[] = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.println(i);
				for (int j = i * i; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
}
