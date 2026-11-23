package arraysUnidimensionales;

import java.util.Scanner;

public class Ejercicio1 {
	private Scanner keyb = new Scanner(System.in);

	public void show() {
		int[] list = new int[4];

		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 4;

		System.out.printf("The sum of the list values is: %d", sumList(list));
	}

	public int sumList(int[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum = sum + list[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
