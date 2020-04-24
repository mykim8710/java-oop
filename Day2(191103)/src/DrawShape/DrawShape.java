package DrawShape;

class Shape {
	String color = "Black";

	public void draw() {
		System.out.println("Color = " + color);
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

// ��Ӱ��� (is a ~�� ~�̴�. ���� �����̴�) 
class Circle extends Shape {
	// ���԰���(has a ~�� ~�� ������, ���� ���� ������)
	Point center;
	int r;

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("Center point = (" + center.x + " , " + center.y + ")  r = " + r + " Color : " + color);
	}

}

public class DrawShape {

	public static void main(String[] args) {

		Point p1 = new Point(1, 2);
		Circle c1 = new Circle(p1, 5);

		c1.draw();
	}

}
