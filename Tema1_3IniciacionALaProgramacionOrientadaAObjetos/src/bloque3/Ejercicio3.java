package bloque3;

public class Ejercicio3 {
	
	public void show() {
		Double numero = 3.14159265358979;
		Double infinito = 1.0 / 0.0;
		Double noNumero = 0.0 / 0.0;
		// float floatValue()
		System.out.println(numero.floatValue());
		// double doubleValue()
		System.out.println(numero.doubleValue());
		// boolean isInfinite()
		System.out.println(infinito.isInfinite());
		// static boolean isInfinite(double v)
		System.out.println(Double.isInfinite(-1.0 / 0.0));
		// boolean isNaN()
		System.out.println(noNumero.isNaN());
		// static double min(double a, double b)
		System.out.println(Double.min(2.5, -7.1));
		// static double parseDouble(String s)
		System.out.println(Double.parseDouble("12.75") * 2);
		// static Double valueOf(double d)
		System.out.println(Double.valueOf(9.99));
		// static Double valueOf(String s)
		System.out.println(Double.valueOf("0.5"));
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}

}
