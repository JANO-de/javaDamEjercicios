package bloque1;

import java.util.Scanner;

public class Ejercicio1 {

	public void show() {
		Scanner keyboard = new Scanner(System.in);
		String name;
		String surname;
		int age;
		// direccion
		String street;
		int number;
		int cod_postal;
		String provincia;
		String is_student;
		boolean is_student_bool = false;
		double height;

		// Ask name
		System.out.println("Nombre: ");
		name = keyboard.nextLine();
		System.out.println("Apellidos: ");
		surname = keyboard.nextLine();
		// Ask age
		System.out.println("Edad: ");
		age = Integer.parseInt(keyboard.nextLine());
		// Ask Direccion
		System.out.println("##-- Introduce su direccion --##");
		System.out.println("Calle: ");
		street = keyboard.nextLine();
		System.out.println("Numero: ");
		number = Integer.parseInt(keyboard.nextLine());
		System.out.println("Codigo Postal: ");
		cod_postal = Integer.parseInt(keyboard.nextLine());
		System.out.println("Provincia: ");
		provincia = keyboard.nextLine();
		// Ask if studient
		System.out.println("Eres estudiante: Si/No");
		is_student = keyboard.nextLine().toUpperCase();
		switch (is_student) {
		case "SI":
			is_student_bool = true;
			break;
		case "NO":
			is_student_bool = false;
			break;
		default:
			System.out.println("Error, introducir Si o No");
		}
		// Ask height
		System.out.println("Altura: ");
		height = Double.parseDouble(keyboard.nextLine().replace(',', '.'));

		// Print out
		System.out.printf("""
				##-- Bienvenido: %s, %s --##
				/
				|  Edad: %d
				|--- Direccion ---|
				|  Calle: %s
				|  Numero: %d
				|  Codigo Postal: %d
				|  Provincia: %s
				|
				|  Estudiante: %b
				|  Altura: %.2f
				\
				""", name, surname, age, street, number, cod_postal, provincia, is_student_bool, height);
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
