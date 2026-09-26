package tiposDeDatosPrimitivos;

public class Ejercicio2 {
	public static void show() {
		short s=30000;
		byte b = (byte) s;
		
		System.out.println(b); // Adquiere el valor 48 que pertenece al rango de valores de bytes.
	}

	public static void main(String[] args) {
		show();
	}
}
