package assignments;
import java.util.Scanner;
public class _057_FindUser {
public static void main(String[] args) {
	 
		    Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE 
		    
		    System.out.println("Enter full name:");
		    String userName = scan.nextLine();
		    
		    if (userName.equalsIgnoreCase("Max Payne")||userName.equalsIgnoreCase("Alan Wake")){
		      System.out.println("User found!");
		          } else {
		            System.out.println("User not found!");
		          }
		    scan.close();
		  }
}

