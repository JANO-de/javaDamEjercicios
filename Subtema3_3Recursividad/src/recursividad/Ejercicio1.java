package recursividad;

import java.util.Scanner; 

public class Ejercicio1 {
	public int mcd(int a, int b) {
		int result = 0;
		if (b == 0) {
			return a;
		} else {
			return mcd(b, a%b);
		}
	}
	
	public void show() {
		Scanner keyb = new Scanner(System.in);
		int a, b, result;
		System.out.println("Maximo Comun Divisor por el algoritmo de Euclides: \n Introduce el primer numero: ");
		a = Integer.parseInt(keyb.nextLine());
		System.out.println("Introduce el segundo numero: ");
		b = Integer.parseInt(keyb.nextLine());
		result = mcd(a,b);
		System.out.printf("El maxmimo comun divisor de %d y %d es: %d", a, b, result);
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
