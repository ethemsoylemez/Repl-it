package assignments;

public class _179_MethodsWithString11_ReverseString {
	public static void main(String[] args) {
		System.out.println(reverse("Wooden Spoon"));
	}

	public static String reverse(String input) {
		String reversed = "";
		for (int i = 0; i < input.length(); i++) {
			reversed += input.charAt(input.length() - 1 - i);
		}
		return reversed;
	}

}
