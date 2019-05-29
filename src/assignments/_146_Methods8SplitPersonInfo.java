package assignments;

import java.util.Scanner;

public class _146_Methods8SplitPersonInfo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person(s);
	}

	public static void person(String info) {
		String[] pInfo = info.split(",");
		System.out.println("person name: " + pInfo[0] + " last name: " + pInfo[1] + " age: " + pInfo[2]);
	}

}
