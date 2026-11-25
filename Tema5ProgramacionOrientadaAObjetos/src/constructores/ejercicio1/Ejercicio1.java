package constructores.ejercicio1;

public class Ejercicio1 {

	public void show() {
		Person person = new Person(null, 0, 0, null);
		System.out.println(person);
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
