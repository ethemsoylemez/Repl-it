package assignments;

import java.util.Scanner;

public class _097_JavaEqualsPython {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    
		    int countJava = 0;
		    int countPython = 0;
		    for (int i = 0; i<=sentence.length()-4;i++){
		      if (sentence.substring(i,i+4).equals("java")){
		      countJava++;
		    }
		    }
		    for(int i = 0; i<=sentence.length()-6;i++){
		      if (sentence.substring(i,i+6).equals("python")){
		      countPython++;
		    }
		    }
		        //System.out.println(countJava+""+countPython);
		    if(countJava==countPython){
		      System.out.println(true);
		    }else{
		      System.out.println(false);
		    }
		    
		    scan.close();
	  }
}
