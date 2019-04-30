package assignments;

import java.util.Scanner;

public class _065_MiddleThree {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    int wordLengt = word.length();
	    if (wordLengt%2 == 1 && wordLengt>=5){
	      System.out.print(word.charAt(wordLengt/2-1));
	      System.out.print(word.charAt(wordLengt/2));
	      System.out.println(word.charAt(wordLengt/2+1));
	    }else {
	      System.out.println("invalid");
	    }
	    scan.close();
	    
	  }

}
