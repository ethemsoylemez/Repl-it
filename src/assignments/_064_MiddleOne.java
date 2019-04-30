package assignments;
import java.util.Scanner;
public class _064_MiddleOne {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    
		    int wordLengt = word.length();
		    if (wordLengt%2==1){
		      if ( wordLengt>=3){
		      System.out.println(word.charAt(wordLengt/2));
		    }else {
		      System.out.println(word+word+word);
		    }
		    }else if (wordLengt%2==0) {
		      if (wordLengt>=4){
		      System.out.print(word.charAt(wordLengt/2-1));
		      System.out.println(word.charAt(wordLengt/2));
		    }else {
		       System.out.println(word+word);
		    }
		    }
		    scan.close();
		    
	  }
}


