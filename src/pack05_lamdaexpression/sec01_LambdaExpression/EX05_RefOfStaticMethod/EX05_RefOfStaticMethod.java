package pack05_lamdaexpression.sec01_LambdaExpression.EX05_RefOfStaticMethod;

interface A {
	void abc();
}

class B {
	static void bcd() {
		System.out.println("메서드");
	}
}

public class EX05_RefOfStaticMethod {
	public static void main(String[] args) {
		// #정적 메서드 참조
		// #1. 익명이너클래스 표현
		A a1 = new A() {
			public void abc() {
				B.bcd();
			}
		};

		// #2. 일반 람다식 표현
		A a2 = () -> B.bcd();

		// #3. 정적 메서드 참조 표현
		A a3 = B::bcd;

		a1.abc();
		a2.abc();
		a3.abc();

	}
}
