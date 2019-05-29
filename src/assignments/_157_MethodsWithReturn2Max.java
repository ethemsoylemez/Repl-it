package assignments;

public class _157_MethodsWithReturn2Max {
	
	public static void main(String[] args) {
		System.out.println(max(1,10));
	}
	public static int max(int x, int max) {

		if (x > max) {
			return max;
		} else {
			return x;
		}
	}
}
