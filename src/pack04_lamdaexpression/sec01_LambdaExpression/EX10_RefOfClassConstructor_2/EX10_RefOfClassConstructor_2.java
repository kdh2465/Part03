package pack04_lamdaexpression.sec01_LambdaExpression.EX10_RefOfClassConstructor_2;

interface A {
	B abc(int a);
}

class B {
	B() {
		System.out.println("첫번째 생성자");
	}

	B(int k) {
		System.out.println("두번째 생성자");
	}
}

public class EX10_RefOfClassConstructor_2 {
	public static void main(String[] args) {
		// #클래스 생성자 참조
		// #1. 익명이너클래스 표현
		A a1 = new A() {
			public B abc(int a) {
				return new B(a);
			}
		};

		// #2. 일반 람다식 표현
		A a2 = (a) -> new B(a);

		// #3. 클래스 생성자 참조 표현
		A a3 = B::new;

		a1.abc(3); // 두번째 생성자
		a2.abc(3); // 두번째 생성자
		a3.abc(3); // 두번째 생성자

	}
}
