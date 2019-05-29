package assignments;

import java.util.Scanner;

public class _139_Methods1SimpleCalculator {

	public static void main(String[] args) {

		plus();
	}

	// your code here
	public static void plus() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = scan.nextInt();
		System.out.println("enter second number:");
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.println("result: " + result);

	}

}
