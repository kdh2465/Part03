package pack01_exceptionhandling.sec04_UserException.EX12_CreateUserException;

//#1. ����� �Ϲݿ���(Checked Exception)
class MyException extends Exception {
	public MyException() {
		super();	
	}
	public MyException(String message) {
		super(message);		
	}
}

//#2. ����� �Ϲݿ���(UnChecked Exception = RuntimeException) 
class MyRTException extends RuntimeException{

	public MyRTException() {
		super();
	}

	public MyRTException(String message) {
		super(message);
	}
}

class A {
	void abc(int num) throws MyException {
		
		//#3. ����� ���� ���� ��ü ����
		MyException me1 = new MyException();
		MyException me2 = new MyException("���ܸ޼���: MyException");
		
		MyRTException mre1 = new MyRTException();
		MyRTException mre2 = new MyRTException("���ܸ޼���: MyRTException");

		//#4. ���� ������
		//@���#1. ���ܸ� ���� ó��		
		try {			
			if (num>70) 
				System.out.println("������");
			else 
				throw new MyException();
		} catch(MyException e) {
			System.out.println("����ó��");
		}
		
		//@���#2. ���ܸ� ������ ����
		throw new MyException();
	}
	
	//#5. ���� �޼��忡�� �������� ����ó���ϱ�	
	void bcd() {
		try {
			abc(65);
		} catch (MyException e) {
			System.out.println("����ó��");
		}
	}
}

public class EX12_CreateUserException {
	
}
