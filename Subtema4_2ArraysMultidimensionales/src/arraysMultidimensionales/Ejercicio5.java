package arraysMultidimensionales;

import java.util.Arrays;

public class Ejercicio5 {

	public void show() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] sums = sumRowsAndColumns(matrix);
		System.out.printf("Rows: %s%n", Arrays.toString(sums[0]));
		System.out.printf("Columns: %s%n", Arrays.toString(sums[1]));
	}

	// Returns { rowSums, columnSums }
	public int[][] sumRowsAndColumns(int[][] matrix) {
		int[] rows = new int[matrix.length];
		int[] columns = new int[matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				rows[i] = rows[i] + matrix[i][j];
				columns[j] = columns[j] + matrix[i][j];
			}
		}
		return new int[][] { rows, columns };
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}

}