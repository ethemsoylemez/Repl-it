package assignments;

import java.util.Scanner;

public class _090_CountJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int count = 0;
		for (int i = 0; i <= word.length() - 4; i++) {
			if (word.substring(i, i + 4).equals("java")) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}