package assignments;

public class _173_MethodsWithString8_BiggerString {

	public static void main(String[] args) {
		System.out.println(biggerS("Wooden", "Spoon"));
	}

	public static String biggerS(String a, String b) {
		if (a.length() >= b.length()) {
			return a;
		} else {
			return b;
		}
	}
}
