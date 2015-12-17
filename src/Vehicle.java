
public class Vehicle implements ShopItem {

    protected String manufacturer;
    
    protected String serialNumber;
    
    protected CarBody body;
    
    protected Engine engine;
    
    protected Gear gear;
    
    protected Wheel[] wheels;
    
    public String toString() {
        String carString = "";
        carString += "Manufacturer: " + manufacturer;   carString += ", ";
        carString += "Serial Number: " + serialNumber;  carString += ", ";
        carString += "Body: { " + body + " }, ";
        carString += "Engine: { " + engine + " }, ";
        carString += "Gear: { " + gear + " }, ";
            
        return carString;
    }


    public double getTotalWheelPrice() {
        double sum = 0;
        for (Wheel wheel : wheels) {
            sum += wheel.getPrice();
        }
        
        return sum;
    }

    
    public double getPrice() {
        double totalPrice = 0;
        
        totalPrice += body.getPrice();
        totalPrice += engine.getPrice();
        totalPrice += gear.getPrice();

        
        
        return totalPrice;
    }

}
