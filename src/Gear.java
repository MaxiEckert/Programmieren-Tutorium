
public class Gear {

	int numGears;
	
	String modelNumber;
	
	double price;

	public Gear(int numGears, String modelNumber, double price) {
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
	
	public String toString() {
		String gearString = "";
		
		gearString += "Number of Gears: " + numGears;	gearString += ", ";
		gearString += "Model Number: " + modelNumber;	gearString += ", ";
		gearString += "Price: " + price;
		
		return gearString;
	}
}
