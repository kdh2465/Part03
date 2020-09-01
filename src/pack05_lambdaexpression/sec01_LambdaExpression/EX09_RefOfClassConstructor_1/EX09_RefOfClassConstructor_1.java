package pack05_lambdaexpression.sec01_LambdaExpression.EX09_RefOfClassConstructor_1;

/*활용#3-2. 클래스의 생성자 참조 (기본생성자 참조)*/

interface A {
	B abc();
}

class B {
	B() {
		System.out.println("첫번째 생성자");
	}

	B(int k) {
		System.out.println("두번째 생성자");
	}
}

public class EX09_RefOfClassConstructor_1 {
	public static void main(String[] args) {
		// #클래스 생성자 참조
		// #1. 익명이너클래스 표현
		A a1 = new A() {
			public B abc() {
				return new B();
			}
		};

		// #2. 일반 람다식 표현
		A a2 = () -> new B();

		// #3. 클래스 생성자 참조 표현
		A a3 = B::new;

		a1.abc(); // 첫번째 생성자
		a2.abc(); // 첫번째 생성자
		a3.abc(); // 첫번째 생성자

	}
}
