// Q 두개의 정수를 받아서 x,y를 초기화하는 생성자를 작성하시오
class Point {
	protected int x; // this.x
	protected int y; // this.y

	// 생성자 x,y를 초기화
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Point3D extends Point {
	private int z;

	Point3D(int x, int y, int z) {
		// x, y, z를 초기화
//		this.x = x;
//		this.y = y;
		super(x, y);
		this.z = z;
	}

	// Object 쿨래스의 toString()을 오버라이딩 하시오.
	// 객체(자기자신)를 문자열(String)으로 변환해서 반환
	// 객체(iv의 집합)출력 = iv를 출력??변수값을 문자열로 바꾼다?
	// iv가 x, y, z인데 이걸 찍어내면되나??
	// int x + '0' => char / int x + "" => String /
	public String toString() {
		return "x = " + x + " , y = " + y + " , z = " + z;
	}

}

class PointTest {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
//		p.x = 1;
//		p.y = 2;
//		p.z = 3;

//		System.out.println(p.x);
//		System.out.println(p.y);
//		System.out.println(p.z);

		System.out.println(p);

//		Point p = new Point();
//		p.x = 3;
//		p.y = 5;
//		System.out.println(p.x);
//		System.out.println(p.y);

	}
}
