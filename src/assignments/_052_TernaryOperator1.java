package assignments;

import java.util.Scanner;

public class _052_TernaryOperator1 {
	  public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number:");
				int x = scan.nextInt();
				//WRITE YOUT CODE HERE
				int result = (x>=5) ? x:-x;
				System.out.println(result);
				
				scan.close();
		  }

}
