package assignments;

import java.util.Scanner;

public class _098_ParseJSONFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		json = json.replace("\"", "");
		json = json.replace(",", "");
		json = json.replace(" ", "");
		json = json.replace(":", "");

		System.out.println(json);
		int first = json.indexOf("firstName");
		int middle = json.indexOf("lastName");
		int last = json.indexOf("role");

		String firstname = json.substring(first + 9, middle);
		String lastname = json.substring(middle + 8, last);
		System.out.println("First name: " + firstname);
		System.out.println("Last name: " + lastname);
		scan.close();
	}
}
