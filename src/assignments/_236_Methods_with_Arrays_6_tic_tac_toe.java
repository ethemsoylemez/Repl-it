package assignments;

public class _236_Methods_with_Arrays_6_tic_tac_toe {

	public static void main(String[] args) {
		char[] game1 = { 'X', 'X', 'X', '4', 'O', '6', '7', 'O', 'O' };
		char[] game2 = { 'X', 'O', 'X', '4', 'O', 'X', '7', 'O', 'O' };

		char[] game3 = { '1', 'O', 'X', '4', 'O', 'X', '7', '8', 'X' };

		System.out.println(won(game1)); // Player X won
		System.out.println(won(game2)); // Player O won
		System.out.println(won(game3)); // Player X won
	}

	public static String won(char[] x) {

		if ((x[0] == x[1] && x[0] == x[2]) || (x[0] == x[3] && x[0] == x[6]) || (x[0] == x[4] && x[0] == x[8])) {
			return "Player " + x[0] + " won";
		} else if ((x[3] == x[4] && x[3] == x[5]) || (x[1] == x[4] && x[1] == x[7]) || (x[2] == x[4] && x[2] == x[6])) {
			return "Player " + x[4] + " won";
		} else if ((x[2] == x[5] && x[2] == x[8]) || (x[6] == x[7] && x[7] == x[8])) {
			return "Player " + x[8] + " won";
		} else {
			return null;
		}

	}

}
