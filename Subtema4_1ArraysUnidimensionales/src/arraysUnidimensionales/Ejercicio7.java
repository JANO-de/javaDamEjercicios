package arraysUnidimensionales;

public class Ejercicio7 {

	public void show() {
		int[] list = { 6, 4, 4, 1, 9, 7, 5, 6, 4, 2, 3, 9, 5, 6, 4 };

		showHistogram(list);
	}

	public void showHistogram(int[] list) {
		int[] frequencies = new int[10];

		for (int i = 0; i < list.length; i++) {
			frequencies[list[i]]++;
		}

		for (int i = 0; i < frequencies.length; i++) {
			System.out.printf("%d | ", i);
			for (int j = 0; j < frequencies[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
	}

}