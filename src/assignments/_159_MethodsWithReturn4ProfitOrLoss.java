package assignments;

public class _159_MethodsWithReturn4ProfitOrLoss {

	public static void main(String[] args) {
		System.out.println(c_profits(100, 50));
	}

	public static String c_profits(int buyPrice, int sellPrice) {
		// your code here
		if (buyPrice < sellPrice) {
			return "profit";
		} else if (buyPrice > sellPrice) {
			return "loss";
		} else {
			return "no loss";
		}

	}

}
