//1. ����x,y�� ���� MyMath Ŭ������ �ۼ��ϼ���.
//2. MyMath Ŭ������ ��Ģ������ �����ϴ� �޼��带 �߰��ϼ���.
//		add(), subtract(), multiply(), divide()
//3. MyMath Ŭ������ �׽�Ʈ�ϼ���.

class MyMath {
	// �ν��Ͻ� ����
	int x, y;

	// �ν��Ͻ� �޼��� : �ν��ϼ� ������ �۾�
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
		MyMath mm = new MyMath(); // ��ü����
//		mm.x = 5;
//		mm.y = 7; // �ν��Ͻ� ���� �ʱ�ȭ
		int resultAdd = mm.add(10, 20);
		int resultSubtract = mm.subtract();
		int resultMultiply = mm.multiply();
		double resultDivide = mm.divide(); // �ν��Ͻ� �޼��� ȣ��

		System.out.println(resultAdd);
		System.out.println(resultSubtract);
		System.out.println(resultMultiply);
		System.out.println(resultDivide);

	}

}
