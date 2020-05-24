package pack04_lamdaexpression.sec01_LambdaExpression.EX06_RefOfInstanceMethod_Type2_1;

interface A {
	void abc(B b, int k);
}

class B {
	void bcd(int k) {
		System.out.println(k);
	}
}

public class EX06_RefOfInstanceMethod_Type2_1 {
	public static void main(String[] args) {
		// #�ν��Ͻ� �޼��� ���� Type2
		// #1. �͸��̳�Ŭ���� ǥ��
		A a1 = new A() {
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};

		// #2. �Ϲ� ���ٽ� ǥ��
		A a2 = (b, k) -> b.bcd(k);

		// #3. �ν��Ͻ� �޼��� ���� Type2 ǥ��
		A a3 = B::bcd;

		a1.abc(new B(), 3);
		a2.abc(new B(), 3);
		a3.abc(new B(), 3);
	}
}
