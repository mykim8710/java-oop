// Q �ΰ��� ������ �޾Ƽ� x,y�� �ʱ�ȭ�ϴ� �����ڸ� �ۼ��Ͻÿ�
class Point {
	protected int x; // this.x
	protected int y; // this.y

	// ������ x,y�� �ʱ�ȭ
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Point3D extends Point {
	private int z;

	Point3D(int x, int y, int z) {
		// x, y, z�� �ʱ�ȭ
//		this.x = x;
//		this.y = y;
		super(x, y);
		this.z = z;
	}

	// Object �𷡽��� toString()�� �������̵� �Ͻÿ�.
	// ��ü(�ڱ��ڽ�)�� ���ڿ�(String)���� ��ȯ�ؼ� ��ȯ
	// ��ü(iv�� ����)��� = iv�� ���??�������� ���ڿ��� �ٲ۴�?
	// iv�� x, y, z�ε� �̰� ����ǳ�??
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
