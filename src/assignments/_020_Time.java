package assignments;

import java.util.Scanner;

public class _020_Time {
	public static void main(String[] args) {
		// 1. WRITE YOUR CODE HERE:
		int hour, minute, second;
		String amOrPm;

		// DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		minute = sc.nextInt();
		second = sc.nextInt();
		amOrPm = sc.next();
		// #############################

		// 2. WRITE YOUR CODE HERE:

		System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);
		sc.close();

	}

}
