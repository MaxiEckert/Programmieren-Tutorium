
public class CarList {
	
	private class CarListElement {

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
		String listString = "[";
		
		Iterator it = new Iterator(first);
		while (it.hasNext()) {
			listString += it.next().toString();
			listString += ", \n";
		}
		
		listString += "]";
		return listString;
	}
	
	public class Iterator {
		private CarListElement current;
		
		private Iterator(CarListElement start) {
			current = start;
		}
		
		public boolean hasNext() {
			return (current != null);
		}
		
		public Car next() {
			Car currentCar = current.getContent();
			current = current.getNext();
			return currentCar;
		}
	}
}
