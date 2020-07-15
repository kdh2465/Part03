package pack01_exceptionhandling.sec03_ThrowsException.EX01_ThrowsException_1;

/*직접 예외처리를 하는 경우와 호출메서드로 예외를 전가하는 경우*/

//#1. 하위 메서드에서 직접 예외처리를 하는 경우
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//예외처리 구문
		}
	}
}
//#2. 호출메서드로 예외를 전가한 경우
class B {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			//예외처리 구문
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000);	
	}
}

public class EX01_ThrowsException_1 {
	public static void main(String[] args) {		
	}
}
