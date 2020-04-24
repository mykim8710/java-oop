//Q 1-8 Point class를 상속받는 Point3D class 정의
public class Point3D extends Point {
	int z;

	// Q 1-9
	public Point3D() {
		this(1, 1, 1);
	}

	// Q 1-9
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	// Q 1-10
	public String toString() {
		return super.toString() + ", z = " + z;
	}

}
