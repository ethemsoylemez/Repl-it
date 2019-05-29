package assignments;

import java.util.Scanner;

public class _103_ArraysReverseSentence2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		String[] arraySentence = sentence.split(" ");

		for (int i = arraySentence.length - 1; i >= 0; i--) {
			if (i == 0) {
				reversed += arraySentence[i];
			} else {
				reversed += arraySentence[i] + " ";
			}
		}
		System.out.println(reversed);

		input.close();
	}
}
