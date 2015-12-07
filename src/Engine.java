
public class Engine {

    private int cylinders;
	
    private double power;
	
    private double weight;
	
    private double displacement;
	
    private double price;

	public Engine(int cylinders, double power, double weight, double displacement, double price) {
		this.cylinders = cylinders;
		this.power = power;
		this.weight = weight;
		this.displacement = displacement;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
	public String toString() {
		String engineString = "";
		
		engineString += "Cylinders: " + cylinders;			engineString += ", ";
		engineString += "Power: " + power;					engineString += ", ";
		engineString += "Weight: " + weight;				engineString += ", ";
		engineString += "Displacement: " + displacement;	engineString += ", ";
		engineString += "Price: " + price;
		
		return engineString;
	}

	public boolean equals(Engine other) {
		if (this == other)
			return true;
		if (other == null)
			return false;

		if (cylinders != other.cylinders)
			return false;
		if (displacement != other.displacement)
			return false;
		if (power != other.power)
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
}
