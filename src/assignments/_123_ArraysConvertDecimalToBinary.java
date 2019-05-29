package assignments;

import java.util.*;

public class _123_ArraysConvertDecimalToBinary {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		for (int i = 0; i < binary.length; i++) {

			int remind = decimal % 2;
			decimal = decimal / 2;
			binary[binary.length - 1 - i] = remind;

		}
		System.out.println(Arrays.toString(binary));
	}
}
