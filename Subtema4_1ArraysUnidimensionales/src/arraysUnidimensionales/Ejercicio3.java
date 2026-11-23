package arraysUnidimensionales;

import java.util.Arrays;

public class Ejercicio3 {

	public void show() {
		int[] list = { 1, 2, 3 };

		System.out.printf("Before: %s%n", Arrays.toString(list));
		modifyList(list);
		// The array is modified because arrays are passed by reference
		System.out.printf("After: %s%n", Arrays.toString(list));
	}

	public void modifyList(int[] list) {
		list[0] = 99;
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}

}