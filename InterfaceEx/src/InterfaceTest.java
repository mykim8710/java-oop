// 클래스(메서드)를 사용하는 쪽 : User
class A {
	public void methodA(I i) {
		i.methodB();
	}
}

// 메서드를 제공하는 쪽 : Provider
class B implements I {
	public void methodB() {
		System.out.println("methodB in B class");
		// System.out.println("providedMethod()");
	}
}

interface I {
	public abstract void methodB();
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		I i = new B();
		a.methodA(i);
	}
}
