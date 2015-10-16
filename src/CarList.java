
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
	
	public void addLast(Car c) {
		if(first == null) {
			addFirst(c);
		} else {
			CarListElement el = first;
			while (el.getNext() != null) {
				el = el.getNext();
			}
			el.setNext(new CarListElement(c, null));
		}
	}
		
	public String toString() {
		CarListElement currentEl = first;
		String listString = "[";
		
		while (currentEl != null) {
			listString += currentEl.getContent().toString();
			listString += ", \n";
			currentEl = currentEl.getNext();
		}
		
		listString += "]";
		return listString;
	}
}
