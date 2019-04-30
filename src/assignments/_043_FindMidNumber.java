package assignments;

import java.util.Scanner;

public class _043_FindMidNumber {
	public static void main(String[] args) {
		// WRITE YOUR CODE HERE
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Enter first number:");
		num1 = keyboard.nextInt();

		System.out.println("Enter second number:");
		num2 = keyboard.nextInt();

		System.out.println("Enter third number:");
		num3 = keyboard.nextInt();

		/*
		 * if ((num1<num2 && num2<num3)||(num3<num2 && num2<num1)){
		 * System.out.println("Medium value is: "+ num2); 
		 * }else if ((num2<num1 &&num1<num3)||(num3<num1 && num1<num2)){
		 * System.out.println("Medium value is: "+ num1); 
		 * }else {
		 * System.out.println("Medium value is: "+ num3); }
		 */

		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println("Medium value is: " + num2);
			} else {
				System.out.println("Medium value is: " + num3);
			}
		} else if (num2 < num1) {
			if (num1 < num3) {
				System.out.println("Medium value is: " + num1);
			} else {
				System.out.println("Medium value is: " + num3);
			}
		}
		keyboard.close();
	}
}