package assignments;

import java.util.Scanner;

public class _101_ArraysPrintFirstLastChar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		String newWords = "";
	    for(String word:words) {
	    	newWords = word.charAt(0)+""+word.charAt(word.length()-1);
	    	System.out.println(newWords);
	    }
	    input.close();
	}

}
