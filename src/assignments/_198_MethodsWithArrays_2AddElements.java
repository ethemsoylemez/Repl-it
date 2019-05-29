package assignments;

import java.util.Arrays;

public class _198_MethodsWithArrays_2AddElements {
	public static void main(String[] args) {
		
		int [] nums1 = {4,6,7,8,2};
		int [] nums2 = {10,16,17,18,12};	
		System.out.println(Arrays.toString(addElements(nums1,nums2)));

	}

	public static int[] addElements(int[] ints1, int[] ints2) {
		int[] sumByOneBy = new int[ints1.length];
		for (int i = 0; i < ints1.length; i++) {
			sumByOneBy[i] = ints1[i] + ints2[i];
		}

		return sumByOneBy;
	}
}
