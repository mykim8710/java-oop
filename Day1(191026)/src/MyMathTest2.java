class MyMath2 {
	long a, b;				 //   long a, b => iv(�ν��Ͻ� ����)
	
	long add() {			 // �ν��Ͻ� �޼��� : iv�� �۾�(iv�� �ʿ� : ��ü�� �ʿ�)
		return a + b;		 //  long a, b => iv(�ν��Ͻ� ����)
	}

	static long add(long c, long d) {			// Ŭ���� �޼���    
		return c + d;									// long a, long b=> lv(��������)
	}
}

public class MyMathTest2 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 200L));
		
		MyMath2 mm = new MyMath2();		// ��ü ����
		mm.a = 200L;
		mm.b = 100L;									// �ν��Ͻ����� �ʱ�ȭ
		
		System.out.println(mm.add());		// �ν��Ͻ� �޼��� ȣ��
		
	}

}
