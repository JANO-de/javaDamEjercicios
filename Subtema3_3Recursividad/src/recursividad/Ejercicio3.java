package recursividad;

public class Ejercicio3 {

	public int contarVocales(String cadena) {
		// Caso base: cadena vacía, no hay vocales
		if (cadena.isEmpty()) {
			return 0;
		}
		// Se comprueba el primer carácter
		int suma = esVocal(cadena.charAt(0)) ? 1 : 0;
		// Caso recursivo: se suma el resto de la cadena
		return suma + contarVocales(cadena.substring(1));
	}

	private boolean esVocal(char c) {
		return "aeiouáéíóúüAEIOUÁÉÍÓÚÜ".indexOf(c) != -1;
	}

	public void show() {
		System.out.println("\"murcielago\" -> " + contarVocales("murcielago"));
		System.out.println("\"Recursividad\" -> " + contarVocales("Recursividad"));
		System.out.println("\"rhythm\" -> " + contarVocales("rhythm"));
		System.out.println("\"\" -> " + contarVocales(""));
	}

	public static void main(String[] args) {
		Ejercicio3 ejercicio = new Ejercicio3();
		ejercicio.show();
	}
}