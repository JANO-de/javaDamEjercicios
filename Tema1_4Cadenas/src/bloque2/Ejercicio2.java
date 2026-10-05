package bloque2;

import java.util.Random;

public class Ejercicio2 {

	public void show() {
		String s = "Programación";
		int pos = new Random().nextInt(s.length());
		System.out.println(s.charAt(pos));
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}
