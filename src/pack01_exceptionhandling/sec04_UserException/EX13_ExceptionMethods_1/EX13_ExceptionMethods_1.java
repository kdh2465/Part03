package pack01_exceptionhandling.sec04_UserException.EX13_ExceptionMethods_1;

public class EX13_ExceptionMethods_1 {
	public static void main(String[] args) {
		
		//#1. ���ܰ�ü ������ �޽����� �������� ���� ��� 
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//#2. ���ܰ�ü ������ �޽����� ������ ���
		try {
			throw new Exception("���� �޽���");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
