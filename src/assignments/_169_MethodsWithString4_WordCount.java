package assignments;

public class _169_MethodsWithString4_WordCount {
	public static void main(String[] args) {
		System.out.println(wordCount("java C Selenium"));
	}

	public static int wordCount(String words) {

		// 1. solution
		int count = 0;
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == ' ') {
				count++;
			}
		}
		return count + 1;

		// 2. solution
//		String[] wordsArray = words.split(" ");
//		return wordsArray.length;
	}
}
