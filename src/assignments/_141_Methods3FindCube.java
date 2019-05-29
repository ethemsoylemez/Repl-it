package assignments;

import java.util.Scanner;

public class _141_Methods3FindCube {

	public static void main(String[] args) {
		cube();
	}
	public static void cube() {
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = 1;
		for (int i = 0; i < 3; i++) {
			result *= num;
		}
		System.out.println(result);
		scan.close();
	}

}
