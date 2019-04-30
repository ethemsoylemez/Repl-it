package assignments;

import java.util.Scanner;

public class _084_ZombieAttack1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();
		int count = 0;
		while (inhabitants > 0) {
			System.out.println("Day " + count + " [" + inhabitants + "]");
			inhabitants = inhabitants / 2;
			count++;
		}
		System.out.println("---- EXTINCT ----");

		scan.close();
	}
}
