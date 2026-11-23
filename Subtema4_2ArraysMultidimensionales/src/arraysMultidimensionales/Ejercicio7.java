package arraysMultidimensionales;

public class Ejercicio7 {
	private static final int SIZE = 8;
	private int solutions = 0;

	public void show() {
		solutions = 0;
		placeQueens(new int[SIZE], 0);
		System.out.printf("Total solutions: %d", solutions);
	}

	// queens[row] = column of the queen placed in that row
	private void placeQueens(int[] queens, int row) {
		if (row == SIZE) {
			solutions++;
			showBoard(queens);
			return;
		}
		for (int column = 0; column < SIZE; column++) {
			if (isSafe(queens, row, column)) {
				queens[row] = column;
				placeQueens(queens, row + 1);
			}
		}
	}

	private boolean isSafe(int[] queens, int row, int column) {
		for (int i = 0; i < row; i++) {
			if (queens[i] == column || Math.abs(queens[i] - column) == row - i) {
				return false;
			}
		}
		return true;
	}

	private void showBoard(int[] queens) {
		System.out.printf("Solution %d:%n", solutions);
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (queens[i] == j) {
					System.out.print("Q ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
	}

}