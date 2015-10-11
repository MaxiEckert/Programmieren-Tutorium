
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
	
	public CarBody(Color color, double weight, int seats) {
		this.color = color;
		this.weight = weight;
		this.seats = seats;
	}
}
