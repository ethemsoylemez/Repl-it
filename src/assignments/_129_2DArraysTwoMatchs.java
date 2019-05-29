package assignments;

//import java.util.Scanner;

public class _129_2DArraysTwoMatchs {

	public static void main(String[] args) {
//		Scanner inp = new Scanner(System.in);
//		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = {{2,2,1,3,4,5},
				       {5,2,3,3,4,5},
				       {3,2,3,1,4,5}}; //new int[rows][cols];
//		for (int i = 0; i <= rows - 1; i++) {
//			for (int j = 0; j <= cols - 1; j++) {
//				arr[i][j] = inp.nextInt();
//			} // end for cols
//		} // end for rwos

		// your code here

		int matches = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][i] == arr[i][j] && i != j) {
					matches++;
				}
			}
		}

		//inp.close();
		System.out.print("matches: " + matches);
	}
}
