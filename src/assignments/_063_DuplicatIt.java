package assignments;

import java.util.Scanner;

public class _063_DuplicatIt {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    System.out.println(word1+word2+word2+word1);
	   /* System.out.print(word2);
	    System.out.print(word2);
	    System.out.print(word1);*/
	    
	    scan.close();
	    
	    
	  }

}
