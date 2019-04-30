package assignments;

import java.util.Scanner;

public class _067_ReverseIt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.println(word);
		// WRITE YOUR CODE HERE

		if (word.length() < 5) {
			System.out.println("Too short!");
		} else if (word.length() > 5) {
			System.out.println("Too long!");
		} else {
			System.out.println(word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + ""
					+ word.charAt(0));
		}
		scan.close();

	}
}
