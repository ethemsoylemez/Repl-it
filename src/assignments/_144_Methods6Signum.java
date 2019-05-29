package assignments;

import java.util.Scanner;

public class _144_Methods6Signum {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		sign(n);
	}
	// your code here
	public static void sign(int n) {
		if (n > 0) {
			System.out.println("1");
		} else if (n < 0) {
			System.out.println("-1");
		} else {
			System.out.println("0");
		}
	}
}
