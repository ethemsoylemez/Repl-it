package assignments;

public class _116_UtopianTree {
	public static void main(String[] args) {
		int treeHeight = 0;
		for (int i = 1; i <= 10; i++) {
			if (i < 4) {
				treeHeight++;
				System.out.println("year " + i + " - growth 1 cm");
				System.out.println("tree size: " + treeHeight + " cm");
			} else {
				treeHeight += 2;
				System.out.println("year " + i + " - growth 2 cm");
				System.out.println("tree size: " + treeHeight + " cm");

			}

		}
	}

}
