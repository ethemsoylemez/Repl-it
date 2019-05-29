package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class _125_Arrays_Make_Last {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		
		int[] numsDouble = new int [2*size];
		numsDouble[numsDouble.length-1] = nums[nums.length-1];
		
		System.out.println(Arrays.toString(numsDouble));
		
	}
}
