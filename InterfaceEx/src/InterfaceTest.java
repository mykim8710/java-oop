// Ŭ����(�޼���)�� ����ϴ� �� : User
class A {
	public void methodA(I i) {
		i.methodB();
	}
}

// �޼��带 �����ϴ� �� : Provider
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
