package doWhile;

import java.util.Random;

public class Ejercicio1 {
	public void genNumber() {
		Random rnd = new Random();
		int num = rnd.nextInt(1000) + 1;
		do {
			num = rnd.nextInt(1000) + 1;
			System.out.println(num);
		} while (num % 9 != 0);
	}

	public void show() {
		genNumber();
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
