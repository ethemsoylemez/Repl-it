package assignments;

import java.util.*;

public class _135_ArraysShiftLeft {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		char[] alpha = new char[26];
		for (int i = 0; i < 26; i++) {
			alpha[i] = (char) (97 + i);
		}
		System.out.println(Arrays.toString(alpha));
		
		char[] alpha1 = new char[alpha.length];

		for (int i = 0; i < alpha1.length; i++) {
			alpha1[i] = alpha[(i+10)%alpha1.length]; // n % m  if n < m always is n
			//alpha1[i] = alpha[alpha1.length-1 -i];  // Reversing by index
		}
		System.out.println(Arrays.toString(alpha1));
		String name = "Ravil";
		String rev = "";
		for(int i = 0; i<name.length();i++) {
			rev += name.charAt(name.length()-1-i);
		}
		System.out.println(rev);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = i;// scan.nextInt();
		}
		// WRITE YOUR CODE HERE
		System.out.println(Arrays.toString(nums));
		int[] nums1 = new int[size];
		for (int i = 0; i < size; i++) {
			// if(i==size-1){
			// nums1[size-1] = nums[0];
			// }else{
			// nums1[i] = nums[i+1];
			// }
			nums1[i] = nums[(i + 2)%size];
		}
		System.out.println(Arrays.toString(nums1));
		

		
	}

}
