package bucleFor;

import java.util.Scanner;

public class Ejercicio6 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una cadena: ");
		String cadena = sc.nextLine();
		System.out.print("Introduce un carácter: ");
		char c = sc.nextLine().charAt(0);
		int resultado = caracteresEntre(cadena, c);
		if (resultado == -1) {
			System.out.println("El carácter no aparece en la cadena.");
		} else {
			System.out
					.println("Hay " + resultado + " caracteres entre la primera y la última aparición de '" + c + "'.");
		}
	}

	// Devuelve -1 si el carácter no aparece; 0 si solo aparece una vez
	public int caracteresEntre(String cadena, char c) {
		int primera = -1;
		int ultima = -1;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == c) {
				if (primera == -1) {
					primera = i;
				}
				ultima = i;
			}
		}
		if (primera == -1) {
			return -1;
		}
		if (primera == ultima) {
			return 0;
		}
		return ultima - primera - 1;
	}

	public static void main(String[] args) {
		new Ejercicio6().show();
	}
}