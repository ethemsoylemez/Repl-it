package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class _136_2DArraysDiagonalDifference {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
				System.out.println(Arrays.deepToString(matrix));
				
		int left = 0;
		int right = 0;
		
		 for (int i= 0;i<matrix.length;i++){
		      for (int j = 0; j<matrix.length;j++){
		        if(i==j){
		          left += matrix[i][j];
		        } 
		        if(j==matrix.length-1-i){
		          right += matrix[i][j];
		        }
		      }
		    
		    }
		System.out.println("Right: "+right);
		System.out.println("Left: "+left);
		System.out.println(Math.abs(left-right));

	}

}
