package assignments;

import java.util.Scanner;

public class _119_ArraysAverageTemperature {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() };
		for(;k<temps.length;k++) {
			total += temps[k];
			avgTemp = total/temps.length;
		}
		System.out.println(avgTemp);
	}

}
