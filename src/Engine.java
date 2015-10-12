
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
	
	
}
