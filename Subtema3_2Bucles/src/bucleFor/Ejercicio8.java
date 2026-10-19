package bucleFor;

import java.util.Scanner;

public class Ejercicio8 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero positivo: ");
		int n = sc.nextInt();
		triangulo(n);
	}

	public void triangulo(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}
}