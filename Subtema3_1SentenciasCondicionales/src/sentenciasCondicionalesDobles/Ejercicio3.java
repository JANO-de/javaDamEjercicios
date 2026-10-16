package sentenciasCondicionalesDobles;

import java.util.Scanner;
public class Ejercicio3 {

	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int daysStay, distance;
		double price;
		final double PRICEKILOMETER = 0.35;
		
		System.out.println("Cuantos dias te vas a quedar alli?");
		daysStay = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("Cual es la distancia de ida?");
		distance = keyboard.nextInt();
		
		price = distance * 2 * PRICEKILOMETER;
		
		if(distance * 2 > 1000 && daysStay > 7) {
			price -= price * 0.3;
		}
		
		System.out.printf("El precio a pagar es: %.2f", price);
	}
	
	public static void main(String[] args) {
		new Ejercicio3().show();
	}

}
