﻿package pack01_exceptionhandling.sec03_ThrowsException.EX03_ThrowsMultiException;

/*여러 개의 예외 한꺼번에 전가하기*/

//#1. 하위 메서드에서 다중 예외처리를 하는 경우
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch (InterruptedException | ClassNotFoundException e) {
			//예외처리 구문
		}
	}
}
//#2. 호출메서드로 다중 예외처리를 를 전가한 경우
class B {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException | ClassNotFoundException e) {
			//예외처리 구문
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}
public class EX03_ThrowsMultiException {
	public static void main(String[] args) {		
	}
}
