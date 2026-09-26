package bloque2;

public class Ejercicio2 {
	
	public void show() {
		final boolean a = true, b = false, c = true; 
		boolean result1, result2, result3, result4;
		
		//Calculo 1
		result1 = a && b || a && c;
		System.out.println(result1);
		//Calculo 2
		result2 = (a || !b) && (!a||c);
		System.out.println(result2);
		//Calculo 3
		result3 = a || b && c;
		System.out.println(result3);
		//Calculo 4
		result4 = !(a || b) && c;
		System.out.println(result4);
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}
