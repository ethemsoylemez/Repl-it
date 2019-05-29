package assignments;

import java.util.Arrays;

public class _204_MethodsWithArrays_4PopulateArray {

	public static int[] populate(int[] r) {
		for (int i = 0; i < r.length; i++) {
			r[i] = i + 1;
		}
		return r;
	}

	public static void main(String[] args) {

		int[] i = new int[8];
		i = populate(i);
		System.out.println(Arrays.toString(i));
	}
}
