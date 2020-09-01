package pack05_lambdaexpression.sec01_LambdaExpression.EX02_FunctionToLambdaExpression;

/*�Լ��� �������̽��� ��ü������ ���� ���ٽ� ǥ�����*/

interface A{ //�Է�X, ���x
	void method1();
}
interface B{ //�Է�O, ���x
	void method2(int a);
}
interface C{ //�Է�X, ���O
	int method3();
}
interface D{ //�Է�O, ���O
	double method4(int a, double b);
}

public class EX02_FunctionToLambdaExpression {
	public static void main(String[] args) {
		
		//#�Լ�(�Լ����������̽�) --> ���ٽ�
		
		//#1. �Է�X, ���x�� �Լ�
		//@1-1. �͸��̳�Ŭ���� ǥ��
		A a1 = new A() { 
			@Override
			public void method1() {
				System.out.println("�Է�X, ���x�� �Լ�");				
			}
		};
		//@1-2. ���ٽ� ǥ��
		A a2 = ()->{System.out.println("�Է�X, ���x�� �Լ�");};
		A a3 = ()-> System.out.println("�Է�X, ���x�� �Լ�"); //�߰�ȣ ����
		
		//#2. //�Է�O, ���x�� �Լ�
		//@2-1. �͸��̳�Ŭ���� ǥ��
		B b1 = new B() {
			public void method2(int a) {
				System.out.println(a);
			};
		};
		//@2-2. ���ٽ� ǥ��
		B b2 = (int a)->{System.out.println(a);};
		B b3 = (a)->{System.out.println(a);};
		B b4 = (a)->System.out.println(a);
		B b5 = a->System.out.println(a);
		
		//#3. //�Է�x, ���O�� �Լ�
		//@3-1. �͸��̳�Ŭ���� ǥ��
		C c1 = new C() {
			@Override
			public int method3() {				
				return 4;
			}
		};
		//@3-2. ���ٽ� ǥ��
		C c2 = ()->{return 4;};
		C c3 = ()->4;
		
		//#4. //�Է�x, ���O�� �Լ�
		//@4-1. �͸��̳�Ŭ���� ǥ��
		D d1 = new D() {
			@Override
			public double method4(int a, double b) {				
				return a+b;
			}
		};
		//@4-2. ���ٽ� ǥ��
		D d2 = (int a, double b)->{return a+b;};
		D d3 = (a, b)->{return a+b;};
		D d4 = (a, b)->a+b;
		
	}
}
