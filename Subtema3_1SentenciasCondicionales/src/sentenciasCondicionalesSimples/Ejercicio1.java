package sentenciasCondicionalesSimples;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Ejercicio1 {
	public void show() {
		double dec = 0;
		Scanner keyboard = new Scanner(System.in);
		double result = 0;
		
		System.out.println("Input a decimal number: ");
		dec = Double.parseDouble(keyboard.nextLine().replace(',', '.'));
		if (dec <= 1000) {
			result = dec * 15 / 100;
			System.out.println(result);
		} else {
			return;
		}
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
