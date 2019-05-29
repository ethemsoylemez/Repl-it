package assignments;

public class _165_MethodsWithReturn10_ThunderBlazz {

	public static void main(String[] args) {
		System.out.println(getThunderBlazz(true,false,1,2,3));

	}

	public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {

		return (available || gift) || (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3)
				|| (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2);
	}

}
