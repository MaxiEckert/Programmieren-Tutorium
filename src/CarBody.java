
public class CarBody {
	
	enum Color {
		BLACK,
		GREY,
		WHITE,
		RED,
		GREEN,
		BLUE
	}

	Color color;
	
	double weight;
	
	int seats;
	
	double price;
	
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
	
	
}
