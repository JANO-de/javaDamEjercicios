package bloque3;

public class Ejercicio2 {
	
	public void show() {
		Integer numero = 300;
		// byte byteValue()
		System.out.println(numero.byteValue());
		// int intValue()
		System.out.println(numero.intValue());
		// double doubleValue()
		System.out.println(numero.doubleValue());
		// static String toHexString(int i)
		System.out.println(Integer.toHexString(255));
		// static int parseInt(String s)
		System.out.println(Integer.parseInt("1234") + 1);
		// static Integer valueOf(int i)
		System.out.println(Integer.valueOf(99));
		// static Integer valueOf(String s)
		System.out.println(Integer.valueOf("2024"));
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}
