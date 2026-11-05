package bucleFor;

import java.util.Scanner;

public class Ejercicio13 {

	public void show() {
		Scanner sc = new Scanner(System.in);
		String box = new String();
		do {
			System.out.println("Introduce una casilla (a1 - h8)");
			box = sc.nextLine();
		}while (!valid(box)); 
		
	}
	
	public boolean valid(String box) {
		return box.length() == 2 && box.charAt(0) >= 'a' && box.charAt(0) <='h' && box.charAt(1)); 
	}
		
	public static void main(String[] args) {
		new Ejercicio13().show();
	}
}