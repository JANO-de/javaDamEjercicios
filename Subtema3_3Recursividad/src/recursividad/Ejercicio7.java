package recursividad;

import java.util.Scanner;

public class Ejercicio7 {

	public void show() {
		Scanner keyb = new Scanner(System.in);

		System.out.println("Introduce la cadena: ");
		String box = keyb.nextLine();

		int pos = 0;

		System.out.printf("El numero de palabras es: %d", contarPalabras(box, pos));
	}

	public int contarPalabras(String box, int pos) {
		int result = 0;
		if (pos >= box.length()) {
			result = 0;
		} else {
			boolean empiezaPalabra = box.charAt(pos) != ' ' && (pos == 0 || box.charAt(pos - 1) == ' ');
			if (empiezaPalabra) {
				result = 1 + contarPalabras(box, pos + 1);
			} else {
				result = contarPalabras(box, pos + 1);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		new Ejercicio7().show();
	}

}