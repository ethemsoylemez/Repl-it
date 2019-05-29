package assignments;

public class _194_MethodsWithString14Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("java"));
		System.out.println(isPalindrome("civic"));
	}

	public static boolean isPalindrome(String check) {
	    String newWord = check.toUpperCase().replace(" ","");
	    String reversed = "";
	    for(int i = 0; i<newWord.length(); i++){
	      reversed = newWord.charAt(i) + reversed;
	    }
	    if(newWord.equals(reversed)){
	      return true;
	    }else{
	      return false;
	    }
	}
}
