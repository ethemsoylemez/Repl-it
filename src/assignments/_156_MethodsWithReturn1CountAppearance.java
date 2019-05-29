package assignments;

public class _156_MethodsWithReturn1CountAppearance {
	public static void main(String[] args) {
		String[] arr = { "a", "foo", "bar", "foo", "bla" };
		String t = "foo";
		System.out.println(count_appearance(arr, t));
	}

	public static int count_appearance(String[] arr, String t) {
		int count = 0;
		for (String word : arr) {
			if (word.equals(t)) {
				count++;
			}
		}
		return count;
	}
}
