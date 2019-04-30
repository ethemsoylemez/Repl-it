package assignments;

import java.util.Scanner;

public class _037_Nums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		// CODE HERE
		if (num1 == num2) {
			System.out.println(num1 + " and " + num2 + " are equal");
		} else if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else {
			System.out.println(num2 + " is greater than " + num1);
		}
		input.close();

	}

}
