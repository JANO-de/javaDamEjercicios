package records;

public class GestionProductos {

	public static void main(String[] args) {

		// 1. Create several products
		Producto p1 = new Producto(1, "Teclado", 25.5);
		Producto p2 = new Producto(2, "Raton", 15.0);
		Producto p3 = new Producto(3, "Monitor", 180.99);

		// 2. Show them using toString
		System.out.println("=== Products ===");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		// 3. Apply discounts to some of them
		System.out.println("\n=== Discounts ===");
		Producto p1Descuento = p1.aplicarDescuento(10);
		Producto p3Descuento = p3.aplicarDescuento(25);

		System.out.println("Before: " + p1);
		System.out.println("After 10%: " + p1Descuento);
		System.out.println("Before: " + p3);
		System.out.println("After 25%: " + p3Descuento);

		// 4. Try to create an invalid product (must be last)
		System.out.println("\n=== Invalid product ===");
		Producto invalido = new Producto(-1, "Cable", 5.0);
		System.out.println(invalido); // never reached
	}
}