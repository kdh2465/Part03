package pack02_generic.sec03_GenericMethod.EX02_AvailableMethodInGenericMethod;

/*���׸� �޼��� ���ο��� ��밡���� �޼���*/

class A{
	public <T> void method1(T t) {
		//System.out.println(t.length());//(�Ұ���)
		System.out.println(t.equals("�ȳ�")); //����(Object �޼���)
	}
}

public class EX02_AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method1("�ȳ�");
	}
}
