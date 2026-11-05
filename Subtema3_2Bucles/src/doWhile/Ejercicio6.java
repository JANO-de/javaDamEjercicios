package doWhile;

import java.util.Scanner;

public class Ejercicio6 {
	private int numPass = 0;
	private int numFail = 0;
	private int sumPass = 0;
	private int sumFail = 0;

	public void addPass(int nota) {
		numPass++;
		sumPass = sumPass + nota;
	}

	public void addFail(int nota) {
		numFail++;
		sumFail = sumFail + nota;
	}

	public String getMediaP() {
		if (numPass == 0)
			return "No hay aprobados";
		double mediaPass = (double) sumPass / numPass;
		return String.format("Nota media de aprobado: %.2f", mediaPass);
	}

	public String getMediaF() {
		if (numFail == 0)
			return "No hay suspensos";
		double mediaFail = (double) sumFail / numFail;
		return String.format("Nota media de suspenso: %.2f", mediaFail);
	}

	public void gradesLoops() {
		Scanner keyb = new Scanner(System.in);
		int notas;
		do {
			System.out.println("Introduce tu nota 0-10: ");
			notas = Integer.parseInt(keyb.nextLine());
			if (notas >= 0 && notas <= 10) {
				if (notas >= 5)
					addPass(notas);
				else
					addFail(notas);
			}
		} while (notas >= 0 && notas <= 10);
	}

	public void show() {
		gradesLoops();
		System.out.println("Hay " + numPass + " aprobados");
		System.out.println("Hay " + numFail + " suspensos");
		System.out.println(getMediaP());
		System.out.println(getMediaF());
	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}
}