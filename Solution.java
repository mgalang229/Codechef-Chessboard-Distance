import java.util.Scanner;

//change class name to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x1 = fs.nextInt(), y1 = fs.nextInt();
			int x2 = fs.nextInt(), y2 = fs.nextInt();
			System.out.println(Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)));
		}
		fs.close();
	}
}
