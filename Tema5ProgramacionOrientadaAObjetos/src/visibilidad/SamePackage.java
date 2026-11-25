package visibilidad;

public class SamePackage {

	public static void main(String[] args) {
		Ejercicio1 e = new Ejercicio1();

		e.privateMethod(); // ERROR
		e.friendlyMethod();
		e.publicMethod();
	}
}