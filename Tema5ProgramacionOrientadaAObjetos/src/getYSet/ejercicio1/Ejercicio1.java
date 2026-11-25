package getYSet.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	private Scanner keyb = new Scanner(System.in);

	public void show() {
		String box = new String();
		Person person = new Person();
		person.setName("Adolfito");
		System.out.printf("The person name is: %s", person.getName());

		System.out.println("\nType the new name: ");
		person.setName(box = keyb.nextLine());

		System.out.printf("The person's new name is: %s", person.getName());
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}