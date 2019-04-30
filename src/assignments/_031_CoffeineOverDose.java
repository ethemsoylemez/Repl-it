package assignments;

import java.util.Scanner;

public class _031_CoffeineOverDose {
	public static void main(String[] args) {

		int coffeEmount, overdoseEmount = 10, drinks;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of milligrams in drink:");
		coffeEmount = scan.nextInt();

		drinks =  (overdoseEmount*1000 / coffeEmount);

		System.out.println("It would take about " + drinks + " drinks for a lethal overdose.");
		scan.close();
	}

}
