// Q 1-1 Point class 정의
public class Point {
	int x;
	int y;

	// Q 1-4 x=1, y=1로 초기화하는 생성자 정의
	public Point() {
		this(1, 1);
	}

	// Q 1-4 생성자 정의
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Q 1-3 x,y값을 포함한 문자열을 반환하도록 하는 toString()메서드 오버라이딩
	public String toString() {
		return "x = " + x + ", y = " + y;
	}

	// Q 1-5 두 점사이의 거리를 double타입으로 반환하는 static 메서드 정의
	public static double getDistance(Point p1, Point p2) {
		double distance = Math.sqrt((Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)));
		return distance;
	}

	// Q 1-6 두 점사이의 거리를 double타입으로 반환하는 인스턴트 메서드 정의
	public double getDistance(Point p) {
		return getDistance(this, p);
	}

	// Q 1-7 비교하는 객체가 Point객체가 아니면 false를 반환하는 equals()메서드를 오버라이딩하여 재정의
	@Override
	// 나(this)하고 obj가 같은지 비교
	public boolean equals(Object obj) {
		// obj가 Point객체인지 확인, Point type이면 x, y값이 같은지 확인 같으면 true, 다르면 false
		if (!(obj instanceof Point)) {
			return false;
		} else {
			// obj에는 x,y가 없으므로 타입을 Point로 바꾼다
			Point p = (Point) obj;
			// Point 타입이면 x,y값이 같은지 확인해서 같으면 true, 다르면 false
			return this.x == p.x && this.y == p.y;
		}
	}

}
