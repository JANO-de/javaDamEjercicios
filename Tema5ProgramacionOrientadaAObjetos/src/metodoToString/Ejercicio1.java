package metodoToString;

public class Ejercicio1 {
	private Person person = new Person();

	public void show() {
		createPerson();
		showPerson();
	}

	public void createPerson() {
		person.setName("Alfonsito");
		person.setAge(5);
		person.setHeight((float) 1.20);
		person.setWork("Mercader");
	}

	public void showPerson() {
		System.out.println(person.toString());
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
