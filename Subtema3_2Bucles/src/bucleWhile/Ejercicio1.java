package bucleWhile;

import java.util.Random;

public class Ejercicio1 {
	public void genNumber() {
		Random rnd = new Random();
		int num = rnd.nextInt(1000) + 1;
		while (num % 9 != 0) {
			System.out.println(num);
			num = rnd.nextInt(1000) + 1;
		}
	}

	public void show() {
		genNumber();
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
