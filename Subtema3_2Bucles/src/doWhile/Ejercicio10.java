package doWhile;

import java.util.Scanner;

public class Ejercicio10 {
	public void sumarDigitos() {
		Scanner keyb = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int num = Math.abs(Integer.parseInt(keyb.nextLine()));
		int suma = 0;
		do {
			suma = suma + num % 10; // último dígito
			num = num / 10; // quita el último dígito
		} while (num > 0);
		System.out.println("La suma de los dígitos es " + suma);
	}

	public static void main(String[] args) {
		new Ejercicio10().sumarDigitos();
	}
}