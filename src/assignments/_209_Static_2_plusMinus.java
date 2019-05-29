package assignments;

//public class for main method
public class _209_Static_2_plusMinus {

	public static void main(String[] args) {

		// since methods are static we don't need to create object.
		// we call methods by using class name
		System.out.println("1+1 = " + calc1.plus(1, 1));
		System.out.println("1-1 = " + calc1.minus(1, 1));
	}
}

//class
class calc1 {

	public static int plus(int n1, int n2) {
		return n1 + n2;
	}

	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
}
