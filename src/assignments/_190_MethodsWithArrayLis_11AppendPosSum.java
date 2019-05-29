package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class _190_MethodsWithArrayLis_11AppendPosSum {
	public static void main(String[] args) {

		ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(-5, 2, 7, 8, 0, -6, 10));

		System.out.println(appendPosSum(ints));

	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> Integers) {
		ArrayList<Integer> newList = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < Integers.size(); i++) {
			if (Integers.get(i) > 0) {
				newList.add(Integers.get(i));
				sum += Integers.get(i);
			}
		}
		newList.add(sum);
		return newList;
	}
}
