package assignments;

import java.util.Scanner;

public class _032_VendingMachine {
	public static void main(String[] args) {
		// ENTER CODE HERE
		int itemPrice, quarters, dimes, nickels, change, changeLeft;
		Scanner object = new Scanner(System.in);
		System.out.println("Enter price in cents:");
		itemPrice = object.nextInt();
		change = 100 - itemPrice;
		quarters = change / 25;
		changeLeft = change % 25;
		dimes = changeLeft / 10;
		changeLeft = changeLeft % 10 ;
		nickels = changeLeft / 5;

		if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) {
			System.out.println("Invalid price!");
		} else {
			System.out.println(
					"Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
		}
object.close();
	}

}
