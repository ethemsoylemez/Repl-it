package assignments;

public class _229_MethodsWithArrays_5BadProducts {
	
	public static void main(String[] args) {
		int [] r = {1,1,0,0,1,1};
		int [] p = {1,1,0,0,0,1};
		System.out.println(badP(r,3));
		System.out.println(badP(p,3));
	}
	
	  public static boolean badP(int[] products,int limit)
	  {
	    
	    int count= 0;
	    for(int p : products){
	      if(p==0){
	        count++;
	      }
	    }
	    return count<limit;
	     
	  }

}
