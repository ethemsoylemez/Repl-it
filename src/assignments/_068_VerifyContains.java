package assignments;

import java.util.Scanner;

public class _068_VerifyContains {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    boolean result = true;
	    if (sentence.contains(word)){
	    System.out.println(result);
	    }else {
	      result = false;
	      System.out.println(result);
	    }
	    scan.close();
	  }

}
