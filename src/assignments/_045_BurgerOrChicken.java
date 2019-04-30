package assignments;

import java.util.*;

class _045_BurgerOrChicken {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String in = s.next();

		// your code here
		if (in.equals("burger") || in.equals("chicken")) {
			System.out.println(10.0);
		}
		if (in.equals("soda")) {
			System.out.println(2.0);
		}

		s.close();

	}
}