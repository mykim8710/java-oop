class MyMath3 {

	static int x = 5;
	static int y = 5;

	int a, b;

	int add() {
		return a + b;
	}

	static int add2(int x, int y) {				//   int x, int y : 매개변수
		return x + y;
	}

}

public class MyMathTest3 {
	public static void main(String[] args) {
		MyMath3 m = new MyMath3();
		m.a = 5;
		m.b = 5;
		int result = m.add();
		System.out.println(result);

		int result2 = MyMath3.add2(MyMath3.x, MyMath3.y);
		System.out.println(result2);

	}
}
