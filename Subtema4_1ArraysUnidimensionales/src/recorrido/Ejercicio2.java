package recorrido;

import java.util.Scanner;

public class Ejercicio2 {
	private Scanner keyb = new Scanner(System.in);
	private boolean box;

	public void show() {
		System.out.println("Type a boolean value [True/False]: ");
		box = keyb.nextBoolean();
		checkBool();
	}

	public void checkBool() {
		int[] list = new int[6];
		list[0] = 71;
		list[1] = 18;
		list[2] = 34;
		list[3] = 51;
		list[4] = 26;
		list[5] = 9;

		if (box == true) {
			printEven(list);
		} else if (box == false) {
			printOdd(list);
		}
	}

	public void printOdd(int[] list) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 != 0) {
				System.out.println("Posicion " + i + " -> " + list[i]);
			}
		}
	}

	public void printEven(int[] list) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 0) {
				System.out.println("Posicion " + i + " -> " + list[i]);
			}
		}

	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}
