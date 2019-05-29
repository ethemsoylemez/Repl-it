package assignments;

import java.util.Scanner;

public class _108_ArraysSplitemail {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		String[] newEmail = email.split("@");
		if (newEmail.length != 2) {
			System.out.println("invalid email");
		} else {
			System.out.println("Email id: " + newEmail[0]);
			System.out.println("Email domain: " + newEmail[1]);
		}
	}
}
