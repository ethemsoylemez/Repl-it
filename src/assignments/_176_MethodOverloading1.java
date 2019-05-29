package assignments;

public class _176_MethodOverloading1 {

	public static void main(String[] args) {
		int[] arrInt = { 10, 20, 5 };
		double[] arrDouble = { 10.5, 20.9, 5.0 };
		System.out.println(findMax(arrInt));
		System.out.println(findMax(arrDouble));
	}

	// WRITE YOUR CODE HERE
	public static int findMax(int[] numsint) {

		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < numsint.length; i++) {
			if (numsint[i] > maxNum) {
				maxNum = numsint[i];
			}
		}
		return maxNum;
	}

	public static double findMax(double[] numsdouble) {

		double maxNum = Double.MIN_VALUE;
		for (int i = 0; i < numsdouble.length; i++) {
			if (numsdouble[i] > maxNum) {
				maxNum = numsdouble[i];
			}
		}
		return maxNum;
	}
}
