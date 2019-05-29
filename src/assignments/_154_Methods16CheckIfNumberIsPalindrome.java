package assignments;

import java.util.Scanner;

public class _154_Methods16CheckIfNumberIsPalindrome {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(isPalindrome(num));
	}

	public static boolean isPalindrome(int num) {
		// WRITE YOUR CODE HERE
		String str = Integer.toString(num);
		String reversed = "";
		for (int i = 0; i < str.length(); i++) {
			reversed += str.charAt(str.length()-1-i);
		}
		return str.equals(reversed);
//		int reversedInteger = 0;
//		int actualInteger = num;
//		while (num != 0) {
//			int remainder = num % 10;
//			reversedInteger = reversedInteger * 10 + remainder;
//			num /= 10;
//		}
//		return reversedInteger == actualInteger;
	}
}
