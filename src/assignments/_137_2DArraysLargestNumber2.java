package assignments;

import java.util.*;

public class _137_2DArraysLargestNumber2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

		// TODO write your code below
		int bigggest = arr[0][0];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] > bigggest) {
					bigggest = arr[i][j];
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = bigggest;
			}
		}

		// FINAL PRINT
		System.out.println(Arrays.deepToString(arr));

	}

}
