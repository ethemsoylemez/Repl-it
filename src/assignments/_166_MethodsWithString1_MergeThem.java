package assignments;

public class _166_MethodsWithString1_MergeThem {
	public static void main(String[] args) {
		System.out.println(mergeStrings("Ethem Soylemez","Nursel"));
	}

	public static String mergeStrings(String one, String two) {
		String newStr = "";
		if (one.length() == two.length()) {
			for (int i = 0; i < one.length(); i++) {
				newStr += one.charAt(i) + "" + two.charAt(i);
			}
		} else if (one.length() > two.length()) {
			for (int i = 0; i < two.length(); i++) {
				newStr += one.charAt(i) + "" + two.charAt(i);
			}
			newStr += one.substring(two.length());
		} else {
			for (int i = 0; i < one.length(); i++) {
				newStr += one.charAt(i) + "" + two.charAt(i);
			}
			newStr += two.substring(one.length());
		}

		return newStr;

	}

}
