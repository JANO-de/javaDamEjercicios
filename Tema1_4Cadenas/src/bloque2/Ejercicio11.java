package bloque2;

public class Ejercicio11 {

	public void show() {
		String s = "el gato y el perro y el pájaro";
		System.out.println(s);
		System.out.println(s.replace("el", "un"));
	}

	public static void main(String[] args) {
		new Ejercicio11().show();
	}
}