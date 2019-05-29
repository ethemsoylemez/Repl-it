package assignments;

import java.util.Scanner;

public class _092_Factorial {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	    long factorial = 1;
	    for(int i = 1; i<=n;i++) {
	    	factorial *= i;
	    }
	    System.out.println(factorial);
	    
	    scan.close();
	}

}
