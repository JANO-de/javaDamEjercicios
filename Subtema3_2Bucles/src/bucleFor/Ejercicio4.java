package bucleFor;

import java.util.Scanner;

public class Ejercicio4 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce n1: ");
		int n1 = sc.nextInt();
		System.out.print("Introduce n2: ");
		int n2 = sc.nextInt();
		System.out.println("Suma de los pares entre " + n1 + " y " + n2 + ": " + sumaPares(n1, n2));
		System.out.println("Suma de los impares entre " + n1 + " y " + n2 + ": " + sumaImpares(n1, n2));
	}

	public int sumaPares(int n1, int n2) {
		int min = Math.min(n1, n2);
		int max = Math.max(n1, n2);
		int suma = 0;
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}
		return suma;
	}

	public int sumaImpares(int n1, int n2) {
		int min = Math.min(n1, n2);
		int max = Math.max(n1, n2);
		int suma = 0;
		for (int i = min; i <= max; i++) {
			if (i % 2 != 0) {
				suma += i;
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}
}