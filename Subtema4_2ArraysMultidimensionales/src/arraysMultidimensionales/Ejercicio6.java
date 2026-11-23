package arraysMultidimensionales;

public class Ejercicio6 {

	public void show() {
		int[][] magic = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
		int[][] notMagic = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.printf("First matrix is magic: %b%n", isMagicSquare(magic));
		System.out.printf("Second matrix is magic: %b%n", isMagicSquare(notMagic));
	}

	public boolean isMagicSquare(int[][] matrix) {
		int n = matrix.length;
		int target = 0;
		int diagonal1 = 0;
		int diagonal2 = 0;

		for (int j = 0; j < n; j++) {
			target = target + matrix[0][j];
		}

		for (int i = 0; i < n; i++) {
			int row = 0;
			int column = 0;
			for (int j = 0; j < n; j++) {
				row = row + matrix[i][j];
				column = column + matrix[j][i];
			}
			if (row != target || column != target) {
				return false;
			}
			diagonal1 = diagonal1 + matrix[i][i];
			diagonal2 = diagonal2 + matrix[i][n - 1 - i];
		}
		return diagonal1 == target && diagonal2 == target;
	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}

}