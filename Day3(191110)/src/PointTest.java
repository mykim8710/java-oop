// Q 1-2 PointTestclass 정의
class Test {
	int x, y;

	Test(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class PointTest {
	public static void main(String[] args) {
		// Q 1-3's result
		Point p1 = new Point();
		p1.x = 3;
		p1.y = 5;
		System.out.println("Q 1-3 result : " + p1);

		// Q 1-4's result
		Point p2 = new Point();
		System.out.println("Q 1-4 result : " + p2);

		// Q 1-5's result
		double result = Point.getDistance(p1, p2);
		System.out.println("Q 1-5 result : " + result);

		// Q 1-6's result
		Point p3 = new Point(1, 2);
		System.out.println("Q 1-6 result : " + p3.getDistance(p2));

		// Q 1-7's result
		Point p4 = new Point(3, 5);
		System.out.println("Q 1-7 result 1 : " + p4.equals(p1));
		Point p5 = new Point(7, 7);
		System.out.println("Q 1-7 result 2 : " + p5.equals(p5));

		// 객체의 멤버(x=3, y=5)는 같지만 Test클래스의 객체와 비교
		// 객체 t, Data Type : Test
		Test t = new Test(3, 5);
		System.out.println("Q 1-7 result 3: " + p1.equals(t));

		// Q 1-8, 9, 10's result
		Point3D pp = new Point3D();
		System.out.println("Q 1-8, 9, 10 result : " + pp);
	}
}
