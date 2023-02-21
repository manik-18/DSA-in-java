import java.util.Scanner;

public class KthBitIsSetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(kthBitIsSetOrNot(n,k));
		sc.close();
	}

	private static boolean kthBitIsSetOrNot(int n,int k) {
		int x=n>>(k-1);
		if((x&1)!=0) {
			return true;
		}
		else {
			return false;
		}
	}

}
