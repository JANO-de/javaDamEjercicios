package constructores.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	private Scanner keyb = new Scanner(System.in);

	public void show() {
		String name;
		int enroll;
		float grade1;
		float grade2;

		System.out.println("Student name: ");
		name = keyb.nextLine();

		System.out.println("Student enrollment number: ");
		enroll = Integer.parseInt(keyb.nextLine());

		System.out.println("Student grade 1: ");
		grade1 = Float.parseFloat(keyb.nextLine().replace(',', '.'));

		System.out.println("Student grade 2: ");
		grade2 = Float.parseFloat(keyb.nextLine().replace(',', '.'));

		Student student = new Student(enroll, name, grade1, grade2);
		System.out.println(student.toString());
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}

}
