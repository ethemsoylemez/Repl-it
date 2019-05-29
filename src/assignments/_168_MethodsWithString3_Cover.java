package assignments;

public class _168_MethodsWithString3_Cover {

	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me")); // java [me]thods
	}

	public static String coverString(String main, String coverME) {
		String newString = "";
		if (main.contains(coverME)) {
			String rep = "[" + coverME + "]";
			newString = main.replace(coverME, rep);
		} else {
			newString = "[" + main + "]";
		}
		return newString;
	}
}
