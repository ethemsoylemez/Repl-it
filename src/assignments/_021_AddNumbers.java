package assignments;

import java.util.Scanner;

public class _021_AddNumbers {
	public static void main(String[] args) {
		int num1, num2, num3, sum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		sum = num1+num2+num3;
		
		System.out.println("Sum of numbers: " + sum);
		scan.close();
		
	}

}
