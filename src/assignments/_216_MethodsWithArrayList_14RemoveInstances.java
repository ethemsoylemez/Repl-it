package assignments;

import java.util.*;

public class _216_MethodsWithArrayList_14RemoveInstances {

	public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
		ArrayList<Integer> newR = new ArrayList<>(r);
		r.removeAll(r);
		for (Integer m : newR) {
			if (m != n) {
				r.add(m);
			}
		}
		return r;

	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		Integer[] nums = new Integer[] { 1, 1, 2, 3 };
		arr.addAll(Arrays.asList(nums));

		System.out.print(removeInst(arr, 1));

	}// end main

}
