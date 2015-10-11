
public class Car {

	String manufacturer;
	
	String serialNumber;
	
	CarBody body;
	
	Engine engine;
	
	Gear gear;
	
	Wheel wheels;
	
	enum Variant {
		CLASSIC,
		COMFORT,
		SPORT
	}
	
	Variant variant;
	
	boolean hasAirCondition;
	
	boolean hasHeatedSeats;

	public Car(String manufacturer, String serialNumber, CarBody body, Engine engine, Gear gear, Wheel wheels,
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
	
}
