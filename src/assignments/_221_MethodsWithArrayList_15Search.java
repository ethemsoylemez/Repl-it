package assignments;

import java.util.ArrayList;

public class _221_MethodsWithArrayList_15Search {

	public static String search(ArrayList<String> r, String find) {

		for (String str : r) {
			if (str.contains(find)) {
				return str;
			}
		}
		return "search failed";

	}// end wineSeller

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("2");
		arr.add("6");
		arr.add("foo bar");
		arr.add("abc");

		String find_tst = search(arr, "foo");
		System.out.print(find_tst);// foo bar

	}// end main
}
