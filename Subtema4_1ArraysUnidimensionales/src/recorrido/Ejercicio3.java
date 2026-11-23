package recorrido;

import java.util.Scanner;

public class Ejercicio3 {
	private Scanner keyb = new Scanner(System.in);

	public void show() {
		char[] list = new char[5];
		char boxc;
		int boxi;

		fillList(list);
		System.out.println("Type the character to add to the list: ");
		boxc = keyb.next().charAt(0);
		System.out.println("Type the position you want the character at: ");
		boxi = keyb.nextInt();

		addToList(list, boxc, boxi);
		printList(list);
	}

	public void fillList(char[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			System.out.println("Type the character for position " + i + ": ");
			list[i] = keyb.next().charAt(0);
		}
	}

	public void addToList(char[] list, char character, int position) {
		if (position >= 0 && position <= list.length - 1) {
			for (int i = list.length - 1; i > position; i--) {
				list[i] = list[i - 1];
			}
			list[position] = character;
		}
	}

	public void printList(char[] list) {
		for (int i = 0; i <= list.length - 1; i++) {
			System.out.print(" [" + list[i] + "] ");
		}
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}

}
