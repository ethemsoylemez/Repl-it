package assignments;

import java.util.*;

public class _130_ArraysDiving {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    float[] score = new float[7];
	    //WRITE YOUR CODE HERE
	    for(int i = 0;i<score.length;i++){
	      System.out.println("Enter score for judge "+(i+1)+":");
	      score[i] = input.nextInt();
	    }
	    double sum = 0;
	    double difficulty = 0;
	    double total = 0;
	    Arrays.sort(score);
	    for(int i = 1;i<score.length-1;i++){
	      sum += score[i];
	    }
	    //System.out.println(sum);
	          System.out.println("Enter difficulty:");
	          difficulty = input.nextDouble();
	     if(difficulty>=1.2&&difficulty<=3.8){
	        total = sum*difficulty*0.6;
	      }
	    
	    // FINAL OUTPUT
	    System.out.println("Total: "+total);
	}
}
