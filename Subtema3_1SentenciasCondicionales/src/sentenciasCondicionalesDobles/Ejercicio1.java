package sentenciasCondicionalesDobles;
import java.util.Scanner;

public class Ejercicio1 {
	public void show() {
		int num;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		num = Integer.parseInt(keyboard.nextLine());
		
		if (num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
