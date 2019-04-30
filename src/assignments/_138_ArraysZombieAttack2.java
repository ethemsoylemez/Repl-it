package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class _138_ArraysZombieAttack2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.

		int day = 0;
		int[] inhabitants1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
		do {
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			day++;
			int L = inhabitants.length;
			for (int j = 0; j < L; j++) {
				if (inhabitants[j] == 0) {
					if (j == 0 && inhabitants[j + 2] != 0) {
						inhabitants[j + 1] = inhabitants[j + 1] / 2;
						j++;
					} else if (j == 0 && inhabitants[j + 2] == 0) {
						inhabitants[j + 1] = inhabitants[j + 1];
						j++;
					} else if (j > 0 && j < L - 2 && inhabitants[j + 2] != 0) {
						inhabitants[j - 1] = inhabitants[j - 1] / 2;
						inhabitants[j + 1] = inhabitants[j + 1] / 2;
						j++;
					} else if (j > 0 && j < L - 2 && inhabitants[j + 2] == 0) {
						inhabitants[j - 1] = inhabitants[j - 1] / 2;
						j++;
					} else if (j == L - 1) {
						inhabitants[j - 1] = inhabitants[j - 1] / 2;
					} else if (j == L - 2) {
						inhabitants[j - 1] = inhabitants[j - 1] / 2;
					}
				}
			}
		} while (!Arrays.equals(inhabitants, inhabitants1) && day < 10);
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants1));
		System.out.println("---- EXTINCT ----");
		input.close();
	}
}
