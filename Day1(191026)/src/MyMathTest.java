//1. 변수x,y를 갖는 MyMath 클래스를 작성하세요.
//2. MyMath 클래스에 사칙연산을 수행하는 메서드를 추가하세요.
//		add(), subtract(), multiply(), divide()
//3. MyMath 클래스를 테스트하세요.

class MyMath {
	// 인스턴스 변수
	int x, y;

	// 인스턴스 메서드 : 인스턴수 변수로 작업
	int add(int x, int y) {
		this.x = x;
		this.y = y;
		return this.x + this.y;
	}

	int subtract() {
		return x - y;
	}

	int multiply() {
		return x * y;
	}

	double divide() {
		return (double) x / y;
	}

}

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); // 객체생성
//		mm.x = 5;
//		mm.y = 7; // 인스턴스 변수 초기화
		int resultAdd = mm.add(10, 20);
		int resultSubtract = mm.subtract();
		int resultMultiply = mm.multiply();
		double resultDivide = mm.divide(); // 인스턴스 메서드 호출

		System.out.println(resultAdd);
		System.out.println(resultSubtract);
		System.out.println(resultMultiply);
		System.out.println(resultDivide);

	}

}
