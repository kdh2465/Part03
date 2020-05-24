package pack01_exceptionhandling.sec04_UserException.EX13_ExceptionMethods_1;

public class EX13_ExceptionMethods_1 {
	public static void main(String[] args) {
		
		//#1. 예외객체 생성시 메시지를 전달하지 않은 경우 
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//#2. 예외객체 생성시 메시지를 전달한 경우
		try {
			throw new Exception("예외 메시지");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
