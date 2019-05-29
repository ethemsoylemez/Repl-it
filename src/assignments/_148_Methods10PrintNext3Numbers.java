package assignments;

import java.util.*;

public class _148_Methods10PrintNext3Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		System.out.print("enter number");
		int num = inp.nextInt();
		next3(num);
	}

	public static void next3(int number) {
		System.out.println(number + 1 + " " + (number + 2) + " " + (number + 3));
	}
}