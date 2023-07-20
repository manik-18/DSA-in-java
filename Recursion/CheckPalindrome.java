import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(checkPalindrome(s, 0, s.length() - 1));
		sc.close();
	}

	private static boolean checkPalindrome(String s, int start, int end) {
		if (start >= end) {
			return true;
		}
		return (s.charAt(start) == s.charAt(end) && checkPalindrome(s, start + 1, end - 1));
	}

}
