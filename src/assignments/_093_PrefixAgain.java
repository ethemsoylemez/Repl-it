package assignments;

import java.util.Scanner;

public class _093_PrefixAgain {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		int count = 0;
		for (int i = 0; i <= str.length() - n; i++) {
			String prefixString = str.substring(0,n);
			if (str.substring(i, i + n).equals(prefixString)) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scan.close();
	}
}
