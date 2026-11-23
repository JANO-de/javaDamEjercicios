package arraysUnidimensionales;

public class Ejercicio10 {

	public void show() {
		double[] list = { 1.2, 2.5, 3.1, 4.8, 5.0, 7.0, 8.3, 9.9, 10.7, 12.6, 15.4 };

		System.out.printf("Position of 12.6: %d%n", search(list, 12.6));
		System.out.printf("Position of 6.0: %d%n", search(list, 6.0));
	}

	public int search(double[] list, double number) {
		return search(list, number, 0, list.length - 1);
	}

	private int search(double[] list, double number, int start, int end) {
		if (start > end) {
			return -1;
		}

		int middle = (start + end) / 2;
		if (list[middle] == number) {
			return middle;
		}
		if (number > list[middle]) {
			return search(list, number, middle + 1, end);
		}
		return search(list, number, start, middle - 1);
	}

	public static void main(String[] args) {
		new Ejercicio10().show();
	}

}