package arraysUnidimensionales;

import java.util.Arrays;

public class Ejercicio6 {

	public void show() {
		int[] list = { 5, 3, 8, 4, 2 };

		System.out.printf("Sorted list: %s", Arrays.toString(bubbleSort(list)));
	}

	public int[] bubbleSort(int[] list) {
		int[] sorted = Arrays.copyOf(list, list.length);

		for (int i = 0; i < sorted.length - 1; i++) {
			for (int j = 0; j < sorted.length - 1 - i; j++) {
				if (sorted[j] > sorted[j + 1]) {
					int aux = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = aux;
				}
			}
		}
		return sorted;
	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}

}