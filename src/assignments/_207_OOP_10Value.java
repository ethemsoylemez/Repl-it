package assignments;

//public class for main method
public class _207_OOP_10Value {
	
	public static void main(String[] args) {
		Value vl = new Value();
		System.out.println(vl.getVal());
		vl.setVal(5);
		System.out.println(vl.getVal());
		Value vl2 = new Value(10);
		System.out.println(vl2.getVal());
	}
}

//class
class Value {
	// WRITE YOUR CODE HERE
	int first = 0;
	int count = 0;

	public Value(int param) {
		count++;
		first = param;
	}

	public Value() {
	}

	int count1 = 0;
	int last = 0;

	public void setVal(int param) {
		count1++;
		last = param;
	}

	public boolean wasModified() {
		return count1 > 0;
	}

	public int getVal() {
		if (count1 > 0) {
			return last;
		} else if (count > 0) {
			return first;
		} else {
			return 0;
		}
	}
}
