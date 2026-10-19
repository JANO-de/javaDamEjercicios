package bucleFor;

import java.util.Scanner;

public class Ejercicio3 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número entero positivo: ");
		int a = sc.nextInt();
		System.out.print("Introduce el segundo número entero positivo: ");
		int b = sc.nextInt();
		System.out.println(a + " x " + b + " = " + producto(a, b));
	}

	// Producto utilizando solo sumas
	public int producto(int a, int b) {
		int resultado = 0;
		for (int i = 0; i < b; i++) {
			resultado += a;
		}
		return resultado;
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}
}