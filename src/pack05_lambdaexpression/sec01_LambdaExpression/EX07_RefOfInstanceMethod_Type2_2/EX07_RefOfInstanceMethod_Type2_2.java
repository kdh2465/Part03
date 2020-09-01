package pack05_lambdaexpression.sec01_LambdaExpression.EX07_RefOfInstanceMethod_Type2_2;

/*Ȱ��#2-3. �ν��Ͻ� �޼��� ���� Type2(�ڹ� ���� �ν��Ͻ� �޼��� ����)*/

interface A {
	int abc(String str);
}

public class EX07_RefOfInstanceMethod_Type2_2 {
	public static void main(String[] args) {
		
		// #�ν��Ͻ� �޼��� ���� Type2
		// #1. �͸��̳�Ŭ���� ǥ��
		A a1 = new A() {
			public int abc(String str) {
				return str.length();
			}
		};

		// #2. �Ϲ� ���ٽ� ǥ��
		A a2 = (str) -> str.length();

		// #3. �ν��Ͻ� �޼��� ���� Type2 ǥ��
		A a3 = String::length;
		
		System.out.println(a1.abc("�ȳ�"));
		System.out.println(a2.abc("�ȳ�"));
		System.out.println(a3.abc("�ȳ�"));
	}
}
