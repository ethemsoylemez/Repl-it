package assignments;

import java.util.Arrays;

public class _195_MethodsWithString_15Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "Silent"));
		System.out.println(isAnagram("star", "rats"));
		System.out.println(isAnagram("java", "cava"));

	}

	public static boolean isAnagram(String word1, String word2) {

		String[] word11 = word1.toUpperCase().replace(" ", "").split("");
		String[] word22 = word2.toUpperCase().replace(" ", "").split("");
		Arrays.sort(word11);
		Arrays.sort(word22);

		if (Arrays.equals(word22, word11)) {
			return true;
		} else {
			return false;
		}
	}
}
