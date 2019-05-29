package assignments;

import java.util.Scanner;

public class _104_ArraysHas55 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

	    boolean isFive = false;
	    boolean status= false;
	    for(int i = 0; i<nums.length;i++) {
	    	if(isFive) {
	    		if(nums[i] ==5 ) {
	    			status = true;
	    			//break;
	    		}
	    	}else {
	    		if(nums[i] == 5) {
	    			isFive = true;
	    		}
	    	}
	    }
	    System.out.println(status);

//		int count = 0;
//		for (int i = 0; i < nums.length - 1; i++) {
//			if (nums[i] == 5 && nums[i + 1] == 5) {
//				count++;
//			}
//		}
//		if (count > 0) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		input.close();
	}

}
