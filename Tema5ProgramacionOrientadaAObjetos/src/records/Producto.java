package records;

public record Producto(int id, String name, double price) {

	public Producto {
		if (id <= 0) {
			throw new IllegalArgumentException("The id must be a positive number");
		}
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("The name cannot be null or empty");
		}
		if (price < 0) {
			throw new IllegalArgumentException("The price must be greater than or equal to 0");
		}
	}

	public Producto aplicarDescuento(double discount) {
		if (discount <= 0 || discount > 100) {
			throw new IllegalArgumentException("Discount must be a positive number between 1%and 100%");
		}
		double newPrice = price - (price * discount / 100);
		return new Producto(id, name, newPrice);
	}
}