package assignments;

import java.util.Scanner;

public class _070_alejandro1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();

		// your code here
		if (a.contains("alejandro")) {
			System.out.println("read this mail");
		} else {
			System.out.println("dont read");
		}
		s.close();

	}

}
