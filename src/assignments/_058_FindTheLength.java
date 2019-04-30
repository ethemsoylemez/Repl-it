package assignments;

import java.util.Scanner;

public class _058_FindTheLength {
	 public static void main(String[] args) {
		    //WRITER YOU CODE HERE
		    
		    Scanner keyboard = new Scanner(System.in);
		    System.out.println("Please enter the text:");
		    String text = keyboard.nextLine();
		    System.out.println("Length is: "+text.length());
		    
		    keyboard.close();
		  }

}
