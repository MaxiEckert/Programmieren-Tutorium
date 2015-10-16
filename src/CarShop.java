
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
		
		System.out.println("Car 1: " + car1);
		
		double totalPrice = car1.getTotalPrice(19);
		
		System.out.println(totalPrice);
		System.out.println("\n");
		System.out.println(car1.getPowerClass());
		
		System.out.println(car2 == car3);
		System.out.println(car2.equals(car3));
		
		testCarListAddFirst(new Car[] {car1, car2, car3});
		testCarListAddLast(new Car[] {car1, car2, car3});
	}
	
	Car getMostExpCar(Car[] cars) {
		Car mostExpCar = cars[0];
		
		for (int i = 1; i < cars.length; i++) {
			if (cars[i].getTotalPrice() > mostExpCar.getTotalPrice()) {
				mostExpCar = cars[i];
			}
		}
		
		return mostExpCar;
	}
	
	static void testCarListAddFirst(Car[] carArray) {
		CarList list = new CarList();
		for (int i = 0; i < carArray.length; i++) {
			list.addFirst(carArray[i]);
		}
	    System.out.println(list);
	}
	
	static void testCarListAddLast(Car[] carArray) {
		CarList list = new CarList();
		for (int i = 0; i < carArray.length; i++) {
			list.addLast(carArray[i]);
		}
	    System.out.println(list);
	}

}
