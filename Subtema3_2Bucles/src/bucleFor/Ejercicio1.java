package bucleFor;

import java.util.Random;

public class Ejercicio1 {
	public void diceThrow() {
		int tries = 20;
		int value = 0;
		int i;
		Random rand = new Random();
		for (i = tries; i >= 0; i--) {
			value = rand.nextInt(6) + 1;
			System.out.printf("\nIntentos: %d; Valor: %d", i, value);
		}
	}

	public void show() {
		diceThrow();
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
