package constructores.ejercicio2;

public class Ejercicio2 {

	public void show() {
		Person person = new Person("Alfonsito", 15, 1.5f, "Estudiante");
		System.out.println(person);
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}
