package assignments;

import java.util.ArrayList;

public class _187_MethodsWithArrayList_8CombineAll {
	public static void main(String[] args) {
		ArrayList<String> wl1 = new ArrayList<>();
		wl1.add("Wooden");
		wl1.add("Spoon");

		ArrayList<String> wl2 = new ArrayList<>();
		wl2.add("Java");
		wl2.add("Selenium");
		wl2.add("Cucumber");
		System.out.println(combineAL(wl1, wl2));

	}

	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> combine = new ArrayList<>();
		for (int i = 0; i < wordList1.size(); i++) {
			combine.add(wordList1.get(i));
		}
		for (int i = 0; i < wordList2.size(); i++) {
			combine.add(wordList2.get(i));
		}
		return combine;
	}
}
