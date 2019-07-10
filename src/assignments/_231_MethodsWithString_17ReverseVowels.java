package assignments;

public class _231_MethodsWithString_17ReverseVowels {
	
	public static void main(String[] args) {
		_231_MethodsWithString_17ReverseVowels t = new _231_MethodsWithString_17ReverseVowels();
		
		System.out.println(t.reverseVowels("athem"));
	}

	 public String reverseVowels(String str) {
		   
		 String reversed = "";
			int j = str.length() - 1;
			String vowels = "AEIOUaeiou";
			
			for (int i = 0; i < str.length(); i++) {

				if (vowels.contains(str.charAt(i)+"")) {
					while (j >= 0) {
						
						if (vowels.contains(str.charAt(j)+"")) {

							reversed += str.charAt(j) + "";
							j--;
							break;
						} else {
							j--;
						}
					}
				} else {
					reversed += str.charAt(i);
				}
			}
			return reversed;
		}
}
