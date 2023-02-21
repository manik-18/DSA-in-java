import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
		sc.close();
	}

	private static int gcd(int a, int b) {
		int t=Math.min(a, b);
		while(t!=0) {
			if(a%t==0&&b%t==0) {
				break;
			}
			t--;
		}
		return t;
	}

}
