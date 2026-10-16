package sentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio1 {

	public void gradesIF(int nota) {
		if (nota == 0 || nota == 1 || nota == 2) {
			System.out.println("Muy deficiente");
		}else if (nota == 3 || nota == 4) {
			System.out.println("Insuficiente");
		}else if (nota == 5) {
			System.out.println("Suficiente");
		}else if (nota == 6) {
			System.out.println("Bien");
		}else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		}else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		}
	}
	
	public void gradesSWITCH(int nota) {
		switch (nota) {
		case 0,1,2 -> System.out.println("Muy deficiente");
		case 3,4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7,8 -> System.out.println("Notable");
		case 9,10 -> System.out.println("Sobresaliente");
		}
	}
	
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Anidacion | Introduce tu nota:");
		int nota = Integer.parseInt(keyboard.nextLine());
		// Anidacion
		gradesIF(nota);
		
		System.out.println("Switch | Introduce tu nota:");
		nota = Integer.parseInt(keyboard.nextLine());
		gradesSWITCH(nota);
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
