package assignments;

import java.util.Arrays;

public class _134_2DArraysChessBoard {
	
	 public static void main(String[] args) {
		    String[][] chessBoard = new String[8][8];
		    //WRITE YOUR CODE HERE
		    for(int i = 0;i<chessBoard.length;i++){
		    	char ch = 'a';
		        for(int j = 0; j<chessBoard[i].length;j++){
		          chessBoard[i][j] = (i+1)+""+ch;
		          ch++;
		         // System.out.println(ch);
		        }
		    }
		    
		    //DO NOT CHANGE
		    System.out.println(Arrays.deepToString(chessBoard));
		  }

}
