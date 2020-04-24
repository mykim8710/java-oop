package ch7_7_19;

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}

}

class TV extends Product {
	TV() {
		super(1000);
	}

	public String toString() {
		return "TV";
	}

}

class NoteBook extends Product {
	NoteBook() {
		super(700);
	}

	public String toString() {
		return "NOTEBOOK";
	}
}

class Radio extends Product {
	Radio() {
		super(300);
	}

	public String toString() {
		return "RADIO";
	}
}

class Table extends Product {
	Table() {
		super(500);
	}

	public String toString() {
		return "TABLE";
	}
}

class Desk extends Product {
	Desk() {
		super(750);
	}

	public String toString() {
		return "DESK";
	}
}
