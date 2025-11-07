package hw6;

public class Pen {

	private String brand;
	private double price;

	public Pen() {
		this.brand = "Unknown";
		this.price = 0.0;
	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void write() {
		System.out.println("使用筆書寫");
	}
}
