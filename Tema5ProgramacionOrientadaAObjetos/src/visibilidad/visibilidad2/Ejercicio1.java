package visibilidad.visibilidad2;

import visibilidad.Ejercicio1;

public class OtherPackage {

	public static void main(String[] args) {
		Ejercicio1 e = new Ejercicio1();

		e.privateMethod(); // ERROR
		e.friendlyMethod(); // ERROR
		e.publicMethod();
	}
}