package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class _105_ArraysPrintFirstLastCharII {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    
//		Manipulating array
	    for (int i = 0; i<words.length;i++) {
	    	words[i] = words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
	    }
	    System.out.println(Arrays.toString(words));
	    
//	    Manipulating string 
	    String newWord="";
	    for(String word:words){
	      newWord += word.charAt(0)+""+word.charAt(word.length()-1)+", ";
	    }
	    System.out.println("["+newWord.substring(0,newWord.lastIndexOf(","))+"]");

	    input.close();
	}
}
