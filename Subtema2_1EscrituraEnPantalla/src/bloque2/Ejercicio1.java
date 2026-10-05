package bloque2;

public class Ejercicio1 {

	public void show() {
		int x=10;
		int y=-10;
		float n=13.269834f;
		String cad="Ana";
		
		System.out.printf("%1$d%n%1$+d%n%2$d%n%3$.2f%n%3$+.4f%n%3$.5f%n%3$+010.3f%n" + "n=%3$-6.2fx=%1$d%n%4$s%4$s%4$4s%n", x, y, n, cad);
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
