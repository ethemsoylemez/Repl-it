package assignments;

import java.util.Scanner;

public class _091_CountHi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		int count = 0;
		for (int i = 0; i <= word.length() - 2; i++) {
			if (word.substring(i, i + 2).equals("hi")) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}
