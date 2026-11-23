package arraysMultidimensionales;

import java.util.Arrays;

public class Ejercicio4 {

	public void show() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

		System.out.println(Arrays.deepToString(doubleColumns(matrix)));
	}

	public int[][] doubleColumns(int[][] matrix) {
		int[][] result = new int[matrix.length][];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = Arrays.copyOf(matrix[i], matrix[i].length * 2);
		}
		return result;
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}

}