package anidacion;

import java.util.Scanner;

public class Ejercicio2 {

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce la temperatura en °C: ");
		double temperature = keyboard.nextDouble();

		String message = temp(temperature);

		System.out.println(message);
	}

	public String temp(double temperature) {
		if (temperature < 0) {
			return "Hace mucho frío";
		} else if (temperature >= 0 && temperature < 15) {
			return "Hace frío";
		} else if (temperature >= 15 && temperature < 25) {
			return "Temperatura agradable";
		} else if (temperature >= 25 && temperature < 35) {
			return "Hace calor";
		} else {
			return "Hace mucho calor";
		}
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}
