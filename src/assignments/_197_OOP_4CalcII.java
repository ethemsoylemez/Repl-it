package assignments;

public class _197_OOP_4CalcII {
	public static void main(String[] args) {

		Calc a = new Calc();
		a.setX(1);
		a.setY(1);
		a.plus();
		System.out.println("1+1 = " + a.getResult());// 1+1 = 2

	}
}

class Calc {
	private int x;
	private int y;
	private int result;

	public int getResult() {
		return result;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void plus() {
		result = x + y;
	}

	public void minus() {
		result = x - y;
	}
}