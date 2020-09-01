package pack05_lambdaexpression.sec01_LambdaExpression.EX04_RefOfInstanceMethod_Type1_2;

/*Ȱ��#2-1. �ν��Ͻ� �޼��� ���� Type1 (�ڹ� ���� �ν��Ͻ� �޼��� ����)*/

interface A {
	void abc(int k);
}

public class EX04_RefOfInstanceMethod_Type1_2 {
	public static void main(String[] args) {
		// #�ν��Ͻ� �޼��� ���� Type1
		// #1. �͸��̳�Ŭ���� ǥ��
		A a1 = new A() {
			public void abc(int k) {
				System.out.println(k);
			}
		};

		// #2. �Ϲ� ���ٽ� ǥ��
		A a2 = (k) -> {
			System.out.println(k);
		};

		// #3. �ν��Ͻ� �޼��� ���� Type1 ǥ��
		A a3 = System.out::println;

		a1.abc(3);
		a2.abc(3);
		a3.abc(3);	
	}
}
