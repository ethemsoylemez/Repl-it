package assignments;

import java.util.ArrayList;

public class _185_MethodsWithArrayList_7AddInsert {

	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList<>();
		word.add("he");
		word.add("hi");
		word.add("hu");
		word.add("himm");
		
		test(word);
	}

	public static void test(ArrayList<String> words) {
		// write code here
		words.add(0, "hey");
		words.add(3, "yo");

		System.out.println(words);
	}
}
