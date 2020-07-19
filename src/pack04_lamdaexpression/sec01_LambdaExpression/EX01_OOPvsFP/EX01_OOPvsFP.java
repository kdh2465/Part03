package pack04_lamdaexpression.sec01_LambdaExpression.EX01_OOPvsFP;

/*��ü ���� ���α׷��� ������ �Լ��� ���α׷��� ����*/

interface A {
	void abc();
}

class B implements A {
	public void abc() {
		System.out.println("�޼��� ����");
	}
}


public class EX01_OOPvsFP {
	public static void main(String[] args) {
		//#1. ��ü���� ���α׷��� ���� 1(case#1)
		A a1 = new B();
		a1.abc(); //�޼��� ����
		
		//#2. ��ü���� ���α׷��� ���� 2(case#2)
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("�޼��� ����");			
			}
		};
		a2.abc();
		
		//#3. �Լ��� ���α׷��� ���� (���ٽ�)(case#3)
		A a3 = ()->{System.out.println("�޼��� ����");};
		a3.abc();

	}
}
