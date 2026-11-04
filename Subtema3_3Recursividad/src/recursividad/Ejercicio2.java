package recursividad;

import java.util.Scanner;

public class Ejercicio2 {
	
	public int potencia(int b, int e) {
		if (e == 0 ) {
			return 1;
		} else {
			return b * potencia(b, e-1);
		}
	}
	
	public void show() {
		Scanner keyb = new Scanner(System.in);
		int b, e;
		System.out.println("Introduce la base: ");
		b = Integer.parseInt(keyb.nextLine());
		System.out.println("Intruduce el exponente: ");
		e = Integer.parseInt(keyb.nextLine());
		
		System.out.printf("\nLa potencia de %d elevado a %d es: %d", b, e, potencia(b, e));
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}
