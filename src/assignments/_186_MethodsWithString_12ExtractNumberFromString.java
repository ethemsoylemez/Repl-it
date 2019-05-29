package assignments;

public class _186_MethodsWithString_12ExtractNumberFromString {

	public static void main(String[] args) {
		System.out.println(extractNum("W2do3on S0p1oo4n"));

	}

	public static String extractNum(String s) {
		String digit = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				digit += s.charAt(i) + "";
			}
		}
		return digit;
	}
}
