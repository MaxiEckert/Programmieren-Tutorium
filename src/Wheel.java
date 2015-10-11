
public class Wheel {

	int rimDiameter;
	
	int tireWidth;
	
	int tireDiameter;
	
	String modelNumber;
	
	double price;

	public Wheel(int rimDiameter, int tireWidth, int tireDiameter, String modelNumber, double price) {
		this.rimDiameter = rimDiameter;
		this.tireWidth = tireWidth;
		this.tireDiameter = tireDiameter;
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
