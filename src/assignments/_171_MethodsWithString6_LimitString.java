package assignments;

public class _171_MethodsWithString6_LimitString {

	public static void main(String[] args) {
		String limitedText = limit("Wooden Spoon", 7);
		System.out.println(limitedText);
	}

	public static String limit(String text, int maxLength) {
		return text.substring(0, maxLength);
	}
}
