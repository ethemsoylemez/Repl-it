package assignments;

public class _189_MethodsWithString_13FindErrorString {

	public static void main(String[] args) {
		System.out.println(isError("error foo bar"));
		System.out.println(isError("three four error"));

	}

	public static boolean isError(String line) {
		return line.startsWith("error");
	}
}
