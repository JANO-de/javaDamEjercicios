package bucleFor;

import java.util.Scanner;

public class Ejercicio5 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		do {
			System.out.print("Introduce n1 (entero positivo): ");
			n1 = sc.nextInt();
			System.out.print("Introduce n2 (entero positivo): ");
			n2 = sc.nextInt();
		} while (n1 <= 0 || n2 <= 0);
		duplicarYDividir(n1, n2);
	}

	// n1 se duplica y n2 se divide a la mitad hasta que n1 > n2
	public void duplicarYDividir(int n1, int n2) {
		for (int i = n1, j = n2; i <= j; i *= 2, j /= 2) {
			System.out.println("n1 = " + i + "  n2 = " + j);
		}
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}
}