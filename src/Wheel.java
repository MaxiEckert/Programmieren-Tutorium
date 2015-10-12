
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
	
	public String toString() {
		String wheelString = "";
		
		wheelString += "{ Rim Diameter: " + rimDiameter;		wheelString += ", ";
		wheelString += "Tire width: " + tireWidth;			wheelString += ", ";
		wheelString += "Tire diameter: " + tireDiameter;	wheelString += ", ";
		wheelString += "Model Number: " + modelNumber;		wheelString += ", ";
		wheelString += "Price: " + price + "}";
		
		return wheelString;
	}
}
