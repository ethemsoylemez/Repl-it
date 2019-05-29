package assignments;

import java.util.ArrayList;

public class _181_MethodsWithArrayList3_CombineArrays {

	public static void main(String[] args) {
		String[] arr1 = { "Wooden", " Spoon" };
		String[] arr2 = { " Java", " Selemium", " Cucumber" };

		System.out.println(combineRs(arr1, arr2));
	}

	public static String combineRs(String[] r1, String[] r2) {
		ArrayList<String> str12 = new ArrayList<>();
		for (int i = 0; i < r1.length; i++) {
			str12.add(r1[i]);
		}
		for (int i = 0; i < r2.length; i++) {
			str12.add(r2[i]);
		}
		String str = "";
		for (String s : str12) {
			str += s;
		}
		return str;
	}
}
