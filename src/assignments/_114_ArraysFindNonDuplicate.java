package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class _114_ArraysFindNonDuplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		// TODO: write your code below
		// Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		// int [] collectionOfUniques = new int[nums.length];
		String collectionOfUniques = "";
		//int unigue = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]&& i != j) {
					count++;
				}
			}
			
			if (count == 0) {
				//unigue++;
				// collectionOfUniques[i] = nums[i];
				collectionOfUniques += nums[i] +" ";
//				unigue = nums[i];
//				break;
			}
		}
		//System.out.println(unigue);
		System.out.println(collectionOfUniques);
		input.close();
	}
}
