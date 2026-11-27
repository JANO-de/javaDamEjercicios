package excepciones.ejercicio2;

import java.util.Scanner;

import excepciones.ConsoleIO;

import static excepciones.Colors.*;

public class Ejercicio2 {

	private static ConsoleIO io = new ConsoleIO(new Scanner(System.in));

	public static void main(String[] args) {

		// 1. Creation order counter
		io.writelnColor("--- Creation order ---", BLUE);
		try {
			Producto p1 = new Producto();
			Producto p2 = new Producto(5, (byte) 20, 9.99);
			Producto p3 = new Producto(1000, (byte) 0, 0.0);
			io.writeln(p1.chain());
			io.writeln(p2.chain());
			io.writeln(p3.chain());
		} catch (Exception e) {
			io.writelnColor("Unexpected error: " + e.getMessage(), RED);
		}

		// 2. Constructors, getters and toString
		io.writelnColor("\n--- Constructors, getters and toString ---", BLUE);
		try {
			Producto def = new Producto();
			io.writeln("Default: " + def);

			Producto p = new Producto(5, (byte) 20, 9.99);
			io.writeln("With params: " + p);
			io.writeln("Model: " + p.getModel());
			io.writeln("Stock: " + p.getStock());
			io.writeln("Price: " + p.getPrice());
			io.writeln("Creation order: " + p.getCreationOrder());
		} catch (Exception e) {
			io.writelnColor("Unexpected error: " + e.getMessage(), RED);
		}

		// 3. Setters
		io.writelnColor("\n--- Setters ---", BLUE);
		try {
			Producto p = new Producto(5, (byte) 20, 9.99);
			p.setModel(500);
			p.setStock((byte) 7);
			p.setPrice(15.5);
			io.writeln("After valid setters: " + p);
		} catch (Exception e) {
			io.writelnColor("Unexpected error: " + e.getMessage(), RED);
		}

		// 4. lessStock
		io.writelnColor("\n--- lessStock ---", BLUE);
		try {
			Producto p = new Producto(5, (byte) 20, 9.99);
			p.lessStock((byte) 5);
			io.writeln("After lessStock(5): stock = " + p.getStock());
			try {
				p.lessStock((byte) 100);
				io.writeln("After lessStock(100): stock = " + p.getStock());
			} catch (IllegalArgumentException e) {
				io.writelnColor("lessStock(100) -> " + e.getMessage(), RED);
			}
		} catch (Exception e) {
			io.writelnColor("Unexpected error: " + e.getMessage(), RED);
		}

		// 5. Invariant: model
		io.writelnColor("\n--- Invariant: model (1 to 1000) ---", BLUE);
		testModel(0);
		testModel(1);
		testModel(1000);
		testModel(1001);

		// 6. Invariant: stock
		io.writelnColor("\n--- Invariant: stock (>= 0) ---", BLUE);
		testStock((byte) -1);
		testStock((byte) 0);

		// 7. Invariant: price
		io.writelnColor("\n--- Invariant: price (>= 0) ---", BLUE);
		testPrice(-5);
		testPrice(0);

		// 8. Invariant through setters
		io.writelnColor("\n--- Invariant through setters ---", BLUE);
		try {
			Producto p = new Producto(5, (byte) 20, 9.99);
			try {
				p.setModel(2000);
			} catch (IllegalArgumentException e) {
				io.writelnColor("setModel(2000) -> " + e.getMessage(), RED);
			}
			try {
				p.setStock((byte) -10);
			} catch (IllegalArgumentException e) {
				io.writelnColor("setStock(-10) -> " + e.getMessage(), RED);
			}
			try {
				p.setPrice(-1);
			} catch (Exception e) {
				io.writelnColor("setPrice(-1) -> " + e.getMessage(), RED);
			}
			io.writeln("Product unchanged: " + p);
		} catch (Exception e) {
			io.writelnColor("Unexpected error: " + e.getMessage(), RED);
		}
	}

	private static void testModel(int model) {
		try {
			new Producto(model, (byte) 0, 0.0);
			io.writeln("Model " + model + " -> OK");
		} catch (Exception e) {
			io.writelnColor("Model " + model + " -> " + e.getMessage(), RED);
		}
	}

	private static void testStock(byte stock) {
		try {
			new Producto(1, stock, 0.0);
			io.writeln("Stock " + stock + " -> OK");
		} catch (Exception e) {
			io.writelnColor("Stock " + stock + " -> " + e.getMessage(), RED);
		}
	}

	private static void testPrice(double price) {
		try {
			new Producto(1, (byte) 0, price);
			io.writeln("Price " + price + " -> OK");
		} catch (Exception e) {
			io.writelnColor("Price " + price + " -> " + e.getMessage(), RED);
		}
	}
}