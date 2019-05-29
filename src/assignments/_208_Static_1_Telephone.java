package assignments;

//public class for main method
public class _208_Static_1_Telephone {
	public static void main(String[] args) {

		Telephone tlp = new Telephone();
		tlp.setNumber("202-546-5674");
		System.out.println(tlp.getNumber());
	}
}

//class
class Telephone {

	String number;
	public static int quantity = 250;
	public static double total = 15658.92;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
