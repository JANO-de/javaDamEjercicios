package bloque3;

public class Ejercicio2 {

	public void show() {
		String str1 = "Dia";
		String str2 = "Mes";
		String str3 = "Año";
		
		System.out.println(String.join(", ", str1, str2, str3));
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();

	}


}
