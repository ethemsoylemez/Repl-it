package assignments;

import java.util.Scanner;

public class _096_PrintLetters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    
	    while(start<=end) {
	    	System.out.print(start);
	    	start++;
	    }
	    scan.close();
	}

}
