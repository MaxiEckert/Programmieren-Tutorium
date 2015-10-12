
public class Car {

	String manufacturer;
	
	String serialNumber;
	
	CarBody body;
	
	Engine engine;
	
	Gear gear;
	
	Wheel[] wheels = new Wheel[4];
	
	enum Variant {
		CLASSIC,
		COMFORT,
		SPORT
	}
	
	Variant variant;
	
	boolean hasAirCondition;
	
	boolean hasHeatedSeats;

	public Car(String manufacturer, String serialNumber, CarBody body, Engine engine, Gear gear, Wheel[] wheels,
			Variant variant, boolean hasAirCondition, boolean hasHeatedSeats) {
		this.manufacturer = manufacturer;
		this.serialNumber = serialNumber;
		this.body = body;
		this.engine = engine;
		this.gear = gear;
		this.wheels = wheels;
		this.variant = variant;
		this.hasAirCondition = hasAirCondition;
		this.hasHeatedSeats = hasHeatedSeats;
	}
	
	double getTotalWheelPrice() {
		double sum = 0;
		for (Wheel wheel : wheels) {
			sum += wheel.getPrice();
		}
		
		return sum;
	}
	
	double getTotalPrice() {
		double totalPrice = 0;
		
		totalPrice += body.getPrice();
		totalPrice += engine.getPrice();
		totalPrice += gear.getPrice();
		totalPrice += getTotalWheelPrice();
		
		totalPrice *= 1.19;
		
		return totalPrice;
	}
	
	double getTotalPrice(int mwst) {
		double totalPrice = 0;
		
		totalPrice += body.getPrice();
		totalPrice += engine.getPrice();
		totalPrice += gear.getPrice();
		totalPrice += getTotalWheelPrice();
		
		totalPrice *= (1 + mwst/100.0);
		
		return totalPrice;
	}
	
	String getPowerClass() {
		if (engine.getPower() < 100) {
			return "Power: weak";
		}
		else if (engine.power < 200) {
			return "Power: middle";
		}
		else {
			return "Power: strong";
		}
	}
}
