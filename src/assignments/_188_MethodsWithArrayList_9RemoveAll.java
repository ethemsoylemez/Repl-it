package assignments;

import java.util.*;

public class _188_MethodsWithArrayList_9RemoveAll {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hi", "hey", "hi", "yo"));

		removeAll(wordList, "hi");
	}

	// create your method below
	public static void removeAll(ArrayList<String> wordList, String targetWord) {

		ArrayList<String> newWordList = new ArrayList<>();

		for (String trw : wordList) {
			if (!trw.equals(targetWord)) {
				newWordList.add(trw);
			}
		}
		System.out.println("New Word list: " + newWordList);
	}
}
