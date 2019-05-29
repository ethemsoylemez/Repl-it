package assignments;

public class _143_Methods5SimplePrintPattern {

	public static void main(String[] args) {

		printHollowRect();
	}

	public static void printHollowRect() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((j == 0 || j == 4) || (i == 0 || i == 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
