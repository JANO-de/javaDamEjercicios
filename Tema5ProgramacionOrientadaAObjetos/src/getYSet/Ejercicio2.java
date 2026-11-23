package getYSet;

import java.util.Scanner;

public class Ejercicio2 {
	private Scanner keyb = new Scanner(System.in);
	private Person person = new Person();

	public void show() {
		String box = new String();

		createPerson();
		askPerson();
	}

	public void createPerson() {
		person.setName("Alfonsito");
		person.setAge(5);
		person.setHeight((float) 1.20);
		person.setWork("Mercader");
		showPerson();
	}

	public void showPerson() {
		System.out.printf("""
				*
				|Name: %s
				|Age: %d
				|Height: %.2f
				|Work: %s
				*
				""", person.getName(), person.getAge(), person.getHeight(), person.getWork());
	}

	public void askPerson() {
		System.out.print("Name: ");
		person.setName(keyb.nextLine());
		System.out.print("Age: ");
		person.setAge(Integer.parseInt(keyb.nextLine()));
		System.out.print("Height: ");
		person.setHeight(Float.parseFloat(keyb.nextLine()));
		System.out.print("Work: ");
		person.setWork(keyb.nextLine());
		showPerson();
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}
}
