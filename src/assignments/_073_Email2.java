package assignments;

import java.util.Scanner;

public class _073_Email2 {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String firstName, lastName, domain;
	    firstName = email.substring(0,email.indexOf("_"));
	    lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
	    domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
	    System.out.println("First name: "+firstName.substring(0,1).toUpperCase()+""+firstName.substring(1));
	    System.out.println("Last name: "+lastName.substring(0,1).toUpperCase()+""+lastName.substring(1));
	    System.out.println("Domain: "+domain);
	    System.out.println("Top-Level Domain: "+email.substring(email.indexOf(".")+1));
	    
	    scan.close();
	    
	  }

}
