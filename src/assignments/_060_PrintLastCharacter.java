package assignments;

import java.util.Scanner;

public class _060_PrintLastCharacter {
	 public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    System.out.println(word.charAt(word.length()-1));
		    scan.close();
		   
		  }

}
