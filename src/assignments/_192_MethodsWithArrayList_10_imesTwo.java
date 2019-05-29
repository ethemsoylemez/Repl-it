package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class _192_MethodsWithArrayList_10_imesTwo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		timesTwo(numbers);
	}
	// create your method below

	public static void timesTwo(ArrayList<Integer> nums) {
		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
		System.out.println(nums);
	}

}
