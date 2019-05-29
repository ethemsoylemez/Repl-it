package assignments;

import java.util.ArrayList;

public class _213_MethodsWithArrayList_13DeliveryCalc {

	public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {

		int count = (int) Math.ceil((double) deliveries.get(0) / max_fuel);

		for (int i = 0; i < deliveries.size() - 1; i++) {

			if (deliveries.get(i) >= max_fuel) {

				if (deliveries.get(i) % max_fuel < deliveries.get(i + 1)) {

					count += Math.ceil((double) deliveries.get(i + 1) / max_fuel);
				}
			} else if (max_fuel - deliveries.get(i) % max_fuel < deliveries.get(i + 1)) {

				count += Math.ceil((double) deliveries.get(i + 1) / max_fuel);
			}
		}
		return count;
	}

//		int sum = 0;
//		for (int in : deliveries) {
//			sum += in;
//		}
//		return sum / max_fuel + sum % max_fuel;
//	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);// 4
		arr.add(3);// 1
		arr.add(1);// 0
		arr.add(2);// 1
		arr.add(8);// 3
		arr.add(1);// 0
		int times = refuel_times(arr, 3);
		System.out.print(times);// should output 9
		
	}
}
