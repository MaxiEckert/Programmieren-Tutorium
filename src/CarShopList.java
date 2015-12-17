
public class CarShopList<T extends ShopItem> {
	
	private class CarShopListElement<T extends ShopItem> {

		private CarShopListElement<T> next;
		
		private T content;
		
		public CarShopListElement(T content, CarShopListElement<T> next) {
			this.content = content;
			this.next = next;
		}

		public CarShopListElement<T> getNext() {
			return next;
		}

		public void setNext(CarShopListElement<T> next) {
			this.next = next;
		}

		public T getContent() {
			return content;
		}

		public void setContent(T content) {
			this.content = content;
		}
		
		public double calcPrice() {
		    if (next == null) {
		        return content.getPrice();
		    } else {
		        return content.getPrice() + next.calcPrice();
		    }
		}
	}

	private CarShopListElement<T> first;

	public CarShopList(CarShopListElement<T> first) {
		this.first = first;
	}
	
	public double calculateTotalPrice() {
	    return first.calcPrice();
	}
	
	public CarShopList() {
		first = null;
	}
	
	public VehicleIterator iterator() {
	    return new VehicleIterator(first);
	}
	
	public void addFirst(T c) {
		CarShopListElement<T> newEl = new CarShopListElement<T>(c, first);
		first = newEl;
	}
	
	public void addLast(T c) {
		if(first == null) {
			addFirst(c);
		} else {
			CarShopListElement<T> el = first;
			while (el.getNext() != null) {
				el = el.getNext();
			}
			el.setNext(new CarShopListElement<T>(c, null));
		}
	}
	
	public void remove(T c) {
		CarShopListElement<T> el = first;
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
	
	public boolean contains(T c) {
		for (CarShopListElement<T> el = first; el != null; el = el.getNext()) {
			if (el.getContent().equals(c)) {
				return true;
			}
		}
		return false;
	}
		
	public String toString() {
		String listString = "[";
		
		VehicleIterator it = new VehicleIterator(first);
		while (it.hasNext()) {
			listString += it.next().toString();
			listString += ", \n";
		}
		
		listString += "]";
		return listString;
	}
	
	public class VehicleIterator {
		private CarShopListElement<T> current;
		
		private VehicleIterator(CarShopListElement<T> start) {
			current = start;
		}
		
		public boolean hasNext() {
			return (current != null);
		}
		
		public T next() {
			T currentVehicle = current.getContent();
			current = current.getNext();
			return currentVehicle;
		}
	}
}
