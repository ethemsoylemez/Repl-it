package assignments;

import java.util.*;

public class _124_ArrayPiece {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		int[] firstTwo = new int[2];
		
		if(num.length<=2) {
			firstTwo = num;
		}else {
			firstTwo = Arrays.copyOf(num, 2);
		}
System.out.println(Arrays.toString(firstTwo));
	}
}
