import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(palindrome(n));
		sc.close();
	}
	private static boolean palindrome(int n) {
		if(reverse(n)==n) {
			return true;
		}
		return false;
	}
	
	private static int reverse(int n) {
		int rev=0,rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
}
