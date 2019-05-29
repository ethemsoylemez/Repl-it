package assignments;

import java.util.Scanner;

public class _150_Methods12TimeConversion {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		String result = "";
		String[] hour = s.split(":");
		int hour1 = Integer.parseInt(hour[0]);
		if (hour[2].endsWith("AM")) {
			result = hour1 + ":" + hour[1];
		} else {
			result = (hour1 + 12 + ":" + hour[1]);
		}
		System.out.println(result);
	}
}
