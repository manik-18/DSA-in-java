import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TakingInputUsingBufferedReader {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int t = Integer.parseInt(br.readLine());
			char r = (char) br.read();
			br.readLine();
			String s = br.readLine();
			double d = Double.parseDouble(br.readLine());
			System.out.println(t + " " + s + " " + r + " " + d);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
