package doWhile;

import java.util.Scanner;

public class Ejercicio4 {
	public void gradesLoops(int tried, int notas) {
		Scanner keyb = new Scanner(System.in);
		do {
			System.out.println("\nIntroduce tu nota 0-10: ");
			notas = Integer.parseInt(keyb.nextLine());
			tried = tried + 1;
			System.out.printf("En la iteracion %d has introducido la nota %s", tried, notas);
		} while (notas >= 0 && notas <= 10);
	}

	public void show() {
		Scanner keyb = new Scanner(System.in);
		int notas;
		int tried = 0;
		System.out.println("Introduce tu nota 1-10:");
		notas = Integer.parseInt(keyb.nextLine());
		System.out.printf("En la iteracion %d has introducido la nota %d", tried, notas);
		gradesLoops(tried, notas);
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}
}
