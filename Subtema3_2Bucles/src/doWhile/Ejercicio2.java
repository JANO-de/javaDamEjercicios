package doWhile;

import java.util.Random;

public class Ejercicio2 {
	public void genNumber() {
		Random rnd = new Random();
		int num = rnd.nextInt(1000) + 1;
		int tries = 0;
		do {
			num = rnd.nextInt(1000) + 1;
			System.out.println(num);
			tries = tries + 1;
		} while (num % 9 != 0 && tries != 7);
	}

	public void show() {
		genNumber();
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}
