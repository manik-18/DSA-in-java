import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(lcm(a,b));
		sc.close();
	}

	private static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}

	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}

}
