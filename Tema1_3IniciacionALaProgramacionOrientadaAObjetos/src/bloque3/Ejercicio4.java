package bloque3;

public class Ejercicio4 {
	public void show() {
		// Declaración e inicialización
		boolean booleano = true;
		int entero = 42;
		char caracter = 'A';
		double decimal = 3.14;

		// Transformación a cadenas
		String sBooleano = String.valueOf(booleano);
		String sEntero = Integer.toString(entero);
		String sCaracter = Character.toString(caracter);
		String sDecimal = Double.toString(decimal);

		// Concatenación
		String result = sBooleano.concat(sEntero).concat(sCaracter).concat(sDecimal);
		System.out.println(result);
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}

}
