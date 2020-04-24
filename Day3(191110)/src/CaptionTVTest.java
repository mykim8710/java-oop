class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

}

class CaptionTv extends Tv {
	String text;

	void caption() {
	}
}

public class CaptionTVTest {
	public static void main(String[] args) {
		Tv t2 = new CaptionTv(); // 다형성 적용,
		t2.channel = 1;
		t2.channelUp();
		System.out.println(t2.channel);

		CaptionTv c = (CaptionTv) t2;

		c.caption();

	}
}
