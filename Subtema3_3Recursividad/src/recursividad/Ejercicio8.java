package recursividad;

import java.util.Scanner;

public class Ejercicio8 {

	public void show() {
		Scanner keyb = new Scanner(System.in);

		System.out.println("Introduce el numero de discos: ");
		int n = keyb.nextInt();

		hanoi(n, 1, 3, 2);
	}

	public void hanoi(int n, int origen, int destino, int auxiliar) {
		if (n == 1) {
			System.out.println(origen + " → " + destino);
		} else {
			hanoi(n - 1, origen, auxiliar, destino);
			System.out.println(origen + " → " + destino);
			hanoi(n - 1, auxiliar, destino, origen);
		}
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}

}