public class Truck extends Vehicle {
    
    public Truck() {
        wheels = new Wheel[6];
    }

    public Truck(String manufacturer, String serialNumber, CarBody body, Engine engine, Gear gear, Wheel[] wheels) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.body = body;
        this.engine = engine;
        this.gear = gear;
        this.wheels = wheels;

    }
}
