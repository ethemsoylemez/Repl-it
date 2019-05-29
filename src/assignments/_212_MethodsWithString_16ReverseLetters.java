package assignments;

public class _212_MethodsWithString_16ReverseLetters {
	public static void main(String[] args) {

		String result = Utils.reverseLetters("..zxcv..d");
		System.out.println(result);
		System.out.println(result.equals("..dvcx..z")); // true

		String result2 = Utils.reverseLetters("---abmkl.o-");
		System.out.println(result2);
		System.out.println(result2.equals("---olkmb.a-")); // true

		String result3 = Utils.reverseLetters("---abmkl.o-");
		System.out.println(result3);
		System.out.println(result3.equals("-o.lkmba---")); // false
	}
}

class Utils {
	public static String reverseLetters(String word) {
		// TODO
		String reversed = "";
		int j = word.length() - 1;
		
		for (int i = 0; i < word.length(); i++) {

			if (Character.isAlphabetic(word.charAt(i))) {

				while (j >= 0) {

					if (Character.isAlphabetic(word.charAt(j))) {

						reversed += word.charAt(j) + "";
						j--;
						break;
					} else {
						j--;
					}
				}
			} else {
				reversed += word.charAt(i);
			}
		}
		return reversed;
	}
}
