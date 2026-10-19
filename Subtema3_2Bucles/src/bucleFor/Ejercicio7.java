package bucleFor;

import java.util.Scanner;

public class Ejercicio7 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una cadena: ");
		String cadena = sc.nextLine();
		System.out.println("Número de palabras: " + contarPalabras(cadena));
	}

	// Una palabra empieza cuando hay un carácter distinto de espacio
	// precedido por un espacio o por el inicio de la cadena.
	public int contarPalabras(String cadena) {
		int palabras = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' ' && (i == 0 || cadena.charAt(i - 1) == ' ')) {
				palabras++;
			}
		}
		return palabras;
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
		// Prueba: " Estoy matriculado en Programación en Entornos y en Marcas " -> 9
	}
}