package doWhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
	public void adivinar() {
		Scanner keyb = new Scanner(System.in);
		int secreto = new Random().nextInt(100) + 1; // 1..100
		int intentos = 0;
		int num;
		do {
			System.out.println("Adivina el número (1-100): ");
			num = Integer.parseInt(keyb.nextLine());
			intentos++;
			if (num < secreto) {
				System.out.println("El número es mayor.");
			} else if (num > secreto) {
				System.out.println("El número es menor.");
			}
		} while (num != secreto);
		System.out.println("Lo has adivinado en " + intentos + " intentos.");
	}

	public static void main(String[] args) {
		new Ejercicio9().adivinar();
	}
}