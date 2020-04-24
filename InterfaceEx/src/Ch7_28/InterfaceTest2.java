package Ch7_28;

interface Iable {
	public abstract void play();
}

class A {
	public void autoPlay(Iable i) {
		i.play();
	}
}

class B implements Iable {
	@Override
	public void play() {
		System.out.println("playMethod in B class");
	}
}

class C implements Iable {
	@Override
	public void play() {
		System.out.println("playMethod in C class");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());

	}
}
