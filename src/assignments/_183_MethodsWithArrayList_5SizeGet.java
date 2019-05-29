package assignments;

import java.util.ArrayList;

public class _183_MethodsWithArrayList_5SizeGet {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(7);
		nums.add(8);
		System.out.println(sum(nums));
	}

	public static int sum(ArrayList<Integer> ints) {
		// write code here
		int sum = 0;
		for (int i = 0; i < ints.size(); i++) {
			sum += ints.get(i);
		}
		return sum;
	}
}
