package bloque1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		String name;
		String surname;
		int age;
		//direccion
		String street;
		int number;
		int cod_postal;
		String provincia;
		boolean is_student;
		double height;
		
		//Ask name
		System.out.println("Nombre: ");
		name = keyboard.nextLine();
		//Ask age
		System.out.println("Edad: ");
		age = keyboard.nextInt();
		//Ask Direccion
		System.out.println("##-- Introduce su direccion --##");
		System.out.println("Calle: ");
		street = keyboard.nextLine();
		System.out.println("Numero: ");
		number = keyboard.nextInt();
		System.out.println("Codigo Postal: ");
		cod_postal = keyboard.nextInt();
		System.out.println("Provincia: ");
		provincia = keyboard.nextLine();
		//Ask if studient
		System.out.println("Eres estudiante: Si/No");
		is_student = keyboard.nextLine();
		switch (is_student);
		//Ask height
		System.out.println("Altura: ");
		height = keyboard.nextDouble();
	}

	public static void main(String[] args) {
		

	}

}
