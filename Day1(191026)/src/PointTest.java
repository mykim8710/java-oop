// Q1. 정수 x,y를 멤버로 갖는 Point 클래스를 정의하시오
// Q2. Point Test의 main메서드에서 Point 클래스의 객체를 생성하고 사용하는 코드를 작성하시오

// 1. 설계도 작성
class Point {
	int x, y;

// 생성자 추가
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}

}

public class PointTest {

	public static void main(String[] args) {
// 2. 객체 생성
		Point p2 = new Point();

//		Point p1 = new Point(3,5);
		

 //3. 객체 사용 : 객체의 멤버(변수와 메서드)를 사용
		p2.x = 3; // iv초기화
		p2.y = 5;
		System.out.println(p2.x);
		System.out.println(p2.y);
	}

}
