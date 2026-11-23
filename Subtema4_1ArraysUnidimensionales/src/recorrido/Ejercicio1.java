package recorrido;

public class Ejercicio1 {

	public void show() {
		mkArray();
	}

	public void mkArray() {
		int[] list;
		list = new int[6];
		list[0] = 71;
		list[1] = 18;
		list[2] = 34;
		list[3] = 51;
		list[4] = 26;
		list[5] = 9;

		for (int i = 0; i <= 5; i++) {
			if (list[i] % 2 == 0) {
				System.out.printf("Posicion %d -> Par\n", i);
			} else {
				System.out.printf("Posicion %d -> Impar\n", i);
			}
		}
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
