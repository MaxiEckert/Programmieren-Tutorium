
public class Engine {

	int cylinders;
	
	double power;
	
	double weight;
	
	double displacement;
	
	double price;

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
}
