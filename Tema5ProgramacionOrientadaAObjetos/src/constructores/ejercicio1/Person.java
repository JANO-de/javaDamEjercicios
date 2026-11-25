package constructores.ejercicio1;

public class Person {
	private String name;
	private int age;
	private float height;
	private String work;

	public Person(String name, int age, float height, String work) {
		super();
		this.name = "unnamed";
		this.age = 0;
		this.height = 0.0f;
		this.work = "unemployment";
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

	@Override
	public String toString() {
		return String.format("Name: %s, age: %d, height: %.2f, work: %s", name, age, height, work);
	}
}
