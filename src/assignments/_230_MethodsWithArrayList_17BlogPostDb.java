package assignments;

import java.util.ArrayList;

public class _230_MethodsWithArrayList_17BlogPostDb {
	
	public String blogDb(ArrayList<String[]> r,String id)  {
	    
		String str = "";
		for(int i = 0; i<r.size();i++) {
			if(id == r.get(i)[0]) {
				str = r.get(i)[1]+"\n"+r.get(i)[2];
			}
		}
	    
		return str;   
	  }
	  
	  public static void main(String[] args) {
		  _230_MethodsWithArrayList_17BlogPostDb m = new _230_MethodsWithArrayList_17BlogPostDb();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});

	    String post = m.blogDb(arr,"3");
	    System.out.print(post);
	    //should output:
	    //title 3 
	    //content3
	   
	    
	  }//end main

}
