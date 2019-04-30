package assignments;

import java.util.Scanner;

public class _030_SecondsConverter {
	 public static void main(String[] args) {
		    //YOUR CODE HERE:
		    Scanner scan = new Scanner(System.in);
		    
		    int inputSeconds, hours, minutes, seconds, remainSeconds;
		    
		    System.out.println("Enter seconds");
		    inputSeconds = scan.nextInt();
		    int division = 60;
		    hours = inputSeconds/(division*division);
		    remainSeconds = inputSeconds % (division*division);
		    minutes = remainSeconds/division;
		    seconds = remainSeconds % division;
		 		    
		    System.out.println(hours+" hours, "+ minutes+" minutes,  and "+seconds+" seconds");
		    
		    scan.close();
		    
		  }

}
