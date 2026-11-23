package arraysUnidimensionales;

import java.util.Arrays;

public class Ejercicio9 {

	public void show() {
		int[] list = { 1, 2, 3 };

		System.out.printf("Reversed list: %s", Arrays.toString(reverseList(list)));
	}

	public int[] reverseList(int[] list) {
		int[] reversed = new int[list.length];
		reverseList(list, reversed, 0);
		return reversed;
	}

	private void reverseList(int[] list, int[] reversed, int index) {
		if (index < list.length) {
			reversed[list.length - 1 - index] = list[index];
			reverseList(list, reversed, index + 1);
		}
	}

	public static void main(String[] args) {
		new Ejercicio9().show();
	}

}