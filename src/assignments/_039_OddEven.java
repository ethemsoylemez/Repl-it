package assignments;

import java.util.Scanner;

public class _039_OddEven {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter a number:");
		    int number = input.nextInt();
		   
		    //CODE HERE 
		    if (number % 2 == 0){
		      System.out.println(number+" is even");
		    }else if (number % 2 == 1){
		      System.out.println(number+" is odd");
		    }
		    
		    input.close();
		    
		  }

}
