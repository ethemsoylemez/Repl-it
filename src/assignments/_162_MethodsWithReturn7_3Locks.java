package assignments;

public class _162_MethodsWithReturn7_3Locks {
	
	public static void main(String[] args) {
		System.out.println(threeLocks(true,true,false));
	}
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
	    return (a&&b)||c;
	    
	    
	  }//end threeLocks

}
