package bloque3;

public class Ejercicio1 {

	public void show() {
		// char charValue()
		Character character ='k';
		System.out.println(character.charValue());
		// static boolean isDigit(char ch)
		System.out.println(Character.isDigit('7'));
		// static boolean isUpperCase(char ch)
		System.out.println(Character.isUpperCase('K'));
		// static char toLowerCase(char ch)
		System.out.println(Character.toLowerCase('K'));
		// static Character valueOf(char c)
		System.out.println(Character.valueOf('x'));
	}
 
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
