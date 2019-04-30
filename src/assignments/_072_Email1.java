package assignments;

import java.util.Scanner;

public class _072_Email1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		if (!email.contains("_")) {
			System.out.println(email);
		} else {
			int idx = email.indexOf("_");
			int idx2 = email.indexOf("@");
			String newEmail = email.substring(idx + 1, idx2) + "_" + email.substring(0, idx) + "@gmail.com";
			System.out.println(newEmail);
		}

		scan.close();

	}

}
