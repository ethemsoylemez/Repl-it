package assignments;

import java.util.Scanner;

public class _075_Without_X_x {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		if (word.substring(0, 1).equalsIgnoreCase("x")) {
			if (word.substring(word.length() - 1).equalsIgnoreCase("x")) {
				System.out.println(word.substring(1, word.length() - 1));
			} else {
				System.out.println(word.substring(1));
			}
		} else if (word.substring(word.length() - 1).equalsIgnoreCase("x")) {
			System.out.println(word.substring(0, word.length() - 1));
		} else {
			System.out.println(word);

		}
		scan.close();
	}

}
