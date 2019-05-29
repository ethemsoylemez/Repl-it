package assignments;

import java.util.Scanner;

public class _145_Methods7plus_minus {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			arr[i] = inp.nextInt();
		}
		plus_minus(arr);
	}

	public static void plus_minus(int[] arr) {
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for (int num : arr) {
			if (num > 0) {
				positive++;
			} else if (num < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		System.out.println("positives: " + positive + " negatives: " + negative + " zeros: " + zero);
	}
}
