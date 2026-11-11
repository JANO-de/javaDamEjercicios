package recursividad;

import java.util.Scanner;

public class Ejercicio5 {

	public void show() {
		Scanner keyb = new Scanner(System.in);

		System.out.println("Introduce la cadena: ");
		String box = keyb.nextLine();

		System.out.printf("La cadena invertida es: %s", invertir(box));
	}

	public String invertir(String box) {
		String result = "";
		if (box.length() <= 1) {
			result = box;
		} else {
			result = invertir(box.substring(1)) + box.charAt(0);
		}
		return result;
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}

}