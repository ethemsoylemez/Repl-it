package assignments;

public class _167_MethodsWithString2_Unique {

	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below
		String unique = "";
		for (int i = 0; i < str.length(); i++) {
			String ch = str.charAt(i) + "";
			if (!unique.contains(ch)) {
				unique += ch;
			}
		}
		return unique;
	}
}
