import java.util.Arrays;

public class Car {

	private String manufacturer;
	
	private String serialNumber;
	
	private CarBody body;
	
	private Engine engine;
	
	private Gear gear;
	
	private Wheel[] wheels = new Wheel[4];
	
	static enum Variant {
		CLASSIC,
		COMFORT,
		SPORT
	}
	
	private Variant variant;
	
	private boolean hasAirCondition;
	
	private boolean hasHeatedSeats;

	public Car() {
		
	}
	
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
	
	public String toString() {
		String carString = "";
		carString += "Manufacturer: " + manufacturer;	carString += ", ";
		carString += "Serial Number: " + serialNumber; 	carString += ", ";
		carString += "Body: { " + body + " }, ";
		carString += "Engine: { " + engine + " }, ";
		carString += "Gear: { " + gear + " }, ";
			
		return carString;
	}

	
	
}
