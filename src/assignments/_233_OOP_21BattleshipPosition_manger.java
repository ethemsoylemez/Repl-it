package assignments;

public class _233_OOP_21BattleshipPosition_manger {

	public static void main(String[] args) {

		String[][] br = new String[][] { { "w", "w", "w", "w" }, { "w", "w", "w", "m" }, { "w", "w", "m", "w" },
				{ "w", "w", "w", "w" }

		};


		position_manger pm = new position_manger(br);
		Sub.o(pm.isValidPos(0, 0, 1, 3));// true
		Sub.o(pm.isValidPos(1, 0, 1, 3));// false
		Sub.o(pm.isValidPos(1, 0, 1, 2));// true

		pm.placeShip(0, 0, 0, 0);// place submarine(ss) from boardR[0][0] vertically(0)
		Sub.o(pm.boardR[0][0]);// s
		Sub.o(pm.boardR[1][0]);// s
		Sub.o(pm.boardR[2][0]);// w
		pm.placeShip(0, 1, 0, 1);// place mine(m) at boardR[0][1]
		Sub.o(pm.boardR[0][1]);// m
		Sub.o(pm.boardR[0][2]);// w
		pm.placeShip(3, 0, 1, 2);// place destroyer(dddd) at boardR[3][0] horizontally (1)
		Sub.o(pm.boardR[3][0]);// d
		Sub.o(pm.boardR[3][1]);// d
		Sub.o(pm.boardR[3][2]);// d
		Sub.o(pm.boardR[3][3]);// d

		/*
		 * //now the board looks like this: {"s","m","w","w"}, {"s","w","w","m"},
		 * {"w","w","m","w"}, {"d","d","d","d"}
		 */

	}// end main

}

class Sub {
	public static void o(Object s) {
		System.out.println(s);
	}
}

class position_manger {

	public String[][] boardR;// board array

	private String[] shipTypes = new String[] { "ss", "m", "dddd", "ccc" };

	public position_manger(String[][] br) {
		boardR = br;

	}// end constructor

	public boolean placeShip(int row, int column, int dir, int shipT) {

		if (isValidPos(row, column, dir, shipT)) {
			for (int i = 0; i < shipTypes[shipT].length(); i++) {
				if (dir == 0) {
					boardR[i][column] = shipTypes[shipT].charAt(0) + "";
				} else {
					boardR[row][i] = shipTypes[shipT].charAt(0) + "";
				}
			}
			return true;
		} else {
			return false;
		}

	}// end place_ship

	public boolean isValidPos(int row, int column, int dir, int len) {

		if (dir == 1 && column + len < boardR.length
				|| dir == 0 && row + len < boardR[row].length && boardR[row][column].equals("w")) {
			return true;
		} else {
			return false;
		}

	}// end isValidPos

}
