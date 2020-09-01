package pack05_lambdaexpression.sec01_LambdaExpression.EX07_RefOfInstanceMethod_Type2_2;

/*활용#2-3. 인스턴스 메서드 참조 Type2(자바 제공 인스턴스 메서드 참조)*/

interface A {
	int abc(String str);
}

public class EX07_RefOfInstanceMethod_Type2_2 {
	public static void main(String[] args) {
		
		// #인스턴스 메서드 참조 Type2
		// #1. 익명이너클래스 표현
		A a1 = new A() {
			public int abc(String str) {
				return str.length();
			}
		};

		// #2. 일반 람다식 표현
		A a2 = (str) -> str.length();

		// #3. 인스턴스 메서드 참조 Type2 표현
		A a3 = String::length;
		
		System.out.println(a1.abc("안녕"));
		System.out.println(a2.abc("안녕"));
		System.out.println(a3.abc("안녕"));
	}
}
