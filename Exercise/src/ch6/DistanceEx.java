package ch6;

class MyPoint {
	int x, y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance2(int a, int b) {
		double distance2 = Math.sqrt(Math.pow((x - a), 2) + Math.pow((y - b), 2));
		return distance2;
	}

}

public class DistanceEx {
	static double getDistance(int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return distance;
	}

	public static void main(String[] args) {
//		System.out.println(getDistance(1, 1, 2, 2));

		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance2(2, 2));
	}

}
