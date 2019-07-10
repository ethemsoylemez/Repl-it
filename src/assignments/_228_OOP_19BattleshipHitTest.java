package assignments;

public class _228_OOP_19BattleshipHitTest {

	public static void main(String[] args) {

		String[][] br = new String[][] { { "~", "w", "w" }, { "w", "h", "h" }, { "~", "w", "m" }

		};
		Board b = new Board(br);
		SS.o(b.isDestroyed());// false
		SS.o(b.hit(2, 2));// true
		SS.o(b.isDestroyed());// true
		SS.o(b.hit(3, 1));// false
		SS.o(b.hit(0, 3));// false

		String[][] brc = b.getBoardR();
		SS.o(brc[0][1]);// w water
		SS.o(b.hit(0, 1));// false(hit water)
		SS.o(brc[0][1]);// ~ miss


	}// end main

}

class SS {
	public static void o(Object s) {
		System.out.println(s);
	}
}

class Board {

	private String[][] boardR;// board array
	//private boolean destroyed;
	//private String[] shipTypes = new String[] { "s", "m", "d", "c" };
	String st = "smdc";

	public Board(String[][] br) {
		this.boardR = br;

	}// end constructor

	public boolean hit(int row, int column) {

		boolean result = true;
		if(row >= boardR.length || column >= boardR.length) {
			result = false;
		}else {
		if (boardR[row][column].equals("h")||st.contains(boardR[row][column])) {
			boardR[row][column] = "h";
			result = true;
		}
		if (boardR[row][column].equals("w")) {
			boardR[row][column] = "~";
			result = false;
		}
		}
		return result;
		// end hit
	}

	public boolean isDestroyed() {

		int count = 0;
		for (int i = 0; i < boardR.length; i++) {
			for (int j = 0; j < boardR.length; j++) {
				if(st.contains(boardR[i][j])) {
					count++;
				}
			}
		}
		return count<=0;
	}

	public String[][] getBoardR() {
		return boardR;
	}

}
