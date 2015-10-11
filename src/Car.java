
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
}
