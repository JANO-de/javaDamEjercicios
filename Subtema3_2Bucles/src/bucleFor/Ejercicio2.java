package bucleFor;

import java.util.Scanner;

public class Ejercicio2 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Introduce un número de 0 a 10: ");
			n = sc.nextInt();
		} while (n < 0 || n > 10);
		mostrarTabla(n);
	}

	public void mostrarTabla(int n) {
		System.out.println("La tabla de multiplicar del " + n + " es:");
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d x %2d = %3d%n", n, i, n * i);
		}
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}