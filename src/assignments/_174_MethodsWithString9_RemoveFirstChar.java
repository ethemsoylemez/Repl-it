package assignments;

public class _174_MethodsWithString9_RemoveFirstChar {

	public static void main(String[] args) {
		System.out.println(removeFirst("Wooden"));
	}

	public static String removeFirst(String target) {
		return target.substring(1);
	}
}
