package assignments;

import java.util.Scanner;

public class _033_citizens {
	  public static void main(String[] args) {
		    //WRITE YOUR CODE HERE 
		    int seniorCitizens, nonSeniorCitizens,age;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		    seniorCitizens = scan.nextInt();
		    nonSeniorCitizens = scan.nextInt();
		    
		    System.out.println("What is new citizen's age?");
		    age = scan.nextInt();
		    
		    if(age>=65){
		      System.out.println("Senior Citizen");
		      seniorCitizens++;
		    }else{
		      System.out.println("Non-Senior Citizen");
		      nonSeniorCitizens++;
		    }
		    System.out.println("New seniorCitizens count "+seniorCitizens);
		    System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);
		    
		    scan.close();
		    
		    
		  }

}
