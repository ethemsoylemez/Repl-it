package assignments;

import java.util.Scanner;

public class _089_RepeatSeparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		String str = "";
		
		for(int i = 0; i<count; i++) {
			if(i==count-1) {
				str += word;
			}else {
				str += word+separator;
			}
		}
		System.out.println(str);
		
		scan.close();
	}

}
