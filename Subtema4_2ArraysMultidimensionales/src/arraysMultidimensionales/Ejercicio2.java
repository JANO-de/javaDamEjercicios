package arraysMultidimensionales;

public class Ejercicio2 {

	public void show() {
		double[][][] cube = { { { 1.5, 2.5 }, { 3.5, 4.5 } }, { { 9.5, 0.5 }, { 7.5, 6.5 } } };

		System.out.printf("The greatest element is: %.1f", greatest(cube));
	}

	public double greatest(double[][][] cube) {
		double max = cube[0][0][0];
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube[i].length; j++) {
				for (int k = 0; k < cube[i][j].length; k++) {
					if (cube[i][j][k] > max) {
						max = cube[i][j][k];
					}
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}