class MyMath2 {
	long a, b;				 //   long a, b => iv(인스턴스 변수)
	
	long add() {			 // 인스턴스 메서드 : iv로 작업(iv가 필요 : 객체가 필요)
		return a + b;		 //  long a, b => iv(인스턴스 변수)
	}

	static long add(long c, long d) {			// 클래스 메서드    
		return c + d;									// long a, long b=> lv(지역변수)
	}
}

public class MyMathTest2 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 200L));
		
		MyMath2 mm = new MyMath2();		// 객체 생성
		mm.a = 200L;
		mm.b = 100L;									// 인스턴스변수 초기화
		
		System.out.println(mm.add());		// 인스턴스 메서드 호출
		
	}

}
