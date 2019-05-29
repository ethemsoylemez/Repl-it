package assignments;

import java.util.Arrays;

public class _117_Arrays_CopyCertainValues {
	
	public static void main(String[] args) {
		 System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  
		  
		  
		  public static String[] getWithE(String[] arr) {
			  int count = 0;
			  for(String ar:arr) {
				  if(ar.contains("e")) {
					  count++;
				  }
			  }
			  String [] newArr = new String[count];
			  int idx = 0;
			  for(int i = 0; i<arr.length;i++) {
				  if(arr[i].contains("e")) {
					  newArr[idx] = arr[i];
					  idx++;
				  }
			  }
			  
			  return newArr;
	}

}
