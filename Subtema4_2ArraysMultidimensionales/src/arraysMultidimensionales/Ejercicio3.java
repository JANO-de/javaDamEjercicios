package arraysMultidimensionales;

public class Ejercicio3 {

	public void show() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };

		showEqualRowsAndColumns(matrix);
	}

	public void showEqualRowsAndColumns(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				if (isRowEqualToColumn(matrix, row, column)) {
					System.out.printf("Row %d: ", row + 1);
					for (int k = 0; k < matrix.length; k++) {
						if (k > 0) {
							System.out.print(",");
						}
						System.out.print(matrix[row][k]);
					}
					System.out.printf(" is equal to column %d.%n", column + 1);
				}
			}
		}
	}

	private boolean isRowEqualToColumn(int[][] matrix, int row, int column) {
		for (int k = 0; k < matrix.length; k++) {
			if (matrix[row][k] != matrix[k][column]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}

}