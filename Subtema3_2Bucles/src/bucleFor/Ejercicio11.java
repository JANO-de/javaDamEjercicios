package bucleFor;

import java.util.Scanner;

public class Ejercicio11 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero positivo (1-9): ");
		int n = sc.nextInt();
		piramide(n);
	}

	public void piramide(int n) {
		for (int i = 1; i <= n; i++) {
			// Espacios iniciales para centrar la pirámide
			for (int e = 0; e < (n - i) * 2; e++) {
				System.out.print(" ");
			}
			// Parte ascendente: 1..i
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Parte descendente: i-1..1
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ejercicio11().show();
	}
}