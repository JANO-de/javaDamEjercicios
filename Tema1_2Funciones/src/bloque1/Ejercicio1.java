package bloque1;

public class Ejercicio1 {
	public int calculeInts(boolean isTrue, int num1, int num2)  {
		int result;
		
		return isTrue ? num1 + num2: num1 - num2;
	}
	
	public void show() {
		int x;
		int y;
		boolean isT;
		
		// 1º Literales
		System.out.println(calculeInts(true, 6, 9));
		// 2º Literales
		System.out.println(calculeInts(false, 6, 9));
		// 3º Variables
		x = 3;
		y = 7;
		isT = true;
		System.out.println(calculeInts(isT, x, y));
		// 4º Expresiones
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
