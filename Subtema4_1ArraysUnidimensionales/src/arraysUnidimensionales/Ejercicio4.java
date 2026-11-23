package arraysUnidimensionales;

public class Ejercicio4 {

	public void show() {
		int[] list = { 1, 5, 4, 5, 1 };

		showOccurrences(list, 5);
	}

	public void showOccurrences(int[] list, int number) {
		String positions = "";
		int count = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] == number) {
				if (count > 0) {
					positions = positions + ",";
				}
				positions = positions + i;
				count++;
			}
		}

		System.out.printf("The positions containing the value %d are: %s.%n", number, positions);
		System.out.printf("The number %d appears %d times in the array.%n", number, count);
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}

}