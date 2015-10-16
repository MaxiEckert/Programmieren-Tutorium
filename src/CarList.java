
public class CarList {

	private CarListElement first;

	public CarList(CarListElement first) {
		this.first = first;
	}
	
	public CarList() {
		first = null;
	}
	
	public void addFirst(Car c) {
		CarListElement newEl = new CarListElement(c, first);
		first = newEl;
	}
		
}
