package doWhile;

import java.util.Scanner;

public class Ejercicio3 {
	public void gradesLoops(int notas) {
		Scanner keyb = new Scanner(System.in);
		do {
			System.out.println("Introduce tu nota 0-10: ");
			notas = Integer.parseInt(keyb.nextLine());
		} while (notas >= 0 && notas <= 10);
	}

	public void show() {
		Scanner keyb = new Scanner(System.in);
		int notas;
		System.out.println("Introduce tu nota 1-10:");
		notas = Integer.parseInt(keyb.nextLine());
		gradesLoops(notas);
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}
}
