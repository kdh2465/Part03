package pack01_exceptionhandling.sec04_UserException.EX01_CreateUserException;

/*��������� �Ϲݿ��� �� ���࿹�ܿ� ������ ó�� �� ����*/

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
	
	//#3. ����� ���� ���� ��ü ����
	MyException me1 = new MyException();
	MyException me2 = new MyException("���ܸ޼���: MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("���ܸ޼���: MyRTException");
	
	//#4. ���� ������
	//@���#1. ���ܸ� ���� ó��
	void abc_1(int num) {		
		try {			
			if (num>70) 
				System.out.println("������");
			else 
				throw new MyException();
		} catch(MyException e) {
			System.out.println("����ó��");
		}		
	}
	void bcd_1() {
		abc_1(65);
	}
	
	//#5. ���� ������
	//@���#2. ���ܸ� �����ϱ�
	void abc_2(int num) throws MyException {		
		if (num>70) 
			System.out.println("������");
		else 
			throw new MyException();
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("����ó��");
		}
	}
}

public class EX01_CreateUserException {
	
}
