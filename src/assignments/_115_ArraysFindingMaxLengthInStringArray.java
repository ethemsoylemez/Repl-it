package assignments;

import java.util.Scanner;

public class _115_ArraysFindingMaxLengthInStringArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {

			words[i] = input.nextLine();

		}
		
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for(int i = 0; i<words.length;i++) {
			if(words[i].length()>max) {
				max = words[i].length();
				idx = i;
			}
		}
		System.out.println(words[idx]);
		System.out.println(max);
	}

}
