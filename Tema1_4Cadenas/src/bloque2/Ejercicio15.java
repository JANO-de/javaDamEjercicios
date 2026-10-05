package bloque2;

public class Ejercicio15 {

	public void show() {
		String s = "Línea 1\nLínea 2\nLínea 3";
		String con = s.indent(3);
		System.out.println(con);
		System.out.println(con.indent(-2));
	}

	public static void main(String[] args) {
		new Ejercicio15().show();
	}
}