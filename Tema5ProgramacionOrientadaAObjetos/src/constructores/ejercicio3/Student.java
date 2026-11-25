package constructores.ejercicio3;

public class Student {
	public int enrollment;
	public String name;
	public float grade1;
	public float grade2;
	public float medium;

	public Student(int enrollment, String name, float grade1, float grade2) {
		this.enrollment = enrollment;
		this.name = name;
		this.medium = (grade1 + grade2) / 2;
	}

	public int getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGrade1() {
		return grade1;
	}

	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}

	public float getGrade2() {
		return grade2;
	}

	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}

	public float getMedium(float grade1, float grade2) {
		return medium;
	}

	@Override
	public String toString() {
		return String.format("Name: %s, enrollment number: %d, grade medium: %.2f", name, enrollment, medium);
	}
}
