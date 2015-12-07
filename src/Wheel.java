
public class Wheel {

    private int rimDiameter;
	
    private int tireWidth;
	
    private int tireDiameter;
	
    private String modelNumber;
	
    private double price;

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

	public boolean equals(Wheel other) {
		if (this == other)
			return true;
		if (other == null)
			return false;

		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		if (price != other.price)
			return false;
		if (rimDiameter != other.rimDiameter)
			return false;
		if (tireDiameter != other.tireDiameter)
			return false;
		if (tireWidth != other.tireWidth)
			return false;
		return true;
	}
	
	
}
