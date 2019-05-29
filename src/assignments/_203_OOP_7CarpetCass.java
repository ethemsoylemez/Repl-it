package assignments;

//public class for main method
public class _203_OOP_7CarpetCass {
	public static void main(String[] args) {

		Carpet c = new Carpet();
		System.out.println(c.totalPrice); // 200

		Carpet c2 = new Carpet(20.0, 20.0, 2.0, false);
		System.out.println(c2.totalPrice); // 80

		Carpet c3 = new Carpet(20.0, 20.0, 2.0, true);
		System.out.println(c3.totalPrice); // 280

	}
}

//Class
class Carpet {

	public double width, length, unitPrice, totalPrice;
	public boolean isPersian;

	public Carpet() {
		width = 300;
		length = 300;
		totalPrice = 200;
		unitPrice = 0;
		isPersian = false;
	}

	public Carpet(double width, double length, double unitPrice, boolean isPersian) {
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian = isPersian;
		totalPrice = (width + length) * unitPrice;
		if (isPersian) {
			totalPrice += 200;
		}
	}
}
