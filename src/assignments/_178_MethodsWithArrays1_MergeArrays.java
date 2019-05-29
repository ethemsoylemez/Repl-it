package assignments;

import java.util.Arrays;

public class _178_MethodsWithArrays1_MergeArrays {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6,7,8 };
		System.out.println(Arrays.toString(mergR(arr1, arr2)));
	}

	public static int[] mergR(int[] a, int[] b) {
		int tl = a.length + b.length;
		int[] retArr = new int[tl];
		for (int i = 0; i < tl; i++) {
			if (i < a.length) {
				retArr[i] = a[i];
			} else {
				retArr[i] = b[i-a.length];
			}
		}
		return retArr;
	}
}
