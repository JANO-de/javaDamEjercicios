package doWhile;

import java.util.Scanner;

public class Ejercicio5 {
	private int numPass = 0;
	private int numFail = 0;

	public void addPass() {
		numPass = numPass + 1;
	}

	public String getPass() {
		return String.format("Hay %d aprobados.", numPass);
	}

	public void addFail() {
		numFail = numFail + 1;
	}

	public String getFail() {
		return String.format("Hay %d suspensos.", numFail);
	}

	public void gradesLoops(int tried, int notas) {
		Scanner keyb = new Scanner(System.in);
		do {
			System.out.println("\nIntroduce tu nota 0-10: ");
			notas = Integer.parseInt(keyb.nextLine());
			tried = tried + 1;
			System.out.printf("En la iteracion %d has introducido la nota %s", tried, notas);
			if (notas >= 5) {
				addPass();
			} else {
				addFail();
			}
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
		System.out.printf("\n" + getPass() + "\n" + getFail());
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}
}
