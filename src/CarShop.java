


public class CarShop {

	public static void main(String[] args) {
		CarBody body = new CarBody(CarBody.Color.BLACK, 500, 5, 2000);
		
		Engine engine = new Engine(4, 200, 500, 2000, 2000);
		
		Gear gear = new Gear(6, "ABC123", 1000);
		
		Wheel wheel = new Wheel(3600, 210, 4000, "Wheel123", 200);
		
		Wheel[] wheels = new Wheel[4];
		wheels[0] = wheel;
		wheels[1] = wheel;
		wheels[2] = wheel;
		wheels[3] = wheel;
		
		Car car1 = new Car("VW", "PestSchleuder123", body, engine, gear, wheels, Car.Variant.COMFORT, true, true);
		
		Car car2 = new Car("VW", "SportPestSchleuder123", body, engine, gear, wheels, Car.Variant.SPORT, false, false);
		Car car3 = new Car("VW", "SportPestSchleuder123", body, engine, gear, wheels, Car.Variant.SPORT, false, false);
		
		Truck t = new Truck("MAN", "truck", body, engine, gear, wheels);
		
		CarShopList<Vehicle> vehicleList = new CarShopList<Vehicle>();
		vehicleList.addLast(car1);
		vehicleList.addLast(car2);
		vehicleList.addLast(car3);
		vehicleList.addLast(t);
		
		for (CarShopList<Vehicle>.VehicleIterator it = vehicleList.iterator(); it.hasNext();) {
		    System.out.println(it.next());
		}
		System.out.println("Total price of Vehicles in list: " + vehicleList.calculateTotalPrice());
		
		CarShopList<Order> orderList = new CarShopList<Order>();
		orderList.addFirst(new Order(27));
		orderList.addFirst(new Order(42));
		System.out.println("Total price of Orders in list: " + orderList.calculateTotalPrice());
	}

	Car getMostExpCar(Car[] cars) {
		Car mostExpCar = cars[0];
		
		for (int i = 1; i < cars.length; i++) {
			if (cars[i].getPrice() > mostExpCar.getPrice()) {
				mostExpCar = cars[i];
			}
		}
		
		return mostExpCar;
	}
}
