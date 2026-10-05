package bloque2;

public class Ejercicio13 {

	public void show() {
		String s1 = "Hola Mundo";
		String s2 = "MUNDO";
		System.out.println(s1.regionMatches(true, 5, s2, 0, 5));
	}

	public static void main(String[] args) {
		new Ejercicio13().show();
	}
}