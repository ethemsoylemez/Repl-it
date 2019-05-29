package assignments;

public class _160_MethodsWithReturn5HamletLogic {
	
	public static void main(String[] args) {
		boolean tobe = true;
		boolean nottobe = false;
		System.out.println(hamletQuote(tobe,nottobe));
	}

	public static boolean hamletQuote(boolean toBe, boolean notToBe) {

		if (!toBe && !notToBe) {
			return false;
		} else {
			return true;
		}
	}

}
