package assignments;

public class _170_MethodsWithString5_CleanString {

	public static void main(String[] args) {
		String words = "he said bla bla bla";
		String remove = "bla";
		System.out.println(clean(words, remove));
		System.out.println(clean1(words, remove));

	}

	// 1. solution
	public static String clean(String text, String badWord) {

		return text.replace(badWord, "");

	}
	// 2. solution

	public static String clean1(String text, String badWord) {
		String newText = "";
		String[] arr = text.split(" ");
		for (String ar : arr) {
			if (!ar.equals(badWord)) {
				newText += ar + " ";
			}
		}
		return newText.trim();
	}
}
