package assignments;
import java.util.*;
public class _122_ArraysZombieAttack1 {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    int day = 0;
	    
	    int [] inhabitants2 = {0,0,0,0,0,0,0,0};
	    
	  do{
	    System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
	        day++;
	      for(int j = 0;j<inhabitants.length;j++){
	      inhabitants[j] = inhabitants[j]/2;
	      }
	  }while(!Arrays.equals(inhabitants,inhabitants2));
	   System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
	   System.out.println("---- EXTINCT ----");
	  }

}
