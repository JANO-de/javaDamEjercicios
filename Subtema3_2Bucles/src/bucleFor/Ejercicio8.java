package bucleFor;

import java.util.Scanner;

public class Ejercicio8 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo: ");
		int n = sc.nextInt();
		
		pyramid(n); 
	}
	
	public void pyramid(int n) {
	    for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= n - i; j++) {
	            System.out.printf(" ");
	        }
	        for (int j = 1; j <= i; j++) {
	            System.out.printf("* ");
	        }
	        System.out.println();
	    }
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}
}