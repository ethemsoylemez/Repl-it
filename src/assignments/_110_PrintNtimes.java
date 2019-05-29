package assignments;

import java.util.Scanner;

public class _110_PrintNtimes {
	
	 public static void main(String[] args) {
		    int j = 0;
		    @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    
		 for(j=0;j<n;j++) {
			 System.out.print("*");
		 }
	 }
}
