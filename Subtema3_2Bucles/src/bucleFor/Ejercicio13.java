package bucleFor;

import static bucleFor.Colors.*;
import java.util.Scanner;

public class Ejercicio13 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		String box = new String();
		do {
			System.out.println("Introduce una casilla (a1 - h8)");
			box = sc.nextLine();
		} while (!valid(box));
		drawTable(box);
	}

	public boolean valid(String box) {
		return box.length() == 2 && box.charAt(0) >= 'a' && box.charAt(0) <= 'h' && box.charAt(1) >= '1'
				&& box.charAt(1) <= '8';
	}

	public void drawTable(String box) {
		int rowB = box.charAt(1) - '0';
		int colB = box.charAt(0) - 'a' + 1;
		System.out.println("  a b c d e f g h");
		for (int row = 8; row >= 1; row--) { // i -> Filas
			System.out.print(row + " ");
			for (int col = 1; col <= 8; col++) {
				// Logica Alfil
				if (row == rowB && col == colB) {
					System.out.print(BLUE_BACKGROUND + "  ");
				} else if (Math.abs(row - rowB) == Math.abs(col - colB)) {
					System.out.print(RED_BACKGROUND + "  ");
				} else if ((row + col) % 2 == 0) {
					System.out.print(WHITE_BACKGROUND + "  ");
				} else {
					System.out.print(BLACK_BACKGROUND + "  ");
				}

			}
			System.out.print(RESET);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ejercicio13().show();
	}
}