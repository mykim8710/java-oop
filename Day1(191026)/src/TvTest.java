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
//		System.out.println("����ä���� " + t.channel + " �Դϴ�.");
		
		// ���̰� 3�� Tv��ü�迭 ����
		Tv[] tvArr = new Tv[3];
		
		// ��ü�� �����ؼ� �迭�� ����ҿ� ����
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
