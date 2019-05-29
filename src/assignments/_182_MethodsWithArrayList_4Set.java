package assignments;

import java.util.ArrayList;

public class _182_MethodsWithArrayList_4Set {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("hub");
		arr.add("got");
		arr.add("hot");
		System.out.println(test(arr));
	}

	public static ArrayList<String> test(ArrayList<String> words) {
		// write code here

		words.set(0, "git");
		words.set(2, "gud");
		return words;

	}
}
