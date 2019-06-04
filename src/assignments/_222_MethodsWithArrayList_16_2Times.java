package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class _222_MethodsWithArrayList_16_2Times {

	public static void main(String[] args)
	{
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,8,5,4,1,0));
		System.out.println(nums);
		System.out.println(twoTimes(nums));
	}
	//create your method below
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
	  ArrayList<Integer> twoNums = new ArrayList<>();
	  for(int nm: nums){
	    twoNums.add(nm);
	    twoNums.add(nm);
	  }
	  return twoNums;
	}
}
