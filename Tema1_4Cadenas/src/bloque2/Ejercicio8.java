package bloque2;

public class Ejercicio8 {

	public void show() {
		String s = "   con espacios   ";
		System.out.println("[" + s + "]");
		System.out.println("[" + s.trim() + "]");
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}
}