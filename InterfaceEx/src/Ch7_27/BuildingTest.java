package Ch7_27;

interface Liftable {
	void liftOff();

	void move(int x, int y);

	void stop();

	void land();
}

class LifableBuilding implements Liftable {

	@Override
	public void liftOff() {
		System.out.println("�ǹ��� ���ø��ϴ�.");
	}

	@Override
	public void move(int x, int y) {
		System.out.println(x + ", " + y + "�� �ǹ��� �̵����Դϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ǹ��̵��� ����ϴ�.");
	}

	@Override
	public void land() {
		System.out.println("�ǹ��� �����մϴ�.");
	}

}

class TerranBuiling {
	int x, y;
	int hp;

	public TerranBuiling(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
}

class Barrack extends TerranBuiling implements Liftable {
	LifableBuilding l = new LifableBuilding();

	public Barrack(int x, int y) {
		super(x, y, 1250);
	}

	@Override
	public void liftOff() {
		l.liftOff();
	}

	@Override
	public void move(int x, int y) {
		l.move(x, y);
	}

	@Override
	public void stop() {
		l.stop();
	}

	@Override
	public void land() {
		l.land();
	}
}

class Factory extends TerranBuiling {
	public Factory(int x, int y) {
		super(x, y, 1500);
	}
}

class Bunker extends TerranBuiling {
	public Bunker(int x, int y) {
		super(x, y, 500);
	}
}

class Academy extends TerranBuiling {
	public Academy(int x, int y) {
		super(x, y, 1200);
	}
}

public class BuildingTest {
	public static void main(String[] args) {
		Barrack b = new Barrack(500, 550);
		System.out.println("�跰�� �Ǽ��Ǿ����ϴ�. ���� ��ġ�� " + b.x + ", " + b.y + "�Դϴ�.");

		b.liftOff();
		b.move(600, 800);
		b.stop();
		b.land();

	}
}
