package assignments;

import java.util.Scanner;

public class _155_Methods17FibonacciNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {
		// WRITE YOUR CODE HERE
		int a = 0;
		int b = 1;
		int c;
		if (num == 0) {
			System.out.println(a);
		} else if (num == 1) {
			System.out.println(b);
		} else {
			for (int i = 2; i <= num; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(b);
		}
	}
}
