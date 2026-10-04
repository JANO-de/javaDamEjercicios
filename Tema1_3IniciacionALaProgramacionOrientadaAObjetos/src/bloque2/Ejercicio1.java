package bloque2;

public class Ejercicio1 {

	public void show() {
		// char charAt(int index)
		System.out.println("hola".charAt(3));
		// int length()
		System.out.println("El gato rojo parlante".length());
		// String concat(String str)
		System.out.println("Adios".concat("s"));
		// boolean endsWith(String suffix)
		System.out.println("Perplexo".endsWith("xo"));
		// int indexOf(int ch)
		System.out.println("Antonio".indexOf(4));
		// int indexOf(int ch, int fromIndex)
		System.out.println("Pepe Guiñon".indexOf(5));
		// int indexOf(String str)
		System.out.println("Orleando".indexOf("a"));
		// int indexOf(String str, int fromIndex)
		System.out.println("Nueva York".indexOf("Y", 5));
		// boolean isEmpty()
		System.out.println("".isEmpty());
		// int lastIndexOf(int ch)
		System.out.println("El gato rojo parlante".lastIndexOf('a'));
		// int lastIndexOf(int ch, int fromIndex)
		System.out.println("El gato rojo parlante".lastIndexOf('a', 14));
		// int lastIndexOf(String str)
		System.out.println("El gato rojo parlante".lastIndexOf("rojo"));
		// int lastIndexOf(String str, int fromIndex)
		System.out.println("El gato rojo parlante".lastIndexOf("0", 10));
		// String replace(char oldChar, char newChar)
		System.out.println("El gato rojo parlante".replace('a', 'o'));
		// String toUpperCase()
		System.out.println("El gato rojo parlante".toUpperCase());
		// String trim()
		String conEspacios = "  \tNueva York\n  ";
		System.out.println(conEspacios.trim());
		// static String valueOf(double d)
		System.out.println(String.valueOf(3.14159));
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
