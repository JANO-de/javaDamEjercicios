package visibilidad;

public class Ejercicio1 {

	private void privateMethod() {
		System.out.println("I'm in privateMethod");
	}

	void friendlyMethod() {
		System.out.println("I'm in friendlyMethod");
	}

	public void publicMethod() {
		System.out.println("I'm in publicMethod");
	}

	public static void main(String[] args) {
		// Case 1: same class
		Ejercicio1 e = new Ejercicio1();
		e.privateMethod();
		e.friendlyMethod();
		e.publicMethod();
	}
}