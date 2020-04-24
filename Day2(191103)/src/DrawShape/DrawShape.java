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

// 상속관계 (is a ~은 ~이다. 원은 도형이다) 
class Circle extends Shape {
	// 포함관계(has a ~은 ~을 가진다, 원은 점을 가진다)
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
