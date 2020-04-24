class Tv {
	String color;
	boolean power;
	int channel;

	void power() {
		power = false;
	}

	void channelUp() {
		channel = ++channel;
	}

	void channelDown() {
		channel = --channel;
	}
}

class TvTest {
	public static void main(String[] args) {
//		Tv t = new Tv();
//		t.channel = 6;
//		t.channelDown();
//		t.power();
//		System.out.println("현재채널은 " + t.channel + " 입니다.");
		
		// 길이가 3인 Tv객체배열 생성
		Tv[] tvArr = new Tv[3];
		
		// 객체를 생성해서 배열의 각요소에 저장
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println(tvArr[i].channel);

		}

	}
}
