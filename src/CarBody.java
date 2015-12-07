
public class CarBody {
	
	static enum Color {
		BLACK,
		GREY,
		WHITE,
		RED,
		GREEN,
		BLUE
	}

	private Color color;
	
	private double weight;
	
	private int seats;
	
	private double price;
	
	public CarBody(Color color, double weight, int seats, double price) {
		this.color = color;
		this.weight = weight;
		this.seats = seats;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		String carBodyString = "";
		
		carBodyString += "Color: " + color.toString();	carBodyString += ", ";
		carBodyString += "Weight: " + weight;			carBodyString += ", ";
		carBodyString += "Seats: " + seats;				carBodyString += ", ";
		carBodyString += "Price: " + price;
		
		return carBodyString;
	}

	public boolean equals(CarBody otherCar) {
		if (this == otherCar)
			return true;
		if (otherCar == null)
			return false;

		if (color != otherCar.color)
			return false;
		if (price != otherCar.price)
			return false;
		if (seats != otherCar.seats)
			return false;
		if (weight != otherCar.weight)
			return false;
		return true;
	}
	
}
