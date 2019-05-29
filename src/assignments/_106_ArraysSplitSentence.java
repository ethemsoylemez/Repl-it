package assignments;

import java.util.Scanner;

public class _106_ArraysSplitSentence {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    String[] newSentence = sentence.split(" ");
	    
	    for(String sent : newSentence) {
	    	System.out.println(sent);
	    }
	    
	    input.close();
	}

}
