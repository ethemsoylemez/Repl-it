package assignments;

import java.util.Scanner;

public class _076_BuildARoute {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();

		if (start.equalsIgnoreCase("A")) {
			if (end.equalsIgnoreCase("A")) {
				System.out.println("A found");
			} else if (end.equalsIgnoreCase("B")) {
				System.out.println("right" + " > " + "B found");
			} else if (end.equalsIgnoreCase("C")) {
				System.out.println("right" + " > " + "down" + " > " + "C found");
			} else {
				System.out.println("right" + " > " + "down" + " > " + "left" + " > " + "D found");
			}

		} else if (start.equalsIgnoreCase("B")) {
			if (end.equalsIgnoreCase("B")) {
				System.out.println("B found");
			} else if (end.equalsIgnoreCase("C")) {
				System.out.println("down" + " > " + "C found");
			} else if (end.equalsIgnoreCase("D")) {
				System.out.println("down" + " > " + "left" + " > " + "D found");
			} else {
				System.out.println("down" + " > " + "left" + " > " + "up" + " > " + "A found");
			}

		} else if (start.equalsIgnoreCase("C")) {
			if (end.equalsIgnoreCase("C")) {
				System.out.println("C found");
			} else if (end.equalsIgnoreCase("D")) {
				System.out.println("left" + " > " + "D found");
			} else if (end.equalsIgnoreCase("A")) {
				System.out.println("left" + " > " + "up" + " > " + "A found");
			} else {
				System.out.println("left" + " > " + "up" + " > " + "right" + " > " + "B found");
			}

		} else{
			if (end.equalsIgnoreCase("D")) {
				System.out.println("D found");
			} else if (end.equalsIgnoreCase("A")) {
				System.out.println("up" + " > " + "A found");
			} else if (end.equalsIgnoreCase("B")) {
				System.out.println("up" + " > " + "right" + " > " + "B found");
			} else {
				System.out.println("up" + " > " + "right" + " > " + "down" + " > " + "C found");
			}

		}

		scan.close();
	}

}
