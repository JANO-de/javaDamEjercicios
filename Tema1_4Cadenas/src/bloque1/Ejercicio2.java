package bloque1;

public class Ejercicio2 {

	public void show() {
		String s1 = new String("Hey");
		String s2 = "Hey";
		boolean bool = s1 == s2;
		System.out.println(bool);
		
		boolean bool1 = s1.equals(s2);
		System.out.println(bool1);
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();

	}
}
