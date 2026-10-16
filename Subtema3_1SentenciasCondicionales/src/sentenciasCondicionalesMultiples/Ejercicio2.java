package sentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio2 {

	public String isEqualNum(int num, int num1, int num2) {	
		if (num == num1 && num1 == num2) {
			return String.format("Hay tres numeros iguales a %d", num);
		}else if (num == num1) {
			return String.format("Hay dos numeros iguales a %d", num);
		}else if (num1 == num2) {
			return String.format("Hay dos numeros iguales a %d", num1);
		}else if (num == num1) {
			return String.format("Hay dos numeros iguales a %d", num);
		}else {
			return "No hay numeros iguales";
		}
	}
	
	@SuppressWarnings("resource")
	public void show() {
		Scanner keyb = new Scanner(System.in);
		int num, num1, num2;
		System.out.println("Introduce el primer numero");
		num = Integer.parseInt(keyb.nextLine());
		System.out.println("Introduce el segundo numero");
		num1 = Integer.parseInt(keyb.nextLine());
		System.out.println("Introduce el tercer numero");
		num2 = Integer.parseInt(keyb.nextLine());
		
		System.out.printf("%s%n",isEqualNum(num, num1, num2));
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}
