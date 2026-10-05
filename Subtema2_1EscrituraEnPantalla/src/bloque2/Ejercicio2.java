package bloque2;

public class Ejercicio2 {

	public static final String RESET = "\u001B[0m";
	public static final String ROJO = "\u001B[31m";
	public static final String VERDE = "\u001B[32m";
	public static final String AZUL = "\u001B[34m";
	public static final String FONDO_AMARILLO = "\u001B[43m";
	public static final String FONDO_BLANCO = "\u001B[47m";
	public static final String FONDO_NEGRO = "\u001B[40m";

	public void show() {
		System.out.printf("%s%s%s%s%s%s%s%s%s%s%n",
				ROJO, FONDO_AMARILLO, "Rojo", RESET,
				VERDE, FONDO_NEGRO, " Verde ", RESET,
				AZUL + FONDO_BLANCO, "Azul" + RESET);
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}