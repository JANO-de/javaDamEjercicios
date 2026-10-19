package bucleFor;

import java.util.Scanner;

public class Ejercicio13 {

	// Códigos ANSI de color de fondo
	private static final String OSCURA = "\u001B[48;5;236m";
	private static final String CLARA = "\u001B[48;5;255m";
	private static final String AZUL = "\u001B[44m";
	private static final String ROJO = "\u001B[41m";
	private static final String RESET = "\u001B[0m";

	public void show() {
		Scanner sc = new Scanner(System.in);
		String casilla;
		do {
			System.out.print("Introduce una casilla (de a1 a h8): ");
			casilla = sc.nextLine().trim().toLowerCase();
		} while (!casillaValida(casilla));
		dibujarTablero(casilla);
	}

	public boolean casillaValida(String casilla) {
		return casilla.length() == 2 && casilla.charAt(0) >= 'a' && casilla.charAt(0) <= 'h' && casilla.charAt(1) >= '1'
				&& casilla.charAt(1) <= '8';
	}

	public void dibujarTablero(String casilla) {
		int colAlfil = casilla.charAt(0) - 'a';
		int filaAlfil = casilla.charAt(1) - '0';

		String letras = "   a  b  c  d  e  f  g  h";
		System.out.println(letras);
		for (int fila = 8; fila >= 1; fila--) {
			System.out.print(fila + " ");
			for (int col = 0; col < 8; col++) {
				String color = (col + fila) % 2 == 0 ? OSCURA : CLARA;
				if (col == colAlfil && fila == filaAlfil) {
					color = AZUL;
				} else if (Math.abs(col - colAlfil) == Math.abs(fila - filaAlfil)) {
					// Misma diagonal que el alfil (la propia casilla ya se ha tratado antes)
					color = ROJO;
				}
				System.out.print(color + "   " + RESET);
			}
			System.out.println(" " + fila);
		}
		System.out.println(letras);
	}

	public static void main(String[] args) {
		new Ejercicio13().show();
	}
}