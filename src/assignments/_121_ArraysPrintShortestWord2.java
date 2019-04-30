package assignments;


import java.util.Scanner;

public class _121_ArraysPrintShortestWord2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] strArray = str.split(", ");
		// System.out.println(Arrays.toString(strArray));
		int minLength = Integer.MAX_VALUE;
		int count = 0;

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() < minLength) {
				minLength = strArray[i].length();
			}
		}

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() == minLength) {
				count++;
			}
		}
		int idx = 0;
		String[] shortArray = new String[count];
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() == minLength) {
				shortArray[idx] = strArray[i];
				idx++;
			}
		}
		scan.close();
	}

}
