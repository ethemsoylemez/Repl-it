package assignments;

public class _237_Common_divisor {

	public static void main(String[] args) {
		System.out.println(commonDivisor(15, 25)); // 5
		System.out.println(commonDivisor(40, 124)); // 4
		System.out.println(commonDivisor(120, 60)); // 60
		System.out.println(commonDivisor(80, 60)); // 20
	}

	public static int commonDivisor(int m, int n) {
		// WRITE YOUR CODE HERE
		int result = 1;
		for (int i = n; i > 1; i--) {
			if (m % i == 0 && n % i == 0) {
				result = i;
				break;
			}
		}
		return result;
	}
}
