
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
	
	public void remove(Car c) {
		CarListElement el = first;
		while (el != null && el.getContent().equals(c)) {
			el = el.getNext();
			first = el;
		}
		
		if (el == null) {
			return;
		}
		
		while (el.getNext() != null) {
			if (el.getNext().getContent().equals(c)) {
				el.setNext(el.getNext().getNext());
			} else {
				el = el.getNext();
			}
		}
	}
	
	public boolean contains(Car c) {
		for (CarListElement el = first; el != null; el = el.getNext()) {
			if (el.getContent().equals(c)) {
				return true;
			}
		}
		return false;
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
