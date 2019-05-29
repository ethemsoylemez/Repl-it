package assignments;

public class _191_OOP_1PrintAttributes {
	public static void main(String[] args) {

		Atts a = new Atts();
		a.name = "ball";
		a.color = "red";
		a.amount = 1;

		System.out.println(a.asString());
	}
}

class Atts {
	public String name;
	public String color;
	public int amount;

	public String asString() {
		return "name: " + name + " color: " + color + " amount: " + amount;
	}
}
