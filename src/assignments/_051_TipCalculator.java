package assignments;

import java.util.Scanner;

public class _051_TipCalculator {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String split, serviceQuality, customizeTip; // numberOfPeople2 = "";
		boolean isSplit = true;
		int numberOfPeople;
		double checkAmount, totalToPay = 0, totalTip = 0, totalPerPerson = 0, tipPerPerson = 0;
		System.out.println("Split: ");
		split = keyboard.next();
		System.out.println("Number of people: ");
		numberOfPeople = keyboard.nextInt();
		if (numberOfPeople == 0) {
			numberOfPeople = 1;
		}
		System.out.println("Check amount: ");
		checkAmount = keyboard.nextDouble();
		System.out.println("Service Quality: ");
		serviceQuality = keyboard.next();
		if (split.equalsIgnoreCase("yes")) {
			isSplit = true;
		} else if (split.equalsIgnoreCase("no")) {
			isSplit = false;
		}

		switch (serviceQuality) {
		case "Poor":
			totalTip = checkAmount * 0.05;
			break;
		case "Fair":
			totalTip = checkAmount * 0.1;
			break;
		case "Good":
			totalTip = checkAmount * 0.15;
			break;
		case "Great":
			totalTip = checkAmount * 0.20;
			break;
		case "Excellent":
			totalTip = checkAmount * 0.25;
			break;
		default:
			System.out.println("Invalid choice, do you want to customize your tip?");
			customizeTip = keyboard.next();
			if (customizeTip.equalsIgnoreCase("yes")) {
				System.out.println("Enter your tip amount:");
				totalTip = keyboard.nextDouble();
				System.out.println("Thank you, see you later");
			} else if (customizeTip.equalsIgnoreCase("no")) {
				System.out.println("Thank you!");
			}

		}
		System.out.println("===============");
		totalToPay = checkAmount + totalTip;

		if (isSplit && numberOfPeople > 1 && numberOfPeople < 11) {
			totalPerPerson = totalToPay / numberOfPeople;
			tipPerPerson = totalTip / numberOfPeople;
		} else if (!isSplit || numberOfPeople == 1) {
			totalPerPerson = totalToPay;
			tipPerPerson = totalTip;
		}

		// numberOfPeople2 = "&".repeat(numberOfPeople);
		System.out.print("Number of people entered: ");
		for (int i = 0; i <= numberOfPeople; i++) {
			System.out.print("&");
		}

		/*switch (numberOfPeople) {
		case 1:
			numberOfPeople2 = "&";
			break;
		case 2:
			numberOfPeople2 = "&&";
			break;
		case 3:
			numberOfPeople2 = "&&&";
			break;
		case 4:
			numberOfPeople2 = "&&&&";
			break;
		case 5:
			numberOfPeople2 = "&&&&&";
			break;
		case 6:
			numberOfPeople2 = "&&&&&&";
			break;
		case 7:
			numberOfPeople2 = "&&&&&&&";
			break;
		case 8:
			numberOfPeople2 = "&&&&&&&&";
			break;
		case 9:
			numberOfPeople2 = "&&&&&&&&&";
			break;
		case 10:
			numberOfPeople2 = "&&&&&&&&&&";
			break;
		}
		*/
		// System.out.println("Number of people entered: " + numberOfPeople2);
		System.out.println("");
		System.out.println("Total to pay: " + totalToPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);

		keyboard.close();
	}

}
