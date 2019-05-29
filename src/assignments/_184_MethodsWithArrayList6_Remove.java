package assignments;

import java.util.ArrayList;

public class _184_MethodsWithArrayList6_Remove {

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<>();
		list.add(20.9);
		list.add(11.1);
		list.add(5.6);
		list.add(2.7);
		
		test(list);
	}

	public static void test(ArrayList<Double> dubs) {
		// write code here
		dubs.remove(0);
		dubs.remove(0);
		System.out.println(dubs);
	}
}
