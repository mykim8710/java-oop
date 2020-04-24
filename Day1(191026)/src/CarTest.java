class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("White", "Auto", 4);
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Color : " + color + "\n" + "GearType : " + gearType + "\n" + "Door : " + door;
	}

}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("Blue", "Auto", 4);
		System.out.println(c1.toString());

		Car c2 = new Car();
		System.out.println(c2.toString());

	}
}
