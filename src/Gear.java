
public class Gear {

    private int numGears;
	
    private String modelNumber;
	
    private double price;

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


	public boolean equals(Gear other) {
		if (this == other)
			return true;
		if (other == null)
			return false;

		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		if (numGears != other.numGears)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}
