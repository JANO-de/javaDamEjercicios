package bloque2;

public class Ejercicio5 {

	public void show() {
		String s1 = "manzana";
		String s2 = "naranja";
		int cmp = s1.compareTo(s2);
		if (cmp > 0) {
			System.out.println(s1 + " es mayor");
		} else if (cmp < 0) {
			System.out.println(s2 + " es mayor");
		} else {
			System.out.println("Son iguales");
		}
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}
}