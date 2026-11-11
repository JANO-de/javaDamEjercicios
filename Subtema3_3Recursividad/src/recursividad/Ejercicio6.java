package recursividad;

import java.util.Scanner;

public class Ejercicio6 {

	public void show() {
		Scanner keyb = new Scanner(System.in);

		System.out.println("Introduce la posicion: ");
		int n = keyb.nextInt();

		System.out.printf("El elemento %d de Fibonacci es: %d", n, fibonacci(n));
	}

	public int fibonacci(int n) {
		int result = 0;
		if (n <= 1) {
			result = n;
		} else {
			result = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return result;
	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}

}