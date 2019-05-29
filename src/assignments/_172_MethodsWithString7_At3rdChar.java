package assignments;

public class _172_MethodsWithString7_At3rdChar {

	public static void main(String[] args) {
		System.out.println(at3("Wooden Spoon", "food"));
	}

	public static String at3(String target, String word) {
		return target.substring(0, 3) + word + target.substring(3);
	}
}
