package assignments;

//public class for main method
public class _206_OOP_9_GasTank {
	public static void main(String[] args) {
		GasTank gt = new GasTank(18);
		gt.addGas(15);
		gt.useGas(7);
		System.out.println(gt.isEmpty());
		System.out.println(gt.isFull());
		System.out.println(gt.getGasLevel());
		System.out.println(gt.fillUp());
	}
}

class GasTank {

	// attributes
	double amount = 0;
	double capacity;

	// constructor
	public GasTank(double capacity) {
		this.capacity = capacity;
	}

	// methods
	public void addGas(double param) {
		amount += param;
		if (amount > capacity) {
			amount = capacity;
		}
	}

	public void useGas(double param) {
		amount -= param;
		if (amount < 0) {
			amount = 0;
		}
	}

	public boolean isEmpty() {
		return amount < 0.1;
	}

	public boolean isFull() {
		return amount > (capacity - 0.1);
	}

	public double getGasLevel() {
		return amount;
	}

	public double fillUp() {
		// amount = capacity;
		return capacity - amount;

	}
}
