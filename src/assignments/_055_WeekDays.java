package assignments;

import java.util.Scanner;

public class _055_WeekDays {
	public static void main(String[] args) {
		// WRITE YOUR CODE HERE
		Scanner keyboard = new Scanner(System.in);
		int dayNumber = 0;
		String day = "";

		System.out.println("Enter number:");
		dayNumber = keyboard.nextInt();

		switch (dayNumber) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
			default:
				System.out.println("Invalid day number");

		}
		System.out.println(day);
		keyboard.close();
	}

}
