package ch6;

public class AbsEx {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 : " + abs(value));
		int value2 = -5;
		System.out.println(value + "의 절대값 : " + abs(value2));

	}

	public static int abs(int value) {
		if (value < 0) {
			value = -value;
		}
		return value;
	}

}
