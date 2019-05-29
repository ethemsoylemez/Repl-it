package assignments;

import java.util.Scanner;

public class _088_PrintLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);
		for (char ch = start; ch <= end; ch++) {
			System.out.print(ch);

		}
		scan.close();

//		while (start <= end){
//		      System.out.print(start+"");
//		      start++;
//		    }
	}

}
