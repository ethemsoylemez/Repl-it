package assignments;

import java.util.Scanner;

public class _102_ArraysReverseSentence {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    String [] arraySentence = sentence.split(" ");
	 for(int i = 0; i<arraySentence.length;i++) {
		 System.out.println(arraySentence[arraySentence.length-1-i]);
		 
	 }
	 input.close();
	    
	    
	}
}
