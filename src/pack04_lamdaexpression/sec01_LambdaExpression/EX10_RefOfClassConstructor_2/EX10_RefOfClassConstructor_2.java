package pack04_lamdaexpression.sec01_LambdaExpression.EX10_RefOfClassConstructor_2;

interface A {
	B abc(int a);
}

class B {
	B() {
		System.out.println("ù��° ������");
	}

	B(int k) {
		System.out.println("�ι�° ������");
	}
}

public class EX10_RefOfClassConstructor_2 {
	public static void main(String[] args) {
		// #Ŭ���� ������ ����
		// #1. �͸��̳�Ŭ���� ǥ��
		A a1 = new A() {
			public B abc(int a) {
				return new B(a);
			}
		};

		// #2. �Ϲ� ���ٽ� ǥ��
		A a2 = (a) -> new B(a);

		// #3. Ŭ���� ������ ���� ǥ��
		A a3 = B::new;

		a1.abc(3); // �ι�° ������
		a2.abc(3); // �ι�° ������
		a3.abc(3); // �ι�° ������

	}
}
