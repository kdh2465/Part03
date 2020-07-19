package pack05_lamdaexpression.sec01_LambdaExpression.EX03_RefOfInstanceMethod_Type1_1;

interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("메서드");
	}
}

public class EX03_RefOfInstanceMethod_Type1_1 {
	public static void main(String[] args) {
		//#인스턴스 메서드 참조 Type1
		//#1. 익명이너클래스 표현 
		A a1 = new A() {
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		// #2. 일반 람다식 표현
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		// #3. 인스턴스 메서드 참조 Type1 표현
		B b = new B();
		A a3 = b::bcd;

		a1.abc();
		a2.abc();
		a3.abc();		
	}
}
