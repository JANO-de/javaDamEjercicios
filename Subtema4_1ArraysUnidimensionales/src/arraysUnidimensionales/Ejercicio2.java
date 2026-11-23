package arraysUnidimensionales;

import java.util.Scanner;

public class Ejercicio2 {
	private Scanner keyb = new Scanner(System.in);

	public void show() {
		System.out.println("Type the 1st value: ");
		int i1 = keyb.nextInt();
		System.out.println("Type the 2nd value: ");
		int i2 = keyb.nextInt();
		System.out.println("Type the 3rd value: ");
		int i3 = keyb.nextInt();
		System.out.printf("The multiplication of the list values is: %d", multList(i1, i2, i3));
	}

	public int multList(int... numbers) {
		int mult = 1;
		for (int i = 0; i < numbers.length; i++) {
			mult = mult * numbers[i];
		}
		return mult;
	}

	public static void main(String[] args) {
		new Ejercicio2().show();

	}

}
