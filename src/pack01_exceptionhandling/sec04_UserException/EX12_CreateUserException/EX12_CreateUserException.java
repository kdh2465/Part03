package pack01_exceptionhandling.sec04_UserException.EX12_CreateUserException;

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
	void abc(int num) throws MyException {
		
		//#3. 사용자 정의 예외 객체 생성
		MyException me1 = new MyException();
		MyException me2 = new MyException("예외메세지: MyException");
		
		MyRTException mre1 = new MyRTException();
		MyRTException mre2 = new MyRTException("예외메세지: MyRTException");

		//#4. 예외 던지기
		//@방법#1. 예외를 직접 처리		
		try {			
			if (num>70) 
				System.out.println("정상동작");
			else 
				throw new MyException();
		} catch(MyException e) {
			System.out.println("예외처리");
		}
		
		//@방법#2. 예외를 상위로 전가
		throw new MyException();
	}
	
	//#5. 상위 메서드에서 전가받은 예외처리하기	
	void bcd() {
		try {
			abc(65);
		} catch (MyException e) {
			System.out.println("예외처리");
		}
	}
}

public class EX12_CreateUserException {
	
}
