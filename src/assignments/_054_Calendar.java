package assignments;

import java.util.Scanner;

public class _054_Calendar {
	public static void main(String[] args) {
		// WRITE YOUR CODE HERE

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter month number:");
		int monthNumber = keyboard.nextInt();
		String month = "";

		switch (monthNumber) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			System.out.println("Invalid number");
		}
		System.out.println(month);
		keyboard.close();

	}

}
