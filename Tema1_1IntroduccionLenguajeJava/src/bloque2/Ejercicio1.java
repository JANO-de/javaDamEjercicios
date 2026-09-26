package bloque2;

public class Ejercicio1 {
	public void show() {
		final int a1 = 3, a2 = 5, a4 = 4, a5 = 2, a6 = 7, a7 = 8, a8 = 6,  result1, result2;
		boolean result3, result4, result5;
		
		//Calculo 1
		result1 = a1 * a2 - a4 / a5;
		System.out.println(result1);
		//Calculo 2
		result2 = a6 - a4 * a5 - a2 * a5;
		System.out.println(result2);
		//Calculo 3
		result3 = a2 + a4 < a6 + a7;
		System.out.println(result3);
		//Calculo 4
		result4 = a4 < a2 * a4 / a5 - a6;
		System.out.println(result4);
		//Calculo 5.
		result5 = !(a4 > a8);
		System.out.println(result5);
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
