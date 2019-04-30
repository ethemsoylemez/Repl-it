package assignments;

public class _081_Evens {

	public static void main(String[] args) throws InterruptedException {
		// WRITE YOUR CODE HERE

		int number = 2;
		while (number <= 100) {
			System.out.print(number + ",");

			number += 2;
			Thread.sleep(100);
		}

	}

}
