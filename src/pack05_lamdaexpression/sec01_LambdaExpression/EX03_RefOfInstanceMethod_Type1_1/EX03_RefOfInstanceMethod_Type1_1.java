package pack05_lamdaexpression.sec01_LambdaExpression.EX03_RefOfInstanceMethod_Type1_1;

interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("�޼���");
	}
}

public class EX03_RefOfInstanceMethod_Type1_1 {
	public static void main(String[] args) {
		//#�ν��Ͻ� �޼��� ���� Type1
		//#1. �͸��̳�Ŭ���� ǥ�� 
		A a1 = new A() {
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		// #2. �Ϲ� ���ٽ� ǥ��
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		// #3. �ν��Ͻ� �޼��� ���� Type1 ǥ��
		B b = new B();
		A a3 = b::bcd;

		a1.abc();
		a2.abc();
		a3.abc();		
	}
}
