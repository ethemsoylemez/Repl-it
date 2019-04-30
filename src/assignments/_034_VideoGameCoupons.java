package assignments;

import java.util.Scanner;

public class _034_VideoGameCoupons {
	public static void main(String[] args) {
	    //Write your code here
	    int coupons, candies, gumballs;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter number of coupons:");
	    coupons = scan.nextInt();
	    
	    candies = coupons/10;
	    gumballs = (int)((coupons%10)/3);
	    
	    
	    if (coupons>=3){
	    System.out.println("Number of Candies: "+candies);
	    System.out.println("Number of Gumballs: "+gumballs);
	    
	    }else{
	      System.out.println("Not enough coupons");
	    }
	    scan.close();
	  }

}
