
public class Gear {

	byte numGears;
	
	String modelNumber;
	
	double price;

	public Gear(byte numGears, String modelNumber, double price) {
		this.numGears = numGears;
		this.modelNumber = modelNumber;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
