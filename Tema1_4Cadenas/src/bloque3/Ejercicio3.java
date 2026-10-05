package bloque3;

public class Ejercicio3 {

	public void show() {
		StringBuilder sb = new StringBuilder("Texto ejemplo");
		System.out.println(sb);
		// Con insert
		sb.insert(5, " de");
		System.out.println(sb);
		// Con delete
		sb.delete(8, 9);
		System.out.println(sb);
		// Con reverso
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		new Ejercicio3().show();

	}

}
