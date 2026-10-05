package bloque3;

public class Ejercicio4 {

	public void show() {
		String str = new String(" Bienvenidos al modulo de PROGRAMACION ");
		// Quitar espacios
		System.out.println(str.trim());
		// Pasar a minusculas
		System.out.println(str.trim().toLowerCase());
		// Sustituir palabra programacion por java
		System.out.println(str.trim().toLowerCase().replace("programacion", "java"));
	}
	
	public static void main(String[] args) {
		new Ejercicio4().show();

	}

}
