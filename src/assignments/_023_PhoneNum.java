package assignments;

import java.util.Scanner;

public class _023_PhoneNum {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int areaCode, localCode;
		areaCode = keyboard.nextInt();
		localCode = keyboard.nextInt();

		String phoneNumber = "(" + areaCode + ")-" + localCode;
		System.out.println("Calling number " + phoneNumber);
		keyboard.close();

	}
}
