package assignments;

import java.util.Arrays;

public class _200_MethodsWithArrays_3SwitchElements {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 7, 8 };
		System.out.println("Original array: " + Arrays.toString(arr));
		System.out.println("Switched array: " + Arrays.toString(do_switch(arr)));
	}

	public static int[] do_switch(int[] i) {
		int temp = i[0];
		i[0] = i[i.length - 1];
		i[i.length - 1] = temp;
		return i;
	}
}
