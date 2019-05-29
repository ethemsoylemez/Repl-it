package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class _199_MethodsWithArrayList_12RepeatAll {

	public static void main(String[] args) {
		ArrayList<Boolean> lst = new ArrayList<Boolean>(Arrays.asList(true, false, true));

		System.out.println(repeatAL(lst));
	}
	// create your method below

	public static ArrayList<Boolean> repeatAL(ArrayList<Boolean> list) {

		// list.addAll(list);
		// System.out.println(list.addAll(list));

		ArrayList<Boolean> newList = new ArrayList<>(list);
		for (int i = 0; i < list.size(); i++) {
			newList.add(list.get(i));
		}
		return newList;
	}
}
