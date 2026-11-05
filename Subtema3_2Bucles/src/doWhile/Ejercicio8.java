package doWhile;

import java.util.Scanner;

public class Ejercicio8 {
	public void sumNum() {
		Scanner keyb = new Scanner(System.in);
		int num1;
		int num2;
		int result;

		System.out.println("Introduce el primer numero: ");
		num1 = Integer.parseInt(keyb.nextLine());
		System.out.println("Introduce el segundo numero: ");
		num2 = Integer.parseInt(keyb.nextLine());
		result = num1 + num2;
		System.out.printf("La suma de %d y %d es %d.\n\n", num1, num2, result);
	}

	public void subNum() {
		Scanner keyb = new Scanner(System.in);
		int num1;
		int num2;
		int result;

		System.out.println("Introduce el primer numero: ");
		num1 = Integer.parseInt(keyb.nextLine());
		System.out.println("Introduce el segundo numero: ");
		num2 = Integer.parseInt(keyb.nextLine());
		result = num1 - num2;
		System.out.printf("La resta de %d y %d es %d.\n\n", num1, num2, result);
	}

	public void printMenu() {
		Scanner keyb = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("""
					1. Sumar dos numeros
					2. Restar dos numeros
					3. Salir
					""");
			option = Integer.parseInt(keyb.nextLine());
			switch (option) {
			case 1 -> sumNum();
			case 2 -> subNum();
			}
		} while (option != 3);
		System.out.println("Adios!");
	}

	public void show() {
		printMenu();
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}
}
