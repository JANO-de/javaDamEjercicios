package referenciaThis.ejercicio2;

public class Person {
	private String name;
	private int age;
	private float height;
	private String work;
	private float salary;

	public Person(String name, int age, float height, String work, float salary) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.work = work;
		this.salary = salary;
	}
	
	public Person() {
		this("unnamed", 0, 0.0f, "unemployment", 0.0f);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void addSalary(Person person) {
		this.salary = salary + person.salary; 
	}
	
	public void doubleSalary() {
		addSalary(this);
	}

	@Override
	public String toString() {
		return String.format("Name: %s, age: %d, height: %.2f, work: %s, salary: %.2f", name, age, height, work, salary);
	}
}
