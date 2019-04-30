package assignments;

import java.util.Scanner;

public class _046_SliceNumber {
	public static void main(String[] args) {
		// DO NOT CHANGE
		int num, digit1, digit2, digit3, digit4, digit5, remain2, remain3, remain4, remain5;
		// WRITE YOUR CODE HERE
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your number:");
		num = keyboard.nextInt();
		digit1 = num / 10000;
		remain2 = num % 10000;
		digit2 =  remain2 / 1000;
		remain3 =  remain2 % 1000;
		digit3 =  remain3 / 100;
		remain4 =  remain3 % 100;
		digit4 =  remain4 / 10;
		remain5 =  remain4 %10;
		digit5 = remain5/1;
		 
		System.out.println("Digit1: "+digit1);
		System.out.println("Digit2: "+digit2);
		System.out.println("Digit3: "+digit3);
		System.out.println("Digit4: "+digit4);
		System.out.println("Digit5: "+digit5);

		keyboard.close();
	}

}
