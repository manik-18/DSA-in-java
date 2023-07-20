public class ComputePowerIterative {

	static int power(int x, int y) {
		int res = 1;
		while (y > 0) {
			if ((y & 1) == 1)
				res = res * x;
			y = y >> 1;
			x = x * x;
		}
		return res;
	}

	public static void main(String[] args) {
		int x = 3;
		int y = 10;
		System.out.println("Power is " + power(x, y));
	}
}
