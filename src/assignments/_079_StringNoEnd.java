package assignments;

import java.util.Scanner;

public class _079_StringNoEnd {
	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
	    String txt = s.next();
	    //your code here
	    
	    System.out.println(txt.replace(txt.substring(txt.length()-1),""));
	    
	    s.close();

	  }
	}
