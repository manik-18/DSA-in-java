import java.util.Scanner;

public class TrailingZeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(trailingZeroes(n));
		sc.close();
	}

	private static int trailingZeroes(int n) {
		int res = 0;
		for (int i = 5; i <= n; i *= 5) {
			res = res + (n / i);
		}
		return res;
	}
}
