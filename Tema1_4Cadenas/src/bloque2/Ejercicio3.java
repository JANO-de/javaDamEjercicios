package bloque2;

public class Ejercicio3 {

	public void show() {
		String s1 = "Hola";
		String s2 = "hola";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}
}