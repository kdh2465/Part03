package pack01_exceptionhandling.sec04_UserException.EX01_CreateUserException;

/*사용자정의 일반예외 및 실행예외와 예외의 처리 및 전가*/

//#1. 사용자 일반예외(Checked Exception)
class MyException extends Exception {
	public MyException() {
		super();	
	}
	public MyException(String message) {
		super(message);		
	}
}

//#2. 사용자 일반예외(UnChecked Exception = RuntimeException) 
class MyRTException extends RuntimeException{

	public MyRTException() {
		super();
	}

	public MyRTException(String message) {
		super(message);
	}
}

class A {
	
	//#3. 사용자 정의 예외 객체 생성
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외메세지: MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외메세지: MyRTException");
	
	//#4. 예외 던지기
	//@방법#1. 예외를 직접 처리
	void abc_1(int num) {		
		try {			
			if (num>70) 
				System.out.println("정상동작");
			else 
				throw me1;
		} catch(MyException e) {
			System.out.println("예외처리 1");
		}		
	}
	void bcd_1() {
		abc_1(65);
	}
	
	//#5. 예외 던지기
	//@방법#2. 예외를 전가하기
	void abc_2(int num) throws MyException {		
		if (num>70) 
			System.out.println("정상동작");
		else 
			throw me1;
	}
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("예외처리 2");
		}
	}
}

public class EX01_CreateUserException {
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();
		a.bcd_2();
	}
}
