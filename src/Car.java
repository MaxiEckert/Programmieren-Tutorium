import java.util.Arrays;

public class Car extends Vehicle {


	
	private Wheel[] wheels;
	
	static enum Variant {
		CLASSIC,
		COMFORT,
		SPORT
	}
	
	private Variant variant;
	
	private boolean hasAirCondition;
	
	private boolean hasHeatedSeats;

	public Car() {
	    wheels = new Wheel[4];
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
	
	
}
