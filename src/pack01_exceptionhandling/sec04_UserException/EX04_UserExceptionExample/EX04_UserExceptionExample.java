package pack01_exceptionhandling.sec04_UserException.EX04_UserExceptionExample;

/*사용자 예외 클래스 정의 및 예외 발생시키기*/

//#.점수가 음수인 경우 발생하는 예외 클래스 생성
class MinusException extends Exception {
	MinusException() {
	}
	MinusException(String s) {
		super(s); // 부모생성자호출
	}
}
//#.점수가 100을 초과하는 경우 발생하는 예외 클래스 생성
class OverException extends Exception {
	OverException() {
	}
	OverException(String s) {
		super(s); // 부모생성자호출
	}
}

class A {
	// #.점수가 0~100 범위가 아닌 경우 예외를 발생하는 메서드
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("예외발생:음수값 입력");
		} else if (score > 100) {
			throw new OverException("예외발생:100점 초과");
		} else {
			System.out.println("정상적인 값입니다");
		}
	}
}

public class EX04_UserExceptionExample {
	//#. A 객체의 checkScore 메서드를 호출하여 예외처리하는 메서드
	public static void main(String[] args) {

		A a = new A();		
		try {
			a.checkScore(85);
			a.checkScore(150); //예외발생
		} catch (MinusException | OverException e) {			
			System.out.println(e.getMessage());
		} 
	}
}
