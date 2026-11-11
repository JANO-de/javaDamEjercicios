package recursividad;

import java.util.Scanner;

public class Ejercicio4 {

	public void show() {
		String box = new String();
		Scanner keyb = new Scanner(System.in);

		System.out.println("Introduce la cadena: ");
		box = keyb.nextLine().toLowerCase().replace(" ", "");

		int izq = 0;
		int der = box.length() - 1;

		System.out.printf("La palabra es palindroma: %s", isPalindrome(box, izq, der));
	}

	public boolean isPalindrome(String box, int izq, int der) {
		boolean result = false;
		if (izq >= der) {
			result = true;
		} else if (box.charAt(izq) == box.charAt(der)) {
			result = isPalindrome(box, izq + 1, der - 1);
		} else {
			result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}

}
