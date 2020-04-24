package Ch7_26;

interface Repairable {
}

interface Healable {
}

class Unit {
	int hp;
	final int MAX_HP;

	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	public Tank() {
		super(150);
		hp = MAX_HP;
	}

	void siegeMode() {
		System.out.println("SiegeMode");
	}

	@Override
	public String toString() {
		return "Tank";
	}
}

class DropShip extends AirUnit implements Repairable {
	public DropShip() {
		super(125);
		hp = MAX_HP;
	}

	void load() {
		System.out.println("유닛을 태웁니다.");
	}

	void unLoad() {
		System.out.println("유닛을 내립니다.");
	}

	@Override
	public String toString() {
		return "DropShip";
	}
}

class Marine extends GroundUnit implements Healable {
	public Marine() {
		super(40);
		hp = MAX_HP;
	}

	void steamPack() {
		if (hp < 10) {
			return;
		} else {
			System.out.println("스팀팩을 맞는다");
			hp = hp - 10;
			System.out.println("hp : " + hp);
		}
	}

	@Override
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable, Healable {
	public SCV() {
		super(60);
		hp = MAX_HP;
	}

	@Override
	public String toString() {
		return "SCV";
	}

	public void repair(Repairable r) {
		if (r instanceof Repairable) {
			Unit u = (Unit) r;
			while (u.hp != u.MAX_HP) {
				u.hp++;
				System.out.println("hp : " + u.hp);
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}

}

class Medic extends GroundUnit implements Healable {
	public Medic() {
		super(50);
		hp = MAX_HP;
	}

	public void heal(Healable h) {
		if (h instanceof Healable) {
			Unit u = (Unit) h;
			while (u.hp != u.MAX_HP) {
				u.hp++;
				System.out.println("hp : " + u.hp);
			}
			System.out.println(u.toString() + " 의 치료가 완료되었습니다.");
		}
	}

	@Override
	public String toString() {
		return "Medic";
	}
}

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		DropShip dropship = new DropShip();
		SCV scv = new SCV();
		Medic medic = new Medic();

		tank.hp = 85;
		scv.repair(tank);
		System.out.println();
		
		dropship.hp = 110;
		scv.repair(dropship);
		System.out.println();

		marine.hp = 12;
		marine.steamPack();
		System.out.println();
		medic.heal(marine);
	}
}
