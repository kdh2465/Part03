package pack05_lamdaexpression.sec01_LambdaExpression.EX05_RefOfStaticMethod;

interface A {
	void abc();
}

class B {
	static void bcd() {
		System.out.println("�޼���");
	}
}

public class EX05_RefOfStaticMethod {
	public static void main(String[] args) {
		// #���� �޼��� ����
		// #1. �͸��̳�Ŭ���� ǥ��
		A a1 = new A() {
			public void abc() {
				B.bcd();
			}
		};

		// #2. �Ϲ� ���ٽ� ǥ��
		A a2 = () -> B.bcd();

		// #3. ���� �޼��� ���� ǥ��
		A a3 = B::bcd;

		a1.abc();
		a2.abc();
		a3.abc();

	}
}
