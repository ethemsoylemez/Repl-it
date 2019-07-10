package assignments;

public class _235_Exceptions_1 {

	public static void main(String[] args) {
		String message = "Is everything allright";
		PanicException pe = new PanicException(message);
		System.out.println(pe);
		PanicException pe1 = new PanicException();
		System.out.println(pe1);
	}

}

class PanicException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanicException(String message) {
		super("PANIC! " + message);
	}

	public PanicException() {
		super("PANIC!");
	}
}
