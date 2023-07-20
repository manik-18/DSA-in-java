import java.util.Scanner;

public class SumOfNaturalNumbers {

	static int sum(int n) {
		return n * (n + 1) / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n value: ");
		int n = sc.nextInt();
		System.out.println("The sum is: " + sum(n));
		sc.close();

	}

}
