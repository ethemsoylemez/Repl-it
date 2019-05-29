package assignments;

import java.util.Scanner;

public class _094_ParseHTML {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		int start = html.indexOf("id=");
		int end = html.indexOf(">", start);
		if (!html.contains("id=")) {
			System.out.println("Invalid input!");
		} else {
			System.out.println(html.substring(start + 4, end - 1));
		}
		
		scan.close();
	}
}
