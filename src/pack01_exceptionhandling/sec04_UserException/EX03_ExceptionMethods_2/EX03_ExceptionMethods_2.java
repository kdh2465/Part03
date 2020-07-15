package pack01_exceptionhandling.sec04_UserException.EX03_ExceptionMethods_2;

/*���� ��ü�� ��ǥ���� �޼��� (printStackTrace())*/

class A{
	void abc() throws NumberFormatException {
		bcd();
	}
	void bcd() throws NumberFormatException {
		cde();
	}
	void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");
	}
}


public class EX03_ExceptionMethods_2 {
	public static void main(String[] args) {
		//#1.��ü ����
		A a = new A();
		//#2. �޼��� ȣ�� + ����ó��
		try {
			a.abc();
		} catch (NumberFormatException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}		
	}
}
