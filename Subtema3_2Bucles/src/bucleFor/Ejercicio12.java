package bucleFor;

public class Ejercicio12 {

	// Códigos ANSI de color de fondo
	private static final String OSCURA = "\u001B[48;5;236m";
	private static final String CLARA = "\u001B[48;5;255m";
	private static final String RESET = "\u001B[0m";

	public void show() {
		dibujarTablero();
	}

	public void dibujarTablero() {
		String letras = "   a  b  c  d  e  f  g  h";
		System.out.println(letras);
		for (int fila = 8; fila >= 1; fila--) {
			System.out.print(fila + " ");
			for (int col = 0; col < 8; col++) {
				// a8 es oscura: la casilla es oscura si columna + fila es par
				String color = (col + fila) % 2 == 0 ? OSCURA : CLARA;
				System.out.print(color + "   " + RESET);
			}
			System.out.println(" " + fila);
		}
		System.out.println(letras);
	}

	public static void main(String[] args) {
		new Ejercicio12().show();
	}
}