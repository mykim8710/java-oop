import java.util.Arrays;

class MyVector {
//	q1. Object배열 objArr0을 iv로 갖도록 하시오
	Object[] objArr;
	int index =0;

// q2. objArr이 지정된 값 (capacity)의 길이를 갖도록 하시오.
	public MyVector(int capacity) {
		this.objArr = new Object[capacity];
	}

// q3. objArr의 길이(용량)를 반환하는 int capacity() 를 작성하시오.
	public int capacity() {
		return objArr.length;
	}

// q4. objArr에 저장된 객체의 개수(count)를 반환하는 int getCount()를 작성하시오
	public int getCount() {
		int count = 0;
		for (int i = 0; i < capacity(); i++) {
			if (objArr[i] != null) {
				count++;
			}
		}
		return count;
	}

// q5. objArr에 지정된 객체를 저장하는 void add(Object obj)를 작성
	public void add(Object obj) {
		objArr[index++] = obj;
	}

}

class Fruit {public String toString() {return "Fruit";}}
class Apple extends Fruit {public String toString() {return "Apple";}}
class Orange extends Fruit {public String toString() {return "Orange";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Lemon extends Fruit {public String toString() {return "Lemon";}}

class MyVectorTest {
	public static void main(String[] args) {
		
		MyVector mv = new MyVector(5);
		
		mv.add(new Fruit());
		mv.add(new Apple());
		mv.add(new Grape());
		mv.add(new Lemon());
		mv.add(new Orange());

		System.out.println("객체배열 objArr의 길이 : " + mv.capacity());
		System.out.println("객체배열 objArr = " + Arrays.toString(mv.objArr));
		System.out.println("객체배열 objArr에 들어 있는 객체의 수 : " + mv.getCount());

	}
}