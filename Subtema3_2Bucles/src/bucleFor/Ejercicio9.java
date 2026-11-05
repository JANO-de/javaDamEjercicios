package bucleFor;

import java.util.Scanner;

public class Ejercicio9 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero positivo: ");
		int n = sc.nextInt();
		rombo(n);
	}

	public void rombo(int n) {
		// Parte creciente: 1..n asteriscos
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// Parte decreciente: n-1..1 asteriscos
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ejercicio9().show();
	}
}