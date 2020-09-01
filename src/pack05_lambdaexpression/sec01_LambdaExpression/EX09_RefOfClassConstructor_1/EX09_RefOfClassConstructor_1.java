package pack05_lambdaexpression.sec01_LambdaExpression.EX09_RefOfClassConstructor_1;

/*Ȱ��#3-2. Ŭ������ ������ ���� (�⺻������ ����)*/

interface A {
	B abc();
}

class B {
	B() {
		System.out.println("ù��° ������");
	}

	B(int k) {
		System.out.println("�ι�° ������");
	}
}

public class EX09_RefOfClassConstructor_1 {
	public static void main(String[] args) {
		// #Ŭ���� ������ ����
		// #1. �͸��̳�Ŭ���� ǥ��
		A a1 = new A() {
			public B abc() {
				return new B();
			}
		};

		// #2. �Ϲ� ���ٽ� ǥ��
		A a2 = () -> new B();

		// #3. Ŭ���� ������ ���� ǥ��
		A a3 = B::new;

		a1.abc(); // ù��° ������
		a2.abc(); // ù��° ������
		a3.abc(); // ù��° ������

	}
}
