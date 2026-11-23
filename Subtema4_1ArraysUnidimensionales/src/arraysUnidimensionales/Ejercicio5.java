package arraysUnidimensionales;

import java.util.Arrays;

public class Ejercicio5 {

	public void show() {
		int[] list = { 1, 2, 3 };

		System.out.printf("Reversed list: %s", Arrays.toString(reverseList(list)));
	}

	public int[] reverseList(int[] list) {
		int[] reversed = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			reversed[i] = list[list.length - 1 - i];
		}
		return reversed;
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}

}