package assignments;

import java.util.Scanner;

public class _120_ArraysPrintShortestWord {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };

		int min = Integer.MAX_VALUE;
		int idx = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < min) {
				min = str[i].length();
				idx = i;
			}
		}
		System.out.println(str[idx]);
	}

}
