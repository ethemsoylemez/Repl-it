package assignments;

//public class for main method
public class _210_Inheritance_1 {
	public static void main(String[] args) {

		SavingsAccount sa = new SavingsAccount(20);
		System.out.println(sa.getInterestRate());
	}
}

//parent class
class BankAccount {

}

//child class
class SavingsAccount extends BankAccount {
	// instance variable
	double interestRate;

	// method
	public double getInterestRate() {
		return interestRate;
	}

	// constructor
	public SavingsAccount(int interestRate) {
		this.interestRate = interestRate;
	}
}