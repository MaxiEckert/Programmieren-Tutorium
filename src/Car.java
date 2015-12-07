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
	
	String getPowerClass() {
		if (engine.getPower() < 100) {
			return "Power: weak";
		}
		else if (engine.getPower() < 200) {
			return "Power: middle";
		}
		else {
			return "Power: strong";
		}
	}
	
	public String toString() {
		String carString = "";
		carString += "Manufacturer: " + manufacturer;	carString += ", ";
		carString += "Serial Number: " + serialNumber; 	carString += ", ";
		carString += "Body: { " + body + " }, ";
		carString += "Engine: { " + engine + " }, ";
		carString += "Gear: { " + gear + " }, ";
		carString += Arrays.toString(wheels);
			
		return carString;
	}

	public boolean equals(Car other) {
		if (this == other)
			return true;
		if (other == null)
			return false;

		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (gear == null) {
			if (other.gear != null)
				return false;
		} else if (!gear.equals(other.gear))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		if (variant != other.variant)
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}
	
	
}
