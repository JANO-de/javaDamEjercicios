package referenciaThis.ejercicio2;

public class Ejercicio2 {
	public void show() {
		Person alfito = new Person("Alfito", 23, 1.7f, "Camionero", 1200.90f);
		Person eliana = new Person("Eliana", 29, 1.8f, "Camarera", 1400.90f);
		
		alfito.addSalary(eliana);
		System.out.println(alfito.getSalary());
		
		eliana.doubleSalary();
		System.out.println(eliana.getSalary());
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}
