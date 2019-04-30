package assignments;

import java.util.Scanner;

public class _056_LaptopConfigurator {
	public static void main(String[] args) {
		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0;
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE

		System.out.println("Select screen size:");
		screenType = scan.next();

		switch (screenType) {
		case "13.3":
			price = 200;
			break;
		case "15.0":
			price = 300;
			break;
		case "17.3":
			price = 400;
			break;
		}

		System.out.println("Select CPU type:");
		cpu = scan.next();

		switch (cpu) {
		case "i3":
			price += 150;
			break;
		case "i5":
			price += 250;
			break;
		case "i7":
			price += 350;
			break;
		}

		System.out.println("Select RAM size:");
		ram = scan.nextInt();

	    price += 50*(ram/4);
		

		System.out.println("Select storage type:");
		storageType = scan.next();

		switch (storageType) {
		case "SSD":
			System.out.println("Enter memory size:");
			int memorySize = scan.nextInt();
			price += 100 * (memorySize / 500);
			break;
		case "HDD":
			System.out.println("Enter memory size:");
			memorySize = scan.nextInt();
			price += 50 * (memorySize / 500);
			break;
		}

		System.out.println("Enter screen resolution:");
		String screenResolution = scan.next();

		switch (screenResolution) {
		case "FULLHD":
			price += 100;
			break;
		case "4K":
			price += 200;
			break;
		}
		System.out.println("Laptop price is: $" + price);
		scan.close();
	}

}
