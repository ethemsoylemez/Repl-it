package assignments;

import java.util.Arrays;

public class _232_MethodsWithString_18CountLetters {

	public static void main(String[] args) {
		System.out.println(countLetters("azzzccbba$$%%%^^^^aabbbbccc...1111"));
	}

	public static String countLetters(String str) {

		String[] strArray = str.split("");
		Arrays.sort(strArray);
		String strm = "";
		int start = 0;
		for (int i = start; i < strArray.length; i++) {
			int count = 0;
			for (int j = start; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					count++;
					start++;
				}else {
					break;
				}
			}
			if (count > 0) {
				strm += count + "(" + strArray[start - 1]+") ";
			}
		}

		return strm.trim();
	}

}
