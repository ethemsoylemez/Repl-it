package assignments;
//import java.io.*;
  import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class _127_2DArraysLargestNumber {
  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    
	    //TODO write your code below
	    int biggest = Integer.MIN_VALUE;
	    for(int i = 0; i<rows;i++){
	      for(int j = 0; j<cols;j++){
	        if(arr[i][j]>biggest){
	          biggest=arr[i][j];
	        }
	      }
	    }
	    System.out.println(biggest);
	    
	    
	    inp.close();
	   
	  }//end main
	}

