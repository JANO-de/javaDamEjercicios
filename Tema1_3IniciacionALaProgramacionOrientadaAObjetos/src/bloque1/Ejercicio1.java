package bloque1;

public class Ejercicio1 {
	
	public void show() {
		
		// static float abs(float a)
		System.out.println("abs: " + Math.abs(-2.35f));	
		// static double exp(double a)
		System.out.println("exp: " + Math.exp(2.0));
		// static double pow(double a, double b)
		System.out.println("pow " + Math.pow(2.6, 10.5));
		// static double max(double a, double b)
		System.out.println("max: " + Math.max(4.8, 9.4));
		// static int min(int a, int b)
		System.out.println("min: " + Math.min(5.7, 3.4 ));
		// static double ceil (double a). Probar con positivo y negativo.
		System.out.println("ceil: " + Math.ceil(5.9)); // +
		System.out.println("ceil: " + Math.ceil(-5.9)); // -
		// static double floor(double a). Probar con positivo y negativo.
		System.out.println("floor " + Math.floor(7.9)); // +
		System.out.println("floor " + Math.floor(-7.9)); // -
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
