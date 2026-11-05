package doWhile;

import java.util.Scanner;

public class Ejercicio7 {
	public void validatePin() {
		int tries = 3;
		int pin = 0;
		Scanner keyb = new Scanner(System.in);

		do {
			System.out.println("Introduzca su Pin: ");
			pin = Integer.parseInt(keyb.nextLine());
			if (pin != 123) {
				System.out.println("Error, pin incorrecto!");
			} else {
				System.out.println("Pin correcto.");
				break;
			}
			tries--;
		} while (tries != 0);

	}

	public void show() {
		validatePin();
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
	}
}
