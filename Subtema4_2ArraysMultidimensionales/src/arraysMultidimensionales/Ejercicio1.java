package arraysMultidimensionales;

public class Ejercicio1 {

	public void show() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };

		System.out.printf("Is symmetric: %b", isSymmetric(matrix));
	}

	public boolean isSymmetric(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}