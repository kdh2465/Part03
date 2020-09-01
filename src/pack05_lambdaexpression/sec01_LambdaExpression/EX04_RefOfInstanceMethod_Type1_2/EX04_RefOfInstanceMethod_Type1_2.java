package pack05_lambdaexpression.sec01_LambdaExpression.EX04_RefOfInstanceMethod_Type1_2;

/*활용#2-1. 인스턴스 메서드 참조 Type1 (자바 제공 인스턴스 메서드 참조)*/

interface A {
	void abc(int k);
}

public class EX04_RefOfInstanceMethod_Type1_2 {
	public static void main(String[] args) {
		// #인스턴스 메서드 참조 Type1
		// #1. 익명이너클래스 표현
		A a1 = new A() {
			public void abc(int k) {
				System.out.println(k);
			}
		};

		// #2. 일반 람다식 표현
		A a2 = (k) -> {
			System.out.println(k);
		};

		// #3. 인스턴스 메서드 참조 Type1 표현
		A a3 = System.out::println;

		a1.abc(3);
		a2.abc(3);
		a3.abc(3);	
	}
}
