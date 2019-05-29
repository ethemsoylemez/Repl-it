package assignments;

public class _193_OOP_2LameCalculator {

	public static void main(String[] args) {

		LameCalculator lc = new LameCalculator();
		System.out.println("1+1 = " + lc.plus(1, 1));
		System.out.println("2-3 = " + lc.minus(2, 3));
		System.out.println("2x3 = " + lc.multiply(2, 3));
		System.out.println("10:2 = " + lc.divide(10, 2));

	}
}

class LameCalculator {

	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}
