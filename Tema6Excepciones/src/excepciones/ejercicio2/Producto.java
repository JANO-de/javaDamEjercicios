package excepciones.ejercicio2;

public class Producto {
	private int model;
	private byte stock;
	private double price;
	private static int counter;
	private int creationOrder;
	
	public Producto (int model, byte stock, double price) throws Exception {
		setModel(model);
		setStock(stock);
		setPrice(price);
		
		counter++;
		creationOrder = counter;
	}
	
	public Producto () throws Exception {
		this(1,(byte)0,0);
	}

	int getModel() {
		return model;
	}

	public void setModel(int model) {
		if (model < 1 || model > 1000) {
			throw new IllegalArgumentException("The model cant be a number under 1 or over 1000");
		} else {
			this.model = model;
		}
	}

	public byte getStock() {
		return stock;
	}

	public void setStock(byte stock) {
		if (stock < 0) {
			throw new IllegalArgumentException("The stock cant be a number under 0");
		} else {
			this.stock = stock;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {
		if (price < 0) {
			throw new Exception("The price cant be a number under 0");
		} else {
			this.price = price;
		}
	}
	
	public int getCreationOrder() {
		return creationOrder;
	}

	@Override
	public String toString() {
		return "Producto [model=" + model + ", stock=" + stock + ", price=" + price + "]";
	}
	
	public Producto lessStock (byte stock){
		if (stock <= this.stock) {
			this.stock -= stock;
		}
		return this;
	}
	
	public String chain () {
		return "I'm the product number " + creationOrder;
	}
}
