package assignments;

import java.util.Scanner;

public class _027_SchoolGrades {
	  public static void main(String[] args) {
		    // Enter your code here
		    
		    String subject1, subject2, subject3, subject4, subject5, summary;
		    double grade1, grade2, grade3, grade4, grade5, average;
		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Welcome to the Grader!");
		    System.out.println("Please enter subject name number 1 and score for this subject");
		    subject1 = scan.next();
		    grade1 = scan.nextDouble();
		    
		    System.out.println("Please enter subject name number 2 and score for this subject");
		    subject2 = scan.next();
		    grade2 = scan.nextDouble();
		    
		    System.out.println("Please enter subject name number 3 and score for this subject");
		    subject3 = scan.next();
		    grade3 = scan.nextDouble();
		    
		    System.out.println("Please enter subject name number 4 and score for this subject");
		    subject4 = scan.next();
		    grade4 = scan.nextDouble();
		    
		    System.out.println("Please enter subject name number 5 and score for this subject");
		    subject5 = scan.next();
		    grade5 = scan.nextDouble();
		    
		    
		    summary = "Summary: "+subject1+" - " + grade1+", "+subject2+ " - "+ grade2+", "+subject3+ " - "+ grade3+ ", "+subject4+ " - " +grade4+ ", "+subject5+ " - "+grade5;
		    average = (grade1+grade2+grade3+grade4+grade5)/5;
		    
		    System.out.println(summary);
		    System.out.println("Your average score is: "+ average);
		    System.out.println("Thank you for using Grader!");
		    System.out.println("Goodbye!");
		    scan.close();
		  }

}
