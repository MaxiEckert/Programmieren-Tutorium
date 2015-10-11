
public class CarShop {

	public static void main(String[] args) {
		CarBody body = new CarBody(CarBody.Color.BLACK, 500, 5, 2000);
		
		Engine engine = new Engine(4, 200, 500, 2000, 2000);
		
		Gear gear = new Gear(6, "ABC123", 1000);
		
		Wheel wheels = new Wheel(3600, 210, 4000, "Wheel123", 800);
		
		Car car1 = new Car("VW", "PestSchleuder123", body, engine, gear, wheels, Car.Variant.COMFORT, true, true);
		
		Car car2 = new Car("VW", "SportPestSchleuder123", body, engine, gear, wheels, Car.Variant.SPORT, false, false);
		
		double totalPrice = car1.getTotalPrice();
		
		System.out.println(totalPrice);
	}

}
