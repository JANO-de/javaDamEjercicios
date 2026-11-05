package sentenciasCondicionalesMultiples;

import java.util.Scanner;

public class Ejercicio3 {

	@SuppressWarnings("unused")
	public String orderNum(int num, int num1, int num2) {	
		int temp;
		int first;
		
		if (num > num1) {
			temp = num;
			num = num1;
			num1 = temp;
		}
		
		if (num > num2) {
			temp = num;
			num = num2;
			num2 = temp;
		}
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		return String.format("Numeros ordenados: %d, %d, %d", num, num1, num2);
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
		
		System.out.printf("%s%n",orderNum(num, num1, num2));
	}
	
	public static void main(String[] args) {
		new Ejercicio3().show();
	}
}
