package assignments;

import java.util.Scanner;

public class _083_Party {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);	    
	    // your code 
	    // ------------------------------------------
	    System.out.println("Please enter guest full name:");
	    String guestName = input.nextLine();
	    System.out.println("Do you want to enter new guest name:");
	    String answer = input.nextLine();
	    // boolean isAnswer = true;
	    while (answer.equalsIgnoreCase("yes")){
	       System.out.println("Please enter guest name:");
	      guestName += ", " + input.nextLine();
	      System.out.println("Do you want to enter new guest name:");
	    answer = input.nextLine();
	    }
	    System.out.println("Guest's list: "+guestName.substring(0, guestName.indexOf(" "))+ guestName.substring(guestName.indexOf(" ", guestName.indexOf(" ")+1)-1));
	    System.out.println("Welcome "+guestName.substring(guestName.indexOf(" ")+1, (guestName.indexOf(" ", guestName.indexOf(" ")+1)-1)).toUpperCase() +" family");
	    
	    input.close();
	  }

}
