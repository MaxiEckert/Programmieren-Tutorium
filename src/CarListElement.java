
public class CarListElement {

	private CarListElement next;
	
	private Car content;
	
	public CarListElement(Car content, CarListElement next) {
		this.content = content;
		this.next = next;
	}

	public CarListElement getNext() {
		return next;
	}

	public void setNext(CarListElement next) {
		this.next = next;
	}

	public Car getContent() {
		return content;
	}

	public void setContent(Car content) {
		this.content = content;
	}
	
}
