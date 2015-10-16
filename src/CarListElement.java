
public class CarListElement {

	private CarListElement next;
	
	private Car content;
	
	public CarListElement(Car content, CarListElement next) {
		this.content = content;
		this.next = next;
	}
}
